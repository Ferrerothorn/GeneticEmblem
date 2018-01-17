package units.factory;

import java.util.ArrayList;

import units.generated.*;

public class ClassList {

	ArrayList<Unit> releasedClasses = new ArrayList<>();

	public ClassList() {
		//releasedClasses.add(new Hero());
	}

	public ArrayList<Unit> getReleasedUnits() {
		return releasedClasses;
	}
}