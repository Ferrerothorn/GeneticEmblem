package units.designed;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronLance;
import weapons.IronSword;

public class Fiora extends Unit {

	public Fiora(String job){
	this.setName("Fiora");
	this.setJob(job);
	this.addWeapon(new IronLance());
	this.setHpBase(17);
	this.setStrBase(6);
	this.setSkillBase(7);
	this.setSpeedBase(10);
	this.setLuckBase(4);
	this.setDefBase(5);
	this.setResBase(4);
	
	this.setHpGr(70);
	this.setStrGr(35);
	this.setSkillGr(60);
	this.setSpeedGr(50);
	this.setLuckGr(30);
	this.setDefGr(20);
	this.setResGr(50);

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

