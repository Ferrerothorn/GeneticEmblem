package units.designed;

import units.factory.Unit;
import weapons.IronSword;

public class Joshua extends Unit {

	public Joshua(String job){
	this.setName("Joshua");
	this.setJob(job);
	this.addWeapon(new IronSword());
	this.setHpBase(21);
	this.setStrBase(7);
	this.setSkillBase(11);
	this.setSpeedBase(12);
	this.setLuckBase(6);
	this.setDefBase(4);
	this.setResBase(1);
	
	this.setHpGr(80);
	this.setStrGr(35);
	this.setSkillGr(55);
	this.setSpeedGr(55);
	this.setLuckGr(30);
	this.setDefGr(20);
	this.setResGr(20);
	
	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
	}

	public void promote(){
		switch (this.getJob()) {
			case "Swordmaster" -> {
				this.setBaseCrit(15);
				this.setStrCap(24);
				this.setSkillCap(29);
				this.setSpeedCap(30);
				this.setDefCap(22);
				this.setResCap(23);
				this.gainPromotionStats(5, 2, 0, 0, 2, 1);
			}
			case "Assassin" -> {
				this.addTrait("Assassin");
				this.setSkillCap(30);
				this.setSpeedCap(30);
				this.gainPromotionStats(3, 1, 0, 0, 2, 2);
			}
		}
	}
}

