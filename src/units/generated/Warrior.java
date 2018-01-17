package units.generated;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronBow;

public class Warrior extends Unit {
	
	public Warrior(){
	this.setJob("Warrior");
	this.addWeapon(new IronBow());
	this.addWeapon(new IronAxe());
	this.setHpBase();
	this.setStrBase();
	this.setSkillBase();
	this.setSpeedBase();
	this.setLuckBase();
	this.setDefBase();
	this.setResBase();
	
	this.setHpGr();
	this.setStrGr();
	this.setSkillGr();
	this.setSpeedGr();
	this.setLuckGr();
	this.setDefGr();
	this.setResGr();
	
	this.setStrCap();
	this.setSkillCap();
	this.setSpeedCap();
	this.setDefCap();
	this.setResCap();
	}


	}

