package units.designed;

import units.factory.Unit;
import weapons.*;

public class Eliwood extends Unit {

	public Eliwood(String promotion){
	this.setName("Eliwood");
	this.setJob(promotion);
	this.addWeapon(new IronSword());
	this.setHpBase(18);
	this.setStrBase(5);
	this.setSkillBase(5);
	this.setSpeedBase(7);
	this.setLuckBase(7);
	this.setDefBase(5);
	this.setResBase(0);
	
	this.setHpGr(80);
	this.setStrGr(45);
	this.setSkillGr(50);
	this.setSpeedGr(40);
	this.setLuckGr(45);
	this.setDefGr(30);
	this.setResGr(35);

	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
	}

	public void promote(){
		switch (this.getJob()){
			case "Knight Lord":
				this.addWeapon(new IronLance());
				this.setStrCap(27);
				this.setSkillCap(26);
				this.setSpeedCap(24);
				this.setDefCap(23);
				this.setResCap(25);
				this.gainPromotionStats(4, 2, 0, 1, 1, 3);
		}
	}
}

