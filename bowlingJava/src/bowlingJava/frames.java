package bowlingJava;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class frames extends JPanel {

	private Object f1b1;
	private Object f1b2;
	private Object f1s;
	private Object f2b1;
	private Object f2b2;
	private Object f2s;
	private Object f3b1;
	private Object f3b2;
	private Object f3s;
	private Object f4b1;
	private Object f4b2;
	private Object f4s;
	private Object f5b1;
	private Object f5b2;
	private Object f5s;
	private Object f6b1;
	private Object f6b2;
	private Object f6s;
	private Object f7b1;
	private Object f7b2;
	private Object f7s;
	private Object f8b1;
	private Object f8b2;
	private Object f8s;
	private Object f9b1;
	private Object f9b2;
	private Object f9s;
	private Object f10b1;
	private Object f10b2;
	private Object f10b3;
	private Object f10s;
	private Object playerName;

	public frames() {
		setLayout(null);
		setPreferredSize(new Dimension(1199, 71));
		
	
		playerName = new JLabel("player");
		((Component) playerName).setBounds(15, 16, 94, 20);
		add((Component) playerName);
		
		f1b1 = new JLabel("0");
		((Component) f1b1).setBounds(113, 16, 32, 20);
		add((Component) f1b1);
		
		f1b2 = new JLabel("0");
		((Component) f1b2).setBounds(140, 16, 69, 20);
		add((Component) f1b2);
		
		f1s = new JLabel("0");
		((Component) f1s).setBounds(105, 40, 69, 20);
		add((Component) f1s);
		
		f2b1 = new JLabel("0");
		((Component) f2b1).setBounds(186, 16, 42, 20);
		add((Component) f2b1);
		
		f2b2 = new JLabel("0");
		((Component) f2b2).setBounds(243, 16, 42, 20);
		add((Component) f2b2);
		
		f2s = new JLabel("0");
		((Component) f2s).setBounds(196, 40, 69, 20);
		add((Component) f2s);
		
		f3b1 = new JLabel("0");
		((Component) f3b1).setBounds(293, 16, 42, 20);
		add((Component) f3b1);
		
		f3b2 = new JLabel("0");
		((Component) f3b2).setBounds(340, 16, 42, 20);
		add((Component) f3b2);
		
		f3s = new JLabel("0");
		((Component) f3s).setBounds(288, 40, 69, 20);
		add((Component) f3s);
		
		f4b1 = new JLabel("0");
		((Component) f4b1).setBounds(397, 16, 42, 20);
		add((Component) f4b1);
		
		f4b2 = new JLabel("0");
		((Component) f4b2).setBounds(440, 16, 42, 20);
		add((Component) f4b2);
		
		f4s = new JLabel("0");
		((Component) f4s).setBounds(407, 40, 69, 20);
		add((Component) f4s);
		
		f5b1 = new JLabel("0");
		((Component) f5b1).setBounds(497, 16, 42, 20);
		add((Component) f5b1);
		
		f5b2 = new JLabel("0");
		((Component) f5b2).setBounds(538, 16, 42, 20);
		add((Component) f5b2);
		
		f5s = new JLabel("0");
		((Component) f5s).setBounds(491, 40, 69, 20);
		add((Component) f5s);
		
		f6b1 = new JLabel("0");
		((Component) f6b1).setBounds(595, 16, 42, 20);
		add((Component) f6b1);
		
		f6b2 = new JLabel("0");
		((Component) f6b2).setBounds(638, 16, 42, 20);
		add((Component) f6b2);
		
		f6s = new JLabel("0");
		((Component) f6s).setBounds(592, 40, 69, 20);
		add((Component) f6s);
		
		f7b1 = new JLabel("0");
		((Component) f7b1).setBounds(679, 16, 42, 20);
		add((Component) f7b1);
		
		f7b2 = new JLabel("0");
		((Component) f7b2).setBounds(719, 16, 42, 20);
		add((Component) f7b2);
		
		f7s = new JLabel("0");
		((Component) f7s).setBounds(689, 40, 69, 20);
		add((Component) f7s);
		
		f8b1 = new JLabel("0");
		((Component) f8b1).setBounds(776, 16, 42, 20);
		add((Component) f8b1);
		
		f8b2 = new JLabel("0");
		((Component) f8b2).setBounds(818, 16, 42, 20);
		add((Component) f8b2);
		
		f8s = new JLabel("0");
		((Component) f8s).setBounds(786, 40, 69, 20);
		add((Component) f8s);
		
		f9b1 = new JLabel("0");
		((Component) f9b1).setBounds(875, 16, 42, 20);
		add((Component) f9b1);
		
		f9b2 = new JLabel("0");
		((Component) f9b2).setBounds(916, 16, 42, 20);
		add((Component) f9b2);
		
		f9s = new JLabel("0");
		((Component) f9s).setBounds(870, 40, 69, 20);
		add((Component) f9s);
		
		f10b1 = new JLabel("0");
		((Component) f10b1).setBounds(973, 16, 50, 20);
		add((Component) f10b1);
		
		f10b2 = new JLabel("0");
		((Component) f10b2).setBounds(1024, 16, 50, 20);
		add((Component) f10b2);
		
		f10b3 = new JLabel("0");
		((Component) f10b3).setBounds(1073, 16, 50, 20);
		add((Component) f10b3);
		
		f10s = new JLabel("0");
		((Component) f10s).setBounds(983, 40, 69, 20);
		add((Component) f10s);
		
		
//		System.out.println("Get Set test Start");
//		
//		System.out.println("GetName1 " + getName());
//		setName("Ben");
//		System.out.println("GetName2 " + getName());
//		System.out.println("PlayerName1 " + ((JLabel) playerName).getText());
//		((JLabel) playerName).setText("Test");
//		System.out.println("PlayerName2 " + ((JLabel) playerName).getText());
//		System.out.println("GetName3 " + getName());
//		System.out.println(getf1B1());
//		setf1B1("2");
//		System.out.println(getf1B1());
//		System.out.println(Integer.parseInt(getf1B1().toString()));
//		
//		System.out.println("Get Set test Finish");
		

	}
	
	public String getName(){
		return (String) ((JLabel) playerName).getText();
	}
	
	public void setName(String name){
		((JLabel) playerName).setText(name);
	}
	
	public String getf1B1(){
		return (String)((JLabel) f1b1).getText();
	}
	
	public void setf1B1(String value){
		((JLabel) f1b1).setText(value);
		}
	
	public String getf1B2(){
		return (String) ((JLabel) f1b2).getText();
	}
	
	public void setf1B2(String value){
		((JLabel) f1b2).setText(value);
		}
	
	public String getf1S(){
		return (String)((JLabel) f1s).getText();
	}
	
	public void setf1S(String value){
		((JLabel) f1s).setText(value);
		}
	
	public String getf2B1(){
		return (String) ((JLabel) f2b1).getText();
	}
	
	public void setf2B1(String value){
		((JLabel) f2b1).setText(value);
		}
	
	public String getf2B2(){
		return (String) ((JLabel) f2b2).getText();
	}
	
	public void setf2B2(String value){
		((JLabel) f2b2).setText(value);
		}
	
	public String getf2S(){
		return (String) ((JLabel) f2s).getText();
	}
	
	public void setf2S(String value){
		((JLabel) f2s).setText(value);
		}
	public String getf3B1(){
		return (String) ((JLabel) f3b1).getText();
	}
	
	public void setf3B1(String value){
		((JLabel) f3b1).setText(value);
		}
	
	public String getf3B2(){
		return (String) ((JLabel) f3b2).getText();
	}
	
	public void setf3B2(String value){
		((JLabel) f3b2).setText(value);
		}
	
	public String getf3S(){
		return (String) ((JLabel) f3s).getText();
	}
	
	public void setf3S(String value){
		((JLabel) f3s).setText(value);
		}
	
	public String getf4B1(){
		return (String) ((JLabel) f4b1).getText();
	}
	
	public void setf4B1(String value){
		((JLabel) f4b1).setText(value);
		}
	
	public String getf4B2(){
		return (String) ((JLabel) f4b2).getText();
	}
	
	public void setf4B2(String value){
		((JLabel) f4b2).setText(value);
		}
	
	public String getf4S(){
		return (String) ((JLabel) f4s).getText();
	}
	
	public void setf4S(String value){
		((JLabel) f4s).setText(value);
		}
	
	public String getf5B1(){
		return (String) ((JLabel) f5b1).getText();
	}
	
	public void setf5B1(String value){
		((JLabel) f5b1).setText(value);
		}
	
	public String getf5B2(){
		return (String) ((JLabel) f5b2).getText();
	}
	
	public void setf5B2(String value){
		((JLabel) f5b2).setText(value);
		}
	
	public String getf5S(){
		return (String) ((JLabel) f5s).getText();
	}
	
	public void setf5S(String value){
		((JLabel) f5s).setText(value);
		}
	
	public String getf6B1(){
		return (String) ((JLabel) f6b1).getText();
	}
	
	public void setf6B1(String value){
		((JLabel) f6b1).setText(value);
		}
	
	public String getf6B2(){
		return (String) ((JLabel) f6b2).getText();
	}
	
	public void setf6B2(String value){
		this.f6b2 = value;
		}
	
	public String getf6S(){
		return (String) ((JLabel) f6s).getText();
	}
	
	public void setf6S(String value){
		((JLabel) f6s).setText(value);
		}
	
	public String getf7B1(){
		return (String) ((JLabel) f7b1).getText();
	}
	
	public void setf7B1(String value){
		((JLabel) f7b1).setText(value);
		}
	
	public String getf7B2(){
		return (String) ((JLabel) f7b2).getText();
	}
	
	public void setf7B2(String value){
		((JLabel) f7b2).setText(value);
		}
	
	public String getf7S(){
		return (String) ((JLabel) f7s).getText();
	}
	
	public void setf7S(String value){
		((JLabel) f7s).setText(value);
		}
	
	public String getf8B1(){
		return (String) ((JLabel) f8b1).getText();
	}
	
	public void setf8B1(String value){
		((JLabel) f8b1).setText(value);
		}
	
	public String getf8B2(){
		return (String) ((JLabel) f8b2).getText();
	}
	
	public void setf8B2(String value){
		((JLabel) f8b2).setText(value);;
		}
	
	public String getf8S(){
		return (String) ((JLabel) f8s).getText();
	}
	
	public void setf8S(String value){
		((JLabel) f8s).setText(value);
		}
	
	public String getf9B1(){
		return (String) ((JLabel) f9b1).getText();
	}
	
	public void setf9B1(String value){
		((JLabel) f9b1).setText(value);
		}
	
	public String getf9B2(){
		return (String) ((JLabel) f9b2).getText();
	}
	
	public void setf9B2(String value){
		((JLabel) f9b2).setText(value);
		}
	
	public String getf9S(){
		return (String) ((JLabel) f9s).getText();
	}
	
	public void setf9S(String value){
		((JLabel) f9s).setText(value);
		}
	
	public String getf10B1(){
		return (String) ((JLabel) f10b1).getText();
	}
	
	public void setf10B1(String value){
		((JLabel) f10b1).setText(value);
		}
	
	public String getf10B2(){
		return (String) ((JLabel) f10b2).getText();
	}
	
	public void setf10B2(String value){
		((JLabel) f10b2).setText(value);
		}
	public String getf10B3(){
		return (String) ((JLabel) f10b3).getText();
	}
	
	public void setf10B3(String value){
		((JLabel) f10b3).setText(value);
		}
	
	public String getf10S(){
		return (String) ((JLabel) f1s).getText();
	}
	
	public void setf10S(String value){
		((JLabel) f10s).setText(value);
		}
	

}
