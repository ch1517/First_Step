import java.util.HashMap;
import java.util.Scanner;

class Student2{
	String name;
	String department;
	String classnum;
	double averscore;
}

public class Chapter7_9 {

	public static void main(String[] args) {
		HashMap<String, Student2> dept = new HashMap<String, Student2>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3;i++){
			Student2 st = new Student2();
			System.out.print("이름을 입력하시오 : ");
			st.name = sc.next();
			System.out.print("학과를 입력하시오 : ");
			st.department = sc.next();
			System.out.print("학번을 입력하시오 : ");
			st.classnum = sc.next();
			System.out.print("학점평균을 입력하시오 : ");
			st.averscore = sc.nextDouble();
			System.out.println();
			dept.put(st.classnum, st);
		}
		System.out.print("학번을 입력하시오 : ");
		Student2 st = dept.get(sc.next());
		System.out.println("이름 : "+st.name);
		System.out.println("학과 : "+st.department);
		System.out.println("학번 : "+st.classnum);
		System.out.println("학점평균 : "+st.averscore);
	}
}
