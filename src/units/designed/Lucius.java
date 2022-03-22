package units.designed;

import units.factory.Unit;
import weapons.Lightning;

public class Lucius extends Unit {

	public Lucius(String job){
	this.setName("Lucius");
	this.setJob(job);
	this.addWeapon(new Lightning());
	this.setHpBase(16);
	this.setStrBase(6);
	this.setSkillBase(5);
	this.setSpeedBase(9);
	this.setLuckBase(2);
	this.setDefBase(1);
	this.setResBase(5);
	
	this.setHpGr(55);
	this.setStrGr(60);
	this.setSkillGr(50);
	this.setSpeedGr(40);
	this.setLuckGr(20);
	this.setDefGr(10);
	this.setResGr(60);

	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
	}

	public void promote(){
		this.setStrCap(25);
		this.setSkillCap(26);
		this.setSpeedCap(24);
		this.setDefCap(22);
		this.setResCap(30);
		this.gainPromotionStats(3, 2, 1, 0, 3, 2);
	}

}

