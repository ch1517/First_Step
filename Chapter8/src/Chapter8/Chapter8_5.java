package Chapter8;
//5��
//����ڷκ��� �� ���� ���� �̸��� �Է¹ް� �� ������ ������ ���Ͽ� ������ "������ �����ϴ�."��,
//Ʋ���� "������ ���� �ٸ��ϴ�."�� ����ϴ� ���α׷��� �ۼ��϶�.
//�� ����� ������ �ؽ�Ʈ �� ���̳ʸ� ���� ��θ� �����Ѵ�.

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		FileInputStream f1 = null;
		FileInputStream f2 = null;
		int same = 0; // ���� �������� �ٸ� �������� �����ϴ� ����
		try {
			int a,b;
			f1 = new FileInputStream("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8\\"+s.next());
			f2 = new FileInputStream("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8\\"+s.next());
			// ���ϰ� ����� ����Ʈ ��Ʈ�� ���� (Ȯ���ڱ��� �Է�)
			if(f1.available()!=f2.available()) { // ������ ���̰� �ٸ���
				same=0; // �� ������ ���� �ʴ�.
			} else{
				same=1; // ������ ���̰� ���� �� �� ������ ���ٰ� �����ϰ� while�� ������
				while((a = f1.read())!=-1){ // a�� ������ ���� ����������
					b = f2.read(); // b�� �о����
					if(a!=b) { // �߰��� �ѱ��ڶ� �ٸ���
						same=0; // �� ������ ���� �ʴ�.
						break; // while�� ����
					}
				}
			}
			if(same==1) {
				System.out.println("������ �����ϴ�.");
			} else {
				System.out.println("������ �ٸ��ϴ�.");
			}
			// ��� ����
			f1.close();
			f2.close();
			// ��Ʈ�� �ݱ�
		} catch(IOException e) {
			System.out.println("���� ����� ����");
		}
	}

}
