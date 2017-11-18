package Chapter9;
//2��
//BorderLayout�� ����Ͽ� ������Ʈ ������ ���� ������ 5�ȼ�, 
//���� ������ 7�ȼ��� �ǵ��� ���� �׸��� ���� ���� �������α׷��� �ۼ��϶�.

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Chapter9_2 extends JFrame{
	public Chapter9_2(){
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,7)); // ContentPane�� BorderLayout ��ġ������ ����
		
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		setSize(600,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter9_2();
	}
}
