package units.designed;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronBow;
import weapons.IronSword;

public class Dorcas extends Unit {

    public Dorcas(String job) {
        this.setName("Dorcas");
        this.setJob(job);
        this.addWeapon(new IronAxe());
        this.setHpBase(28);
        this.setStrBase(6);
        this.setSkillBase(6);
        this.setSpeedBase(6);
        this.setLuckBase(2);
        this.setDefBase(3);
        this.setResBase(0);

        this.setHpGr(80);
        this.setStrGr(60);
        this.setSkillGr(40);
        this.setSpeedGr(20);
        this.setLuckGr(40);
        this.setDefGr(25);
        this.setResGr(15);

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

