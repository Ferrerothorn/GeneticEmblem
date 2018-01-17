package units.generated;

import units.factory.Unit;
import weapons.Fire;
import weapons.Flux;

public class Druid extends Unit {

	public Druid() {
		this.setJob("Druid");
		this.addWeapon(new Fire());
		this.addWeapon(new Flux());
		this.setHpBase(20);
		this.setStrBase(8);
		this.setSkillBase(5);
		this.setSpeedBase(6);
		this.setLuckBase(4);
		this.setDefBase(3);
		this.setResBase(7);

		this.setHpGr(65);
		this.setStrGr(55);
		this.setSkillGr(40);
		this.setSpeedGr(35);
		this.setLuckGr(30);
		this.setDefGr(22);
		this.setResGr(48);

		this.setStrCap(28);
		this.setSkillCap(25);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(28);
	}

}
