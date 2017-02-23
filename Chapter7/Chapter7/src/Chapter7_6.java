import java.util.Vector;

abstract class GraphicObject{
	int x,y,w,h;
	public GraphicObject(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	public abstract void view();
}

class Rect extends GraphicObject{
	public Rect(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void view() {
		System.out.println(x+","+y+" -> "+w+","+h+"의 사각형");
	}
}

class Line extends GraphicObject{
	public Line(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void view() {
		System.out.println(x+","+y+" -> "+w+","+h+"의 선");
	}	
}

public class Chapter7_6 {
	Vector<GraphicObject> v = new Vector<GraphicObject>();
	void add(GraphicObject ob){
		v.add(ob);
	}
	void draw(){
		for(int i=0;i<v.size();i++){
			v.get(i).view();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter7_6 c = new Chapter7_6();
		c.add(new Rect(2,2,3,4));
		c.add(new Line(3,3,8,8));
		c.add(new Line(2,5,6,6));
		c.draw();
	}

}