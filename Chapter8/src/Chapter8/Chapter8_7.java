package Chapter8;
//7��
//�̹��� ���� a.jpg�� b.jpg�� �����ϴ� ���α׷��� �ۼ��϶�.
//�� ���� 1kB ������ �����͸� �����϶�.
//a.jpg�� ������Ʈ ���� �ؿ� �־�� �Ѵ�.

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chapter8_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fin = null; // ����Ʈ ��Ʈ�� ����
		FileOutputStream fout =null;
		try {
			fin = new FileInputStream("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8\\a.jpg");
			fout = new FileOutputStream("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8\\b.jpg");
			int c;
			while((c = fin.read())!=-1) {
				fout.write(c); // ���� �����ϱ�
			}
			fin.close();
			fout.close();
			// ��Ʈ�� �ݱ�
		} catch(IOException e) {
			System.out.println("���� ����� ����");
		}
	}

}
