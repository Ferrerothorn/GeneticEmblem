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

		this.setHpGr(65);
		this.setStrGr(50);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(35);
		this.setDefGr(30);
		this.setResGr(25);

		this.setStrCap(27);
		this.setSkillCap(27);
		this.setSpeedCap(25);
		this.setDefCap(26);
		this.setResCap(23);
	}

}
