package Chapter8;
//6��
//�ڹ� �ҽ� ������ �о�鿩�� �� �տ� �� ��ȣ�� �ٿ��� ȭ�鿡 ����ϴ� ���α׷��� �ۼ��Ͽ���.

import java.io.FileReader;
import java.io.IOException;

public class Chapter8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		try {
			fin = new FileReader("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8_5.java");
			// �ؽ�Ʈ ������ �б�
			int c;
			int count=1; // �� ��ȣ
			while((c=fin.read())!=-1) { // ������ ���� ���� ������ ���ڵ� �ϳ��� �б�
				if(count==1){ // ������ ������ �� �� ��ȣ ���
					System.out.print(count++ + " ");
					continue;
				}
				System.out.print((char)c); // ���� ���ڸ� ���� ��� ��Ʈ���� ��
				if(c=='\n') { // ���Ŀ� ���� ���� ���� �� ��ȣ ���
					System.out.print(count++ + " ");
				}
				
			}
		} catch(IOException e) {
			System.out.println("���� ����� ����");
		}
	}

}
