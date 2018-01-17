package units.generated;

import units.factory.Unit;
import weapons.Geomancy;

public class Geomancer extends Unit {

	public Geomancer() {
		this.setJob("Geomancer");
		this.setBaseCrit(5);
		this.addWeapon(new Geomancy());
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
