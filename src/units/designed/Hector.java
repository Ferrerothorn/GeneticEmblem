package units.designed;

import units.factory.Unit;
import weapons.*;

public class Hector extends Unit {

    public Hector(String job) {
        this.setName("Hector");
        this.setJob(job);
        this.addWeapon(new IronAxe());
        this.setHpBase(19);
        this.setStrBase(7);
        this.setSkillBase(4);
        this.setSpeedBase(5);
        this.setLuckBase(3);
        this.setDefBase(8);
        this.setResBase(0);

        this.setHpGr(90);
        this.setStrGr(60);
        this.setSkillGr(45);
        this.setSpeedGr(35);
        this.setLuckGr(30);
        this.setDefGr(50);
        this.setResGr(25);

        this.setStrCap(20);
        this.setSkillCap(20);
        this.setSpeedCap(20);
        this.setDefCap(20);
        this.setResCap(20);
    }

    public void promote() {
        this.addWeapon(new IronSword());
        this.setStrCap(30);
        this.setSkillCap(24);
        this.setSpeedCap(24);
        this.setDefCap(29);
        this.gainPromotionStats(3, 0, 2, 3, 1, 5);
    }
}

