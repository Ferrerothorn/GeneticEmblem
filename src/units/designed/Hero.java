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

		this.setHpGr(80);
		this.setStrGr(40);
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(35);
		this.setDefGr(35);
		this.setResGr(15);

		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(26);
		this.setDefCap(25);
		this.setResCap(22);
	}

}
