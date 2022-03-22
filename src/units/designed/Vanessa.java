package units.designed;

import units.factory.Unit;
import weapons.IronLance;
import weapons.IronSword;

public class Vanessa extends Unit {

	public Vanessa(String job){
	this.setName("Vanessa");
	this.setJob(job);
	this.addWeapon(new IronLance());
	this.setHpBase(17);
	this.setStrBase(5);
	this.setSkillBase(7);
	this.setSpeedBase(11);
	this.setLuckBase(4);
	this.setDefBase(6);
	this.setResBase(5);
	
	this.setHpGr(50);
	this.setStrGr(35);
	this.setSkillGr(55);
	this.setSpeedGr(60);
	this.setLuckGr(50);
	this.setDefGr(20);
	this.setResGr(30);
	
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
				this.gainPromotionStats(5, 2, 0, 2, 2, 2);
			}
			case "Wyvern Knight" -> {
				this.setStrCap(24);
				this.setSkillCap(27);
				this.setSpeedCap(29);
				this.setDefCap(23);
				this.setResCap(23);
				this.gainPromotionStats(3, 2, 1, 2, 1, 1);
			}
		}
	}

}

