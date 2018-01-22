package units.designed;

import units.factory.Unit;
import weapons.SteelAxe;

public class Berserker extends Unit {

	public Berserker() {
		this.setJob("Berserker");
		this.addWeapon(new SteelAxe());
		this.setBaseCrit(15);
		this.setHpBase(23);
		this.setStrBase(9);
		this.setSkillBase(4);
		this.setSpeedBase(8);
		this.setLuckBase(6);
		this.setDefBase(5);
		this.setResBase(1);

		this.setHpGr(80);
		this.setStrGr(60);
		this.setSkillGr(35);
		this.setSpeedGr(45);
		this.setLuckGr(35);
		this.setDefGr(20);
		this.setResGr(20);

		this.setStrCap(30);
		this.setSkillCap(28);
		this.setSpeedCap(28);
		this.setDefCap(22);
		this.setResCap(20);
	}

}
