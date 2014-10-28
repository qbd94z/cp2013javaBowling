package bowlingJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class frame extends JFrame {

	private JPanel contentPane;
	private String name;
	private String f1b1;
	private String f1b2;
	private String f1s;
	private String f2b1;
	private String f2b2;
	private String f2s;
	private String f3b1;
	private String f3b2;
	private String f3s;
	private String f4b1;
	private String f4b2;
	private String f4s;
	private String f5b1;
	private String f5b2;
	private String f5s;
	private String f6b1;
	private String f6b2;
	private String f6s;
	private String f7b1;
	private String f7b2;
	private String f7s;
	private String f8b1;
	private String f8b2;
	private String f8s;
	private String f9b1;
	private String f9b2;
	private String f9s;
	private String f10b1;
	private String f10b2;
	private String f10b3;
	private String f10s;

	/**
	 * Launch the application.
	 */
	public static void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1179, 149);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setName("Ben");
		
		JLabel playerName = new JLabel("playerName");
		playerName.setBounds(15, 16, 94, 20);
		name = playerName.getText();
		contentPane.add(playerName);
		
		JLabel f1B1 = new JLabel("F1B1");
		f1B1.setBounds(113, 16, 32, 20);
		f1b1 = f1B1.getText();
		contentPane.add(f1B1);
		
		JLabel f1B2 = new JLabel("F1B2");
		f1B2.setBounds(140, 16, 69, 20);
		contentPane.add(f1B2);
		
		JLabel f1S = new JLabel("F1S");
		f1S.setBounds(105, 40, 69, 20);
		contentPane.add(f1S);
		
		JLabel f2B1 = new JLabel("F2B1");
		f2B1.setBounds(186, 16, 42, 20);
		contentPane.add(f2B1);
		
		JLabel f2B2 = new JLabel("F2B2");
		f2B2.setBounds(243, 16, 42, 20);
		contentPane.add(f2B2);
		
		JLabel f2S = new JLabel("F2S");
		f2S.setBounds(196, 40, 69, 20);
		contentPane.add(f2S);
		
		JLabel f3B1 = new JLabel("F3B1");
		f3B1.setBounds(293, 16, 42, 20);
		contentPane.add(f3B1);
		
		JLabel f3B2 = new JLabel("F3B2");
		f3B2.setBounds(340, 16, 42, 20);
		contentPane.add(f3B2);
		
		JLabel f3S = new JLabel("F3S");
		f3S.setBounds(288, 40, 69, 20);
		contentPane.add(f3S);
		
		JLabel f4B1 = new JLabel("F4B1");
		f4B1.setBounds(397, 16, 42, 20);
		contentPane.add(f4B1);
		
		JLabel f4B2 = new JLabel("F4B2");
		f4B2.setBounds(440, 16, 42, 20);
		contentPane.add(f4B2);
		
		JLabel f4S = new JLabel("F4S");
		f4S.setBounds(407, 40, 69, 20);
		contentPane.add(f4S);
		
		JLabel f5B1 = new JLabel("F5B1");
		f5B1.setBounds(497, 16, 42, 20);
		contentPane.add(f5B1);
		
		JLabel f5B2 = new JLabel("F5B2");
		f5B2.setBounds(538, 16, 42, 20);
		contentPane.add(f5B2);
		
		JLabel f5S = new JLabel("F5S");
		f5S.setBounds(491, 40, 69, 20);
		contentPane.add(f5S);
		
		JLabel f6B1 = new JLabel("F6B1");
		f6B1.setBounds(595, 16, 42, 20);
		contentPane.add(f6B1);
		
		JLabel f6B2 = new JLabel("F6B2");
		f6B2.setBounds(638, 16, 42, 20);
		contentPane.add(f6B2);
		
		JLabel f6S = new JLabel("F6S");
		f6S.setBounds(592, 40, 69, 20);
		contentPane.add(f6S);
		
		JLabel f7B1 = new JLabel("F7B1");
		f7B1.setBounds(679, 16, 42, 20);
		contentPane.add(f7B1);
		
		JLabel f7B2 = new JLabel("F7B2");
		f7B2.setBounds(719, 16, 42, 20);
		contentPane.add(f7B2);
		
		JLabel f7S = new JLabel("F7S");
		f7S.setBounds(689, 40, 69, 20);
		contentPane.add(f7S);
		
		JLabel f8B1 = new JLabel("F8B1");
		f8B1.setBounds(776, 16, 42, 20);
		contentPane.add(f8B1);
		
		JLabel f8B2 = new JLabel("F8B2");
		f8B2.setBounds(818, 16, 42, 20);
		contentPane.add(f8B2);
		
		JLabel f8S = new JLabel("F8S");
		f8S.setBounds(786, 40, 69, 20);
		contentPane.add(f8S);
		
		JLabel f9B1 = new JLabel("F9B1");
		f9B1.setBounds(875, 16, 42, 20);
		contentPane.add(f9B1);
		
		JLabel f9B2 = new JLabel("F9B2");
		f9B2.setBounds(916, 16, 42, 20);
		contentPane.add(f9B2);
		
		JLabel f9S = new JLabel("F9S");
		f9S.setBounds(870, 40, 69, 20);
		contentPane.add(f9S);
		
		JLabel f10B1 = new JLabel("F10B1");
		f10B1.setBounds(973, 16, 50, 20);
		contentPane.add(f10B1);
		
		JLabel f10B2 = new JLabel("F10B2");
		f10B2.setBounds(1024, 16, 50, 20);
		contentPane.add(f10B2);
		
		JLabel f10B3 = new JLabel("F10B3");
		f10B3.setBounds(1073, 16, 50, 20);
		contentPane.add(f10B3);
		
		JLabel f10S = new JLabel("F10S");
		f10S.setBounds(983, 40, 69, 20);
		contentPane.add(f10S);
		
		System.out.println("GetName1 " + getName());
		setName("Ben");
		System.out.println("GetName2 " + getName());
		System.out.println("PlayerName " + playerName.getText());
		System.out.println(getf1B1());
		setf1B1("2");
		System.out.println(getf1B1());
		System.out.println(Integer.parseInt(getf1B1().toString()));
		
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String names){
		name = names;
	}
	
	public String getf1B1(){
		return f1b1;
	}
	
	public void setf1B1(String value){
		this.f1b1 = value;
		}
	
	public String getf1B2(){
		return f1b2;
	}
	
	public void setf1B2(String value){
		this.f1b2 = value;
		}
	
	public String getf1S(){
		return f1s;
	}
	
	public void setf1S(String value){
		this.f1s = value;
		}
	
	public String getf2B1(){
		return f2b1;
	}
	
	public void setf2B1(String value){
		this.f2b1 = value;
		}
	
	public String getf2B2(){
		return f2b2;
	}
	
	public void setf2B2(String value){
		this.f1b2 = value;
		}
	
	public String getf2S(){
		return f2s;
	}
	
	public void setf2S(String value){
		this.f3s = value;
		}
	public String getf3B1(){
		return f3b1;
	}
	
	public void setf3B1(String value){
		this.f3b1 = value;
		}
	
	public String getf3B2(){
		return f3b2;
	}
	
	public void setf3B2(String value){
		this.f3b2 = value;
		}
	
	public String getf3S(){
		return f3s;
	}
	
	public void setf3S(String value){
		this.f3s = value;
		}
	
	public String getf4B1(){
		return f4b1;
	}
	
	public void setf4B1(String value){
		this.f4b1 = value;
		}
	
	public String getf4B2(){
		return f4b2;
	}
	
	public void setf4B2(String value){
		this.f4b2 = value;
		}
	
	public String getf4S(){
		return f4s;
	}
	
	public void setf4S(String value){
		this.f4s = value;
		}
	
	public String getf5B1(){
		return f5b1;
	}
	
	public void setf5B1(String value){
		this.f5b1 = value;
		}
	
	public String getf5B2(){
		return f5b2;
	}
	
	public void setf5B2(String value){
		this.f5b2 = value;
		}
	
	public String getf5S(){
		return f5s;
	}
	
	public void setf5S(String value){
		this.f5s = value;
		}
	
	public String getf6B1(){
		return f6b1;
	}
	
	public void setf6B1(String value){
		this.f6b1 = value;
		}
	
	public String getf6B2(){
		return f6b2;
	}
	
	public void setf6B2(String value){
		this.f6b2 = value;
		}
	
	public String getf6S(){
		return f6s;
	}
	
	public void setf6S(String value){
		this.f6s = value;
		}
	
	public String getf7B1(){
		return f7b1;
	}
	
	public void setf7B1(String value){
		this.f7b1 = value;
		}
	
	public String getf7B2(){
		return f7b2;
	}
	
	public void setf7B2(String value){
		this.f7b2 = value;
		}
	
	public String getf7S(){
		return f7s;
	}
	
	public void setf7S(String value){
		this.f7s = value;
		}
	
	public String getf8B1(){
		return f8b1;
	}
	
	public void setf8B1(String value){
		this.f8b1 = value;
		}
	
	public String getf8B2(){
		return f8b2;
	}
	
	public void setf8B2(String value){
		this.f8b2 = value;
		}
	
	public String getf8S(){
		return f8s;
	}
	
	public void setf8S(String value){
		this.f8s = value;
		}
	
	public String getf9B1(){
		return f9b1;
	}
	
	public void setf9B1(String value){
		this.f9b1 = value;
		}
	
	public String getf9B2(){
		return f9b2;
	}
	
	public void setf9B2(String value){
		this.f9b2 = value;
		}
	
	public String getf9S(){
		return f9s;
	}
	
	public void setf9S(String value){
		this.f9s = value;
		}
	
	public String getf10B1(){
		return f10b1;
	}
	
	public void setf10B1(String value){
		this.f10b1 = value;
		}
	
	public String getf10B2(){
		return f10b2;
	}
	
	public void setf10B2(String value){
		this.f10b2 = value;
		}
	public String getf10B3(){
		return f10b3;
	}
	
	public void setf10B3(String value){
		this.f10b3 = value;
		}
	
	public String getf10S(){
		return f10s;
	}
	
	public void setf10S(String value){
		this.f10s = value;
		}
	
}
