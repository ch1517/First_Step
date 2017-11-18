package Chapter9;
//5��
//GrideLayout�� �̿��Ͽ� ���� �׸��� ���� Color.WHITE, Color.GRAY, Color.RED ��
//16���� ���� ������� �ϴ� 4*4 �ٵ����� �����϶�.

import java.awt.*;
import javax.swing.*;

public class Chapter9_5 extends JFrame{
	Color colorArr[] = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
			Color.blue,new Color(330066), new Color(660066), new Color(999999),
			Color.pink, Color.GRAY, Color.white, Color.DARK_GRAY, Color.black,
			Color.ORANGE, new Color(330066), new Color(660066)}; 
	Chapter9_5(){
		setTitle("4*4 Color Frame");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,4));
		for(int i=0;i<16;i++){
			JLabel lab = new JLabel(i+"");
			lab.setBackground(colorArr[i]);
			lab.setOpaque(true);
			c.add(lab);
		}
		setSize(700,300);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter9_5();
	}

}
