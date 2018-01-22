package units.designed;

import units.factory.Unit;
import weapons.SharpClaw;

public class Bael extends Unit {

	public Bael() {
		this.setJob("Bael");
		this.addTrait("Monster");
		this.addWeapon(new SharpClaw());
		this.setHpBase(23);
		this.setStrBase(9);
		this.setSkillBase(5);
		this.setSpeedBase(6);
		this.setLuckBase(3);
		this.setDefBase(8);
		this.setResBase(2);

		this.setHpGr(85);
		this.setStrGr(55);
		this.setSkillGr(38);
		this.setSpeedGr(42);
		this.setLuckGr(10);
		this.setDefGr(50);
		this.setResGr(15);

		this.setStrCap(30);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(26);
		this.setResCap(20);
	}

}