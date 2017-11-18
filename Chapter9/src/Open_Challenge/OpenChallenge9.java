package Open_Challenge;
//������ ���� �������α׷��� ������. �׸��� ���� �������� ����Ʈ���� NORTH �������� �г��� ����Ͽ�
//3���� ��ư�� ���� �ٸ� �����, ����Ʈ���� CENTER���� ������ ���� 3���� ���ڿ� "Hello", "Java", "Love"�� ����Ѵ�.

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenChallenge9 extends JFrame{
	OpenChallenge9(){
		setTitle("Open Challenge 9"); // �������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ������ �����츦 ������ ���α׷� ����
		Container c = getContentPane();
		c.setLayout(new BorderLayout()); 
		// ����Ʈ ������  �� ��ġ�����ڸ� ������ �ֱ� ������ ���� ��ġ������ �������ص� ��
		c.add(new NorthPanel(),BorderLayout.NORTH); // North �г� �߰�
		c.add(new CenterPanel(),BorderLayout.CENTER); // Center �г� �߰�
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OpenChallenge9();
	}
	
}
class NorthPanel extends JPanel{ // NORTH�� ���� �г�
	NorthPanel(){
		setBackground(Color.LIGHT_GRAY);
		this.add(new JButton("Open"));
		this.add(new JButton("Read"));
		this.add(new JButton("Close"));
	}
}
class CenterPanel extends JPanel{ // CENTER�� ���� �г�
	CenterPanel(){
		this.setLayout(null);
		String text[] = {"Hello", "Java", "Love"};
		int x;
		int y;
		JLabel label;
		for(int i=0;i<3;i++) {
			x = (int)(Math.random()*250); // ���� ©�� ������ ���� 50�� ������ ����
			y = (int)(Math.random()*250);
			label = new JLabel(text[i]);
			label.setLocation(x, y); // ������ġ�� label ���̱�
			label.setSize(50,10); // label ũ�� ����
			this.add(label);
		}
	}
}
