import java.util.HashMap;
import java.util.Scanner;

class Location{
	String region; // ����
	String latitude; // ���� 
	String hardness; // �浵
}
public class Chapter7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Location> area = new HashMap<String, Location>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++){
			Location l = new Location();
			System.out.print("�������� �Է��Ͻÿ� : ");
			l.region = sc.next();
			System.out.print("������ �Է��Ͻÿ� : ");
			l.latitude = sc.next();
			System.out.print("�浵��  �Է��Ͻÿ� : ");
			l.hardness = sc.next();
			System.out.println();
			area.put(l.region, l);
		}
		System.out.print("�������� �Է��Ͻÿ� : ");
		Location l = area.get(sc.next());
		System.out.println("������ : " + l.region);
		System.out.println("���� : " + l.latitude);
		System.out.println("�浵 : " + l.hardness);
	}

}
