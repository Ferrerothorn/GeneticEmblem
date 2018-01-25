package units.designed;

import units.factory.Unit;
import weapons.Rapier;

public class Chosen extends Unit {

	public Chosen() {
		this.setJob("Chosen");
		this.addWeapon(new Rapier());
		this.setHpBase(21);
		this.setStrBase(6);
		this.setSkillBase(8);
		this.setSpeedBase(6);
		this.setLuckBase(5);
		this.setDefBase(5);
		this.setResBase(3);

		this.setHpGr(55);
		this.setStrGr(40);
		this.setSkillGr(45);
		this.setSpeedGr(55);
		this.setLuckGr(50);
		this.setDefGr(35);
		this.setResGr(40);

		this.setStrCap(26);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(25);
		this.setResCap(25);
	}

}
