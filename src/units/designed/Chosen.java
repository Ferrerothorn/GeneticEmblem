package units.designed;

import units.factory.Unit;
import weapons.IronSword;

public class Chosen extends Unit {

	public Chosen() {
		this.setJob("Chosen");
		this.addWeapon(new IronSword());
		this.setHpBase(21);
		this.setStrBase(6);
		this.setSkillBase(8);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(5);
		this.setResBase(3);

		this.setHpGr(60);
		this.setStrGr(40);
		this.setSkillGr(50);
		this.setSpeedGr(40);
		this.setLuckGr(50);
		this.setDefGr(25);
		this.setResGr(30);

		this.setStrCap(26);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(25);
		this.setResCap(25);
	}

}
