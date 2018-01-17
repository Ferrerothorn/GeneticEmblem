package units.factory;

import java.util.ArrayList;

import units.generated.*;

public class ClassList {

	ArrayList<Unit> releasedClasses = new ArrayList<>();

	public ClassList() {
		releasedClasses.add(new Paladin());
		releasedClasses.add(new Sage());
	}

	public ArrayList<Unit> getReleasedUnits() {
		return releasedClasses;
	}
}