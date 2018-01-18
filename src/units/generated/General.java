package units.generated;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronLance;

public class General extends Unit {

	public General() {
		this.setJob("General");
		this.addWeapon(new IronAxe());
		this.addWeapon(new IronLance());
		this.setHpBase(23);
		this.setStrBase(8);
		this.setSkillBase(8);
		this.setSpeedBase(4);
		this.setLuckBase(4);
		this.setDefBase(8);
		this.setResBase(1);

		this.setHpGr(80);
		this.setStrGr(45);
		this.setSkillGr(40);
		this.setSpeedGr(30);
		this.setLuckGr(35);
		this.setDefGr(45);
		this.setResGr(20);

		this.setStrCap(29);
		this.setSkillCap(25);
		this.setSpeedCap(23);
		this.setDefCap(30);
		this.setResCap(21);
	}

}
