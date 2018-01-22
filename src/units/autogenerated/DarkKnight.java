package units.autogenerated;

import units.factory.Unit;
import weapons.*;

public class DarkKnight extends Unit { 

public DarkKnight() {

    this.setJob("DarkKnight");
    this.addWeapon(new IronLance());
    this.addWeapon(new Flux());
    this.setHpBase(21);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(6);
    this.setSkillBase(7);
    this.setSpeedBase(9);
    this.setLuckBase(3);
    this.setDefBase(5);
    this.setResBase(3);

    this.setHpGr(50);
    this.setStrGr(55);
    this.setSkillGr(60);
    this.setSpeedGr(65);
    this.setLuckGr(20);
    this.setDefGr(25);
    this.setResGr(25);

    this.setStrCap(27);
    this.setSkillCap(27);
    this.setSpeedCap(28);
    this.setDefCap(24);
    this.setResCap(23);
    }
}
