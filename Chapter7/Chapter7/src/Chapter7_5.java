import java.util.ArrayList;
import java.util.Scanner;

public class Chapter7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> a = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3;i++){
			Student st = new Student();
			System.out.print("�̸��� �Է��Ͻÿ� : ");
			st.name = sc.next();
			System.out.print("�а��� �Է��Ͻÿ� : ");
			st.department = sc.next();
			System.out.print("�й��� �Է��Ͻÿ� : ");
			st.classnum = sc.nextInt();
			System.out.print("��������� �Է��Ͻÿ� : ");
			st.averscore = sc.nextDouble();
			System.out.println();
			a.add(st);
		}
		for(int i=0;i<a.size();i++){
			System.out.println("�̸� : "+a.get(i).name);
			System.out.println("�а� : "+a.get(i).department);
			System.out.println("�й� : "+a.get(i).classnum);
			System.out.println("������� : "+a.get(i).averscore);
		}
	}
}
class Student{
	String name;
	String department;
	int classnum;
	double averscore;
}