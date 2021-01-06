package Game;

public class ZED extends Champion{
	private int level; // 레벨
	private int dagger= 80; // q스킬
	private int x=100; // x 좌표값
	private int y= 20; // y 좌표값
	private int ShadowSlash =70;
	
	ZED() { // 제드의 기본 공격력, 방어력을 Champion 클래스 공격력, 방어력 넣기
		super(63, 32, 584); 
		this.level=1;
		
	}
	
	
	public int skillQ() {// 스킬 q
		return dagger;
	}
	
	public int skillW() { // 스킬 w
		int[][] abscissa = new int[this.x][this.y]; // 좌표 표시해줄 배열
		abscissa[this.x-1][this.y-1] = 1; 
		return abscissa[this.x-1][this.y-1];
	}
	
	public int skillE() { // 스킬 e
		return ShadowSlash;
	}
	
	public int skillR(Champion champ) { // 스킬 r 대상 챔피언에 관여해서 그 챔피언의 Hp를 깍음
		int result = champ.getHp() - 30;
		return result;
	}
	
	@Override
	public int getLevel() { // 챔피언 레벨 확인
		
		return this.level;
	}
		
}
