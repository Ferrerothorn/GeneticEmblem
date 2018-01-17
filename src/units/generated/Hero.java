package units.generated;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronSword;

public class Hero extends Unit {

	public Hero() {
		this.setJob("Hero");
		this.addWeapon(new IronSword());
		this.addWeapon(new IronAxe());
		this.setHpBase(23);
		this.setStrBase(6);
		this.setSkillBase(9);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(5);
		this.setResBase(1);

		this.setHpGr(85);
		this.setStrGr(45);
		this.setSkillGr(40);
		this.setSpeedGr(40);
		this.setLuckGr(35);
		this.setDefGr(30);
		this.setResGr(20);

		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(26);
		this.setDefCap(25);
		this.setResCap(22);
	}

}
