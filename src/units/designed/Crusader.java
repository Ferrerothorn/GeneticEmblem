package units.designed;

import units.factory.Unit;
import weapons.IronLance;
import weapons.Rapier;

public class Crusader extends Unit {

	public Crusader() {
		this.setJob("Crusader");
		this.addWeapon(new IronLance());
		this.addWeapon(new Rapier());
		this.setHpBase(22);
		this.setStrBase(6);
		this.setSkillBase(7);
		this.setSpeedBase(7);
		this.setLuckBase(5);
		this.setDefBase(5);
		this.setResBase(3);

		this.setHpGr(65);
		this.setStrGr(45);
		this.setSkillGr(45);
		this.setSpeedGr(40);
		this.setLuckGr(40);
		this.setDefGr(30);
		this.setResGr(30);

		this.setStrCap(27);
		this.setSkillCap(27);
		this.setSpeedCap(25);
		this.setDefCap(24);
		this.setResCap(25);
	}

}
