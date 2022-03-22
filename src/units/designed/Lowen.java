package units.designed;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronLance;
import weapons.IronSword;

public class Lowen extends Unit {

	public Lowen(String job){
	this.setName("Lowen");
	this.setJob(job);
	this.addWeapon(new IronLance());
	this.addWeapon(new IronSword());
	this.setHpBase(22);
	this.setStrBase(7);
	this.setSkillBase(5);
	this.setSpeedBase(7);
	this.setLuckBase(3);
	this.setDefBase(7);
	this.setResBase(0);
	
	this.setHpGr(90);
	this.setStrGr(30);
	this.setSkillGr(30);
	this.setSpeedGr(30);
	this.setLuckGr(50);
	this.setDefGr(40);
	this.setResGr(30);
	
	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
	}

	public void promote(){
		this.addWeapon(new IronAxe());
		switch (this.getJob()) {
			case "Great Knight" -> {
				this.setStrCap(28);
				this.setSkillCap(24);
				this.setSpeedCap(24);
				this.setDefCap(29);
				this.setResCap(25);
				this.gainPromotionStats(3, 2, 1, 2, 2, 1);
			}
			case "Paladin" -> {
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

