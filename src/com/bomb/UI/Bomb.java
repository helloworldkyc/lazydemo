package com.bomb.UI;
import javax.swing.JButton;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Bomb extends JButton {
 
 public int num_x,num_y;       //�ڼ��ŷ��� 
 public int BombRoundCount;    //��Χ���� 
 public boolean isBomb;        //�Ƿ�Ϊ�� 
 public boolean isClicked;     //�Ƿ񱻵��
 public int BombFlag;          //̽�ױ��
 public boolean isRight;       //�Ƿ����Ҽ�
 
 public Bomb(int x,int y) 
  { 
   BombFlag = 0; 
   num_x = x;
   num_y = y; 
   BombRoundCount = 0; 
   isBomb = false; 
   isClicked = false;
   isRight = false;
  }

}