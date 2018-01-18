package units.generated;

import units.factory.Unit;
import weapons.Lightning;

public class Bishop extends Unit {

	public Bishop() {
		this.setJob("Bishop");
		this.addWeapon(new Lightning());
		this.setHpBase(20);
		this.setStrBase(6);
		this.setSkillBase(5);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(3);
		this.setResBase(7);

		this.setHpGr(55);
		this.setStrGr(50);
		this.setSkillGr(35);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(25);
		this.setResGr(50);

		this.setStrCap(24);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(22);
		this.setResCap(30);
	}

}
