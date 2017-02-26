import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


class TuringMachine {
		static JFrame frame1;
		static Container pane;
		static JButton btn1, btn2, btn3;
		static JLabel prompt;
	  static JTextField input;
		static Insets insets;

		public static void main(String args[]) throws Exception{

		frame1 = new JFrame ("Turning Machine Application");
		frame1.setSize(650,200);
		pane = frame1.getContentPane();
		insets = pane.getInsets();
		pane.setLayout(null);

		prompt = new JLabel("Please chose your language");
		input = new JTextField(10);
		btn1 = new JButton("{ww | w ∈ {0,1}}");
		btn2 = new JButton("{w#w#w | w ∈ {0, 1}}");
		btn3 = new JButton("{w | w contains an even number of 0s and w ∈ {0} ∗ }");


		pane.add(prompt);
		prompt.setBounds(insets.top + 100, insets.right + 5, prompt.getPreferredSize().width, prompt.getPreferredSize().height);

		pane.add(btn1);
		btn1.setBounds (input.getX() + 100 + btn1.getWidth(), insets.top + 30, btn1.getPreferredSize().width, btn1.getPreferredSize().height);
		btn1.setActionCommand("1");

		pane.add(btn2);
		btn2.setBounds (input.getX() +100 + btn2.getWidth(), insets.top + 60, btn2.getPreferredSize().width, btn2.getPreferredSize().height);
		btn2.setActionCommand("2");

		pane.add(btn3);
		btn3.setBounds (input.getX() +100 + btn3.getWidth(), insets.top + 90, btn3.getPreferredSize().width, btn3.getPreferredSize().height);
		btn3.setActionCommand("3");

		frame1.setVisible(true);

		btn1.addActionListener(new ButtonListener());
		btn2.addActionListener(new ButtonListener());
		btn3.addActionListener(new ButtonListener());

		//Set Look and Feel

	try
		{UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			}catch (ClassNotFoundException e) {}

				catch (InstantiationException e) {}

					catch (IllegalAccessException e) {}

						catch (UnsupportedLookAndFeelException e) {}



	}//main

}//turning machine


	class ButtonListener implements ActionListener{
		static JFrame frame1;
		static Container pane;
		static JLabel prompt, tapeJ, deniedJ;
	  static JTextField input;
		static Insets insets;
		static JButton btn;
		ButtonListener(){

		}

		public void actionPerformed(ActionEvent e){
				if("1".equals(e.getActionCommand())){
					Machine1_Input();
				}
				if("2".equals(e.getActionCommand())){
				Machine2_Input();
				}
				if("3".equals(e.getActionCommand())){
				Machine3_Input();
				}
				if("OK1".equals(e.getActionCommand())){
						String str = input.getText();
						Machine1(str);
				}
				if("OK2".equals(e.getActionCommand())){
						String str = input.getText();
						Machine2(str);
				}
				if("OK3".equals(e.getActionCommand())){
						String str = input.getText();
						Machine3(str);
				}
			}


		public void Machine1_Input(){
				//{ww | w ∈ {0,1}}
					frame1 = new JFrame ("Machine 1");
					frame1.setSize(650,200);
					pane = frame1.getContentPane();
					insets = pane.getInsets();
					pane.setLayout(null);
					input = new JTextField(10);
					prompt = new JLabel("Please enter your string");
					btn = new JButton("OK");

					pane.add(prompt);
					prompt.setBounds(insets.top + 100, insets.right + 5, prompt.getPreferredSize().width, prompt.getPreferredSize().height);

					pane.add(input);
					input.setBounds(insets.top + 100, insets.top + 25, input.getPreferredSize().width, input.getPreferredSize().height);

					pane.add(btn);
					btn.setBounds(insets.top + 100, insets.right + 60, btn.getPreferredSize().width, btn.getPreferredSize().height);
					btn.setActionCommand("OK1");

					frame1.setVisible(true);
					try
						{UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
							}catch (ClassNotFoundException e) {}

								catch (InstantiationException e) {}

									catch (IllegalAccessException e) {}

										catch (UnsupportedLookAndFeelException e) {}

					btn.addActionListener(new ButtonListener());
								}//Machine1

		public void Machine1(String str){
			StringBuilder tape = new StringBuilder(str);
			StringBuilder tape1 = new StringBuilder(tape);
			tape.append(tape1);
				for(int i = 0; i < tape.length(); i++){
					if(tape.charAt(i) == '0'){
						tape.setCharAt(i, 'x');
						 System.out.println("Step #"+ i + " " + tape + "\tOperation performed: Read 0 at position #" + i + ", wrote x, movement right");
					} else if (tape.charAt(i) != '0'){
						System.out.println("Denied!");
						System.out.println("\t\tOperation performed: Read 1 at position #" + i + ", string denied.");
						break;
					}

					if(tape.charAt(i+1) == '1'){
						tape.setCharAt(i+1, 'x');
						System.out.println("Step #"+ (i+1) + " " + tape + "\tOperation performed: Read 1 at position #" + (i+1) + ", wrote x, movement right");
					} else if (tape.charAt(i+1) != '1'){
						System.out.println("Denied!");
						System.out.println("\t\tOperation performed: Read 0 at position #" + i + ", string denied.");
						break;
					}
					i++;
				}//for
				if(tape.charAt(tape.length()-1) == 'x'){
					System.out.println("Accepted!");
				}

		}//machine1

		public void Machine2_Input(){
			//{w#w#w | w ∈ {0, 1}}
				frame1 = new JFrame ("Machine 2");
				frame1.setSize(650,200);
				pane = frame1.getContentPane();
				insets = pane.getInsets();
				pane.setLayout(null);
				input = new JTextField(10);
				prompt = new JLabel("Please enter your string");
				btn = new JButton("OK");

				pane.add(prompt);
				prompt.setBounds(insets.top + 100, insets.right + 5, prompt.getPreferredSize().width, prompt.getPreferredSize().height);

				pane.add(input);
				input.setBounds(insets.top + 100, insets.top + 25, input.getPreferredSize().width, input.getPreferredSize().height);

				pane.add(btn);
				btn.setBounds(insets.top + 100, insets.right + 60, btn.getPreferredSize().width, btn.getPreferredSize().height);
				btn.setActionCommand("OK2");

				frame1.setVisible(true);
				try
					{UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
						}catch (ClassNotFoundException e) {}

							catch (InstantiationException e) {}

								catch (IllegalAccessException e) {}

									catch (UnsupportedLookAndFeelException e) {}

				btn.addActionListener(new ButtonListener());
		}

		public void Machine2(String str){
				//{w#w#w | w ∈ {0, 1}}

					String h = "#";

					StringBuilder tape = new StringBuilder(str);
					StringBuilder tape1 = new StringBuilder(tape);
					StringBuilder tape2 = new StringBuilder(tape1);
					tape.append(h);
					tape.append(tape1);
					tape.append(h);
					tape.append(tape2);

					try{
					for(int i = 0; i < tape.length();i++){
						if(tape.charAt(i) == '0'){
							tape.setCharAt(i, 'x');
							System.out.println("Step #"+ i + " " + tape + "\tOperation performed: Read 0 at position #" + i + ", wrote x, movement right.");
						} else if (tape.charAt(i) == '1'){
								System.out.println("Denied!");
								System.out.println("\t\tOperation performed: Read 1 at position #" + i + ", string denied.");
								break;
						}
						if(tape.charAt(i+1) == '1'){
							tape.setCharAt(i+1, 'x');
							System.out.println("Step #"+ (i+1) + " " + tape + "\tOperation performed: Read 1 at position #" + (i+1) + ", wrote x, movement right.");
						} else if (tape.charAt(i+1) == '0'){
							System.out.println("Denied!");
							System.out.println("\t\tOperation performed: Read 0 at position #" + i + ", string denied.");
							break;
						}

						if(tape.charAt(i+2) == '#' ) {
							tape.setCharAt(i+2, 'x');
							System.out.println("Step #"+ (i+2) + " " + tape + "\tOperation performed: Read # at position #" + (i+2) + ", wrote x, movement right.");
						}else if ((tape.charAt(i+2) == '0') || (tape.charAt(i+2) == '1')){
							System.out.println("Denied!");
							System.out.println("\t\tOperation performed: Read 1 or 0 at position #" + (i+2) + ", string denied.");
							break;
						}
						i++;
						i++;
					}//for
				} catch (StringIndexOutOfBoundsException e) {

				}
				if(tape.charAt(tape.length()-1) == 'x'){
					System.out.println("Accepted!");
				}
				}//Machine2

		public void Machine3_Input(){
					//{w | w contains an even number of 0s and w ∈ {0} ∗ }
						frame1 = new JFrame ("Machine 3");
						frame1.setSize(650,200);
						pane = frame1.getContentPane();
						insets = pane.getInsets();
						pane.setLayout(null);
						input = new JTextField(10);
						prompt = new JLabel("Please enter your string");
						btn = new JButton("OK");

						pane.add(prompt);
						prompt.setBounds(insets.top + 100, insets.right + 5, prompt.getPreferredSize().width, prompt.getPreferredSize().height);

						pane.add(input);
						input.setBounds(insets.top + 100, insets.top + 25, input.getPreferredSize().width, input.getPreferredSize().height);

						pane.add(btn);
						btn.setBounds(insets.top + 100, insets.right + 60, btn.getPreferredSize().width, btn.getPreferredSize().height);
						btn.setActionCommand("OK3");

						frame1.setVisible(true);
						try
							{UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
								}catch (ClassNotFoundException e) {}

									catch (InstantiationException e) {}

										catch (IllegalAccessException e) {}

											catch (UnsupportedLookAndFeelException e) {}

						btn.addActionListener(new ButtonListener());
				}

		public void Machine3(String str){
					//{w | w contains an even number of 0s and w ∈ {0} ∗ }
						boolean odd = false;
						StringBuilder tape = new StringBuilder(str);
						try{
						for(int i = 0; i < tape.length();i++){
							if(tape.charAt(i) == '0'){
								tape.setCharAt(i, 'x');
								System.out.println("Step #"+ i + " " + tape + "\tOperation performed: Read 0 at position #" + i + ", wrote x, movement right.");
							} else if (tape.charAt(i) != '0'){
								System.out.println("Denied!");
								System.out.println("\t\tOperation performed: Read 1 at position #" + i + ", string denied.");
								break;
							}

							if(tape.charAt(i+1) == '0'){
								tape.setCharAt(i+1, 'x');
								System.out.println("Step #"+ (i+1) + " " + tape + "\tOperation performed: Read 0 at position #" + (i+1) + ", wrote x, movement right.");
							} else if (tape.charAt(i+1) != '0'){
								System.out.println("Denied!");
								System.out.println("\t\tOperation performed: Read 1 at position #" + (i+1) + ", string denied.");
								break;
							}
							i++;
						}//for
					} catch (StringIndexOutOfBoundsException ei) {
							System.out.println("Denied!\t\tString is not of even length.");
							odd = true;
					}
					if((tape.charAt(tape.length()-1) == 'x') && (odd == false)){
						System.out.println("Accepted!");
					}
				}//Machine3


		}
