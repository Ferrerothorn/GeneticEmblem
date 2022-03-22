package units.designed;

import units.factory.Unit;
import weapons.Fire;

public class Erk extends Unit {

    public Erk(String job) {
        this.setName("Erk");
        this.setJob(job);
        this.addWeapon(new Fire());
        this.setHpBase(17);
        this.setStrBase(5);
        this.setSkillBase(6);
        this.setSpeedBase(7);
        this.setLuckBase(3);
        this.setDefBase(2);
        this.setResBase(4);

        this.setHpGr(65);
        this.setStrGr(40);
        this.setSkillGr(40);
        this.setSpeedGr(50);
        this.setLuckGr(30);
        this.setDefGr(20);
        this.setResGr(40);

        this.setStrCap(20);
        this.setSkillCap(20);
        this.setSpeedCap(20);
        this.setDefCap(20);
        this.setResCap(20);
    }

    public void promote() {
		switch (this.getJob()) {
			case "Sage" -> {
				this.setStrCap(28);
				this.setSkillCap(30);
				this.setSpeedCap(26);
				this.setDefCap(21);
				this.setResCap(25);
				this.gainPromotionStats(4, 1, 0, 0, 3, 3);
			}
		}
    }
}

