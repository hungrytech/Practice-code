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
	// ü���� �� ���ҳ� Ȯ��
	public int getHp() { 
		return this.Hp;
	}

	
	// �� è�Ǿ�� ����
	public abstract int skillQ(); // ��ų q
	public abstract int skillW(); // ��ų w
	public abstract int skillE(); // ��ų e
	public abstract int skillR(Champion champ); // ��ų r
	public abstract int getLevel(); // è�Ǿ��� ���� Ȯ��
	
	
	// �������̽� ����
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
