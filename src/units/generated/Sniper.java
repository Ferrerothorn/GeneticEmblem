package units.generated;

import units.factory.Unit;
import weapons.IronBow;

public class Sniper extends Unit {

	public Sniper() {
		this.setJob("Sniper");
		this.setBaseCrit(15);
		this.addWeapon(new IronBow());
		this.setHpBase();
		this.setStrBase();
		this.setSkillBase();
		this.setSpeedBase();
		this.setLuckBase();
		this.setDefBase();
		this.setResBase();

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
