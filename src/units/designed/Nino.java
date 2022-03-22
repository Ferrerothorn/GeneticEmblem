package units.designed;

import units.factory.Unit;
import weapons.Fire;

public class Nino extends Unit {

	public Nino(String job){
	this.setName("Nino");
	this.setJob(job);
	this.addWeapon(new Fire());
	this.setHpBase(17);
	this.setStrBase(5);
	this.setSkillBase(6);
	this.setSpeedBase(9);
	this.setLuckBase(8);
	this.setDefBase(3);
	this.setResBase(5);
	
	this.setHpGr(55);
	this.setStrGr(50);
	this.setSkillGr(55);
	this.setSpeedGr(60);
	this.setLuckGr(45);
	this.setDefGr(15);
	this.setResGr(50);

	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
	}

	public void promote(){
		this.setStrCap(30);
		this.setSkillCap(28);
		this.setSpeedCap(26);
		this.setDefCap(21);
		this.setResCap(25);
		this.gainPromotionStats(3, 1, 1, 0, 3, 3);
	}
}

