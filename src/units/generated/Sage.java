package units.generated;

import units.factory.Unit;
import weapons.Fire;
import weapons.Lightning;

public class Sage extends Unit {

	public Sage() {
		this.setJob("Sage");
		this.addWeapon(new Fire());
		this.addWeapon(new Lightning());
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
