package units.designed;

import units.factory.Unit;
import weapons.Fire;
import weapons.IronSword;

public class Spellblade extends Unit {

	public Spellblade() {
		this.setJob("Spellblade");
		this.addWeapon(new Fire());
		this.addWeapon(new IronSword());
		this.setHpBase(21);
		this.setStrBase(6);
		this.setSkillBase(8);
		this.setSpeedBase(8);
		this.setLuckBase(4);
		this.setDefBase(4);
		this.setResBase(3);

		this.setHpGr(55);
		this.setStrGr(40);
		this.setSkillGr(45);
		this.setSpeedGr(65);
		this.setLuckGr(45);
		this.setDefGr(35);
		this.setResGr(35);

		this.setStrCap(24);
		this.setSkillCap(27);
		this.setSpeedCap(27);
		this.setDefCap(25);
		this.setResCap(25);
	}
}
