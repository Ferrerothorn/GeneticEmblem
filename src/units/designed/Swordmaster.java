package units.designed;

import units.factory.Unit;
import weapons.SteelSword;

public class Swordmaster extends Unit {

	public Swordmaster() {
		this.setJob("Swordmaster");
		this.addWeapon(new SteelSword());
		this.setBaseCrit(15);
		this.setHpBase(22);
		this.setStrBase(5);
		this.setSkillBase(9);
		this.setSpeedBase(9);
		this.setLuckBase(6);
		this.setDefBase(2);
		this.setResBase(2);

		this.setHpGr(70);
		this.setStrGr(35);
		this.setSkillGr(50);
		this.setSpeedGr(60);
		this.setLuckGr(40);
		this.setDefGr(20);
		this.setResGr(20);

		this.setStrCap(24);
		this.setSkillCap(29);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(23);
	}

}
