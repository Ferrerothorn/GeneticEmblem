package units.generated;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronSword;

public class Tank extends Unit {
	
	public Tank(){
	this.setJob("Tank");
	this.addWeapon(new IronAxe());
	this.addWeapon(new IronSword());
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
