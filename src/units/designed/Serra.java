package units.designed;

import units.factory.Unit;
import weapons.Lightning;

public class Serra extends Unit {

	public Serra(String job){
	this.setName("Serra");
	this.setJob(job);
	this.addWeapon(new Lightning());
	this.setHpBase(17);
	this.setStrBase(2);
	this.setSkillBase(5);
	this.setSpeedBase(8);
	this.setLuckBase(6);
	this.setDefBase(2);
	this.setResBase(5);
	
	this.setHpGr(50);
	this.setStrGr(50);
	this.setSkillGr(30);
	this.setSpeedGr(40);
	this.setLuckGr(60);
	this.setDefGr(15);
	this.setResGr(55);

	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);

	}

	public void promote(){
		this.setStrCap(25);
		this.setSkillCap(25);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(30);
		this.gainPromotionStats(3, 1, 2, 1, 2, 2);
	}
}

