package units.designed;

import units.factory.Unit;
import weapons.IronBow;

public class Rebecca extends Unit {

	public Rebecca(String job){
	this.setName("Rebecca");
	this.setJob(job);
	this.addWeapon(new IronBow());
	this.setHpBase(17);
	this.setStrBase(4);
	this.setSkillBase(5);
	this.setSpeedBase(6);
	this.setLuckBase(4);
	this.setDefBase(3);
	this.setResBase(1);
	
	this.setHpGr(60);
	this.setStrGr(40);
	this.setSkillGr(50);
	this.setSpeedGr(60);
	this.setLuckGr(50);
	this.setDefGr(15);
	this.setResGr(30);
	
	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
	}

	public void promote(){
		this.setStrCap(24);
		this.setSkillCap(30);
		this.setSpeedCap(29);
		this.setDefCap(24);
		this.setResCap(24);
		this.gainPromotionStats(4, 3, 1, 1, 2, 2);
	}
}

