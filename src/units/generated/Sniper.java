package units.generated;

import units.factory.Unit;
import weapons.IronBow;

public class Sniper extends Unit {

	public Sniper() {
		this.setJob("Sniper");
		this.setBaseCrit(15);
		this.addWeapon(new IronBow());
		this.setHpBase(21);
		this.setStrBase(6);
		this.setSkillBase(8);
		this.setSpeedBase(8);
		this.setLuckBase(5);
		this.setDefBase(3);
		this.setResBase(3);

		this.setHpGr(65);
		this.setStrGr(45);
		this.setSkillGr(50);
		this.setSpeedGr(50);
		this.setLuckGr(40);
		this.setDefGr(20);
		this.setResGr(25);

		this.setStrCap(24);
		this.setSkillCap(30);
		this.setSpeedCap(29);
		this.setDefCap(21);
		this.setResCap(24);
	}

}
