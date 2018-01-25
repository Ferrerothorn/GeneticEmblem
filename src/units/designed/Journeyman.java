package units.designed;

import units.factory.Unit;
import weapons.SteelAxe;

public class Journeyman extends Unit {

	public Journeyman() {
		this.setJob("Journeyman");
		this.addWeapon(new SteelAxe());
		this.setBaseCrit(15);
		this.setHpBase(22);
		this.setStrBase(8);
		this.setSkillBase(4);
		this.setSpeedBase(7);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(3);

		this.setHpGr(75);
		this.setStrGr(55);
		this.setSkillGr(40);
		this.setSpeedGr(35);
		this.setLuckGr(45);
		this.setDefGr(40);
		this.setResGr(30);

		this.setStrCap(26);
		this.setSkillCap(29);
		this.setSpeedCap(27);
		this.setDefCap(23);
		this.setResCap(23);
	}

}
