package units.designed;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronLance;
import weapons.IronSword;

public class Wallace extends Unit {

	public Wallace(String job){
	this.setName("Wallace");
	this.setJob(job);
	this.addWeapon(new IronLance());
	this.setHpBase(22);
	this.setStrBase(8);
	this.setSkillBase(3);
	this.setSpeedBase(3);
	this.setLuckBase(7);
	this.setDefBase(11);
	this.setResBase(0);
	
	this.setHpGr(70);
	this.setStrGr(45);
	this.setSkillGr(40);
	this.setSpeedGr(20);
	this.setLuckGr(30);
	this.setDefGr(35);
	this.setResGr(35);
	
	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
	}

	public void promote(){
		switch (this.getJob()){
			case "General":
				this.addWeapon(new IronAxe());
				this.setStrCap(29);
				this.setSkillCap(27);
				this.setSpeedCap(24);
				this.setDefCap(30);
				this.setResCap(25);
				this.gainPromotionStats(4, 2, 2, 3, 2, 3);
				break;
		}
	}

}

