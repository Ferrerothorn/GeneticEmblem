package units.designed;

import units.factory.Unit;
import weapons.IronLance;
import weapons.IronSword;

public class Pegasus extends Unit {

	public Pegasus() {
		this.setJob("Falcoknight");
		this.addTrait("Flying");
		this.addWeapon(new IronLance());
		this.addWeapon(new IronSword());
		this.setHpBase(20);
		this.setStrBase(5);
		this.setSkillBase(6);
		this.setSpeedBase(8);
		this.setLuckBase(7);
		this.setDefBase(3);
		this.setResBase(4);

		this.setHpGr(65);
		this.setStrGr(45);
		this.setSkillGr(40);
		this.setSpeedGr(65);
		this.setLuckGr(60);
		this.setDefGr(20);
		this.setResGr(25);

		this.setStrCap(23);
		this.setSkillCap(26);
		this.setSpeedCap(29);
		this.setDefCap(23);
		this.setResCap(27);
	}

}
