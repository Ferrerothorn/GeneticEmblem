package units.generated;

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

		this.setHpGr(50);
		this.setStrGr(40);
		this.setSkillGr(40);
		this.setSpeedGr(55);
		this.setLuckGr(40);
		this.setDefGr(35);
		this.setResGr(35);

		this.setStrCap(24);
		this.setSkillCap(27);
		this.setSpeedCap(27);
		this.setDefCap(25);
		this.setResCap(25);
	}

}
