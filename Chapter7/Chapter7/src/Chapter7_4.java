import java.util.ArrayList;
import java.util.Iterator;

public class Chapter7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> a = new ArrayList<Double>();
		// Iterator<Double> it = a.iterator(); 여기서 지정 시 오류 발생
		for(int i=0;i<20;i++){
			double d = Math.random()*100; //0.0 ~ 100.0 사이의 랜덤한 난수
			a.add(d);
		}
		Iterator<Double> it = a.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
