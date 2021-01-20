package JAVATIL;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class AvgtoList {
	private List<Integer> list;
	private ArrayList<Integer> sutter;
	private ArrayList<Integer> imsiList =new ArrayList<Integer>();
	private int consol=0;
	private int avg;
	Scanner scan = new Scanner(System.in);
	
	// 생성자
	public AvgtoList() {
		super();
		// 0으로 초기화
		this.avg=0;
		System.out.println("학생 성적을 입력해주세요.");
		
		while (consol < 5) {
			int input = scan.nextInt();
			imsiList.add(input);
			this.consol++;
			
		}
		this.consol=0;
		sutter = new ArrayList<Integer>(imsiList);
		this.list=sutter;
		imsiList.clear();
		makeAvg();
	}
	// 평균 계산
	private void makeAvg() {
		Iterator<Integer> it = this.list.iterator();
		while(it.hasNext()) {
			imsiList.add(it.next());
		}
		Iterator<Integer> i = this.imsiList.iterator();
		while(i.hasNext()) {
			this.avg += i.next();
		}
		this.avg /= imsiList.size();
		imsiList.clear();
		
	}
	// 리스트에 들어있는 element 확인
	public List<Integer> getList() {
		return this.list;
	}
	
	// 평균확인
	public String getAvg() {
		String avg = "평균은="+this.avg;
		return avg;
	}
	// sutter에 들어있는 element 확인
	public ArrayList<Integer> getSutter() {
		
		return this.sutter;
	}
	
}
