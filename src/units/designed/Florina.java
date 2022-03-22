package units.designed;

import units.factory.Unit;
import weapons.IronLance;
import weapons.IronSword;

public class Florina extends Unit {

	public Florina(String job){
	this.setName("Florina");
	this.setJob(job);
	this.addWeapon(new IronLance());
	this.setHpBase(17);
	this.setStrBase(5);
	this.setSkillBase(7);
	this.setSpeedBase(9);
	this.setLuckBase(7);
	this.setDefBase(4);
	this.setResBase(4);
	
	this.setHpGr(60);
	this.setStrGr(40);
	this.setSkillGr(50);
	this.setSpeedGr(55);
	this.setLuckGr(50);
	this.setDefGr(15);
	this.setResGr(35);
	
	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
	}

	public void promote(){
		switch (this.getJob()) {
			case "Falcoknight" -> {
				this.addWeapon(new IronSword());
				this.setStrCap(23);
				this.setSkillCap(25);
				this.setSpeedCap(28);
				this.setDefCap(23);
				this.setResCap(26);
				this.gainPromotionStats(5, 2, 0, 0, 2, 2);
			}
		}
	}
}

