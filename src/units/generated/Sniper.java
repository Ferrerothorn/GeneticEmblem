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

		this.setHpGr();
		this.setStrGr();
		this.setSkillGr();
		this.setSpeedGr();
		this.setLuckGr();
		this.setDefGr();
		this.setResGr();

		this.setStrCap();
		this.setSkillCap();
		this.setSpeedCap();
		this.setDefCap();
		this.setResCap();
	}

}
