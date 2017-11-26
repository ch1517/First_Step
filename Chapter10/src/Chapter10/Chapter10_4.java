package Chapter10;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


//JLabel�� Ȱ���Ͽ� "Love Java"�� ����ϰ� ���� ȭ��ǥ Ű(<Left>Ű)�� �Է��� ������
//"ove JavaL", "ve JavaLo", "e JavaLov" ��� ���� ��� �� ���ھ� �������� �̵��ϴ� ���� ���α׷��� �ۼ��϶�.
//���ڿ��� �̵��� String Ŭ������ substring() �޼ҵ带 �̿��Ͽ� �����϶�.
//String text = "Love Java"�� ���, text.substring(0,1)�� "L"�� �����ϰ�, text.substring(1)��
//"ove Java"�� �����Ѵ�. JLavel�� ��Ŀ�� �����ϴ� ���� ���� ���ƾ��Ѵ�.
public class Chapter10_4 extends JFrame{

	JLabel label; 
	String text = "Love Java";
	Chapter10_4(){
		setTitle("Left Ű�� ���ڿ� �ٲٱ� ����"); // ���� ����
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �ݱ� ��ư�� ������ �� ȭ�� �ݱ�
		
		label= new JLabel("Love Java");
		
		// Jabel ������Ʈ ���� �� KeyListener�� �ܴ�.
		label.addKeyListener(new MyKeyAdapter());
		
		label.setSize(200,50);
		add(label);
		setSize(400,200);
		setVisible(true);
		label.requestFocus();
		// ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter10_4();
	}
	class MyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) { // �Է¹��� �ڵ尡
				case KeyEvent.VK_LEFT: //<Left> Ű �϶�
					label.setText(text); // text ��ĭ�� ������ ���
					text = text.substring(1)+text.substring(0, 1);
					break;
				default:
					break;
			}
		}
	}

}
