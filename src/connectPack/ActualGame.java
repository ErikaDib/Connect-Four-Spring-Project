package connectPack;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ActualGame implements ActionListener  {
	
//introductiongui
		private JFrame introFrame;
		private JLabel introLabel;
		private JLabel introLabel2;
		private JButton introButton;
//instruccionsgui
		
		private JFrame instruccionsFrame;
		private JLabel instruccionsLabel_1;
		private JLabel instruccionsLabel_2;
		private JLabel instruccionsLabel_3;
		private JLabel instruccionsLabel_4;
		private JTextField instruccionstextField;
		private JTextField instruccionstextField_1;
		private JTextField instruccionstextField_2;
		private JTextField instruccionstextField_3;
		private JButton instruccionsButton;
		private JButton instruccionsButton2;
		private JLabel instruccionsLabelOr;
		private JLabel instruccionsLabelInstruccions;
		private JLabel instruccionsLabel_5;
		private JTextField instruccionstextField_5;
		
//game gui
		private JFrame gameFrame;
		private JPanel gamePanel;
		private JButton [][] board;
		private JLabel gameLabel ;
		
		
		
	
		
//score gui
		private JFrame scoreFrame;
		private JButton scoreButton;
		private JButton scoreButton_2;
		private JLabel scoreLabel;
		
	///utilities
		
	private	int counter =0;
	private	int rowrow=0;
	private	int colcol=0;
	private	String player1;
	private	String player2;
	private	int numberrows;
	private	int numbercolumns;
	private	int numberconnect;
		
		
		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public  void run() {
					
						ActualGame window = new ActualGame();
						ActualGame window2=new ActualGame();
						ActualGame window3=new ActualGame();
						ActualGame window4=new ActualGame();
						window.introFrame.setVisible(true);
						window2.instruccionsFrame.setVisible(false);
						window3.gameFrame.setVisible(false);
						window4.scoreFrame.setVisible(false);
				}
			});
		}

		
		public ActualGame() {
			myGame();
		}

		
		private void myGame() {
			//introduction gui
			introFrame = new JFrame("Connect X");
			introFrame.setBounds(100, 100, 516, 393);
			introFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			introFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\eri_k\\Desktop\\conect4\\fouricon.png"));
			introFrame.getContentPane().setBackground(Color.BLACK);
			introFrame.getContentPane().setLayout(null);
			//introFrame.setIconImage(new ImageIcon(ActualGame.class.getResource("/connectPack/image1.gif"));
			
			introLabel=new JLabel("CONNECT X");
			introLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
			introLabel.setHorizontalAlignment(SwingConstants.CENTER);
			introLabel.setForeground(Color.WHITE);
			introLabel.setBounds(149, 11, 186, 50);
			introFrame.getContentPane().add(introLabel);
		
			introButton = new JButton("Start");
			introButton.setBounds(174, 311, 161, 38 );
			introButton.setBackground(Color.GRAY);
			introButton.setForeground(Color.WHITE);
			introButton.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
			
			introLabel2= new JLabel();
			introLabel2.setIcon(new ImageIcon("C:\\Users\\eri_k\\Desktop\\conect4\\image34.gif"));
			introLabel2.setBounds(10, 57, 480, 243);
			introFrame.getContentPane().add(introLabel2);
			
			introFrame.getContentPane().add(introButton);
			
			//instruccions gui
			instruccionsFrame = new JFrame("Connect X Instruccions");
			instruccionsFrame.setBounds(100, 100, 557, 417);
			instruccionsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			instruccionsFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\eri_k\\Desktop\\conect4\\fouricon.png"));
			instruccionsFrame.getContentPane().setBackground(Color.BLACK);
			instruccionsFrame.getContentPane().setLayout(null);
			
			instruccionsButton = new JButton("Play");
			instruccionsButton.setBounds(182, 326, 161, 41);
			instruccionsButton.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
			instruccionsFrame.getContentPane().add(instruccionsButton);
			
			instruccionstextField = new JTextField();
			instruccionstextField.setBounds(141, 26, 86, 20);
			instruccionsFrame.getContentPane().add(instruccionstextField);
			instruccionstextField.setColumns(10);
			
			instruccionstextField_1 = new JTextField();
			instruccionstextField_1.setBounds(141, 69, 86, 20);
			instruccionsFrame.getContentPane().add(instruccionstextField_1);
			instruccionstextField_1.setColumns(10);
			
			instruccionstextField_2 = new JTextField();
			instruccionstextField_2.setBounds(141, 115, 86, 20);
			instruccionsFrame.getContentPane().add(instruccionstextField_2);
			instruccionstextField_2.setColumns(10);
			
			instruccionstextField_3 = new JTextField();
			instruccionstextField_3.setBounds(141, 160, 86, 20);
			instruccionsFrame.getContentPane().add(instruccionstextField_3);
			instruccionstextField_3.setColumns(10);
			
			instruccionstextField_5 = new JTextField();
			instruccionstextField_5.setBounds(141, 206, 86, 20);
			instruccionsFrame.getContentPane().add(instruccionstextField_5);
			instruccionstextField_5.setColumns(10);
			
			instruccionsLabel_1 = new JLabel("Player 1 Name");
			instruccionsLabel_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
			instruccionsLabel_1.setForeground(Color.WHITE);
			instruccionsLabel_1.setBounds(21, 29, 110, 14);
			
			instruccionsFrame.getContentPane().add(instruccionsLabel_1);
			
			instruccionsLabel_2 = new JLabel("Player 2 Name");
			instruccionsLabel_2.setBounds(21, 72, 110, 14);
			instruccionsLabel_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
			instruccionsLabel_2.setForeground(Color.WHITE);
			instruccionsFrame.getContentPane().add(instruccionsLabel_2);
			
			instruccionsLabel_3 = new JLabel("Rows");
			instruccionsLabel_3.setBounds(21, 115, 110, 14);
			instruccionsLabel_3.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
			instruccionsLabel_3.setForeground(Color.WHITE);
			instruccionsFrame.getContentPane().add(instruccionsLabel_3);
			
			instruccionsLabel_4= new JLabel("Columns");
			instruccionsLabel_4.setBounds(21, 163, 110, 14);
			instruccionsLabel_4.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
			instruccionsLabel_4.setForeground(Color.WHITE);
			instruccionsFrame.getContentPane().add(instruccionsLabel_4);
			
			instruccionsLabel_5 = new JLabel("Connect");
			instruccionsLabel_5.setBounds(21, 209, 110, 14);
			instruccionsLabel_5.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
			instruccionsLabel_5.setForeground(Color.WHITE);
			instruccionsFrame.getContentPane().add(instruccionsLabel_5);
			
			instruccionsLabelOr= new JLabel("OR");
			instruccionsLabelOr.setBounds(102, 249, 46, 14);
			instruccionsLabelOr.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
			instruccionsLabelOr.setForeground(Color.WHITE);
			instruccionsFrame.getContentPane().add(instruccionsLabelOr);
			
			instruccionsLabelInstruccions= new JLabel();
			instruccionsLabelInstruccions.setText("<html><body>To win Connect Four"
					+ " you must be the first player"
					+ " to get four of your colored"
					+ " checkers in a row either "
					+ " horizontally, vertically or diagonally.</body></html>");
			
			instruccionsLabelInstruccions.setFont(new Font("Showcard Gothic", Font.PLAIN, 15));
			instruccionsLabelInstruccions.setForeground(Color.WHITE);
			instruccionsLabelInstruccions.setBounds(293, 29, 211, 183);
			instruccionsFrame.getContentPane().add(instruccionsLabelInstruccions);
			
			
			instruccionsButton2 = new JButton("Normal Game");
			instruccionsButton2.setBounds(51, 274, 161, 23);
			instruccionsButton2.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
			instruccionsFrame.getContentPane().add(instruccionsButton2);
			//////////////
			
			//game gui
			gameFrame = new JFrame("Connect X");
			gameFrame.setBounds(100, 100, 555, 493);
			gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gameFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\eri_k\\Desktop\\conect4\\fouricon.png"));
			gameFrame.getContentPane().setBackground(Color.BLACK);
			gameFrame.getContentPane().setLayout(null);
			
			
			gamePanel = new JPanel();
			
			gamePanel.setBounds(68, 21, 402, 376);
			
			gameFrame.getContentPane().add(gamePanel);
			
			gameLabel= new JLabel();
			gameLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
			gameLabel.setBackground(Color.WHITE);
			gameLabel.setForeground(Color.WHITE);
			gameLabel.setBounds(219, 414, 121, 29);
			gameFrame.getContentPane().add(gameLabel);
			
			
			
			// score board gui
			
			scoreFrame = new JFrame("Connect X");
			scoreFrame.setBounds(100, 100, 450, 300);
			scoreFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			scoreFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\eri_k\\Desktop\\conect4\\fouricon.png"));
			scoreFrame.getContentPane().setBackground(Color.BLACK);
			scoreFrame.getContentPane().setLayout(null);
			
			scoreButton = new JButton("Play Again");
			scoreButton.setBounds(163, 161, 100, 23);
			scoreButton.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
			scoreFrame.getContentPane().add(scoreButton);
			
			scoreButton_2 = new JButton("Quit");
			scoreButton_2.setBounds(163, 208, 100, 23);
			scoreButton_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
			scoreFrame.getContentPane().add(scoreButton_2);
			
			scoreLabel= new JLabel("");
			scoreLabel.setBounds(61, 29, 282, 50);
			scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
			scoreLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
			scoreLabel.setForeground(Color.WHITE);
			scoreFrame.getContentPane().add(scoreLabel);
			
			
			introButton.addActionListener(this);
			instruccionsButton.addActionListener(this);
			instruccionsButton2.addActionListener(this);
			scoreButton.addActionListener(this);
			scoreButton_2.addActionListener(this);
			
		}
		//////methods////
		
		public String getUserInput(JTextField textField ){
	    	
	    	String userinput=textField.getText();
	    	
	    	return userinput;
	    }
		
		public int getIntFromTextField(JTextField textField)throws Exception{
			boolean flag=true;
			int num = -999999999;
			
			try{
				num =  Integer.parseInt(textField.getText());
				
			}
				catch(Exception e){
				throw new Exception("Invalid Input: "+ e.getMessage());
			} 
			return num;
		}
		public void setUserInput(JTextField textField,String a){
			textField.setText(a);
			
		}
		
		public void displayBoard(int x, int y) {
			ImageIcon icon=new ImageIcon(ActualGame.class.getResource("/connectPack/circleone.png"));
			gamePanel.setLayout(new GridLayout(x,y));
			board = new JButton[x][y];
			 for(int row=0; row<board.length; row++){
			  for(int col=0; col<board[row].length; col++){
			     board[row][col] = new JButton();
		        	board[row][col].setBackground(Color.yellow);
			Image img = icon.getImage();
			//resize image
			if(x<y || x==y){
			Image newimg = img.getScaledInstance(((-402/2)/x),(376/y),java.awt.Image.SCALE_SMOOTH );
			board[row][col].setIcon(new ImageIcon(newimg));
			     }else if(x>y){
				Image newimg2 = img.getScaledInstance(((-402/2)/x),((376/2)/y),java.awt.Image.SCALE_SMOOTH );
				board[row][col].setIcon(new ImageIcon(newimg2));
			}
			//
			    board[row][col].addActionListener(this);
			     board[row][col].setEnabled(true);
			      gamePanel.add(board[row][col]);
			}
		
			}

		}
		//the  method
		public void turn(JButton btnClicked,int x, int y,int columns,int rows){
			scoreFrame.dispose();
		
			ImageIcon icon1=new ImageIcon(ActualGame.class.getResource("/connectPack/circletwo.png"));
			ImageIcon icon2=new ImageIcon(ActualGame.class.getResource("/connectPack/circlethree.png"));
			player1=getUserInput(instruccionstextField);
			player2=getUserInput(instruccionstextField_1);
			//my turns are given by %
		
			if(counter%2==0){
				gameLabel.setText("It's "+player1+" turn");
				if(x<y || x==y){
					//this should be in stackoverflow
					Image img = icon1.getImage();
					Image newimage1 = img.getScaledInstance(((-402/2)/x),(376/y),java.awt.Image.SCALE_SMOOTH );
					//btnClicked.setIcon(new ImageIcon(newimage1));
					//
					//reverse loop to drop my images
					if(board[rows][columns].isEnabled()==true && board[rows][columns]==btnClicked){
						for (int i=x-1; i >= 0; i--){
							
							if(board[i][columns].isEnabled()==true){
								board[i][columns].setEnabled(false);
								board[i][columns].setBackground(Color.RED);
								board[i][columns].setDisabledIcon(new ImageIcon(newimage1));
								break;
							}
							 
							
						  }
						
					}
					//board[rows][columns].setBackground(Color.BLACK);
					
					counter++;
					}else if(x>y){
						Image img = icon1.getImage();
						Image newimage2 = img.getScaledInstance(((-402/2)/x),((376/2)/y),java.awt.Image.SCALE_SMOOTH );
						//btnClicked.setIcon(new ImageIcon(newimage2));
						if(board[rows][columns].isEnabled()==true){
							for (int i=x-1; i >= 0; i--){
								
								if(board[i][columns].isEnabled()==true){
									board[i][columns].setEnabled(false);
									board[i][columns].setBackground(Color.RED);
									board[i][columns].setDisabledIcon(new ImageIcon(newimage2));
									break;
								}
								 
								
							  }
							
						}
						
						counter++;
					}
				
			    }else if(x<y || x==y){
			    	gameLabel.setText("It's "+player2+" turn");
					Image img2 = icon2.getImage();
					Image newimage12 = img2.getScaledInstance(((-402/2)/x),(376/y),java.awt.Image.SCALE_SMOOTH );
					//btnClicked.setIcon(new ImageIcon(newimage12));
					if(board[rows][columns].isEnabled()==true){
						for (int i=x-1; i >= 0; i--){
							
							if(board[i][columns].isEnabled()==true){
								board[i][columns].setEnabled(false);
								board[i][columns].setBackground(Color.BLUE);
								board[i][columns].setDisabledIcon(new ImageIcon(newimage12));
								break;
							}
							 
							
						  }
						
					}
					counter++;
					}else if(x>y){
						Image img2 = icon2.getImage();
						Image newimage12 = img2.getScaledInstance(((-402/2)/x),((376/2)/y),java.awt.Image.SCALE_SMOOTH );
						//btnClicked.setIcon(new ImageIcon(newimage12));
						if(board[rows][columns].isEnabled()==true){
							for (int i=x-1; i >= 0; i--){
								
								if(board[i][columns].isEnabled()==true){
									board[i][columns].setEnabled(false);
									board[i][columns].setBackground(Color.BLUE);
									board[i][columns].setDisabledIcon(new ImageIcon(newimage12));
									break;
								}
								 
								
							  }
							
						}
						counter++;
					}
			
		     }
		public boolean isWinnerRed(JButton btnClicked,int x,int y,int connect){
			
			//check rows
		for(int row=0; row<board.length; row++){
			int rowCount=0;
			 for(int col=0; col<board[row].length; col++){
			   if(board[row][col].getBackground().equals(Color.RED)){
			   rowCount++;
			   }else{
				   
				   rowCount=0;
			   }
			    if(rowCount >= connect){
			        return true;
			       }
			     }
			   }
	     	
			//check columns
		
			for(int col=0; col<y-1; col++){
			 int colCount=0;
			  for(int row=0; row<board.length; row++){
			    if(board[row][col].getBackground().equals(Color.RED)){
			     colCount++;
			    }else{
			    	colCount=0;
			    }
			      if(colCount >=connect){
			         return true;
		         	}
			     }
			  }
			
			//check main diagonal [0][0],[1][1],[2][2]
			int diagCount=0;
			    for(int i=0; i<board.length; i++){
			      if(board[i][i].getBackground().equals(Color.RED)){
			        diagCount++;
			      }else{
			    	  diagCount=0;
			      }
			         if(diagCount >=connect){
			          return true;
			         }
			        } 
			    

			//check secondary diagonal
			int diag2Count=0;
			   int row=board.length-1;
			    int col = 0;
			  while(row >=0 && col< board.length){
			    if(board[row][col].getBackground().equals(Color.RED)){
			     diag2Count++;
			      if(diag2Count >=connect){
			       return true;
		        	}
			   }
			row--;
			col++;
			}
			return false;
			}


    public boolean isWinnerBlue(JButton btnClicked,int x,int y, int connect){
			
			//check rows
    	for(int row=0; row<board.length; row++){
			int rowCount=0;
			 for(int col=0; col<board[row].length; col++){
			   if(board[row][col].getBackground().equals(Color.BLUE)){
			   rowCount++;
			   }else{
				   
				   rowCount=0;
			   }
			    if(rowCount >= connect){
			        return true;
			       }
			     }
			   }
	     	
			//check columns
		
			for(int col=0; col<y-1; col++){
			 int colCount=0;
			  for(int row=0; row<board.length; row++){
			    if(board[row][col].getBackground().equals(Color.BLUE)){
			     colCount++;
			    }else{
			    	colCount=0;
			    }
			      if(colCount >=connect){
			         return true;
		         	}
			     }
			  }
			
			//check main diagonal [0][0],[1][1],[2][2]
			int diagCount=0;
			    for(int i=0; i<board.length; i++){
			      if(board[i][i].getBackground().equals(Color.BLUE)){
			        diagCount++;
			      }else{
			    	  diagCount=0;
			      }
			         if(diagCount >=connect){
			          return true;
			         }
			        } 
			    

			//check secondary diagonal
			    int diag2Count=0;
				   int row=x;
				    int col = 0;
				  while(row >=0 && col< board.length){
				    if(board[row][col].getBackground().equals(Color.BLUE)){
				     diag2Count++;
				    }else{
				    	 diag2Count=0;
				    }
				    
				    if(diag2Count >=connect){
				       return true;
			        	}
				   
				row--;
				col++;
				}
				return false;
				}
    ///
    
    public boolean isfull(){
   
     boolean flag=false;
       for(int row=0; row<board.length; row++){
    		for(int col=0; col<board[row].length; col++){
    		
    		  if((board[row][col].isEnabled()==true)){
    			//  System.out.println("spost arent fill" );
    			 
    		  flag= true;
    		}else if((board[row][col].isEnabled()==false)){
    		//	 System.out.println("full" );
    		  flag=false;
    		}
	
    		  
    		}
       }
     
	return flag;
    }
    
    public void isFullSimpleWay(int x, int y){
    	if(counter-1==x*y){
			scoreFrame.setVisible(true);
			scoreLabel.setText("Nobody wins!!");
			gamePanel.setEnabled(false);
			
		}
	
		
    }
		public static void countDownToZero(int n){
			if(n<=0){
				System.out.println("DONE!!!!");
				
			}
			else{
				System.out.println(n);
				countDownToZero(n-1);
			}
		}
		
		public void clearBoard(int x,int y) {
				ImageIcon icon=new ImageIcon(ActualGame.class.getResource("/connectPack/circleone.png"));
				for(int row=0; row<board.length; row++){
				for(int col=0; col<board[row].length; col++){
				board[row][col].setBackground(Color.yellow);
				Image img = icon.getImage();
				//resize image
				if(x<y || x==y){
				Image newimg = img.getScaledInstance(((-402/2)/x),(376/y),java.awt.Image.SCALE_SMOOTH );
				board[row][col].setIcon(new ImageIcon(newimg));
				}else if(x>y){
					Image newimg2 = img.getScaledInstance(((-402/2)/x),((376/2)/y),java.awt.Image.SCALE_SMOOTH );
					board[row][col].setIcon(new ImageIcon(newimg2));
				}
				//
				board[row][col].setEnabled(true);
				board[row][col].addActionListener(this);
				gamePanel.add(board[row][col]);
				}
			
				}

			
			
			
		}//
		public void close(JFrame a){
			a.dispose();
			
		}
		
		public boolean winnercheck(boolean red, boolean blue){
			boolean flag=false;
			if(red==true){
				
				scoreFrame.setVisible(true);
				scoreLabel.setText(player2+" wins !");
				gamePanel.setEnabled(false);
				
				flag=true;
				
				//
			}else if(blue==true){
				scoreFrame.setVisible(true);
				scoreLabel.setText(player1+" wins !");
				gamePanel.setEnabled(false);
				flag=false;
				
			}
			
				
			
			
			
			
			return flag;
		}
		
		

				
			public int columNumber(JButton[][] board,JButton btnClicked){
				
				
				
				return 0;
		}
			
			

		@Override
		public void actionPerformed(ActionEvent e) {
			String actCdm=e.getActionCommand();
			try{
			switch(actCdm){
			case "Start":
				
				instruccionsFrame.setVisible(true);
				introFrame.setVisible(false);
				
				break;
				
			case "Play":
			
				instruccionsFrame.setVisible(false);
				gameFrame.setVisible(true);
				//gameFrame.setEnabled(true);
				//counter=0;
				numberrows=getIntFromTextField(instruccionstextField_2);
				numbercolumns=getIntFromTextField(instruccionstextField_3);
				displayBoard(numberrows,numbercolumns);
				break;
				
			case"Normal Game":
			
				String number1="6";
				String number2="7";
				String number3="4";
				
				setUserInput(instruccionstextField_2,number1);
				setUserInput(instruccionstextField_3,number2);
				setUserInput(instruccionstextField_5,number3);
				break;
				
			case "Play Again":
				
				gameFrame.dispose();
				scoreFrame.dispose();
				close(introFrame);
				close(instruccionsFrame);
			
				
				ActualGame.main(null);
				
				//run();
			    break;
				
				
			case "Quit":
				System.exit(0);
				break;
				
				default:
							
			}
			
		
			}catch(Exception exc){
			
		}
			
			
			try{
			numberconnect=getIntFromTextField(instruccionstextField_5);
			//bring row col
			for(int row=0; row<board.length; row++){
				for(int col=0; col<board[row].length; col++){
					if (e.getSource() == board[row][col]){
						rowrow=row;
						colcol=col;
						
					}
					
				}
				}
            //controls buttns
			JButton btnClicked = (JButton) e.getSource();
			turn(btnClicked,numberrows,numbercolumns,colcol,rowrow);
			
			boolean checkred=isWinnerRed(btnClicked,numberrows,numbercolumns,numberconnect);
			boolean checkblue=isWinnerBlue(btnClicked,numberrows,numbercolumns,numberconnect);
			winnercheck(checkred,checkblue);
			//int num=FullCol();
			isFullSimpleWay(numberrows,numbercolumns);
			
			
			
			
			}
			catch(Exception exc1){
				
			}
			
			
			
			}
			
		}
	

	
	
//int column=0;
//for(int row=0; row<board.length; row++){
	//for(int col=0; col<board[row].length; col++){
		//if(ae.getSource()==board[row][col]){
			
	//	}
		
   // }
	//}
//boolean fullboard=isfull();
//if(fullboard==true){
	//System.out.print("board is full");
//}

	
	
	

	


