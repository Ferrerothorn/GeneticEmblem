package units.designed;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronBow;
import weapons.IronSword;

public class Bartre extends Unit {

    public Bartre(String job) {
        this.setName("Bartre");
        this.setJob(job);
        this.addWeapon(new IronAxe());
        this.setHpBase(28);
        this.setStrBase(9);
        this.setSkillBase(5);
        this.setSpeedBase(3);
        this.setLuckBase(4);
        this.setDefBase(4);
        this.setResBase(0);

        this.setHpGr(85);
        this.setStrGr(50);
        this.setSkillGr(35);
        this.setSpeedGr(40);
        this.setLuckGr(30);
        this.setDefGr(30);
        this.setResGr(25);

        this.setStrCap(20);
        this.setSkillCap(20);
        this.setSpeedCap(20);
        this.setDefCap(20);
        this.setResCap(20);
    }

    public void promote() {
        switch (this.getJob()) {
            case "Warrior" -> {
                this.addWeapon(new IronBow());
                this.setStrCap(30);
                this.setSkillCap(28);
                this.setSpeedCap(26);
                this.setDefCap(26);
                this.setResCap(22);
                this.gainPromotionStats(3, 1, 2, 0, 3, 3);
            }
            case "Hero" -> {
                this.setStrCap(25);
                this.setSkillCap(30);
                this.setSpeedCap(26);
                this.setDefCap(25);
                this.setResCap(22);
                this.addWeapon(new IronSword());
                this.gainPromotionStats(4, 0, 2, 2, 2, 2);
            }
        }
    }
}

