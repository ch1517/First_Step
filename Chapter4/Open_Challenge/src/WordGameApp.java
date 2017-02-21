import java.util.ArrayList;
import java.util.Scanner;

class Player{
	String name;
	String word;
	void sayWord(){
		System.out.print(name+">>");
		Scanner sc = new Scanner(System.in);
		word = sc.next(); // ����ڷκ��� �ܾ �Է¹޴´�.
	}
	void setName(String name){
		this.name = name;
	}
	void setWord(String word){
		this.word = word;
	}
	String getWord(){
		return word;
	}
	String getName(){
		return name;
	}
	boolean succeed(char lastChar){
		return (this.word.charAt(0) == lastChar);
		// �� �÷��̾��� ������ ���ڿ� ���� �÷��̾��� ù ��° ���ڰ� ������ true ��ȯ
	}
}
public class WordGameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Player> player = new ArrayList<Player>();
		Scanner sc = new Scanner(System.in);
		Player p;
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int playerNum = sc.nextInt();
		for(int i=0;i<playerNum;i++){
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			p=new Player();
			p.setName(sc.next());
			player.add(p); // ����ڰ� �Է��� �ܾ �̸����� ����
		}
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
		int i = 0;
		int j, k;
		int lastIndex;
		while(true){
			j=i%playerNum;
			System.out.print(player.get(j).getName()+">>");
			player.get(j).setWord(sc.next());// ����ڰ� �Է��� �ܾ �÷��̾� �ܾ�� ����
			if(i==0){ 
				if(!player.get(j).succeed('��')){
					System.out.println(player.get(j).getName()+"�� �����ϴ�.");
					break; // ���� �����ϴ� �ܾ����� Ȯ��
				}
			} 
			else{
				k=(i-1)%playerNum; // �÷��̾� ���� ���� ���� Ƚ��
				lastIndex = player.get(k).getWord().length()-1; // ������ ���ڿ� ���� �ε���
				if(!player.get(j).succeed(player.get(k).getWord().charAt(lastIndex))){
					System.out.println(player.get(j).getName()+"�� �����ϴ�.");
					break;				
				}
			}
			i++;
		}
	}

}
