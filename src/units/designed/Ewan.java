package units.designed;

import units.factory.Unit;
import weapons.Fire;
import weapons.Flux;
import weapons.Lightning;

public class Ewan extends Unit {

	public Ewan(String job) {
		this.setName("Ewan");
		this.setJob(job);
		this.setHpBase(20);
		this.setStrBase(9);
		this.setSkillBase(6);
		this.setSpeedBase(9);
		this.setLuckBase(9);
		this.setDefBase(2);
		this.setResBase(9);

		this.setHpGr(50);
		this.setStrGr(45);
		this.setSkillGr(60);
		this.setSpeedGr(35);
		this.setLuckGr(50);
		this.setDefGr(15);
		this.setResGr(40);

		this.setStrCap(20);
		this.setSkillCap(20);
		this.setSpeedCap(20);
		this.setDefCap(20);
		this.setResCap(20);

		if (job.equals("Druid") || job.equals("Summoner")) {
			this.addWeapon(new Flux());
		} else {
			this.addWeapon(new Fire());
		}
	}

	public void promote(){
		switch (this.getJob()) {
			case "Summoner" -> {
				this.setStrCap(27);
				this.setSkillCap(27);
				this.setSpeedCap(26);
				this.setResCap(28);
				this.gainPromotionStats(3, 0, 1, 3, 1, 3);
			}
			case "Mage Knight" -> {
				this.setStrCap(24);
				this.setSkillCap(26);
				this.setSpeedCap(25);
				this.setDefCap(24);
				this.setResCap(25);
				this.gainPromotionStats(4, 2, 0, 0, 2, 2);
			}
			case "Druid" -> {
				this.addWeapon(new Fire());
				this.setStrCap(29);
				this.setSkillCap(26);
				this.setSpeedCap(26);
				this.setDefCap(21);
				this.setResCap(28);
				this.gainPromotionStats(4, 0, 0, 3, 2, 2);
			}
			case "Sage" -> {
				this.addWeapon(new Lightning());
				this.setStrCap(28);
				this.setSkillCap(30);
				this.setSpeedCap(26);
				this.setDefCap(21);
				this.setResCap(25);
				this.gainPromotionStats(4, 1, 0, 0, 3, 3);
			}
			case "Pupil" -> {
				this.addWeapon(new Flux());
				this.addWeapon(new Lightning());
				this.setStrCap(29);
				this.setSkillCap(28);
				this.setSpeedCap(27);
				this.setDefCap(21);
				this.setResCap(26);
				this.gainPromotionStats(4, 2, 0, 1, 3, 3);
			}
		}
	}
}


