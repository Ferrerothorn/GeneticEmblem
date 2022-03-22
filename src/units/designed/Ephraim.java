package units.designed;

import units.factory.Unit;
import weapons.IronLance;
import weapons.IronSword;

public class Ephraim extends Unit {

	public Ephraim(String job){
	this.setName("Ephraim");
	this.setJob(job);
	this.addWeapon(new IronLance());
	this.setHpBase(21);
	this.setStrBase(6);
	this.setSkillBase(7);
	this.setSpeedBase(10);
	this.setLuckBase(7);
	this.setDefBase(6);
	this.setResBase(1);
	
	this.setHpGr(80);
	this.setStrGr(55);
	this.setSkillGr(55);
	this.setSpeedGr(45);
	this.setLuckGr(50);
	this.setDefGr(35);
	this.setResGr(25);
	
	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
	}

	public void promote(){
		this.setStrCap(27);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(23);
		this.setResCap(23);
		this.gainPromotionStats(4, 2, 3, 2, 2, 5);
	}
}

