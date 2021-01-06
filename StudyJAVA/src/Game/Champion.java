package Game;

public abstract class Champion implements Keyboard {
	private int BasicStrikingPower;
	private int BasicDefensivePower;
	private int Hp;
	
	Champion (int striking, int defensive, int Hp ) {
		this.BasicStrikingPower = striking;
		this.BasicDefensivePower= defensive;
		this.Hp=Hp;
	}
	// 체력이 얼마 남았나 확인
	public int getHp() { 
		return this.Hp;
	}

	
	// 각 챔피언당 구현
	public abstract int skillQ(); // 스킬 q
	public abstract int skillW(); // 스킬 w
	public abstract int skillE(); // 스킬 e
	public abstract int skillR(Champion champ); // 스킬 r
	public abstract int getLevel(); // 챔피언의 레벨 확인
	
	
	// 인터페이스 구현
	public int clikQ() {
		return skillQ();
	}
	public int clikW() {
		return skillW();
	}
	public int clikE() {
		return skillE();
	}
	public int clikR(Champion champ) {
		return skillR(champ);
	}
}
