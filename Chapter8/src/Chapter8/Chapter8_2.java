package Chapter8;
//2��
//�ؽ�Ʈ ������ �о� �ҹ��ڷ� �� ���� ���ڸ� ��� �빮�ڷ� �ٲ㼭 ����ϴ� ���α׷��� ���� ��Ʈ���� �̿��Ͽ� �ۼ��϶�.

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Chapter8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedOutputStream bout = new BufferedOutputStream(System.out,5);
		// ���۸� ������ ��Ʈ���� �����
		FileReader fin = null;
		try {
			fin = new FileReader("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8\\test1.txt");
			// �ؽ�Ʈ ������ �б�
			int c;
			while((c=fin.read())!=-1) { // ������ ���� ���� ������ ���ڵ� �ϳ��� �б�
				bout.write((char)(c-32)); // ���� ���ڸ� ���� ��� ��Ʈ���� ��
			}
			fin.close();
			bout.close();
		}catch(IOException e) { // ������ �������� ���� �� ����ó��
			System.out.println("test1.txt ������ �������� �ʽ��ϴ�.");
		}
	}

}
