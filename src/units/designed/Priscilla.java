package units.designed;

import units.factory.Unit;
import weapons.Fire;

public class Priscilla extends Unit {

	public Priscilla(String job){
	this.setName("Priscilla");
	this.setJob(job);
	this.addWeapon(new Fire());
	this.setHpBase(15);
	this.setStrBase(5);
	this.setSkillBase(5);
	this.setSpeedBase(7);
	this.setLuckBase(6);
	this.setDefBase(3);
	this.setResBase(5);
	
	this.setHpGr(45);
	this.setStrGr(40);
	this.setSkillGr(50);
	this.setSpeedGr(40);
	this.setLuckGr(65);
	this.setDefGr(15);
	this.setResGr(50);

	this.setStrCap(20);
	this.setSkillCap(20);
	this.setSpeedCap(20);
	this.setDefCap(20);
	this.setResCap(20);
}
	public void promote(){
		this.setStrCap(25);
		this.setSkillCap(24);
		this.setSpeedCap(25);
		this.setDefCap(24);
		this.setResCap(28);
		this.gainPromotionStats(3, 2, 1, 0, 2, 3);
	}


}

