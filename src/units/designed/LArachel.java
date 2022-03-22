package units.designed;

import units.factory.Unit;
import weapons.Fire;
import weapons.Lightning;

public class LArachel extends Unit {

	public LArachel(String job) {
		this.setName("L'Arachel");
		this.setJob(job);
		this.setHpBase(17);
		this.setStrBase(5);
		this.setSkillBase(5);
		this.setSpeedBase(9);
		this.setLuckBase(11);
		this.setDefBase(5);
		this.setResBase(7);

		this.setHpGr(45);
		this.setStrGr(50);
		this.setSkillGr(45);
		this.setSpeedGr(45);
		this.setLuckGr(65);
		this.setDefGr(15);
		this.setResGr(50);

		this.setStrCap(20);
		this.setSkillCap(20);
		this.setSpeedCap(20);
		this.setDefCap(20);
		this.setResCap(20);

		if (job.equals("Mage Knight")) {
			this.addWeapon(new Fire());
		} else {
			this.addWeapon(new Lightning());
		}
	}

	public void promote(){
		switch (this.getJob()) {
			case "Mage Knight" -> {
				this.setStrCap(25);
				this.setSkillCap(24);
				this.setSpeedCap(25);
				this.setDefCap(24);
				this.setResCap(28);
				this.gainPromotionStats(3, 2, 0, 0, 2, 2);
			}
			case "Valkyrie" -> {
				this.setStrCap(25);
				this.setSkillCap(24);
				this.setSpeedCap(25);
				this.setDefCap(24);
				this.setResCap(28);
				this.gainPromotionStats(3, 2, 1, 0, 2, 3);
			}
		}
	}
}


