import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader rd = new InputStreamReader(System.in);
		int count=0;
		char arr[]= new char[100];
		try {
			while(true) {
				int c = rd.read(); // ctrl-z�� �ȸ����� Enter�� ����
				if(c==13) // Enter �Է½� ����
					break;
				arr[count]=(char)c;
				count++;
			}
		} catch(IOException e) {
			System.out.println("�Է� ���� �߻�");
		}
		String s = String.valueOf(arr); // char�迭�� String���� ��ȯ
		StringTokenizer st = new StringTokenizer(s, " "); // Tokenizer�� �̿��� �и�
		System.out.println(st.countTokens()); // Token ���� ���
	}

}
