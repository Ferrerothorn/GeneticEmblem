package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

import units.factory.ClassList;
import units.factory.Unit;

public class List {

	static ArrayList<Unit> arena = new ArrayList<>();
	static Boolean on = true;
	static Scanner input = new Scanner(System.in);
	static ClassList classList;
	static int defaultLevelForExperiments = 20;
	static boolean logging = false;

	public static void main(String[] args) {

		while (on) {
			System.out.println();
			System.out.println("===Choose a command===");
			System.out.println("0: The usual (Add 25k each, 2048 remain, report).");
			System.out.println("1: Add a number of each class to the arena.");
			System.out.println("2: View a single match.");
			System.out.println("22: Run until 2048 remain.");
			System.out.println("222: Run until specified number remain.");
			System.out.println("3: See the top 8 in the arena.");
			System.out.println("456: Clear arena.");
			System.out.println("5: Report on the surviving units.");
			System.out.println("55: Report standard deviation.");
			System.out.println("77: Toggle logging.");
			System.out.println("88: Determine which class is healthiest to cull.");
			System.out.println("999: Quit.");
			System.out.println();
			int choice = input.nextInt();

			switch (choice) {
				case 0 -> {
					System.out.println("Adding units.");
					addEachClass(25000, arena);
					System.out.println("Leveling units.");
					levelTheDudesTo(defaultLevelForExperiments, arena);
					System.out.println("Deathmatch begins.");
					deathmatch(2048, arena);
					System.out.println();
					showSurvivors(arena);
					System.out.println();
				}
				case 1 -> {
					System.out.println("How many of each class should be added?");
					int number = input.nextInt();
					addEachClass(number, arena);
					System.out.println("What level should everyone start at?");
					number = input.nextInt();
					levelTheDudesTo(number, arena);
				}
				case 2 -> deathmatch(arena.size() - 1, arena);
				case 22 -> deathmatch(2048, arena);
				case 222 -> {
					System.out.println("How many units should remain standing?");
					int number1 = input.nextInt();
					deathmatch(number1, arena);
				}
				case 3 -> scry(8);
				case 456 -> arena.clear();
				case 5 -> showSurvivors(arena);
				case 55 -> System.out.println(metagameBalanceMetrics(arena));
				case 77 -> logging = !logging;
				case 88 -> {
					ArrayList<Unit> counter = new ArrayList<>();
					addEachClass(1, counter);
					Collections.shuffle(counter);
					analyseDisposableClasses(counter, true);
					arena.clear();
				}
				case 999 -> {
					on = false;
					input.close();
				}
				default -> {
				}
			}
		}
	}

	private static void analyseDisposableClasses(ArrayList<Unit> counter, boolean firstIteration) {

		ArrayList<Unit> tempArena;
		HashMap<String, Double> metagameHealth = new HashMap<>();

		System.out.println("Adding 12500 of each class to arena.");
		addEachClass(12500, arena);
		System.out.println("Leveled them all to " + defaultLevelForExperiments + ".");
		levelTheDudesTo(defaultLevelForExperiments, arena);
		System.out.println("Running deathmatch to 2048.");
		System.out.println();
		deathmatch(2048, arena);
		double defaultMetagameHealth = metagameBalanceMetrics(arena);
		arena.clear();

		System.out.println("Default metagame health determined @ " + defaultMetagameHealth + ".");
		metagameHealth.put("Default", defaultMetagameHealth);

		ArrayList<Unit> recheckThese = new ArrayList<>();

		for (Unit placeholder : counter) {
			String withoutThisClass = placeholder.getJob();
			tempArena = new ArrayList<>();
			System.out.println("Testing what life would be like without " + withoutThisClass + ".");

			addEachClass(12500, arena);
			levelTheDudesTo(defaultLevelForExperiments, arena);

			for (Unit u : arena) {
				if (!u.getJob().equals(withoutThisClass)) {
					tempArena.add(u);
				}
			}
			arena.clear();
			deathmatch(2048, tempArena);
			double withoutHealth = metagameBalanceMetrics(tempArena);

			if (withoutHealth < defaultMetagameHealth) {
				recheckThese.add(placeholder);
			}
			metagameHealth.put(withoutThisClass, withoutHealth);
			System.out.println("[" + withoutHealth + "]");
		}

		if (recheckThese.size() > 0 && firstIteration) {
			System.out.println();
			System.out.println("Some classes appear to be polluting the metagame.");
			System.out.println("Initiating recheck.");
			metagameHealth.clear();
			analyseDisposableClasses(recheckThese, false);
		}

		sortByValues(metagameHealth);
		printAlternateMetagameHealth(metagameHealth);
	}

	@SuppressWarnings("unchecked")
	private static void printAlternateMetagameHealth(HashMap<String, Double> metagameHealth) {

		metagameHealth = sortByValues(metagameHealth);

		for (Map.Entry<String, Double> stringDoubleEntry : metagameHealth.entrySet()) {
			System.out.println(((Map.Entry) stringDoubleEntry).getKey() + ": " + ((Map.Entry) stringDoubleEntry).getValue());
		}
	}

	private static double metagameBalanceMetrics(ArrayList<Unit> anArena) {
		HashMap<String, Integer> survivors = reportOnSurvivors(anArena);
		double total = 0;
		double index = survivors.size();
		for (Map.Entry<String, Integer> stringIntegerEntry : survivors.entrySet()) {
			total += Integer.parseInt(((Map.Entry) stringIntegerEntry).getValue().toString());
		}
		double mean = total / index;

		ArrayList<Double> meanSubs = new ArrayList<>();
		for (Map.Entry<String, Integer> stringIntegerEntry : survivors.entrySet()) {
			double beforeSquaring = Double.parseDouble(((Map.Entry) stringIntegerEntry).getValue().toString());
			meanSubs.add(Math.pow(beforeSquaring - mean, 2));
		}

		double sum = 0;
		for (Double d : meanSubs) {
			sum += d;
		}
		sum /= meanSubs.size();
		sum = Math.sqrt(sum);

		return sum / survivors.size();
	}

	private static void showSurvivors(ArrayList<Unit> anArena) {
		HashMap<String, Integer> survivors = reportOnSurvivors(anArena);
		printMap(survivors);
	}

	private static HashMap<String, Integer> reportOnSurvivors(ArrayList<Unit> anArena) {
		HashMap<String, Integer> survivors = new HashMap<>();

		for (Unit u : anArena) {
			String key = "" + u.getName() + " (" + u.getJob() + ")";

			if (!survivors.containsKey(key)) {
				survivors.put(key, 1);
			} else {
				survivors.put(key, survivors.get(key) + 1);
			}
		}
		return survivors;
	}

	@SuppressWarnings("unchecked")
	private static void printMap(HashMap<String, Integer> survivors) {

		survivors = sortByValues(survivors);

		for (Map.Entry<String, Integer> stringIntegerEntry : survivors.entrySet()) {
			@SuppressWarnings("rawtypes")
			Map.Entry pair = stringIntegerEntry;
			System.out.println(pair.getKey() + ": " + pair.getValue());
		}
	}

	private static void deathmatch(int i, ArrayList<Unit> u) {

		int cullSize = u.size() - i;
		int initialSize = (cullSize + i);
		if (i > 0) {
			while (u.size() > i) {
				Unit unit1 = u.remove(0);
				Unit unit2 = u.remove(0);
				unit1.chooseWeaponFromBackpack(unit2);
				unit2.chooseWeaponFromBackpack(unit1);
				Unit victor = unit1.fight(unit2, logging);

				victor.levelUp();
				if (logging) {
					System.out.println();
				}
				u.add(victor);
				System.out.println(("" + 100 * (double) (initialSize - (u.size() - i)) / (double) initialSize) + "%");
			}
		}
	}

	private static void scry(int i) {
		for (int x = 0; x < i && x < arena.size(); x++) {
			arena.get(x).printDetailedUnitDescription(x + 1);
		}
	}

	private static void addEachClass(int i, ArrayList<Unit> theArena) {
		for (int x = 0; x < i; x++) {
			classList = new ClassList();
			addEach(classList.getReleasedUnits(), theArena);
		}
		Collections.shuffle(arena);
	}

	private static void addEach(ArrayList<Unit> released, ArrayList<Unit> theArena) {
		theArena.addAll(released);
	}

	public static void levelTheDudesTo(int lv, ArrayList<Unit> dudes) {
		for (Unit u : dudes) {
			for (int i = 1; i < lv; i++) {
				u.levelUp();
				if (u.getLv() == 20){
					u.promote();
				}
			}
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static HashMap sortByValues(HashMap map) {
		LinkedList list = new LinkedList(map.entrySet());
		list.sort((o1, o2) -> ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue()));
		HashMap sortedHashMap = new LinkedHashMap();
		for (Object o : list) {
			Map.Entry entry = (Map.Entry) o;
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}
}