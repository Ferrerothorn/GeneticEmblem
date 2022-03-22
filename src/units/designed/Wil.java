package units.designed;

import units.factory.Unit;
import weapons.IronBow;

public class Wil extends Unit {

	public Wil(String job){
	this.setName("Wil");
	this.setJob(job);
	this.addWeapon(new IronBow());
	this.setHpBase(19);
	this.setStrBase(6);
	this.setSkillBase(5);
	this.setSpeedBase(6);
	this.setLuckBase(6);
	this.setDefBase(5);
	this.setResBase(0);
	
	this.setHpGr(75);
	this.setStrGr(50);
	this.setSkillGr(50);
	this.setSpeedGr(40);
	this.setLuckGr(40);
	this.setDefGr(20);
	this.setResGr(25);
	
	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
	}

	public void promote(){
		this.setStrCap(25);
		this.setSkillCap(30);
		this.setSpeedCap(28);
		this.setDefCap(25);
		this.setResCap(23);
		this.gainPromotionStats(3, 1, 2, 2, 2, 3);
	}

}

