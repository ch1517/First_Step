package Chapter8;
//4��
//����ڷκ��� �� ���� �ؽ�Ʈ ���� �̸��� �Է¹ް� ù ��° ���� �ڿ� �� ��° ������ ���ٿ� ���ο� ������ �����ϴ� ���α׷��� �ۼ��Ͽ���.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Chapter8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		FileReader f1 = null; // ù�� ° ����
		FileReader f2 = null; // �ι� ° ����
		FileWriter f3 = null; // ù�� ° ����+ �ι� ° ����
		try {
			int c;
			f1 = new FileReader("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\"+s.next()+".txt");
			f2 = new FileReader("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\"+s.next()+".txt");
			// �ҷ��� ���� �̸��� �Է¹���
			f3 = new FileWriter("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\test3.txt");
			// ���� ���� ������ ��������
			while((c = f1.read())!=-1) { // f1�� ������ f3�� ��´�.
				f3.write(c);
			}
			while((c = f2.read())!=-1) { // f2�� ������ f3�� ��´�.
				f3.write(c);
			}
			f1.close();
			f2.close();
			f3.close();
			// ��Ʈ�� �ݱ�
		} catch (IOException e) {
			System.out.println("���� ����� ����");
		}
	}

}
