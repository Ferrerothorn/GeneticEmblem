package units.designed;

import units.factory.Unit;
import weapons.IronSword;

public class Matthew extends Unit {

	public Matthew(String job){
	this.setName("Matthew");
	this.setJob(job);
	this.addWeapon(new IronSword());
	this.setHpBase(17);
	this.setStrBase(4);
	this.setSkillBase(4);
	this.setSpeedBase(11);
	this.setLuckBase(2);
	this.setDefBase(3);
	this.setResBase(0);
	
	this.setHpGr(75);
	this.setStrGr(30);
	this.setSkillGr(40);
	this.setSpeedGr(70);
	this.setLuckGr(50);
	this.setDefGr(25);
	this.setResGr(20);

		this.setStrCap(20);
		this.setSkillCap(20);
		this.setSpeedCap(20);
		this.setDefCap(20);
		this.setResCap(20);
	}

	public void promote(){
		this.setSkillCap(30);
		this.setSpeedCap(30);
		this.addTrait("Assassin");
		this.gainPromotionStats(3, 1, 0, 0, 2, 2);
	}
}

