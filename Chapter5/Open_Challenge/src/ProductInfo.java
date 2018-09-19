import java.util.ArrayList;
import java.util.Scanner;

class Product{
	int identifier; //��ǰ�� �ĺ���
	String explanation; //��ǰ ����
	String producer; //������
	int price; //���� ����
	void setId(int id){
		identifier=id;
	}
	int getId(){
		return identifier;
	}
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǰ ����>>");
		explanation=sc.nextLine();
		System.out.print("������>>");
		producer=sc.nextLine();
		System.out.print("����>>");
		price=sc.nextInt();
	}
	void print(){
		System.out.println("��ǰ ID>>"+identifier);
		System.out.println("��ǰ ����>>"+explanation);
		System.out.println("������>>"+producer);
		System.out.println("����>>"+price);
	}
}

class Book extends Product{
	int ISBNnum; //ISBN ��ȣ
	String writer; // ����
	String book_title; // å ����

	void input(){
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("å ����>>");
		book_title=sc.nextLine();
		System.out.print("����>>");
		writer=sc.nextLine();
		System.out.print("ISBN ��ȣ>>");
		ISBNnum=sc.nextInt();
	}
	void print(){
		super.print();
		System.out.println("ISBN>>"+ISBNnum);
		System.out.println("å ����>>"+book_title);
		System.out.println("����>>"+writer);
	}
}

class CompactDisc extends Product{
	String album_title;
	String singer_name;

	void input(){
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("�ٹ� ����>>");
		album_title=sc.nextLine();
		System.out.print("����>>");
		singer_name=sc.nextLine();
	}
	void print(){
		super.print();
		System.out.println("�ٹ� ����>>"+album_title);
		System.out.println("����>>"+singer_name);
	}
}

class ConversationBook extends Book{
	String languageInfo;
	
	void input(){
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("���>>");
		languageInfo=sc.next();
		
	}
	void print(){
		super.print();
		System.out.println("���>>"+languageInfo);
	}
}
public class ProductInfo {
	static ArrayList<Product> productList = new ArrayList<Product>();
	
	static void productAdd(){
		Scanner sc = new Scanner(System.in);
		System.out.printf("��ǰ ���� å(1), ����CD(2), ȸȭå(3)>>");
		Product p=null;
		int num=sc.nextInt();
		
		switch(num){
			case 1:
				p = new Book();
				break;
			case 2:
				p = new CompactDisc();
				break;
			case 3:
				p = new ConversationBook();
				break;
		}
		p.input();
		p.setId(productList.size());
		productList.add(p);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		while(true){
			System.out.print("��ǰ �߰�(1), ��� ��ǰ ��ȸ(2), ������(3)>>");
			num=sc.nextInt();
			if(num==1){
				productAdd();
			}
			else if(num==2){
				for(int i=0;i<productList.size();i++){
					productList.get(i).print();
					System.out.println();
				}
			}
			else if(num==3){
				break;
			}
			else{
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
		}
	}

}
