package units.factory;

import java.util.ArrayList;

import units.designed.*;
import units.autogenerated.*;

public class ClassList {

	ArrayList<Unit> releasedClasses = new ArrayList<>();

	public ClassList() {
		releasedClasses.add(new Paladin());
		releasedClasses.add(new General());
		releasedClasses.add(new Sage());
		releasedClasses.add(new Viking());
		releasedClasses.add(new Chosen());
		releasedClasses.add(new Tank());
		releasedClasses.add(new Assassin());
		releasedClasses.add(new Swordmaster());
		releasedClasses.add(new GreatKnight());
		releasedClasses.add(new Warrior());
		releasedClasses.add(new Valkyrie());
		releasedClasses.add(new Bishop());
		releasedClasses.add(new Templar());
		releasedClasses.add(new Druid());
		releasedClasses.add(new Hero());
		releasedClasses.add(new Sniper());
		releasedClasses.add(new Geomancer());
		releasedClasses.add(new Spellblade());
		releasedClasses.add(new Berserker());
		releasedClasses.add(new Pupil());
		releasedClasses.add(new Fencer());
		releasedClasses.add(new Crusader());
	}

	public ArrayList<Unit> getReleasedUnits() {
		return releasedClasses;
	}
}