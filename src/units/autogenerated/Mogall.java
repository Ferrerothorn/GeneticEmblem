package units.autogenerated;

import units.factory.Unit;
import weapons.*;

public class Mogall extends Unit { 

public Mogall() {

    this.setJob("Mogall");
    this.addWeapon(new Flux());
    this.setTrait("Monster");
    this.setHpBase(20);
    this.setCurrentHp(this.getHpBase());
    this.setStrBase(8);
    this.setSkillBase(5);
    this.setSpeedBase(9);
    this.setLuckBase(0);
    this.setDefBase(3);
    this.setResBase(8);

    this.setHpGr(40);
    this.setStrGr(65);
    this.setSkillGr(40);
    this.setSpeedGr(60);
    this.setLuckGr(0);
    this.setDefGr(30);
    this.setResGr(60);

    this.setStrCap(29);
    this.setSkillCap(23);
    this.setSpeedCap(29);
    this.setDefCap(20);
    this.setResCap(27);
    }
}
