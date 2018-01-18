package units.designed;

import units.factory.Unit;
import weapons.Lightning;

public class Valkyrie extends Unit {

	public Valkyrie() {
		this.setJob("Valkyrie");
		this.addWeapon(new Lightning());
		this.setHpBase(20);
		this.setStrBase(6);
		this.setSkillBase(4);
		this.setSpeedBase(6);
		this.setLuckBase(8);
		this.setDefBase(2);
		this.setResBase(7);

		this.setHpGr(45);
		this.setStrGr(45);
		this.setSkillGr(35);
		this.setSpeedGr(40);
		this.setLuckGr(65);
		this.setDefGr(15);
		this.setResGr(50);

		this.setStrCap(25);
		this.setSkillCap(25);
		this.setSpeedCap(25);
		this.setDefCap(25);
		this.setResCap(28);
	}

}
