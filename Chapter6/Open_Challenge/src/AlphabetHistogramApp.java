import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetHistogramApp {
	static int alphabet[] = null;
	final static int alphabetNum = 26;
	AlphabetHistogramApp(){
		alphabet = new int[alphabetNum];
		for(int i=0;i<alphabetNum;i++){
			alphabet[i]=0; // ���ĺ� ���� ��� 0���� �ʱ�ȭ
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AlphabetHistogramApp();
		InputStreamReader rd = new InputStreamReader(System.in);
		int index; // �迭�� ���� �� �ε���
		try{
			while(true){
				int c = rd.read(); // enter�� �ԷµǸ� 13�� �����Ѵ�.
				if(c==13) //c�� �Էµ� Ű ��
					break;
				if(Character.isAlphabetic(c)){ // ���ĺ����� Ȯ��
					if(c>='a'&&c<='z'){
						c-=32;
					}
					index = c-'A';
					alphabet[index]+=1;
				}
				
			}
			System.out.println("������׷��� �׸��ϴ�.");
			for(int i=0;i<alphabetNum;i++){
				System.out.print((char)(i+'A'));
				for(int j=0;j<alphabet[i];j++)
					System.out.print("-"); // ���ĺ� ������ŭ ���
				System.out.println();
			}
		}
		catch(IOException e){
			System.out.println("�Է� ���� �߻�");
		}
	}

}
