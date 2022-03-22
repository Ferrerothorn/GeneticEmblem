package units.designed;

import units.factory.Unit;
import weapons.*;

public class Lyn extends Unit {
	
	public Lyn(String job){
	this.setName("Lyn");
	this.setJob(job);
	this.addWeapon(new IronSword());
	this.setHpBase(16);
	this.setStrBase(4);
	this.setSkillBase(7);
	this.setSpeedBase(9);
	this.setLuckBase(5);
	this.setDefBase(2);
	this.setResBase(0);
	
	this.setHpGr(70);
	this.setStrGr(40);
	this.setSkillGr(60);
	this.setSpeedGr(60);
	this.setLuckGr(55);
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
			case "Blade Lord" -> {
				this.addWeapon(new IronBow());
				this.setStrCap(24);
				this.setSkillCap(29);
				this.setSpeedCap(30);
				this.setDefCap(22);
				this.setResCap(22);
				this.gainPromotionStats(3, 2, 2, 0, 3, 5);
			}
		}

	}
}

