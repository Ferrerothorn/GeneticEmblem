package units.designed;

import units.factory.Unit;
import weapons.IronBow;
import weapons.IronSword;

public class Nomad extends Unit {

	public Nomad() {
		this.setJob("Nomad");
		this.addWeapon(new IronBow());
		this.addWeapon(new IronSword());
		this.setHpBase(22);
		this.setStrBase(6);
		this.setSkillBase(6);
		this.setSpeedBase(9);
		this.setLuckBase(4);
		this.setDefBase(5);
		this.setResBase(3);

		this.setHpGr(70);
		this.setStrGr(45);
		this.setSkillGr(50);
		this.setSpeedGr(65);
		this.setLuckGr(40);
		this.setDefGr(25);
		this.setResGr(25);

		this.setStrCap(25);
		this.setSkillCap(28);
		this.setSpeedCap(30);
		this.setDefCap(23);
		this.setResCap(22);
	}
}
