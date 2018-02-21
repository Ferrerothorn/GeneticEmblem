package units.designed;

import units.factory.Unit;
import weapons.Fire;
import weapons.Lightning;

public class Sage extends Unit {

	public Sage() {
		this.setJob("Sage");
		this.addWeapon(new Fire());
		this.addWeapon(new Lightning());
		this.setHpBase(20);
		this.setStrBase(7);
		this.setSkillBase(6);
		this.setSpeedBase(7);
		this.setLuckBase(6);
		this.setDefBase(2);
		this.setResBase(5);

		this.setHpGr(45);
		this.setStrGr(50);
		this.setSkillGr(50);
		this.setSpeedGr(55);
		this.setLuckGr(45);
		this.setDefGr(25);
		this.setResGr(45);

		this.setStrCap(28);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(25);
	}

}
