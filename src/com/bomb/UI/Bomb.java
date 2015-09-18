package com.bomb.UI;
import javax.swing.JButton;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Bomb extends JButton {
 
 public int num_x,num_y;       //第几号方块 
 public int BombRoundCount;    //周围雷数 
 public boolean isBomb;        //是否为雷 
 public boolean isClicked;     //是否被点击
 public int BombFlag;          //探雷标记
 public boolean isRight;       //是否点击右键
 
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