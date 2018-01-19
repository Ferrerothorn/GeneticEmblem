package units.designed;

import units.factory.Unit;
import weapons.Fire;
import weapons.Flux;
import weapons.Lightning;

public class Pupil extends Unit {

	public Pupil() {
		this.setJob("Pupil");
		this.addWeapon(new Lightning());
		this.addWeapon(new Fire());
		this.addWeapon(new Flux());
		this.setHpBase(20);
		this.setStrBase(7);
		this.setSkillBase(6);
		this.setSpeedBase(7);
		this.setLuckBase(6);
		this.setDefBase(1);
		this.setResBase(6);

		this.setHpGr(50);
		this.setStrGr(55);
		this.setSkillGr(40);
		this.setSpeedGr(40);
		this.setLuckGr(50);
		this.setDefGr(15);
		this.setResGr(45);

		this.setStrCap(29);
		this.setSkillCap(28);
		this.setSpeedCap(27);
		this.setDefCap(20);
		this.setResCap(24);
	}

}
