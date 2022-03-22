package units.designed;

import units.factory.Unit;
import weapons.Fire;
import weapons.Flux;

public class Canas extends Unit {

	public Canas(String promotion){
	this.setName("Canas");
	this.setJob(promotion);
	this.addWeapon(new Flux());
	this.setHpBase(16);
	this.setStrBase(7);
	this.setSkillBase(6);
	this.setSpeedBase(6);
	this.setLuckBase(5);
	this.setDefBase(3);
	this.setResBase(5);
	
	this.setHpGr(70);
	this.setStrGr(45);
	this.setSkillGr(40);
	this.setSpeedGr(35);
	this.setLuckGr(25);
	this.setDefGr(25);
	this.setResGr(45);

	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
}

	public void promote(){
		switch (this.getJob()) {
			case "Druid":
			this.setStrCap(29);
			this.setSkillCap(26);
			this.setSpeedCap(26);
			this.setDefCap(21);
			this.setResCap(28);
			this.gainPromotionStats(4, 0, 0, 3, 2, 2);
			break;
		}
	}


}

