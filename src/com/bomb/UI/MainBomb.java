package com.bomb.UI;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
public class MainBomb extends JFrame implements ActionListener,MouseListener{
 
 public JTextField text;
  public Label nowBomb,setBomb;
  public int BlockNum,BombNum;                                                //当前方块数当前雷数
  public Icon icon_bomb = new ImageIcon("Bomb.gif");                          //踩雷
  public Icon icon_bomb_big = new ImageIcon("bomb_big.gif");                  //踩雷标记
  public Icon icon_flag = new ImageIcon("flag.gif");                          //雷标记
  public Icon icon_question = new ImageIcon("question.gif");                  //疑惑是否有雷
  public JButton start = new JButton(" 开始 "); 
  public Panel MenuPamel = new Panel(); 
  public Panel mainPanel = new Panel(); 
  public Bomb[][] bombButton;
  
  /*界面设计*/
  
  public MainBomb() 
  {
   super("WK 2015制作  ");
   BlockNum = 64; 
   BombNum = 10; 
   Container c=getContentPane();
   c.setBackground(Color.gray); 
   c.setLayout(new BorderLayout()); 
   text=new JTextField("10 ",3);
   nowBomb = new Label("当前雷数"+"  "+BombNum+"");
   setBomb= new Label("设置地雷数");
   start.addActionListener(new ActionListener(){ 
     public void actionPerformed(ActionEvent e) 
     {   
      BombNum = Integer.parseInt(text.getText().trim());
      if(BombNum >= 10 && BombNum < 50 )
       replay();
      else if(BombNum >=0&&BombNum<10)
      {
    	  JOptionPane msg = new JOptionPane(); 
          JOptionPane.showMessageDialog(null,"您设置的地雷数太少了,请重设!","错误",2); 
      }
          else if(BombNum <0)
          {
        	  JOptionPane msg = new JOptionPane(); 
              JOptionPane.showMessageDialog(null,"你是在逗我吧","错误",2); 
      }
      else
      {
       JOptionPane msg = new JOptionPane(); 
       JOptionPane.showMessageDialog(null,"您设置的地雷数太多了,请重设!","错误",2); 
      }
      
     } 
    } );
   MenuPamel.add(setBomb);
   MenuPamel.add(text); 
   MenuPamel.add(start); 
   MenuPamel.add(nowBomb); 
   c.add(MenuPamel,"North"); 
   
   mainPanel.setLayout(new GridLayout( (int)Math.sqrt(BlockNum) , (int)Math.sqrt(BlockNum)) );
   bombButton=new Bomb[ (int)Math.sqrt(BlockNum) ][];
   for(int i = 0 ; i < (int)Math.sqrt(BlockNum) ; i++)
   {
    bombButton[ i ]=new Bomb[ (int)Math.sqrt(BlockNum) ];
   }
   for(int i = 0 ; i < (int)Math.sqrt(BlockNum) ; i++ ) 
    for(int j = 0 ; j < (int)Math.sqrt(BlockNum) ; j++ )
    { 
     bombButton[ i ][ j ]=new Bomb(i,j);
     bombButton[ i ][ j ].setForeground( Color.gray); 
     bombButton[ i ][ j ].addActionListener(this); 
     bombButton[ i ][ j ].addMouseListener(this); 
    } 
   for(int i = 0 ; i < (int)Math.sqrt(BlockNum) ; i++ ) 
    for(int j = 0 ; j < (int)Math.sqrt(BlockNum) ; j++ )
     mainPanel.add(bombButton[ i ][ j ]); 
   c.add(mainPanel,"Center");
   startBomb();
   setSize(400,400);
   setLocation(350,200);
   setResizable(false);
  }
  
  /*布雷*/
  
  public void startBomb()
  {
   
   for(int i=0;i<BombNum;i++) 
   { 
    int x =(int)(Math.random()*(int)(Math.sqrt(BlockNum)-1));  
    int y =(int)(Math.random()*(int)(Math.sqrt(BlockNum)-1)); 
    
    if(bombButton[ x ][ y ].isBomb==true) 
     i--;//再重新来一次.呵呵
    else 
     bombButton[ x ][ y ].isBomb=true ; 
   } 
  }
  
  /*重新开始*/
  
  public void replay() 
  {
   BombNum=Integer.parseInt(text.getText().trim());
   nowBomb.setText("当前雷数"+"  "+BombNum+""); 
   for(int i = 0 ; i < (int)Math.sqrt(BlockNum) ; i++) 
    for(int j = 0 ; j < (int)Math.sqrt(BlockNum) ; j++)
    { 
     bombButton[ i ][ j ].isBomb=false; 
     bombButton[ i ][ j ].isClicked=false; 
     bombButton[ i ][ j ].setEnabled(true); 
     bombButton[ i ][ j ].setText(""); 
     bombButton[ i ][ j ].setIcon(null); 
    } 
   startBomb();
  }
  
  /*是否挖完了所有的雷*/
  
  public void isWin() 
  { 
   int findBomb=0;  //找到的地雷数
   for(int i = 0;i < (int)Math.sqrt(BlockNum) ; i++)
    
    for(int j = 0;j < (int)Math.sqrt(BlockNum ); j++)
     { 
      if(bombButton[ i ][ j ].isBomb == true && bombButton[ i ][ j ].isRight == true)
       findBomb++; 
     } 
    if( findBomb == Integer.parseInt(text.getText().trim()) ) 
    { 
     JOptionPane msg = new JOptionPane(); 
     JOptionPane.showMessageDialog(this,"您挖完了所有的雷，您胜利了!","您胜利了",2); 
    }
   } 
   
   /*计算方块周围雷数 */
   
   public void CountRoundBomb() 
   { 
    for (int i = 0; i < (int)Math.sqrt(BlockNum); i++) {
     for (int j = 0; j < (int)Math.sqrt(BlockNum); j++) {
      int count = 0;
      //当需要检测的单元格本身无地雷的情况下,统计周围的地雷个数
      if (bombButton[ i ][ j ].isBomb != true) { 
       if ( (i - 1 >= 0) && (j - 1 >= 0)) {
        if (bombButton[i - 1][j - 1].isBomb == true) {
         count += 1; //检测左上方空格是否是地雷
        }
       }
       if ( (i - 1 >= 0)) {
        if (bombButton[i - 1][ j ].isBomb == true) {
         count += 1; //检测上方空格是否为地雷
        }
       }
       if ( (i - 1 >= 0) && (j + 1 <= (int)Math.sqrt(BlockNum)-1)) {
        if (bombButton[i - 1][j + 1] .isBomb == true) {
         count += 1; //检测右上方是否为地雷
        }
       }
       if ( (j - 1 >= 0)) {
        if (bombButton[ i ][j - 1] .isBomb == true) {
         count += 1; //检测左边是否为地雷
        }
       }
       if ( (i >= 0) && (j + 1 <= (int)Math.sqrt(BlockNum)-1)) {
        if (bombButton[ i ][j + 1].isBomb == true) {
         count += 1; //右边
        }
       }
       if ( (j - 1 >= 0) && (i + 1 <= (int)Math.sqrt(BlockNum)-1)) {
        if (bombButton[i + 1][j - 1].isBomb == true) {
         count += 1; //左下
        }
       }
       if ( (i + 1 <= (int)Math.sqrt(BlockNum)-1)) {
        if (bombButton[i + 1][ j ].isBomb == true) {
         count += 1; //下
        }
        if ( (j + 1 <= (int)Math.sqrt(BlockNum)-1) && (i + 1 <= Math.sqrt(BlockNum)-1)) {
         if (bombButton[i + 1][j + 1].isBomb == true) {
          count += 1; //右下
         }
        }
        bombButton[ i ][ j ].BombRoundCount = count;
       }
      }
     }
    }
   }
    
    /**当选中的位置为空,则翻开周围的地图**/
    
    public void isNull(Bomb[][] bombButton,Bomb ClickecButton) 
    {
     int i,j;
     i=ClickecButton.num_x;
     j=ClickecButton.num_y;
     
     if (ClickecButton.isBomb==true) {
      
     }
     else {
      
      if ( (i - 1 >= 0) && (j - 1 >= 0)) { //检测左上方空格是否是空
       if (bombButton[i - 1][j - 1].isBomb == false && bombButton[i - 1][j - 1].isClicked == false && bombButton[i - 1][j - 1].isRight == false) {
        bombButton[i - 1][j - 1].setText((bombButton[i - 1][j - 1].BombRoundCount)+"");
        bombButton[i - 1][j - 1].setEnabled(false);
        bombButton[i - 1][j - 1].isClicked=true;
       }
      }
      
      if ( (i - 1 >= 0)) { //检测上方空格是否为空
       if (bombButton[i - 1][ j ] .isBomb == false && bombButton[i - 1][ j ].isClicked == false && bombButton[i - 1][ j ].isRight == false) {
        bombButton[i - 1][ j ].setText((bombButton[i - 1][ j ].BombRoundCount)+"");
        bombButton[i - 1][ j ].setEnabled(false);
        bombButton[i - 1][ j ].isClicked=true;
       }
      }
      if ( (i - 1 >= 0) && (j + 1 <= ((int)Math.sqrt(BlockNum)-1)) ) { //检测右上方是否为空
       if (bombButton[i - 1][j + 1] .isBomb == false && bombButton[i - 1][j + 1].isClicked == false && bombButton[i - 1][j + 1].isRight == false) {
        bombButton[i - 1][j + 1].setText((bombButton[i - 1][j + 1].BombRoundCount)+"");
        bombButton[i - 1][j + 1].setEnabled(false);
        bombButton[i - 1][j + 1].isClicked=true;
       }
       
      }
      if ( (j - 1 >= 0)) { //检测左边是否为空
       if (bombButton[ i ][j - 1].isBomb == false && bombButton[ i ][j - 1].isClicked == false && bombButton[ i ][j - 1].isRight == false) {
        bombButton[ i ][j - 1].setText((bombButton[ i ][j - 1].BombRoundCount)+"");
        bombButton[ i ][j - 1].setEnabled(false);
        bombButton[ i ][j - 1].isClicked=true;
       }
       
      }
      if ( (i >= 0) && (j + 1 <= ((int)Math.sqrt(BlockNum)-1)) ) { //检测右边空格是否是空
       if (bombButton[ i ][j + 1].isBomb == false && bombButton[ i ][j + 1].isClicked == false && bombButton[ i ][j + 1].isRight == false) {
        bombButton[ i ][j + 1].setText((bombButton[ i ][j + 1].BombRoundCount)+"");
        bombButton[ i ][j + 1].setEnabled(false);
        bombButton[ i ][j + 1].isClicked=true;
       }
      }
      if ( (j - 1 >= 0) && (i + 1 <= ((int)Math.sqrt(BlockNum)-1)) ) { //检测左下空格是否是空
       if (bombButton[i + 1][j - 1].isBomb == false && bombButton[i + 1][j - 1].isClicked == false && bombButton[i + 1][j - 1].isRight == false) {
        bombButton[i + 1][j - 1].setText((bombButton[i + 1][j - 1].BombRoundCount)+"");
        bombButton[i + 1][j - 1].setEnabled(false);
        bombButton[i + 1][j - 1].isClicked=true;
       }
      }
      if ( (i + 1 <= ((int)Math.sqrt(BlockNum)-1)) ) { //检测下边空格是否是空
       if (bombButton[i + 1][ j ].isBomb == false && bombButton[i + 1][ j ].isClicked == false && bombButton[i + 1][ j ].isRight == false) {
        bombButton[i + 1][ j ].setText((bombButton[i + 1][ j ].BombRoundCount)+"");
        bombButton[i + 1][ j ].setEnabled(false);
        bombButton[i + 1][ j ].isClicked=true;
       }
      }
      if ( (j + 1 <= ((int)Math.sqrt(BlockNum)-1) ) && (i + 1 <= ((int)Math.sqrt(BlockNum)-1)) ) { //检测右下边空格是否是空
       if (bombButton[i + 1][j + 1].isBomb == false && bombButton[i + 1][j + 1].isClicked == false && bombButton[i + 1][j + 1].isRight == false) {
        bombButton[i + 1][j + 1].setText((bombButton[i + 1][j + 1].BombRoundCount)+"");
        bombButton[i + 1][j + 1].setEnabled(false);
        bombButton[i + 1][j + 1].isClicked=true;
       }
      }
      if ( (i - 1 >= 0) && (j - 1 >= 0))//检测左上
       isNull(bombButton,bombButton[i - 1][j - 1]);
      if ( (i - 1 >= 0))
       isNull( bombButton,bombButton[i - 1][ j ]);//检测上方
      if ( (i - 1 >= 0) && (j + 1 <= (int)Math.sqrt(BlockNum)-1))
       isNull( bombButton,bombButton[i - 1][j + 1]);//检测右上
      if ( (j - 1 >= 0))
       isNull(bombButton,bombButton[i][j - 1]);//检测左边
      if ( (i >= 0) && (j + 1 <= ((int)Math.sqrt(BlockNum)-1)) )
       isNull(bombButton,bombButton[i][j + 1]);//检测右边
      if ( (j - 1 >= 0) && (i + 1 <= ((int)Math.sqrt(BlockNum)-1)) )
       isNull(bombButton,bombButton[i + 1][j - 1]); //检测左下
      if ( (i + 1 <= ((int)Math.sqrt(BlockNum)-1)) ) //检测下
       isNull(bombButton,bombButton[i + 1][ j ]);
      if ( (j + 1 <= ((int)Math.sqrt(BlockNum)-1)) && (i + 1 <= ((int)Math.sqrt(BlockNum)-1)) ) //检测右下
       isNull(bombButton,bombButton[i + 1][j + 1]);
      
     }
    }
    
    
    public void actionPerformed(ActionEvent e) 
    {       
     
     CountRoundBomb();//计算方块周围雷数
     
     if(((Bomb)e.getSource()).isBomb==false && ((Bomb)e.getSource()).isClicked == false) 
     { 
      ((Bomb)e.getSource()).setText(( ((Bomb)e.getSource()).BombRoundCount )+""); 
      ((Bomb)e.getSource()).isClicked=true;
      ((Bomb)e.getSource()).setIcon(null); 
      ((Bomb)e.getSource()).setEnabled(false); 
      if((((Bomb)e.getSource()).BombRoundCount) == 0)
       isNull(bombButton,(Bomb)e.getSource());
      isWin();
     } 
     else if(((Bomb)e.getSource()).isBomb == true) 
     {
      
      for(int i=0;i<(int)Math.sqrt(BlockNum);i++) 
       for(int j=0;j<(int)Math.sqrt(BlockNum);j++)
       { 
        if(bombButton[ i ][ j ].isBomb == true)
         bombButton[ i ][ j ].setIcon(icon_bomb);
       } 
      
      ((Bomb)e.getSource()).setIcon(icon_bomb_big);
      
      JOptionPane msg = new JOptionPane(); 
      JOptionPane.showMessageDialog(this,"你踩到地雷了，按确定重来","你踩到地雷了",2); 
      replay(); 
     } 
    } 
    
    public void mouseClicked(MouseEvent e) 
    { 
     Bomb bombSource = (Bomb)e.getSource(); 
     boolean right = SwingUtilities.isRightMouseButton(e); 
     
     if((right == true) && (bombSource.isClicked == false)) 
     { 
      bombSource.BombFlag = (bombSource.BombFlag + 1)%3; 
      if(bombSource.BombFlag == 1) 
      { 
       
       if(BombNum > 0 && bombSource.isRight == false ){
        bombSource.setIcon(icon_flag);
        bombSource.isRight = true;
        BombNum--;
       }
       isWin();
       nowBomb.setText("当前雷数"+"  "+BombNum+""); 
      } 
      else if(bombSource.BombFlag == 2) 
      { 
       
       if( (BombNum !=0 ) ||(BombNum ==0 &&(bombSource.getIcon()==icon_flag)))
        BombNum++; 
       bombSource.setIcon(icon_question);
       nowBomb.setText("当前雷数"+"  "+BombNum+"");
      } 
      else if(bombSource.BombFlag == 0) 
      {  
       bombSource.setIcon(null);
       bombSource.isRight = false;
      } 
     } 
    } 
    
    public void mouseEntered(MouseEvent e) 
    {} 
    public void mouseReleased(MouseEvent e) 
    {} 
    public void mouseExited(MouseEvent e) 
    {} 
    public void mousePressed(MouseEvent e) 
    {}
}