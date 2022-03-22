package units.designed;

import units.factory.Unit;
import weapons.IronBow;
import weapons.IronSword;

public class Eirika extends Unit {

	public Eirika(String job){
	this.setName("Eirika");
	this.setJob(job);
	this.addWeapon(new IronSword());
	this.setHpBase(16);
	this.setStrBase(4);
	this.setSkillBase(8);
	this.setSpeedBase(9);
	this.setLuckBase(5);
	this.setDefBase(3);
	this.setResBase(1);
	
	this.setHpGr(70);
	this.setStrGr(40);
	this.setSkillGr(60);
	this.setSpeedGr(60);
	this.setLuckGr(60);
	this.setDefGr(30);
	this.setResGr(30);
	
	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
	}

	public void promote(){
		this.setStrCap(24);
		this.setSkillCap(29);
		this.setSpeedCap(30);
		this.setDefCap(22);
		this.setResCap(25);
		this.gainPromotionStats(4, 2, 2, 1, 3, 5);
	}
}

