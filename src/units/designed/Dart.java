package units.designed;

import units.factory.Unit;
import weapons.IronAxe;

public class Dart extends Unit {

	public Dart(String job){
	this.setName("Dart");
	this.setJob(job);
	this.addWeapon(new IronAxe());
	this.setHpBase(29);
	this.setStrBase(7);
	this.setSkillBase(7);
	this.setSpeedBase(4);
	this.setLuckBase(1);
	this.setDefBase(5);
	this.setResBase(0);
	
	this.setHpGr(70);
	this.setStrGr(65);
	this.setSkillGr(20);
	this.setSpeedGr(60);
	this.setLuckGr(35);
	this.setDefGr(20);
	this.setResGr(15);
	
	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
	}

	public void promote(){
		this.setBaseCrit(15);
		this.setStrCap(30);
		this.setSkillCap(29);
		this.setSpeedCap(28);
		this.setDefCap(23);
		this.setResCap(21);
		this.gainPromotionStats(4, 2, 1, 1, 2, 2);
	}
}

