package units.designed;

import units.factory.Unit;
import weapons.SerasMagicSword;

public class SeraJane extends Unit {

	public SeraJane() {
		this.setJob("Sera-Jane");
		this.addWeapon(new SerasMagicSword());
		this.setHpBase(19);
		this.setStrBase(5);
		this.setSkillBase(5);
		this.setSpeedBase(5);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(7);

		this.setHpGr(45);
		this.setStrGr(40);
		this.setSkillGr(50);
		this.setSpeedGr(50);
		this.setLuckGr(50);
		this.setDefGr(30);
		this.setResGr(55);

		this.setStrCap(26);
		this.setSkillCap(26);
		this.setSpeedCap(26);
		this.setDefCap(26);
		this.setResCap(26);
	}

}
