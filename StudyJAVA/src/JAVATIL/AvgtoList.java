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
	
	// ������
	public AvgtoList() {
		super();
		// 0���� �ʱ�ȭ
		this.avg=0;
		System.out.println("�л� ������ �Է����ּ���.");
		
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
	// ��� ���
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
	// ����Ʈ�� ����ִ� element Ȯ��
	public List<Integer> getList() {
		return this.list;
	}
	
	// ���Ȯ��
	public String getAvg() {
		String avg = "�����="+this.avg;
		return avg;
	}
	// sutter�� ����ִ� element Ȯ��
	public ArrayList<Integer> getSutter() {
		
		return this.sutter;
	}
	
}
