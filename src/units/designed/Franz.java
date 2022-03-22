package units.designed;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronLance;
import weapons.IronSword;

public class Franz extends Unit {

    public Franz(String promotion) {
        this.setName("Franz");
        this.setJob(promotion);
        this.addWeapon(new IronLance());
        this.addWeapon(new IronSword());
        this.setHpBase(20);
        this.setStrBase(7);
        this.setSkillBase(5);
        this.setSpeedBase(7);
        this.setLuckBase(2);
        this.setDefBase(6);
        this.setResBase(1);

        this.setHpGr(80);
        this.setStrGr(40);
        this.setSkillGr(40);
        this.setSpeedGr(50);
        this.setLuckGr(40);
        this.setDefGr(25);
        this.setResGr(20);

        this.setStrCap(20);
        this.setSkillCap(20);
        this.setSpeedCap(20);
        this.setDefCap(20);
        this.setResCap(20);
    }

    public void promote() {
        switch (this.getJob()) {
            case "Great Knight" -> {
                this.addWeapon(new IronAxe());
                this.setStrCap(28);
                this.setSkillCap(24);
                this.setSpeedCap(24);
                this.setDefCap(29);
                this.setResCap(25);
                this.gainPromotionStats(3, 2, 1, 1, 2, 1);
            }
            case "Paladin" -> {
                this.setStrCap(25);
                this.setSkillCap(26);
                this.setSpeedCap(24);
                this.setDefCap(25);
                this.setResCap(25);
                this.gainPromotionStats(2, 1, 1, 1, 2, 1);
            }
        }
    }
}



