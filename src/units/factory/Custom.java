package units.factory;

import java.util.ArrayList;

import weapons.Weapon;

public class Custom extends Unit {

	public Custom(ArrayList<Weapon> weps, int baseHP, int strBase, int skillBase, int speedBase, int luckBase,
			int defBase, int resBase, int hpGr, int strGr, int skillGr, int speedGr, int luckGr, int defGr, int resGr,
			int strCap, int speedCap, int skillCap, int defCap, int resCap) {
		this.setJob("Custom");
		this.setWeapons(weps);
		this.setHpBase(baseHP);
		this.setCurrentHp(this.getHpBase());

		this.setStrBase(strBase);
		this.setSkillBase(skillBase);
		this.setSpeedBase(speedBase);
		this.setLuckBase(luckBase);
		this.setDefBase(defBase);
		this.setResBase(resBase);

		this.setHpGr(hpGr);
		this.setStrGr(strGr);
		this.setSkillGr(skillGr);
		this.setSpeedGr(speedGr);
		this.setLuckGr(luckGr);
		this.setDefGr(defGr);
		this.setResGr(resGr);

		this.setStrCap(strCap);
		this.setSkillCap(skillCap);
		this.setSpeedCap(speedCap);
		this.setDefCap(defCap);
		this.setResCap(resCap);
	}
}