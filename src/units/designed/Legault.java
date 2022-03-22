package units.designed;

import units.factory.Unit;
import weapons.IronSword;

public class Legault extends Unit {

	public Legault(String job){
	this.setName("Legault");
	this.setJob(job);
	this.addWeapon(new IronSword());
	this.setHpBase(19);
	this.setStrBase(5);
	this.setSkillBase(6);
	this.setSpeedBase(8);
	this.setLuckBase(3);
	this.setDefBase(5);
	this.setResBase(0);
	
	this.setHpGr(60);
	this.setStrGr(25);
	this.setSkillGr(45);
	this.setSpeedGr(60);
	this.setLuckGr(60);
	this.setDefGr(25);
	this.setResGr(25);

	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
	}

	public void promote(){
		this.addTrait("Assassin");
		this.setSkillCap(30);
		this.setSpeedCap(30);
		this.gainPromotionStats(3, 1, 0, 0, 2, 2);
	}
}

