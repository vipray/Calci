import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.*;
public class MainCalci {

	private JFrame frame;
	private JTextField textField;
	double n1,n2,r;
	String opr,ans,mid;
	int flag=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					MainCalci window = new MainCalci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainCalci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try{
		
		frame = new JFrame("Calculator");
		frame.setBounds(100, 100, 342, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 13, 236, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		/*lblByjainvipray = new JLabel("By-YourNaMe");
		lblByjainvipray.setBackground(new Color(192, 192, 192));
		lblByjainvipray.setBounds(119, 224, 101, 216);
		frame.getContentPane().add(lblByjainvipray);
		*/
		final JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = textField.getText()+btnNewButton.getText(); //input =7
				textField.setText(input);   //textField shows 7
			}
		});
		btnNewButton.setBounds(12, 63, 50, 50);
		frame.getContentPane().add(btnNewButton);
		
		final JButton button = new JButton("8");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = textField.getText()+button.getText(); 
				textField.setText(input);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 17));
		button.setBounds(74, 63, 50, 50);
		frame.getContentPane().add(button);
		
		final JButton button_1 = new JButton("9");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = textField.getText()+button_1.getText(); 
				textField.setText(input);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_1.setBounds(136, 63, 50, 50);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(flag==0){
					n1=Double.parseDouble(textField.getText());
					textField.setText("");  //clear the text field
					opr= "+";
					flag=1;
					}
					else if(flag==1)
					{
						n2=Double.parseDouble(textField.getText());
						if(opr=="+")
						{
							n1=n1+n2;
						}
						else if(opr=="-")
						{
							n1=n1-n2;
						}
						else if(opr=="*")
						{
							n1=n1*n2;
						}
						else if(opr=="/")
						{
							n1=n1/n2;
						}
						
						textField.setText("");  //clear the text field
						opr= "+";
					}// dispalay se uthkar value n1 m aa jayegi
			//mid=textField.getText() + "+";
			
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_2.setBounds(198, 63, 50, 50);
		frame.getContentPane().add(button_2);
		
		final JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = textField.getText()+button_3.getText(); 
				textField.setText(input);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_3.setBounds(12, 126, 50, 50);
		frame.getContentPane().add(button_3);
		
		final JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = textField.getText()+button_4.getText(); 
				textField.setText(input);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_4.setBounds(74, 126, 50, 50);
		frame.getContentPane().add(button_4);
		
		final JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = textField.getText()/*Text Box m jo pehle se h*/+button_5.getText();//aur ye num 5 bhi usi m add hoke show hone lage 
				textField.setText(input);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_5.setBounds(136, 126, 50, 50);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("-");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(flag==0){
					n1=Double.parseDouble(textField.getText());
					textField.setText("");  //clear the text field
					opr= "-";
					flag=1;
					}
					else if(flag==1)
					{
						n2=Double.parseDouble(textField.getText());
						if(opr=="+")
						{
							n1=n1+n2;
						}
						else if(opr=="-")
						{
							n1=n1-n2;
						}
						else if(opr=="*")
						{
							n1=n1*n2;
						}
						else if(opr=="/")
						{
							n1=n1/n2;
						}
						
						textField.setText("");  //clear the text field
						opr= "-";
					}
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_6.setBounds(198, 126, 50, 50);
		frame.getContentPane().add(button_6);
		
		final JButton button_7 = new JButton("1");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = textField.getText()+button_7.getText(); 
				textField.setText(input);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_7.setBounds(12, 189, 50, 50);
		frame.getContentPane().add(button_7);
		
		final JButton button_8 = new JButton("2");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = textField.getText()+button_8.getText(); 
				textField.setText(input);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_8.setBounds(74, 189, 50, 50);
		frame.getContentPane().add(button_8);
		
		final JButton button_9 = new JButton("3");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = textField.getText()+button_9.getText(); 
				textField.setText(input);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_9.setBounds(136, 189, 50, 50);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(flag==0){
				n1=Double.parseDouble(textField.getText());
				textField.setText("");  //clear the text field
				opr= "*";
				flag=1;
				}
				else if(flag==1)
				{
					n2=Double.parseDouble(textField.getText());
					if(opr=="+")
					{
						n1=n1+n2;
					}
					else if(opr=="-")
					{
						n1=n1-n2;
					}
					else if(opr=="*")
					{
						n1=n1*n2;
					}
					else if(opr=="/")
					{
						n1=n1/n2;
					}
					
					textField.setText("");  //clear the text field
					opr= "*";
				}
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_10.setBounds(198, 189, 50, 50);
		frame.getContentPane().add(button_10);
		
		final JButton button_11 = new JButton("0");
		button_11.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = textField.getText()+button_11.getText(); 
				textField.setText(input);
			}
		});
		button_11.setBounds(12, 252, 112, 50);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("=");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				n2=Double.parseDouble(textField.getText());
				if(opr=="+")
				{
					r=n1+n2;
				}
				else if(opr=="-")
				{
					r=n1-n2;
				}
				else if(opr=="*")
				{
					r=n1*n2;
				}
				else if(opr=="/")
				{
					r=n1/n2;
				}
				/*else if(opr=="")
				{
					r=n1+n2;
				}
				else if(opr=="+")
				{
					r=n1+n2;
				}
				else if(opr=="+")
				{
					r=n1+n2;
				}
				else if(opr=="+")
				{
					r=n1+n2;
				}
				else if(opr=="+")
				{
					r=n1+n2;
				}*/
				ans = String.format("%.2f", r);
				textField.setText(ans);
				flag=0;
			}
		});
		button_12.setBounds(136, 252, 50, 50);
		button_12.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("/");
		button_13.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(flag==0){
					n1=Double.parseDouble(textField.getText());
					textField.setText("");  //clear the text field
					opr= "/";
					flag=1;
					}
					else if(flag==1)
					{
						n2=Double.parseDouble(textField.getText());
						if(opr=="+")
						{
							n1=n1+n2;
						}
						else if(opr=="-")
						{
							n1=n1-n2;
						}
						else if(opr=="*")
						{
							n1=n1*n2;
						}
						else if(opr=="/")
						{
							n1=n1/n2;
						}
						
						textField.setText("");  //clear the text field
						opr= "/";
					}
			}
		});
		button_13.setBounds(198, 252, 50, 50);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("\u221A");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				n2=Double.parseDouble(textField.getText());
				ans = String.format("%.2f",Math.sqrt(n2));
				textField.setText(ans);
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_14.setBounds(260, 189, 50, 50);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("%");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				n2=Double.parseDouble(textField.getText());
				ans = String.format("%.2f",((n1*n2)/100));
				textField.setText(ans);
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_15.setBounds(260, 126, 50, 50);
		frame.getContentPane().add(button_15);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				flag=0;
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnC.setBounds(260, 63, 50, 50);
		frame.getContentPane().add(btnC);
		
		JButton button_17 = new JButton(".");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s;
				int g=0;
				s=textField.getText();
				for(int i=0;i<textField.getText().length();i++)
				{
					if(s.charAt(i)=='.')
						{
						g=1;break;
						}
				}
				if(g==0)
					textField.setText(textField.getText()+".");
			}
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_17.setBounds(260, 252, 50, 50);
		frame.getContentPane().add(button_17);
		
		JButton button_16 = new JButton("\u2190");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backspace =null;
				
				if(textField.getText().length()>0)
				{
					if(textField.getText().length()==1)
						flag=0;
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backspace =strB.toString();
					textField.setText(backspace);
				}
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_16.setBounds(260, 13, 50, 37);
		frame.getContentPane().add(button_16);
		}catch(Exception e)
		{
			textField.setText("Error");
		}
		

	}
}
