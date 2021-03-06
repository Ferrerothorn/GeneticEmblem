package units.designed;

import units.factory.Unit;
import weapons.Geomancy;

public class Geomancer extends Unit {

	public Geomancer() {
		this.setJob("Geomancer");
		this.setBaseCrit(5);
		this.addWeapon(new Geomancy());
		this.setHpBase(21);
		this.setStrBase(5);
		this.setSkillBase(5);
		this.setSpeedBase(5);
		this.setLuckBase(6);
		this.setDefBase(6);
		this.setResBase(6);

		this.setHpGr(65);
		this.setStrGr(40);
		this.setSkillGr(35);
		this.setSpeedGr(30);
		this.setLuckGr(35);
		this.setDefGr(45);
		this.setResGr(45);

		this.setStrCap(25);
		this.setSkillCap(24);
		this.setSpeedCap(25);
		this.setDefCap(27);
		this.setResCap(27);
	}

}
