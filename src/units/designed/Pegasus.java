package units.designed;

import units.factory.Unit;
import weapons.IronLance;
import weapons.IronSword;

public class Pegasus extends Unit {

	public Pegasus() {
		this.setJob("Falcoknight");
		this.setTrait("Flying");
		this.addWeapon(new IronLance());
		this.addWeapon(new IronSword());
		this.setHpBase(20);
		this.setStrBase(5);
		this.setSkillBase(6);
		this.setSpeedBase(8);
		this.setLuckBase(7);
		this.setDefBase(3);
		this.setResBase(4);

		this.setHpGr(60);
		this.setStrGr(35);
		this.setSkillGr(50);
		this.setSpeedGr(55);
		this.setLuckGr(45);
		this.setDefGr(20);
		this.setResGr(30);

		this.setStrCap(23);
		this.setSkillCap(26);
		this.setSpeedCap(29);
		this.setDefCap(23);
		this.setResCap(27);
	}

}
