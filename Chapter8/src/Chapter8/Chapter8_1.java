package Chapter8;
//1��
//a.jpg ������ ũ�⸦ ȭ�鿡 ����ϴ� ���α׷��� �ۼ��϶�. 
//������ ũ��� File Ŭ������ length() �޼ҵ带 �̿��ϸ� �ȴ�.
//a.jpg�� ������Ʈ ���� �ؿ� �־�� �Ѵ�.

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Chapter8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8\\a.jpg");
		// a.jpg�� ����Ǿ� �ִ� ���
		if(f.exists()) { // ������ �����Ҷ� ������ ũ�� ���
			System.out.println(f.length());
		} else { // ������ �������� ���� �� ����ó��
			System.out.println("a.jpg ������ �����ϴ�.");
		}
	}

}
