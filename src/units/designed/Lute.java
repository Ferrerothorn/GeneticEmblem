package units.designed;

import units.factory.Unit;
import weapons.Fire;
import weapons.Lightning;

public class Lute extends Unit {

    public Lute(String job) {
        this.setName("Lute");
        this.setJob(job);
        this.addWeapon(new Fire());
        this.setHpBase(17);
        this.setStrBase(6);
        this.setSkillBase(6);
        this.setSpeedBase(7);
        this.setLuckBase(8);
        this.setDefBase(3);
        this.setResBase(5);

        this.setHpGr(45);
        this.setStrGr(65);
        this.setSkillGr(30);
        this.setSpeedGr(45);
        this.setLuckGr(45);
        this.setDefGr(15);
        this.setResGr(40);

        this.setStrCap(20);
        this.setSkillCap(20);
        this.setSpeedCap(20);
        this.setDefCap(20);
        this.setResCap(20);
    }

    public void promote() {
        switch (this.getJob()) {
            case "Sage":
                this.addWeapon(new Lightning());
                this.setStrCap(30);
                this.setSkillCap(28);
                this.setSpeedCap(26);
                this.setDefCap(21);
                this.setResCap(25);
                this.gainPromotionStats(3, 1, 1, 0, 3, 3);
                break;
            case "Mage Knight":
                this.setStrCap(25);
                this.setSkillCap(24);
                this.setSpeedCap(25);
                this.setDefCap(24);
                this.setResCap(28);
                this.gainPromotionStats(3, 2, 1, 0, 2, 2);
                break;
        }
    }
}

