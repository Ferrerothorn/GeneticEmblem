package units.generated;

import units.factory.Unit;
import weapons.IronLance;
import weapons.IronSword;

public class Paladin extends Unit {

	public Paladin() {
		this.setJob("Paladin");
		this.addWeapon(new IronSword());
		this.addWeapon(new IronLance());
		this.setHpBase();
		this.setStrBase();
		this.setSkillBase();
		this.setSpeedBase();
		this.setLuckBase();
		this.setDefBase();
		this.setResBase();

		this.setHpGr();
		this.setStrGr();
		this.setSkillGr();
		this.setSpeedGr();
		this.setLuckGr();
		this.setDefGr();
		this.setResGr();

		this.setStrCap();
		this.setSkillCap();
		this.setSpeedCap();
		this.setDefCap();
		this.setResCap();
	}

}
