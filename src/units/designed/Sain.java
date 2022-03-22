package units.designed;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronLance;
import weapons.IronSword;

public class Sain extends Unit {

public Sain(String promotion) {
	this.setName("Sain");
	this.setJob(promotion);
	this.addWeapon(new IronLance());
	this.addWeapon(new IronSword());
	this.setHpBase(19);
	this.setStrBase(8);
	this.setSkillBase(4);
	this.setSpeedBase(6);
	this.setLuckBase(4);
	this.setDefBase(6);
	this.setResBase(0);
	
	this.setHpGr(80);
	this.setStrGr(60);
	this.setSkillGr(35);
	this.setSpeedGr(40);
	this.setLuckGr(35);
	this.setDefGr(20);
	this.setResGr(20);
	
	this.setStrCap(25);
	this.setSkillCap(26);
	this.setSpeedCap(24);
	this.setDefCap(25);
	this.setResCap(25);
	}

	public void promote(){
		switch (this.getJob()) {
			case "Great Knight" -> {
				this.addWeapon(new IronAxe());
				this.setStrCap(28);
				this.setSkillCap(24);
				this.setSpeedCap(24);
				this.setDefCap(29);
				this.setResCap(25);
				this.gainPromotionStats(3, 2, 1, 2, 2, 1);
			}
			case "Paladin" -> {
				this.addWeapon(new IronAxe());
				this.setStrCap(25);
				this.setSkillCap(26);
				this.setSpeedCap(24);
				this.setDefCap(25);
				this.setResCap(25);
				this.gainPromotionStats(2, 1, 1, 1, 2, 1);
			}
		}
	}
}

