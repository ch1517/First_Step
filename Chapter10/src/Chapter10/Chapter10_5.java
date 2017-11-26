package Chapter10;
//JLabel ������Ʈ�� Key �̺�Ʈ�� ���� �� �ִ�. JLabel ������Ʈ�� �̿��Ͽ� "Love Java"��
//����ϰ� + Ű�� ġ�� ��Ʈ ũ�⸦ 5�ȼ��� Ű���, -Ű�� ġ�� ��Ʈ ũ�⸦ 5�ȼ��� ���̴� ���� �������α׷��� �ۼ��϶�.
//5�ȼ� ���Ϸ� �۾����� �ʵ����϶�.

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Chapter10_5 extends JFrame {
	JLabel label; 
	Chapter10_5(){
		setTitle("+,- Ű�� ��Ʈ ũ�� ����"); // ���� ����
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �ݱ� ��ư�� ������ �� ȭ�� �ݱ�
		
		label= new JLabel("Love Java");
		label.setSize(200,50);
		label.setFont(new Font("Arial",Font.PLAIN,10));
		// Arial ��Ʈ�� 10�ȼ� ũ��
		
		label.addKeyListener(new MyKeyAdapter());
		// Jabel ������Ʈ ���� �� KeyListener�� �ܴ�.
		
		add(label);
		setSize(400,200);
		setVisible(true);
		label.requestFocus();
		// ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter10_5();
		
	}

	class MyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			Font f = label.getFont();
			int size = f.getSize(); // label�� font size ���ϱ�
			
			switch(e.getKeyCode()) {
				case 45: // -Ű ������ ���
					if(size>5) { // 5���� Ŭ����
						label.setFont(new Font("Arial", Font.PLAIN,size-5));
					}
					break;
				case 61: // +��=Ű ��� ���
					label.setFont(new Font("Arial", Font.PLAIN,size+5));
					break;
			}
		}
	}
}
