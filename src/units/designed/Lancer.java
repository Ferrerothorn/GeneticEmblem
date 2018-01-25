package units.designed;

import units.factory.Unit;
import weapons.SteelLance;

public class Lancer extends Unit {

	public Lancer() {
		this.setJob("Lancer");
		this.addWeapon(new SteelLance());
		this.setHpBase(22);
		this.setStrBase(7);
		this.setSkillBase(7);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(5);
		this.setResBase(3);

		this.setHpGr(75);
		this.setStrGr(50);
		this.setSkillGr(55);
		this.setSpeedGr(45);
		this.setLuckGr(40);
		this.setDefGr(35);
		this.setResGr(20);

		this.setStrCap(27);
		this.setSkillCap(27);
		this.setSpeedCap(25);
		this.setDefCap(26);
		this.setResCap(23);
	}

}
