package Chapter8;
//8��
//�̹��� ���� a.jpg�� b.jpg�� �����ϴ� ���α׷��� �ۼ��϶�.
//���縦 �����ϴ� ���� 10% ������ ������ '*' �ϳ��� ����ϵ��� �϶�.

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chapter8_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fin = null; // ����Ʈ ��Ʈ�� ����
		FileOutputStream fout =null;
		try {
			fin = new FileInputStream("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8\\a.jpg");
			fout = new FileOutputStream("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8\\b.jpg");
			int c;
			int total = fin.available(); // ��ü ����
			int count=0; // ���� ����
			while((c = fin.read())!=-1) { // ������ ���� ���� �� ����
				if(count==total/10) { // 10% ���� ������ 
					System.out.print("*");
					count=0; // ���� �������� �ʱ�ȭ
				}
				fout.write(c); // ���� �����ϱ�
				count++;
			}
			fin.close();
			fout.close();
			// ��Ʈ�� �ݱ�
		} catch(IOException e) {
			System.out.println("���� ����� ����");
		}
	}

}
