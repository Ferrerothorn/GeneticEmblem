package units.designed;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronLance;
import weapons.IronSword;

public class Forde extends Unit {

    public Forde(String promotion) {
        this.setName("Forde");
        this.setJob(promotion);
        this.addWeapon(new IronLance());
        this.addWeapon(new IronSword());
        this.setHpBase(20);
        this.setStrBase(5);
        this.setSkillBase(6);
        this.setSpeedBase(6);
        this.setLuckBase(5);
        this.setDefBase(7);
        this.setResBase(1);

        this.setHpGr(85);
        this.setStrGr(40);
        this.setSkillGr(50);
        this.setSpeedGr(45);
        this.setLuckGr(35);
        this.setDefGr(20);
        this.setResGr(25);

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


