package units.designed;

import units.factory.Unit;
import weapons.SteelSword;

public class Assassin extends Unit {

	public Assassin() {
		this.setJob("Assassin");
		this.addTrait("Assassin");
		this.addWeapon(new SteelSword());
		this.setHpBase(21);
		this.setStrBase(5);
		this.setSkillBase(9);
		this.setSpeedBase(9);
		this.setLuckBase(5);
		this.setDefBase(3);
		this.setResBase(2);

		this.setHpGr(65);
		this.setStrGr(50);
		this.setSkillGr(55);
		this.setSpeedGr(65);
		this.setLuckGr(45);
		this.setDefGr(20);
		this.setResGr(20);

		this.setStrCap(24);
		this.setSkillCap(30);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(22);
	}

}
