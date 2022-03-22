package units.designed;

import units.factory.Unit;
import weapons.*;

public class Raven extends Unit {

	public Raven(String job){
	this.setName("Raven");
	this.setJob(job);
	this.addWeapon(new IronSword());
	this.setHpBase(22);
	this.setStrBase(6);
	this.setSkillBase(9);
	this.setSpeedBase(11);
	this.setLuckBase(1);
	this.setDefBase(4);
	this.setResBase(0);
	
	this.setHpGr(85);
	this.setStrGr(55);
	this.setSkillGr(40);
	this.setSpeedGr(45);
	this.setLuckGr(35);
	this.setDefGr(25);
	this.setResGr(15);

	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
	}

	public void promote(){
		switch(this.getJob()) {
			case "Hero":
			this.setStrCap(25);
			this.setSkillCap(30);
			this.setSpeedCap(26);
			this.setDefCap(25);
			this.setResCap(22);
			this.addWeapon(new IronAxe());
			this.gainPromotionStats(4, 0, 2, 2, 2, 2);
			break;
		}
	}

}

