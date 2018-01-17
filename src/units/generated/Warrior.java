package units.generated;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronBow;

public class Warrior extends Unit {
	
	public Warrior(){
	this.setJob("Warrior");
	this.addWeapon(new IronBow());
	this.addWeapon(new IronAxe());
	this.setHpBase(23);
	this.setStrBase(9);
	this.setSkillBase(7);
	this.setSpeedBase(4);
	this.setLuckBase(6);
	this.setDefBase(5);
	this.setResBase(2);
	
	this.setHpGr(80);
	this.setStrGr(60);
	this.setSkillGr(40);
	this.setSpeedGr(35);
	this.setLuckGr(40);
	this.setDefGr(25);
	this.setResGr(15);
	
	this.setStrCap();
	this.setSkillCap();
	this.setSpeedCap();
	this.setDefCap();
	this.setResCap();
	}


	}

