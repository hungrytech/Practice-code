package IOpractice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileClone {

	public FileClone() {
		
	}
	
	/* ���� ��Ʈ���� �̿�
	 *  ����Ʈ ��� Ŭ�� ������
	 */ 
	public void cloneSequence() {
		FileInputStream fis=null;
		FileOutputStream fos =null;
		Scanner scan = new Scanner(System.in);
		byte[] arr = new byte[512];
		
		System.out.println("Ŭ���� ���� ��ġ, �̸��� �����ּ���");
		String fileName = scan.next();
		System.out.println("������ ���� ��ġ, �̸��� �����ּ���");
		String outFileName = scan.next();
		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream(outFileName);
			int line = 0;
			while ((line = fis.read(arr))!=-1) {
				fos.write(arr, 0, line);
			}
		// ���� catch�� ������ ���� ��f��.
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			scan.close();
			try {
				if(fis ==null) fis.close();
				if(fos==null) fos.close();
			}catch(IOException e) {
				
			}
		}//finally �� ��
		
	}// �޼��� �� ��
	
	
	//try-with-resources �̿�
	public void cloneSequenceResource() {
		Scanner scan = new Scanner(System.in);
		byte[] arr = new byte[512];
		System.out.println("Ŭ���� ���� ��ġ, �̸��� �����ּ���");
		String fileName = scan.next();
		System.out.println("������ ���� ��ġ, �̸��� �����ּ���");
		String outFileName = scan.next();
		scan.close();
		try ( FileInputStream fis = new FileInputStream(fileName);
				FileOutputStream fos = new FileOutputStream(outFileName)) {
			int line = 0;
			while ((line = fis.read(arr))!=-1) {
				fos.write(arr, 0, line);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/* Buffer ������Ʈ�� �̿��ؼ� �������
	 * try-with-resources �̿�
	 */
	public void cloneSequenceBuffer() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ŭ���� ���� ��ġ, �̸��� �����ּ���");
		String fileName = scan.next();
		System.out.println("������ ���� ��ġ, �̸��� �����ּ���");
		String outFileName = scan.next();
		scan.close();
		byte[] arr = new byte[512];
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outFileName))) {
			int line = 0;
			while((line = bis.read(arr))!=-1) {
				bos.write(arr, 0, line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}// class ��
