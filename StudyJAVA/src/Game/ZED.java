package Game;

public class ZED extends Champion{
	private int level; // ����
	private int dagger= 80; // q��ų
	private int x=100; // x ��ǥ��
	private int y= 20; // y ��ǥ��
	private int ShadowSlash =70;
	
	ZED() { // ������ �⺻ ���ݷ�, ������ Champion Ŭ���� ���ݷ�, ���� �ֱ�
		super(63, 32, 584); 
		this.level=1;
		
	}
	
	
	public int skillQ() {// ��ų q
		return dagger;
	}
	
	public int skillW() { // ��ų w
		int[][] abscissa = new int[this.x][this.y]; // ��ǥ ǥ������ �迭
		abscissa[this.x-1][this.y-1] = 1; 
		return abscissa[this.x-1][this.y-1];
	}
	
	public int skillE() { // ��ų e
		return ShadowSlash;
	}
	
	public int skillR(Champion champ) { // ��ų r ��� è�Ǿ� �����ؼ� �� è�Ǿ��� Hp�� ����
		int result = champ.getHp() - 30;
		return result;
	}
	
	@Override
	public int getLevel() { // è�Ǿ� ���� Ȯ��
		
		return this.level;
	}
		
}
