package units.factory;

import java.util.ArrayList;

import units.designed.*;

public class ClassList {

	ArrayList<Unit> releasedClasses = new ArrayList<>();

	public ClassList() {
		releasedClasses.add(new Ewan("Summoner"));
		releasedClasses.add(new Ewan("Druid"));
		releasedClasses.add(new Ewan("Mage Knight"));
		releasedClasses.add(new Ewan("Sage"));
		releasedClasses.add(new Ewan("Pupil"));
		releasedClasses.add(new Joshua("Swordmaster"));
		releasedClasses.add(new Joshua("Assassin"));
		releasedClasses.add(new Vanessa("Falcoknight"));
		releasedClasses.add(new Vanessa("Wyvern Knight"));
		releasedClasses.add(new Lute("Sage"));
		releasedClasses.add(new Lute("Mage Knight"));
		releasedClasses.add(new Lyn("Blade Lord"));
		releasedClasses.add(new Eliwood("Knight Lord"));
		releasedClasses.add(new Hector("Lord"));
		releasedClasses.add(new Raven("Hero"));
		releasedClasses.add(new Matthew("Assassin"));
		releasedClasses.add(new Wallace("General"));
		releasedClasses.add(new Nino("Sage"));
		releasedClasses.add(new Rath("Nomad Trooper"));
		releasedClasses.add(new Erk("Sage"));
		releasedClasses.add(new Sain("Paladin"));
		releasedClasses.add(new Bartre("Warrior"));
		releasedClasses.add(new Kent("Paladin"));
		releasedClasses.add(new Fiora("Falcoknight"));
		releasedClasses.add(new Heath("Wyvern Lord"));
		releasedClasses.add(new Canas("Druid"));
		releasedClasses.add(new Legault("Assassin"));
		releasedClasses.add(new Lowen("Paladin"));
		releasedClasses.add(new Oswin("General"));
		releasedClasses.add(new Rebecca("Sniper"));
		releasedClasses.add(new Ephraim("Lord"));
		releasedClasses.add(new Guy("Swordmaster"));
		releasedClasses.add(new Eirika("Lord"));
		releasedClasses.add(new Florina("Falcoknight"));
		releasedClasses.add(new Serra("Bishop"));
		releasedClasses.add(new Lucius("Bishop"));
		releasedClasses.add(new Gilliam("Great Knight"));
		releasedClasses.add(new Gilliam("General"));
		releasedClasses.add(new Kyle("Great Knight"));
		releasedClasses.add(new Kyle("Paladin"));
		releasedClasses.add(new Colm("Assassin"));
		releasedClasses.add(new Wil("Sniper"));
		releasedClasses.add(new Dorcas("Warrior"));
		releasedClasses.add(new Farina("Falcoknight"));
		releasedClasses.add(new Priscilla("Mage Knight"));
		releasedClasses.add(new LArachel("Valkyrie"));
		releasedClasses.add(new LArachel("Mage Knight"));
		releasedClasses.add(new Dart("Berserker"));
	}

	public ArrayList<Unit> getReleasedUnits() {
		return releasedClasses;
	}
}