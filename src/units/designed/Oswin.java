package units.designed;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronLance;

public class Oswin extends Unit {

    public Oswin(String job) {
        this.setJob(job);
        this.setName("Oswin");
        this.addWeapon(new IronLance());
        this.setHpBase(21);
        this.setStrBase(10);
        this.setSkillBase(7);
        this.setSpeedBase(3);
        this.setLuckBase(0);
        this.setDefBase(9);
        this.setResBase(1);

        this.setHpGr(90);
        this.setStrGr(40);
        this.setSkillGr(30);
        this.setSpeedGr(30);
        this.setLuckGr(35);
        this.setDefGr(55);
        this.setResGr(30);

        this.setStrCap(20);
        this.setSkillCap(20);
        this.setSpeedCap(20);
        this.setDefCap(20);
        this.setResCap(20);
    }

    public void promote() {
        switch (this.getJob()) {
            case "General" -> {
                this.addWeapon(new IronAxe());
                this.setStrCap(29);
                this.setSkillCap(27);
                this.setSpeedCap(24);
                this.setDefCap(30);
                this.setResCap(25);
                this.gainPromotionStats(4, 2, 2, 3, 2, 3);
            }
            case "Great Knight" -> {
                this.setStrCap(28);
                this.setSkillCap(24);
                this.setSpeedCap(24);
                this.setDefCap(29);
                this.setResCap(25);
                this.gainPromotionStats(3, 2, 1, 2, 2, 1);
            }
        }
    }
}

