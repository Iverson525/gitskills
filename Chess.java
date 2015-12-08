package com.bookswork;

import java.awt.*;  
import javax.swing.*;  
  
public class Chess extends JFrame {  
  
      
    private static final long serialVersionUID = 1L;  
      
    JPanel jp=new JPanel();  
          
    public Chess(int gridSize){  
          
        //这句忘加可不行  
        jp.setLayout(null);  
        for(int i=0;i<8;i++)  
            for(int j=0;j<8;j++)  
            {  
                Color color=Color.white;  
                JLabel label=new JLabel();  
                label.setSize(gridSize, gridSize);  
                label.setLocation(i*gridSize, j*gridSize);  
                if((i+j)%2==0)  
                     color=Color.black;  
                  
                label.setOpaque(true);  
                label.setBackground(color);  
                //设置边界线为黑色  
                label.setBorder(BorderFactory.createLineBorder(Color.black));  
                jp.add(label);  
                //Jpanel加在JFrame上  
                add(jp, BorderLayout.CENTER);  
            }  
    }  
  
    public static void main(String[] args) {  
  
        try {  
            //用当前系统的窗口风格  
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());    
        }catch (Exception e) {  
            e.printStackTrace();  
        }  
         Chess chessBord=new Chess(50);  
         chessBord.setSize(410,435);  
         //加上这句可以让窗口居中  
         chessBord.setLocationRelativeTo(null);  
         chessBord.setVisible(true);  
         chessBord.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
          
    }  
}