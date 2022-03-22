package units.designed;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronSword;

public class Guy extends Unit {

	public Guy(String job){
	this.setName("Guy");
	this.setJob(job);
	this.addWeapon(new IronSword());
	this.setHpBase(20);
	this.setStrBase(5);
	this.setSkillBase(10);
	this.setSpeedBase(10);
	this.setLuckBase(1);
	this.setDefBase(5);
	this.setResBase(0);
	
	this.setHpGr(75);
	this.setStrGr(30);
	this.setSkillGr(50);
	this.setSpeedGr(70);
	this.setLuckGr(45);
	this.setDefGr(15);
	this.setResGr(25);
	
	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
	}

	public void promote(){
		switch(this.getJob()){
			case "Swordmaster":
				this.setBaseCrit(15);
				this.setStrCap(24);
				this.setSkillCap(29);
				this.setSpeedCap(30);
				this.setDefCap(22);
				this.setResCap(23);
				this.gainPromotionStats(5, 2, 0, 0, 2, 1);
				break;
			case "Assassin":
				this.setSkillCap(30);
				this.setSpeedCap(30);
				this.addTrait("Assassin");
				this.gainPromotionStats(3, 1, 0, 0, 2, 2);
				break;
		}
	}
}

