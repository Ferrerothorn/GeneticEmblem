package units.designed;

import units.factory.Unit;
import weapons.IronBow;
import weapons.IronSword;

public class Rath extends Unit {

	public Rath(String job){
	this.setName("Rath");
	this.setJob(job);
	this.addWeapon(new IronBow());
	this.setHpBase(20);
	this.setStrBase(5);
	this.setSkillBase(6);
	this.setSpeedBase(7);
	this.setLuckBase(3);
	this.setDefBase(6);
	this.setResBase(1);
	
	this.setHpGr(80);
	this.setStrGr(50);
	this.setSkillGr(40);
	this.setSpeedGr(50);
	this.setLuckGr(30);
	this.setDefGr(10);
	this.setResGr(25);
	
	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
	}

	public void promote(){
		this.addWeapon(new IronSword());
		this.setStrCap(25);
		this.setSkillCap(28);
		this.setSpeedCap(30);
		this.setDefCap(24);
		this.setResCap(23);
		this.gainPromotionStats(3, 2, 1, 1, 3, 3);
	}
}

