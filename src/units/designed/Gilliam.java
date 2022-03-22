package units.designed;

import units.factory.Unit;
import weapons.IronAxe;
import weapons.IronLance;
import weapons.IronSword;

public class Gilliam extends Unit {

	public Gilliam(String job){
	this.setName("Gilliam");
	this.setJob(job);
	this.addWeapon(new IronLance());
	this.setHpBase(22);
	this.setStrBase(8);
	this.setSkillBase(5);
	this.setSpeedBase(2);
	this.setLuckBase(2);
	this.setDefBase(7);
	this.setResBase(2);
	
	this.setHpGr(90);
	this.setStrGr(45);
	this.setSkillGr(35);
	this.setSpeedGr(30);
	this.setLuckGr(30);
	this.setDefGr(55);
	this.setResGr(20);

	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
}
	public void promote(){
		this.addWeapon(new IronAxe());
		this.addWeapon(new IronSword());
		switch (this.getJob()) {
			case "General" -> {
				this.setStrCap(29);
				this.setSkillCap(27);
				this.setSpeedCap(24);
				this.setDefCap(30);
				this.setResCap(25);
				this.gainPromotionStats(4, 2, 2, 3, 2, 3);
			}
			case "Great Knight" -> {
				this.setStrCap(28);
				this.setSkillCap(24);
				this.setSpeedCap(24);
				this.setDefCap(29);
				this.setResCap(25);
				this.gainPromotionStats(3, 2, 1, 2, 2, 1);
			}
		}
	}
}

