package Chapter8;
//3��
//C:\�� ���� ���͸��� ��� ����ϴ� ���α׷��� �ۼ��϶�.

import java.io.File;

public class Chapter8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\"); // ��� �Է�
		for(String s: f.list()) { // f ��ο� �ִ� ���ϰ� ���͸� �̸��� ����Ʈ ���
			File sf = new File(f,s); // f�� parent, s�� child ��θ�
			if(sf.isDirectory()) { // sf�� ���丮 �̸�
				System.out.println(sf); // sf ���
			}
		}
		
	}

}
