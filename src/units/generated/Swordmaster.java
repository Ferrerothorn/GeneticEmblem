package units.generated;

import units.factory.Unit;
import weapons.IronSword;

public class Swordmaster extends Unit {

	public Swordmaster() {
		this.setJob("Swordmaster");
		this.addWeapon(new IronSword());
		this.setBaseCrit(15);
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
