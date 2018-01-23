package units.designed;

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
	
	this.setHpGr(85);
	this.setStrGr(65);
	this.setSkillGr(45);
	this.setSpeedGr(35);
	this.setLuckGr(35);
	this.setDefGr(40);
	this.setResGr(15);
	
	this.setStrCap(30);
	this.setSkillCap(26);
	this.setSpeedCap(26);
	this.setDefCap(25);
	this.setResCap(21);
	}


	}

