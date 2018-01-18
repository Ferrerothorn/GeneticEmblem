package units.designed;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronSword;

public class Tank extends Unit {

	public Tank() {
		this.setJob("Tank");
		this.addWeapon(new IronAxe());
		this.addWeapon(new IronSword());
		this.setHpBase(23);
		this.setStrBase(9);
		this.setSkillBase(5);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(8);
		this.setResBase(1);

		this.setHpGr(70);
		this.setStrGr(60);
		this.setSkillGr(40);
		this.setSpeedGr(35);
		this.setLuckGr(25);
		this.setDefGr(50);
		this.setResGr(15);

		this.setStrCap(30);
		this.setSkillCap(24);
		this.setSpeedCap(24);
		this.setDefCap(29);
		this.setResCap(21);
	}

}
