package units.generated;

import units.factory.Unit;
import weapons.IronSword;

public class Swordmaster extends Unit {

	public Swordmaster() {
		this.setJob("Swordmaster");
		this.addWeapon(new IronSword());
		this.setBaseCrit(15);
		this.setHpBase(22);
		this.setStrBase(5);
		this.setSkillBase(9);
		this.setSpeedBase(9);
		this.setLuckBase(6);
		this.setDefBase(2);
		this.setResBase(2);

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
