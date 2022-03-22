package units.designed;

import units.factory.Unit;
import weapons.IronLance;
import weapons.IronSword;

public class Farina extends Unit {

    public Farina(String job) {
        this.setName("Farina");
        this.setJob(job);
        this.addWeapon(new IronLance());
        this.setHpBase(16);
        this.setStrBase(5);
        this.setSkillBase(9);
        this.setSpeedBase(9);
        this.setLuckBase(5);
        this.setDefBase(7);
        this.setResBase(9);

        this.setHpGr(75);
        this.setStrGr(50);
        this.setSkillGr(40);
        this.setSpeedGr(45);
        this.setLuckGr(45);
        this.setDefGr(25);
        this.setResGr(30);

        this.setStrCap(20);
        this.setSkillCap(20);
        this.setSpeedCap(20);
        this.setDefCap(20);
        this.setResCap(20);
    }

    public void promote() {
        switch (this.getJob()) {
            case "Falcoknight" -> {
                this.addWeapon(new IronSword());
                this.setStrCap(23);
                this.setSkillCap(25);
                this.setSpeedCap(28);
                this.setDefCap(23);
                this.setResCap(26);
                this.gainPromotionStats(5, 2, 0, 0, 2, 2);
            }
        }
    }
}

