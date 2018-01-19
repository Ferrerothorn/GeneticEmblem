package units.designed;

import units.factory.Unit;
import weapons.IronSword;
import weapons.SteelSword;

public class Assassin extends Unit {

	public Assassin() {
		this.setJob("Assassin");
		this.setTrait("Assassin");
		this.addWeapon(new SteelSword());
		this.setHpBase(21);
		this.setStrBase(5);
		this.setSkillBase(9);
		this.setSpeedBase(9);
		this.setLuckBase(5);
		this.setDefBase(3);
		this.setResBase(2);

		this.setHpGr(65);
		this.setStrGr(35);
		this.setSkillGr(45);
		this.setSpeedGr(65);
		this.setLuckGr(45);
		this.setDefGr(20);
		this.setResGr(20);

		this.setStrCap(26);
		this.setSkillCap(30);
		this.setSpeedCap(30);
		this.setDefCap(21);
		this.setResCap(21);
	}

}
