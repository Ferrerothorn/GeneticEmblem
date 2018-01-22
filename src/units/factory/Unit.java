package units.factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import weapons.Weapon;

public abstract class Unit {

	String job = "";
	ArrayList<String> traits = new ArrayList<>();
	protected ArrayList<Weapon> backpack = new ArrayList<>();
	Weapon chosenWeapon;
	int lv = 1;
	int currentHp;
	int baseCrit;

	int HpCap = 60;
	int StrCap;
	int SkillCap;
	int SpeedCap;
	int LuckCap = 30;
	int DefCap;
	int ResCap;

	int HpGr;
	int StrGr;
	int SkillGr;
	int SpeedGr;
	int LuckGr;
	int DefGr;
	int ResGr;

	int HpBase;
	int StrBase;
	int SkillBase;
	int SpeedBase;
	int LuckBase;
	int DefBase;
	int ResBase;

	public Unit() {
	}

	public void setBaseCrit(int n) {
		baseCrit = n;
	}

	public int getBaseCrit() {
		return baseCrit;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getHpCap() {
		return HpCap;
	}

	public int getStrCap() {
		return StrCap;
	}

	public void setStrCap(int strCap) {
		StrCap = strCap;
	}

	public int getSkillCap() {
		return SkillCap;
	}

	public void setSkillCap(int skillCap) {
		SkillCap = skillCap;
	}

	public int getSpeedCap() {
		return SpeedCap;
	}

	public void setSpeedCap(int speedCap) {
		SpeedCap = speedCap;
	}

	public int getLuckCap() {
		return LuckCap;
	}

	public void setLuckCap(int luckCap) {
		LuckCap = luckCap;
	}

	public int getDefCap() {
		return DefCap;
	}

	public void setDefCap(int defCap) {
		DefCap = defCap;
	}

	public int getResCap() {
		return ResCap;
	}

	public void setResCap(int resCap) {
		ResCap = resCap;
	}

	public int getHpGr() {
		return HpGr;
	}

	public void setHpGr(int hpGr) {
		HpGr = hpGr;
	}

	public int getStrGr() {
		return StrGr;
	}

	public void setStrGr(int strGr) {
		StrGr = strGr;
	}

	public int getSkillGr() {
		return SkillGr;
	}

	public void setSkillGr(int skillGr) {
		SkillGr = skillGr;
	}

	public int getSpeedGr() {
		return SpeedGr;
	}

	public void setSpeedGr(int speedGr) {
		SpeedGr = speedGr;
	}

	public int getLuckGr() {
		return LuckGr;
	}

	public void setLuckGr(int luckGr) {
		LuckGr = luckGr;
	}

	public int getDefGr() {
		return DefGr;
	}

	public void setDefGr(int defGr) {
		DefGr = defGr;
	}

	public int getResGr() {
		return ResGr;
	}

	public void setResGr(int resGr) {
		ResGr = resGr;
	}

	public int getHpBase() {
		return HpBase;
	}

	public void setHpBase(int hpBase) {
		HpBase = hpBase;
	}

	public int getStrBase() {
		return StrBase;
	}

	public void setStrBase(int strBase) {
		StrBase = strBase;
	}

	public int getSkillBase() {
		return SkillBase;
	}

	public void setSkillBase(int skillBase) {
		SkillBase = skillBase;
	}

	public int getSpeedBase() {
		return SpeedBase;
	}

	public void setSpeedBase(int speedBase) {
		SpeedBase = speedBase;
	}

	public int getLuckBase() {
		return LuckBase;
	}

	public void setLuckBase(int luckBase) {
		LuckBase = luckBase;
	}

	public int setCurrentHp() {
		return currentHp;
	}

	public void setCurrentHp(int newCHP) {
		currentHp = newCHP;
	}

	public ArrayList<Weapon> getWeapons() {
		return backpack;
	}

	public void setWeapons(ArrayList<Weapon> weapons) {
		this.backpack = weapons;
	}

	public void addWeapon(Weapon wep) {
		this.backpack.add(wep);
	}

	public int getDefBase() {
		return DefBase;
	}

	public void setDefBase(int defBase) {
		DefBase = defBase;
	}

	public int getResBase() {
		return ResBase;
	}

	public void setResBase(int resBase) {
		ResBase = resBase;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String s) {
		job = s;
	}

	public void swingAt(Unit target, boolean logging) {

		if (logging) {
			System.out.println(this.getJob() + " swings at " + target.getJob() + "!");
		}
		Random r = new Random();

		int thisAccu = 2 * this.getSkillBase() + this.LuckBase + chosenWeapon.getAcc()
				+ this.triangleAccuracyBonus(chosenWeapon, target.getWeapon());
		int thisPower = this.StrBase + chosenWeapon.getPow()
				+ this.triangleDamageBonus(chosenWeapon, target.getWeapon());

		if (target.getTraits().contains("Flying") && this.getWeapon().getTraits().contains("Arrow")) {
			thisPower += (chosenWeapon.getPow());
		}

		if ((target.getTraits().contains("Mounted") && this.getWeapon().getTraits().contains("Horseslayer"))
				|| (target.getTraits().contains("Armor") && this.getWeapon().getTraits().contains("Armorslayer"))) {
			thisPower += (chosenWeapon.getPow());
		}

		if ((target.getTraits().contains("Monster") && this.getJob().equals("Bishop"))) {
			thisPower += (chosenWeapon.getPow() * 2);
		}

		int pierce = r.nextInt(100);
		if ((this.getTraits().contains("Pierce") && pierce < (this.lv / 2))) {
			thisPower += target.getDefBase();
		}

		int thisCrit = this.SkillBase / 2 + this.getBaseCrit() + 5 + this.chosenWeapon.getCrit() - target.getLuckBase();
		int hitDamage;
		if (this.chosenWeapon.isPhys()) {
			hitDamage = thisPower - target.DefBase;
		} else {
			hitDamage = thisPower - target.ResBase;
		}

		if (hitDamage < 0) {
			hitDamage = 0;
		}

		int theirAvo = 2 * target.SpeedBase + target.LuckBase;
		int overallHitRate = thisAccu - theirAvo;

		if (logging) {
			System.out.println(this.getJob() + " boasts " + overallHitRate + "%" + " accuracy.");
		}

		int hit = r.nextInt(100);

		if (hit < overallHitRate) {

			if (this.getTraits().contains("Assassin")) {
				int killingBlow = r.nextInt(100);
				if (killingBlow <= (thisCrit / 2)) {
					target.currentHp = 0;
					if (logging) {
						System.out.println("KILLING BLOW!");
					}
					return;
				}
			}

			int isCrit = r.nextInt(100);
			if (isCrit <= thisCrit) {
				if (logging) {
					System.out.println("Critical hit!");
				}
				hitDamage *= 3;
			}
			target.currentHp -= hitDamage;
			if (logging) {
				System.out.println("And hits for " + hitDamage + " damage. (" + target.getJob() + " has ["
						+ target.getCurrentHp() + "/" + target.getHpBase() + "] left.)");
			}
		} else {
			if (logging) {
				System.out.println("Miss!");
			}
		}
	}

	private Weapon getWeapon() {
		return chosenWeapon;
	}

	private int triangleDamageBonus(Weapon ours, Weapon theirs) {
		return triangleAccuracyBonus(ours, theirs) / 15;
	}

	private int triangleAccuracyBonus(Weapon ours, Weapon theirs) {
		int bonus = 0;
		if (ours.getTrinity().contains("Lance") && theirs.getTrinity().contains("Sword")) {
			bonus += 15;
		}
		if (ours.getTrinity().contains("Sword") && theirs.getTrinity().contains("Axe")) {
			bonus += 15;
		}
		if (ours.getTrinity().contains("Axe") && theirs.getTrinity().contains("Lance")) {
			bonus += 15;
		}
		if (ours.getTrinity().contains("Anima") && theirs.getTrinity().contains("Light")) {
			bonus += 15;
		}
		if (ours.getTrinity().contains("Light") && theirs.getTrinity().contains("Dark")) {
			bonus += 15;
		}
		if (ours.getTrinity().contains("Dark") && theirs.getTrinity().contains("Anima")) {
			bonus += 15;
		}
		if (ours.getTrinity().contains("Sword") && theirs.getTrinity().contains("Lance")) {
			bonus -= 15;
		}
		if (ours.getTrinity().contains("Lance") && theirs.getTrinity().contains("Axe")) {
			bonus -= 15;
		}
		if (ours.getTrinity().contains("Axe") && theirs.getTrinity().contains("Sword")) {
			bonus -= 15;
		}
		if (ours.getTrinity().contains("Dark") && theirs.getTrinity().contains("Light")) {
			bonus -= 15;
		}
		if (ours.getTrinity().contains("Light") && theirs.getTrinity().contains("Anima")) {
			bonus -= 15;
		}
		if (ours.getTrinity().contains("Anima") && theirs.getTrinity().contains("Dark")) {
			bonus -= 15;
		}
		return bonus;
	}

	public boolean greatlyOutspeeds(Unit target) {
		if (SpeedBase - target.SpeedBase >= 4) {
			return true;
		}
		return false;
	}

	public Unit fight(Unit opponent, boolean logging) {

		if (logging) {
			System.out.println("Behold, " + this.getJob() + " vs. " + opponent.getJob() + "!");
		}

		int turnCounter = 1;

		while (this.isAlive() && opponent.isAlive() && turnCounter < 51) {

			if (logging) {
				System.out.println("Turn " + turnCounter + ":");
			}

			if (this.isAlive() && opponent.isAlive()) {
				this.swingAt(opponent, logging);
			}

			if (this.isAlive() && opponent.isAlive()) {
				opponent.swingAt(this, logging);
			}

			if (this.isAlive() && opponent.isAlive() && this.greatlyOutspeeds(opponent)
					&& !opponent.greatlyOutspeeds(this)) {
				this.swingAt(opponent, logging);
			}

			if (this.isAlive() && opponent.isAlive() && !this.greatlyOutspeeds(opponent)
					&& opponent.greatlyOutspeeds(this)) {
				opponent.swingAt(this, logging);
			}

			turnCounter++;
		}

		if (this.isAlive() && !opponent.isAlive()) {
			if (logging) {
				System.out.println(this.getJob() + " is victorious!");
			}
			return this;
		} else if (!this.isAlive() && opponent.isAlive()) {
			if (logging) {
				System.out.println(opponent.getJob() + " is victorious!");
			}
			return opponent;
		} else {
			int thistotal = this.getHpBase() + this.getStrBase() + this.getSkillBase() + this.getLuckBase()
					+ this.getSpeedBase() + this.getDefBase() + this.getResBase();
			int unit2total = opponent.getHpBase() + opponent.getStrBase() + opponent.getSkillBase()
					+ opponent.getLuckBase() + opponent.getSpeedBase() + opponent.getDefBase() + opponent.getResBase();
			if (unit2total > thistotal) {
				return opponent;
			}
			return this;
		}
	}

	private ArrayList<String> getTraits() {
		return traits;
	}

	protected void addTrait(String trait) {
		traits.add(trait);
	}

	public void levelUp() {
		if (lv < 40) {
			lv++;

			int metisBonus = 0;
			if (this.getTraits().contains("Metis")) {
				metisBonus += 5;
			}
			if (this.getTraits().contains("Unmetis")) {
				metisBonus -= 5;
			}

			Random r = new Random();

			int growthPerc = r.nextInt(100) - metisBonus;
			if (growthPerc < HpGr && HpBase < HpCap) {
				HpBase++;
			}
			growthPerc = r.nextInt(100) - metisBonus;
			if (growthPerc < StrGr && StrBase < StrCap) {
				StrBase++;
			}
			growthPerc = r.nextInt(100) - metisBonus;
			if (growthPerc < SkillGr && SkillBase < SkillCap) {
				SkillBase++;
			}
			growthPerc = r.nextInt(100) - metisBonus;
			if (growthPerc < SpeedGr && SpeedBase < SpeedCap) {
				SpeedBase++;
			}
			growthPerc = r.nextInt(100) - metisBonus;
			if (growthPerc < LuckGr && LuckBase < LuckCap) {
				LuckBase++;
			}
			growthPerc = r.nextInt(100) - metisBonus;
			if (growthPerc < DefGr && DefBase < DefCap) {
				DefBase++;
			}
			growthPerc = r.nextInt(100) - metisBonus;
			if (growthPerc < ResGr && ResBase < ResCap) {
				ResBase++;
			}
		}
		this.currentHp = this.HpBase;
	}

	public int getCurrentHp() {
		if (currentHp < 0) {
			currentHp = 0;
		}
		return this.currentHp;
	}

	public boolean isAlive() {
		if (this.getCurrentHp() > 0) {
			return true;
		}
		return false;
	}

	public void printDetailedUnitDescription(int i) {
		System.out.println("" + i + ": " + this.getJob() + " - " + "Lv" + this.getLv() + ", HP: " + this.getHpBase()
				+ ", Str: " + this.getStrBase() + ", Skill: " + this.getSkillBase() + ", Speed: " + this.getSpeedBase()
				+ ", Luck: " + this.getLuckBase() + ", Def: " + this.getDefBase() + ", Res: " + this.getResBase()
				+ ".");
	}

	public void chooseWeaponFromBackpack(Unit target) {
		chosenWeapon = null;
		if (backpack.size() >= 2) {
			ArrayList<WeaponQualityComparator> bestWeaponChoice = new ArrayList<WeaponQualityComparator>();

			for (Weapon weps : backpack) {
				for (Weapon theirOptions : target.getBackpack()) {
					WeaponQualityComparator wQC = new WeaponQualityComparator(weps);
					if (triangleAccuracyBonus(weps, theirOptions) > 0) {
						wQC.alterMatchups(1);
					}
					if (triangleAccuracyBonus(weps, theirOptions) < 0) {
						wQC.alterMatchups(-1);
					}
					if (weps.traits.contains("Ranged") && !theirOptions.traits.contains("Ranged")) {
						wQC.alterMatchups(1);
					}
					if (weps.traits.contains("Arrow") && target.traits.contains("Flying")) {
						wQC.alterMatchups(1);
					}
					if (containsWeapon(bestWeaponChoice, wQC.getWeapon())) {
						alter(bestWeaponChoice, wQC);
					} else {
						bestWeaponChoice.add(wQC);
					}
				}
			}
			Collections.sort(bestWeaponChoice);
			chosenWeapon = bestWeaponChoice.get(0).getWeapon();
		} else {
			chosenWeapon = backpack.get(0);
		}
	}

	private void alter(ArrayList<WeaponQualityComparator> bestWeaponChoice, WeaponQualityComparator wQC) {
		for (WeaponQualityComparator w : bestWeaponChoice) {
			if (w.getWeaponName().equals(wQC.getWeapon().getName())) {
				w.alterMatchups(wQC.getMatchups());
			}
		}
	}

	public boolean containsWeapon(ArrayList<WeaponQualityComparator> bestWeaponChoice, Weapon weapon) {
		for (WeaponQualityComparator w : bestWeaponChoice) {
			if (w.getWeaponName().equals(weapon.getName())) {
				return true;
			}
		}
		return false;
	}

	private ArrayList<Weapon> getBackpack() {
		return backpack;
	}
}