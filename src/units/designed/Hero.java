package units.designed;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.SteelSword;

public class Hero extends Unit {

	public Hero() {
		this.setJob("Hero");
		this.addWeapon(new SteelSword());
		this.addWeapon(new IronAxe());
		this.setHpBase(23);
		this.setStrBase(6);
		this.setSkillBase(8);
		this.setSpeedBase(9);
		this.setLuckBase(4);
		this.setDefBase(5);
		this.setResBase(1);

		this.setHpGr(85);
		this.setStrGr(45);
		this.setSkillGr(60);
		this.setSpeedGr(50);
		this.setLuckGr(35);
		this.setDefGr(30);
		this.setResGr(15);

		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(26);
		this.setDefCap(25);
		this.setResCap(22);
	}

}
