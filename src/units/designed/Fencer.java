package units.designed;

import units.factory.Unit;
import weapons.Rapier;

public class Fencer extends Unit {

	public Fencer() {
		this.setJob("Fencer");
		this.addWeapon(new Rapier());
		this.setHpBase(22);
		this.setStrBase(4);
		this.setSkillBase(9);
		this.setSpeedBase(9);
		this.setLuckBase(7);
		this.setDefBase(3);
		this.setResBase(1);

		this.setHpGr(60);
		this.setStrGr(40);
		this.setSkillGr(55);
		this.setSpeedGr(60);
		this.setLuckGr(55);
		this.setDefGr(25);
		this.setResGr(25);

		this.setStrCap(24);
		this.setSkillCap(29);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(23);
	}

}
