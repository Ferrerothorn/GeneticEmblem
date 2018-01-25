package units.designed;

import units.factory.Unit;
import weapons.Shine;

public class Bishop extends Unit {

	public Bishop() {
		this.setJob("Bishop");
		this.addWeapon(new Shine());
		this.setHpBase(20);
		this.setStrBase(6);
		this.setSkillBase(5);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(3);
		this.setResBase(7);

		this.setHpGr(55);
		this.setStrGr(50);
		this.setSkillGr(40);
		this.setSpeedGr(45);
		this.setLuckGr(40);
		this.setDefGr(30);
		this.setResGr(60);

		this.setStrCap(24);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(22);
		this.setResCap(30);
	}

}
