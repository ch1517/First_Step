import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader rd = new InputStreamReader(System.in);
		int count=0;
		String arr = "";
		try {
			while(true) {
				int c = rd.read(); // ctrl-z�� �ȸ����� Enter�� ����
				if(c==13) // Enter �Է½� ����
					break;
				arr = arr + String.valueOf((char)c); //���� �߰�
				count++;
			}
		} catch(IOException e) {
			System.out.println("�Է� ���� �߻�");
		}
		String str[] = arr.split(" "); // ���� ������ ��� �迭�� ����
		int max=str[0].length(); // �ִ� ���� ���̸� ������ ����
		int n = 0; //�ִ� ���� ���ڰ� ����ִ� �迭�� �ε���
		for(int i=0;i<str.length;i++) {
			if(max<str[i].length()) {
				max=str[i].length();
				n=i;
			}
		}
		System.out.println(str[n]);
	}
}
