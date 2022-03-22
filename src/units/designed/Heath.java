package units.designed;

import units.factory.Unit;
import weapons.IronLance;
import weapons.IronSword;

public class Heath extends Unit {

	public Heath(String job){
	this.setName("Heath");
	this.setJob(job);
	this.addWeapon(new IronLance());
	this.setHpBase(23);
	this.setStrBase(8);
	this.setSkillBase(5);
	this.setSpeedBase(4);
	this.setLuckBase(6);
	this.setDefBase(8);
	this.setResBase(0);
	
	this.setHpGr(80);
	this.setStrGr(50);
	this.setSkillGr(50);
	this.setSpeedGr(45);
	this.setLuckGr(20);
	this.setDefGr(30);
	this.setResGr(20);

	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
	}

	public void promote(){
		switch(this.getJob()){
			case "Wyvern Lord":
				this.addWeapon(new IronSword());
				this.setStrCap(27);
				this.setSkillCap(25);
				this.setSpeedCap(23);
				this.setDefCap(28);
				this.setResCap(22);
				this.gainPromotionStats(4, 0, 2, 2, 0, 2);
				break;
			case "Wyvern Knight":
				this.setStrCap(25);
				this.setSkillCap(26);
				this.setSpeedCap(28);
				this.setDefCap(24);
				this.setResCap(22);
				this.gainPromotionStats(3, 1, 2, 3, 0, 1);
		}
	}

}

