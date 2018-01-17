package units.factory;

import weapons.Weapon;

public class WeaponQualityComparator implements Comparable<WeaponQualityComparator> {

	Weapon wep;
	String weaponName;
	int matchups = 0;

	public WeaponQualityComparator(Weapon weapon) {
		wep = weapon;
		weaponName = weapon.getName();
	}

	@Override
	public int compareTo(WeaponQualityComparator o) {
		if (matchups > o.getMatchups()) {
			return -1;
		}
		if (matchups < o.getMatchups()) {
			return 1;
		}
		if (this.wep.pow > o.wep.pow) {
			return -1;
		}
		if (this.wep.pow < o.wep.pow) {
			return 1;
		}
		return 0;

	}

	public void alterMatchups(int i) {
		matchups += i;
	}

	int getMatchups() {
		return matchups;
	}

	public String getWeaponName() {
		return weaponName;
	}
	
	public Weapon getWeapon() {
		return wep;
	}
}
