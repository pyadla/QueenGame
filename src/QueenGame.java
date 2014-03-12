
// 3-1 mini project : EIGHT QUEEN GAME 

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class QueenGame extends Applet implements ActionListener{

    int[] flag=new int[64];
    int ge=0,count=0;
    Panel p1,p2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    JButton b9,b10,b11,b12,b13,b14,b15,b16;
    JButton b17,b18,b19,b20,b21,b22,b23,b24;
    JButton b25,b26,b27,b28,b29,b30,b31,b32;
    JButton b33,b34,b35,b36,b37,b38,b39,b40;
    JButton b41,b42,b43,b44,b45,b46,b47,b48;
    JButton b49,b50,b51,b52,b53,b54,b55,b56;
    JButton b57,b58,b59,b60,b61,b62,b63,b64;
    JButton replay;
    TextField msg;



    @Override
    public void init() {

        p1=new Panel();
        p2=new Panel();
        p1.setLayout(new GridLayout(8,8));
        p2.setLayout(new GridLayout(2,1));
        Font f=new Font("Monospaced",Font.BOLD,20);
        replay=new JButton("Play again!");      
        msg=new TextField(25);
        setSize(500,530);
        this.showStatus("Place the Queens!");
        setBackground(Color.black);
        p2.setForeground(Color.blue);
        msg.setFont(f);

        p2.add(msg);
        replay.setPreferredSize(new Dimension(200,50));
        replay.setFont(f);
        replay.setBackground(new Color(0,150,204));
        p2.add(replay);
        
        
        replay.addActionListener(this);
        

        for(int i=0;i<64;i++)
            flag[i]=0;


         b1=new JButton("*");b1.setFont(f);b1.setPreferredSize(new Dimension(50,50));p1.add(b1);b1.addActionListener(this);
         b2=new JButton("*");b2.setFont(f);b2.setPreferredSize(new Dimension(50,50));p1.add(b2);b2.addActionListener(this);
         b3=new JButton("*");b3.setFont(f);b3.setPreferredSize(new Dimension(50,50));p1.add(b3);b3.addActionListener(this);
         b4=new JButton("*");b4.setFont(f);b4.setPreferredSize(new Dimension(50,50));p1.add(b4);b4.addActionListener(this);
         b5=new JButton("*");b5.setFont(f);b5.setPreferredSize(new Dimension(50,50));p1.add(b5);b5.addActionListener(this);
         b6=new JButton("*");b6.setFont(f);b6.setPreferredSize(new Dimension(50,50));p1.add(b6);b6.addActionListener(this);
         b7=new JButton("*");b7.setFont(f);b7.setPreferredSize(new Dimension(50,50));p1.add(b7);b7.addActionListener(this);
         b8=new JButton("*");b8.setFont(f);b8.setPreferredSize(new Dimension(50,50));p1.add(b8);b8.addActionListener(this);

         b9=new JButton("*");b9.setFont(f);b9.setPreferredSize(new Dimension(50,50));p1.add(b9);b9.addActionListener(this);
         b10=new JButton("*");b10.setFont(f);b10.setPreferredSize(new Dimension(50,50));p1.add(b10);b10.addActionListener(this);
         b11=new JButton("*");b11.setFont(f);b11.setPreferredSize(new Dimension(50,50));p1.add(b11);b11.addActionListener(this);
         b12=new JButton("*");b12.setFont(f);b12.setPreferredSize(new Dimension(50,50));p1.add(b12);b12.addActionListener(this);
         b13=new JButton("*");b13.setFont(f);b13.setPreferredSize(new Dimension(50,50));p1.add(b13);b13.addActionListener(this);
         b14=new JButton("*");b14.setFont(f);b14.setPreferredSize(new Dimension(50,50));p1.add(b14);b14.addActionListener(this);
         b15=new JButton("*");b15.setFont(f);b15.setPreferredSize(new Dimension(50,50));p1.add(b15);b15.addActionListener(this);
         b16=new JButton("*");b16.setFont(f);b16.setPreferredSize(new Dimension(50,50));p1.add(b16);b16.addActionListener(this);

         b17=new JButton("*");b17.setFont(f);b17.setPreferredSize(new Dimension(50,50));p1.add(b17);b17.addActionListener(this);
         b18=new JButton("*");b18.setFont(f);b18.setPreferredSize(new Dimension(50,50));p1.add(b18);b18.addActionListener(this);
         b19=new JButton("*");b19.setFont(f);b19.setPreferredSize(new Dimension(50,50));p1.add(b19);b19.addActionListener(this);
         b20=new JButton("*");b20.setFont(f);b20.setPreferredSize(new Dimension(50,50));p1.add(b20);b20.addActionListener(this);
         b21=new JButton("*");b21.setFont(f);b21.setPreferredSize(new Dimension(50,50));p1.add(b21);b21.addActionListener(this);
         b22=new JButton("*");b22.setFont(f);b22.setPreferredSize(new Dimension(50,50));p1.add(b22);b22.addActionListener(this);
         b23=new JButton("*");b23.setFont(f);b23.setPreferredSize(new Dimension(50,50));p1.add(b23);b23.addActionListener(this);
         b24=new JButton("*");b24.setFont(f);b24.setPreferredSize(new Dimension(50,50));p1.add(b24);b24.addActionListener(this);

         b25=new JButton("*");b25.setFont(f);b25.setPreferredSize(new Dimension(50,50));p1.add(b25);b25.addActionListener(this);
         b26=new JButton("*");b26.setFont(f);b26.setPreferredSize(new Dimension(50,50));p1.add(b26);b26.addActionListener(this);
         b27=new JButton("*");b27.setFont(f);b27.setPreferredSize(new Dimension(50,50));p1.add(b27);b27.addActionListener(this);
         b28=new JButton("*");b28.setFont(f);b28.setPreferredSize(new Dimension(50,50));p1.add(b28);b28.addActionListener(this);
         b29=new JButton("*");b29.setFont(f);b29.setPreferredSize(new Dimension(50,50));p1.add(b29);b29.addActionListener(this);
         b30=new JButton("*");b30.setFont(f);b30.setPreferredSize(new Dimension(50,50));p1.add(b30);b30.addActionListener(this);
         b31=new JButton("*");b31.setFont(f);b31.setPreferredSize(new Dimension(50,50));p1.add(b31);b31.addActionListener(this);
         b32=new JButton("*");b32.setFont(f);b32.setPreferredSize(new Dimension(50,50));p1.add(b32);b32.addActionListener(this);

         b33=new JButton("*");b33.setFont(f);b33.setPreferredSize(new Dimension(50,50));p1.add(b33);b33.addActionListener(this);
         b34=new JButton("*");b34.setFont(f);b34.setPreferredSize(new Dimension(50,50));p1.add(b34);b34.addActionListener(this);
         b35=new JButton("*");b35.setFont(f);b35.setPreferredSize(new Dimension(50,50));p1.add(b35);b35.addActionListener(this);
         b36=new JButton("*");b36.setFont(f);b36.setPreferredSize(new Dimension(50,50));p1.add(b36);b36.addActionListener(this);
         b37=new JButton("*");b37.setFont(f);b37.setPreferredSize(new Dimension(50,50));p1.add(b37);b37.addActionListener(this);
         b38=new JButton("*");b38.setFont(f);b38.setPreferredSize(new Dimension(50,50));p1.add(b38);b38.addActionListener(this);
         b39=new JButton("*");b39.setFont(f);b39.setPreferredSize(new Dimension(50,50));p1.add(b39);b39.addActionListener(this);
         b40=new JButton("*");b40.setFont(f);b40.setPreferredSize(new Dimension(50,50));p1.add(b40);b40.addActionListener(this);

         b41=new JButton("*");b41.setFont(f);b41.setPreferredSize(new Dimension(50,50));p1.add(b41);b41.addActionListener(this);
         b42=new JButton("*");b42.setFont(f);b42.setPreferredSize(new Dimension(50,50));p1.add(b42);b42.addActionListener(this);
         b43=new JButton("*");b43.setFont(f);b43.setPreferredSize(new Dimension(50,50));p1.add(b43);b43.addActionListener(this);
         b44=new JButton("*");b44.setFont(f);b44.setPreferredSize(new Dimension(50,50));p1.add(b44);b44.addActionListener(this);
         b45=new JButton("*");b45.setFont(f);b45.setPreferredSize(new Dimension(50,50));p1.add(b45);b45.addActionListener(this);
         b46=new JButton("*");b46.setFont(f);b46.setPreferredSize(new Dimension(50,50));p1.add(b46);b46.addActionListener(this);
         b47=new JButton("*");b47.setFont(f);b47.setPreferredSize(new Dimension(50,50));p1.add(b47);b47.addActionListener(this);
         b48=new JButton("*");b48.setFont(f);b48.setPreferredSize(new Dimension(50,50));p1.add(b48);b48.addActionListener(this);

         b49=new JButton("*");b49.setFont(f);b49.setPreferredSize(new Dimension(50,50));p1.add(b49);b49.addActionListener(this);
         b50=new JButton("*");b50.setFont(f);b50.setPreferredSize(new Dimension(50,50));p1.add(b50);b50.addActionListener(this);
         b51=new JButton("*");b51.setFont(f);b51.setPreferredSize(new Dimension(50,50));p1.add(b51);b51.addActionListener(this);
         b52=new JButton("*");b52.setFont(f);b52.setPreferredSize(new Dimension(50,50));p1.add(b52);b52.addActionListener(this);
         b53=new JButton("*");b53.setFont(f);b53.setPreferredSize(new Dimension(50,50));p1.add(b53);b53.addActionListener(this);
         b54=new JButton("*");b54.setFont(f);b54.setPreferredSize(new Dimension(50,50));p1.add(b54);b54.addActionListener(this);
         b55=new JButton("*");b55.setFont(f);b55.setPreferredSize(new Dimension(50,50));p1.add(b55);b55.addActionListener(this);
         b56=new JButton("*");b56.setFont(f);b56.setPreferredSize(new Dimension(50,50));p1.add(b56);b56.addActionListener(this);

         b57=new JButton("*");b57.setFont(f);b57.setPreferredSize(new Dimension(50,50));p1.add(b57);b57.addActionListener(this);
         b58=new JButton("*");b58.setFont(f);b58.setPreferredSize(new Dimension(50,50));p1.add(b58);b58.addActionListener(this);
         b59=new JButton("*");b59.setFont(f);b59.setPreferredSize(new Dimension(50,50));p1.add(b59);b59.addActionListener(this);
         b60=new JButton("*");b60.setFont(f);b60.setPreferredSize(new Dimension(50,50));p1.add(b60);b60.addActionListener(this);
         b61=new JButton("*");b61.setFont(f);b61.setPreferredSize(new Dimension(50,50));p1.add(b61);b61.addActionListener(this);
         b62=new JButton("*");b62.setFont(f);b62.setPreferredSize(new Dimension(50,50));p1.add(b62);b62.addActionListener(this);
         b63=new JButton("*");b63.setFont(f);b63.setPreferredSize(new Dimension(50,50));p1.add(b63);b63.addActionListener(this);
         b64=new JButton("*");b64.setFont(f);b64.setPreferredSize(new Dimension(50,50));p1.add(b64);b64.addActionListener(this);

        add(p1);
        add(p2);
        setReplay();


    }

    public void actionPerformed(ActionEvent e) {
        setButtonColorAndStatus(e);
    }

	private void setButtonColorAndStatus(ActionEvent e) {
		if(ge==0)
       {
        showStatus("WAY TO GO!!");
        
        if(e.getSource()==b1)
        {
            
            b1IsPressed();
        }

        else if(e.getSource()==b2)
        {
        	b2IsPressed();
        }

        else if(e.getSource()==b3)
        {
        	
        	if(b3.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b3.setLabel("Q");
            b3.setBackground(Color.yellow);
            if(flag[2]==0)
            {
                for(int i=0;i<8;i++)
                    flag[i]=1;
                for(int i=2;i<59;i+=8)
                    flag[i]=1;
                for(int i=2;i<48;i+=9)
                    flag[i]=1;
                for(int i=2;i<17;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (1,3)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                setBGColor2();
            }
            }
        }

        else if(e.getSource()==b4)
        {
        	
        	if(b4.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b4.setLabel("Q");b4.setBackground(Color.yellow);
            if(flag[3]==0)
            {
                for(int i=0;i<8;i++)
                    flag[i]=1;
                for(int i=3;i<60;i+=8)
                    flag[i]=1;
                for(int i=3;i<40;i+=9)
                    flag[i]=1;
                for(int i=3;i<25;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (1,4)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                setBGColor3();
            }
            }
        }

        else if(e.getSource()==b5)
        {
        	
        	if(b5.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b5.setLabel("Q");b5.setBackground(Color.yellow);
            if(flag[4]==0)
            {
                for(int i=0;i<8;i++)
                    flag[i]=1;
                for(int i=4;i<61;i+=8)
                    flag[i]=1;
                for(int i=4;i<32;i+=9)
                    flag[i]=1;
                for(int i=4;i<33;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (1,5)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                setBGColor4();
            }
            }
        }

        else if(e.getSource()==b6)
        {
        	
        	if(b6.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
        	b6.setLabel("Q");b6.setBackground(Color.yellow);
            if(flag[5]==0)
            {
                for(int i=0;i<8;i++)
                    flag[i]=1;
                for(int i=5;i<62;i+=8)
                    flag[i]=1;
                for(int i=5;i<24;i+=9)
                    flag[i]=1;
                for(int i=5;i<41;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (1,6)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                setBGColor5();
            }}
        }

        else if(e.getSource()==b7)
        {
        	
        	if(b7.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b7.setLabel("Q");b7.setBackground(Color.yellow);
            if(flag[6]==0)
            {
                for(int i=0;i<8;i++)
                    flag[i]=1;
                for(int i=6;i<63;i+=8)
                    flag[i]=1;
                for(int i=6;i<16;i+=9)
                    flag[i]=1;
                for(int i=6;i<49;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (1,7)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                setBGColor6();
            }
            }
        }

        else if(e.getSource()==b8)
        {
        	
        	if(b8.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b8.setLabel("Q");b8.setBackground(Color.yellow);
            if(flag[7]==0)
            {
                for(int i=0;i<8;i++)
                    flag[i]=1;
                for(int i=7;i<64;i+=8)
                    flag[i]=1;
                flag[8]=1;
                for(int i=7;i<57;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (1,8)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                setBGColor7();
            }
            }
        }

        else if(e.getSource()==b9)
        {
        	
        	if(b9.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b9.setLabel("Q");b9.setBackground(Color.yellow);
            if(flag[8]==0)
            {
                for(int i=8;i<16;i++)
                    flag[i]=1;
                for(int i=0;i<57;i+=8)
                    flag[i]=1;
                for(int i=8;i<63;i+=9)
                    flag[i]=1;
                flag[1]=1;
                msg.setText("Queen placed at (2,1)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b9.setBackground(Color.RED);
                if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                else if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                else if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b1.getText().equals("Q"))
                    b1.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }
            }
        }

        else if(e.getSource()==b10)
        {
        	
        	if(b10.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b10.setLabel("Q");b10.setBackground(Color.yellow);
            if(flag[9]==0)
            {
                for(int i=8;i<16;i++)
                    flag[i]=1;
                for(int i=1;i<58;i+=8)
                    flag[i]=1;
                for(int i=0;i<64;i+=9)
                    flag[i]=1;
                for(int i=2;i<17;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (2,2)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b10.setBackground(Color.RED);
                if(b1.getText().equals("Q"))
                    b1.setBackground(Color.RED);
                else if(b2.getText().equals("Q"))
                    b2.setBackground(Color.RED);
                else if(b3.getText().equals("Q"))
                    b3.setBackground(Color.RED);
                else if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }
            }
        }

        else if(e.getSource()==b11)
        {
        	
        	if(b11.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b11.setLabel("Q");b11.setBackground(Color.yellow);
            if(flag[10]==0)
            {
                for(int i=8;i<16;i++)
                    flag[i]=1;
                for(int i=2;i<59;i+=8)
                    flag[i]=1;
                for(int i=1;i<56;i+=9)
                    flag[i]=1;
                for(int i=3;i<25;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (2,3)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                 b11.setBackground(Color.RED);
                if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b2.getText().equals("Q"))
                    b2.setBackground(Color.RED);
                else if(b3.getText().equals("Q"))
                    b3.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                else if(b4.getText().equals("Q"))
                    b4.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }
            }
        }

        else if(e.getSource()==b12)
        {
        	
        	if(b12.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b12.setLabel("Q");b12.setBackground(Color.yellow);
            if(flag[11]==0)
            {
                for(int i=8;i<16;i++)
                    flag[i]=1;
                for(int i=3;i<60;i+=8)
                    flag[i]=1;
                for(int i=2;i<48;i+=9)
                    flag[i]=1;
                for(int i=4;i<33;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (2,4)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b12.setBackground(Color.RED);
                if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b4.getText().equals("Q"))
                    b4.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                else if(b5.getText().equals("Q"))
                    b5.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b3.getText().equals("Q"))
                    b3.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }
            }
        }

        else if(e.getSource()==b13)
        {
        	
        	if(b13.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b13.setLabel("Q");b13.setBackground(Color.yellow);
            if(flag[12]==0)
            {
                for(int i=8;i<16;i++)
                    flag[i]=1;
                for(int i=4;i<61;i+=8)
                    flag[i]=1;
                for(int i=3;i<40;i+=9)
                    flag[i]=1;
                for(int i=5;i<41;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (2,5)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b13.setBackground(Color.RED);
                if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b5.getText().equals("Q"))
                    b5.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                else if(b6.getText().equals("Q"))
                    b6.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                else if(b4.getText().equals("Q"))
                    b4.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }
            }
        }

        else if(e.getSource()==b14)
        {
        	
        	if(b14.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b14.setLabel("Q");b14.setBackground(Color.yellow);
            if(flag[13]==0)
            {
                for(int i=8;i<16;i++)
                    flag[i]=1;
                for(int i=5;i<62;i+=8)
                    flag[i]=1;
                for(int i=4;i<32;i+=9)
                    flag[i]=1;
                for(int i=6;i<49;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (2,6)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b14.setBackground(Color.RED);
                if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b6.getText().equals("Q"))
                    b6.setBackground(Color.RED);
                else if(b5.getText().equals("Q"))
                    b5.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                else if(b7.getText().equals("Q"))
                    b7.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }
            }
        }

        else if(e.getSource()==b15)
        {
        	
        	if(b15.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b15.setLabel("Q");b15.setBackground(Color.yellow);
            if(flag[14]==0)
            {
                for(int i=8;i<16;i++)
                    flag[i]=1;
                for(int i=6;i<63;i+=8)
                    flag[i]=1;
                for(int i=5;i<24;i+=9)
                    flag[i]=1;
                for(int i=7;i<57;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (2,7)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b15.setBackground(Color.RED);
                if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b6.getText().equals("Q"))
                    b6.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b7.getText().equals("Q"))
                    b7.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                else if(b8.getText().equals("Q"))
                    b8.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }
            }
        }

        else if(e.getSource()==b16)
        {
        	
        	if(b16.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b16.setLabel("Q");b16.setBackground(Color.yellow);
            if(flag[15]==0)
            {
                for(int i=8;i<16;i++)
                    flag[i]=1;
                for(int i=7;i<64;i+=8)
                    flag[i]=1;
                flag[6]=1;
                for(int i=15;i<58;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (2,8)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b16.setBackground(Color.RED);
                if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b8.getText().equals("Q"))
                    b8.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }
            }
        }

        else if(e.getSource()==b17)
        {
        	
        	if(b17.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b17.setLabel("Q");b17.setBackground(Color.yellow);
            if(flag[16]==0)
            {
                for(int i=16;i<24;i++)
                    flag[i]=1;
                for(int i=0;i<57;i+=8)
                    flag[i]=1;
                for(int i=16;i<62;i+=9)
                    flag[i]=1;
                for(int i=2;i<17;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (3,1)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b17.setBackground(Color.RED);
                if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b1.getText().equals("Q"))
                    b1.setBackground(Color.RED);
                else if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                else if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b3.getText().equals("Q"))
                    b3.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }
            }
        }

        else if(e.getSource()==b18)
        {
        	
        	if(b18.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b18.setLabel("Q");b18.setBackground(Color.yellow);
            if(flag[17]==0)
            {
                for(int i=16;i<24;i++)
                    flag[i]=1;
                for(int i=1;i<58;i+=8)
                    flag[i]=1;
                for(int i=8;i<63;i+=9)
                    flag[i]=1;
                for(int i=3;i<25;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (3,2)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b18.setBackground(Color.RED);
                if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b2.getText().equals("Q"))
                    b2.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                else if(b4.getText().equals("Q"))
                    b4.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }
            }
        }

        else if(e.getSource()==b19)
        {
        	
        	if(b19.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b19.setLabel("Q");b19.setBackground(Color.yellow);
            if(flag[18]==0)
            {
                for(int i=16;i<24;i++)
                    flag[i]=1;
                for(int i=2;i<59;i+=8)
                    flag[i]=1;
                for(int i=0;i<64;i+=9)
                    flag[i]=1;
                for(int i=4;i<33;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (3,3)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b19.setBackground(Color.RED);
                if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b3.getText().equals("Q"))
                    b3.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                else if(b5.getText().equals("Q"))
                    b5.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b1.getText().equals("Q"))
                    b1.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }
            }
        }

        else if(e.getSource()==b20)
        {
        	
        	if(b20.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b20.setLabel("Q");b20.setBackground(Color.yellow);
            if(flag[19]==0)
            {
                for(int i=16;i<24;i++)
                    flag[i]=1;
                for(int i=3;i<60;i+=8)
                    flag[i]=1;
                for(int i=1;i<56;i+=9)
                    flag[i]=1;
                for(int i=5;i<41;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (3,4)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b20.setBackground(Color.RED);
                if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b4.getText().equals("Q"))
                    b4.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                else if(b6.getText().equals("Q"))
                    b6.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b2.getText().equals("Q"))
                    b2.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b21)
        {
        	
        	if(b21.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b21.setLabel("Q");b21.setBackground(Color.yellow);
            if(flag[20]==0)
            {
                for(int i=16;i<24;i++)
                    flag[i]=1;
                for(int i=4;i<61;i+=8)
                    flag[i]=1;
                for(int i=2;i<48;i+=9)
                    flag[i]=1;
                for(int i=6;i<49;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (3,5)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b21.setBackground(Color.RED);
                if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b5.getText().equals("Q"))
                    b5.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                else if(b3.getText().equals("Q"))
                    b3.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                else if(b7.getText().equals("Q"))
                    b7.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b22)
        {
        		
        	if(b22.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b22.setLabel("Q");b22.setBackground(Color.yellow);
            if(flag[21]==0)
            {
                for(int i=16;i<24;i++)
                    flag[i]=1;
                for(int i=5;i<62;i+=8)
                    flag[i]=1;
                for(int i=3;i<40;i+=9)
                    flag[i]=1;
                for(int i=7;i<57;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (3,6)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b22.setBackground(Color.RED);
                if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b6.getText().equals("Q"))
                    b6.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                else if(b8.getText().equals("Q"))
                    b8.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b4.getText().equals("Q"))
                    b4.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b23)
        {
        	
        	if(b23.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b23.setLabel("Q");b23.setBackground(Color.yellow);
            if(flag[22]==0)
            {
                for(int i=16;i<24;i++)
                    flag[i]=1;
                for(int i=6;i<63;i+=8)
                    flag[i]=1;
                for(int i=4;i<32;i+=9)
                    flag[i]=1;
                for(int i=15;i<58;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (3,7)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b23.setBackground(Color.RED);
                if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b7.getText().equals("Q"))
                    b7.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                else if(b5.getText().equals("Q"))
                    b5.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }


        else if(e.getSource()==b24)
        {
        	
        	if(b24.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b24.setLabel("Q");b24.setBackground(Color.yellow);
            if(flag[23]==0)
            {
                for(int i=16;i<24;i++)
                    flag[i]=1;
                for(int i=7;i<64;i+=8)
                    flag[i]=1;
                for(int i=5;i<24;i+=9)
                    flag[i]=1;
                for(int i=23;i<59;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (3,8)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b24.setBackground(Color.RED);
                if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b8.getText().equals("Q"))
                    b8.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                else if(b6.getText().equals("Q"))
                    b6.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b25)
        {
        	
        	if(b25.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b25.setLabel("Q");b25.setBackground(Color.yellow);
            if(flag[24]==0)
            {
                for(int i=24;i<32;i++)
                    flag[i]=1;
                for(int i=0;i<57;i+=8)
                    flag[i]=1;
                for(int i=24;i<61;i+=9)
                    flag[i]=1;
                for(int i=3;i<25;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (4,1)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b25.setBackground(Color.RED);
                if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                else if(b1.getText().equals("Q"))
                    b1.setBackground(Color.RED);
                else if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                else if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b26)
        {
        	
        	if(b26.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b26.setLabel("Q");b26.setBackground(Color.yellow);
            if(flag[25]==0)
            {
                for(int i=24;i<32;i++)
                    flag[i]=1;
                for(int i=1;i<58;i+=8)
                    flag[i]=1;
                for(int i=16;i<62;i+=9)
                    flag[i]=1;
                for(int i=4;i<33;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (4,2)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                 b26.setBackground(Color.RED);
                if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                else if(b2.getText().equals("Q"))
                    b2.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50 .setBackground(Color.RED);
                else if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                else if(b5.getText().equals("Q"))
                    b5.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                 else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                 else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b27)
        {
        
        	if(b27.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b27.setLabel("Q");b27.setBackground(Color.yellow);
            if(flag[26]==0)
            {
                for(int i=24;i<32;i++)
                    flag[i]=1;
                for(int i=2;i<59;i+=8)
                    flag[i]=1;
                for(int i=8;i<63;i+=9)
                    flag[i]=1;
                for(int i=5;i<41;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (4,3)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b27.setBackground(Color.RED);
                if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                else if(b3.getText().equals("Q"))
                    b3.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                else if(b6.getText().equals("Q"))
                    b6.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b28)
        {
        	
        	if(b28.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b28.setLabel("Q");b28.setBackground(Color.yellow);
            if(flag[27]==0)
            {
                for(int i=24;i<32;i++)
                    flag[i]=1;
                for(int i=3;i<60;i+=8)
                    flag[i]=1;
                for(int i=0;i<64;i+=9)
                    flag[i]=1;
                for(int i=6;i<49;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (4,4)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                 b28.setBackground(Color.RED);
                if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                else if(b4.getText().equals("Q"))
                    b4.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                else if(b7.getText().equals("Q"))
                    b7.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                else if(b1.getText().equals("Q"))
                    b1.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        if(e.getSource()==b29)
        {
        	
        	if(b29.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b29.setLabel("Q");b29.setBackground(Color.yellow);
            if(flag[28]==0)
            {
                for(int i=24;i<32;i++)
                    flag[i]=1;
                for(int i=4;i<61;i+=8)
                    flag[i]=1;
                for(int i=1;i<56;i+=9)
                    flag[i]=1;
                for(int i=7;i<57;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (4,5)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b29.setBackground(Color.RED);
                if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                else if(b5.getText().equals("Q"))
                    b5.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                else if(b8.getText().equals("Q"))
                    b8.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b2.getText().equals("Q"))
                    b2.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b30)
        {
        	
        	if(b30.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b30.setLabel("Q");b30.setBackground(Color.yellow);
            if(flag[29]==0)
            {
                for(int i=24;i<32;i++)
                    flag[i]=1;
                for(int i=5;i<62;i+=8)
                    flag[i]=1;
                for(int i=2;i<48;i+=9)
                    flag[i]=1;
                for(int i=15;i<58;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (4,6)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b30.setBackground(Color.RED);
                if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                else if(b6.getText().equals("Q"))
                    b6.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                else if(b3.getText().equals("Q"))
                    b3.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b31)
        {
        	
        	if(b31.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b31.setLabel("Q");b31.setBackground(Color.yellow);
            if(flag[30]==0)
            {
                for(int i=24;i<32;i++)
                    flag[i]=1;
                for(int i=6;i<63;i+=8)
                    flag[i]=1;
                for(int i=3;i<40;i+=9)
                    flag[i]=1;
                for(int i=23;i<59;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (4,7)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b31.setBackground(Color.RED);
                if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                else if(b7.getText().equals("Q"))
                    b7.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                else if(b4.getText().equals("Q"))
                    b4.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b32)
        {
        	
        	if(b32.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b32.setLabel("Q");b32.setBackground(Color.yellow);
            if(flag[31]==0)
            {
                for(int i=24;i<32;i++)
                    flag[i]=1;
                for(int i=7;i<64;i+=8)
                    flag[i]=1;
                for(int i=4;i<32;i+=9)
                    flag[i]=1;
                for(int i=31;i<60;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (4,8)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b32.setBackground(Color.RED);
                if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b8.getText().equals("Q"))
                    b8.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                else if(b5.getText().equals("Q"))
                    b5.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b33)
        {
        		
        	if(b33.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b33.setLabel("Q");b33.setBackground(Color.yellow);
            if(flag[32]==0)
            {
                for(int i=32;i<40;i++)
                    flag[i]=1;
                for(int i=0;i<57;i+=8)
                    flag[i]=1;
                for(int i=32;i<60;i+=9)
                    flag[i]=1;
                for(int i=4;i<33;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (5,1)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b33.setBackground(Color.RED);
                if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                else if(b1.getText().equals("Q"))
                    b1.setBackground(Color.RED);
                else if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                else if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b5.getText().equals("Q"))
                    b5.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b34)
        {
        	
        	if(b34.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b34.setLabel("Q");b34.setBackground(Color.yellow);
            if(flag[33]==0)
            {
                for(int i=32;i<40;i++)
                    flag[i]=1;
                for(int i=1;i<58;i+=8)
                    flag[i]=1;
                for(int i=24;i<61;i+=9)
                    flag[i]=1;
                for(int i=5;i<41;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (5,2)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b34.setBackground(Color.RED);
                if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                else if(b2.getText().equals("Q"))
                    b2.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                else if(b6.getText().equals("Q"))
                    b6.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b35)
        {
        
        	if(b35.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b35.setLabel("Q");b35.setBackground(Color.yellow);
            if(flag[34]==0)
            {
                for(int i=32;i<40;i++)
                    flag[i]=1;
                for(int i=2;i<59;i+=8)
                    flag[i]=1;
                for(int i=16;i<62;i+=9)
                    flag[i]=1;
                for(int i=6;i<49;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (5,3)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b35.setBackground(Color.RED);
                if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                else if(b3.getText().equals("Q"))
                    b3.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                else if(b7.getText().equals("Q"))
                    b7.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                else if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b36)
        {
        	
        	if(b36.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b36.setLabel("Q");b36.setBackground(Color.yellow);
            if(flag[35]==0)
            {
                for(int i=32;i<40;i++)
                    flag[i]=1;
                for(int i=3;i<60;i+=8)
                    flag[i]=1;
                for(int i=8;i<63;i+=9)
                    flag[i]=1;
                for(int i=7;i<57;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (5,4)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b36.setBackground(Color.RED);
                if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                else if(b4.getText().equals("Q"))
                    b4.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                else if(b8.getText().equals("Q"))
                    b8.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                 else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b37)
        {
        	
        	if(b37.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b37.setLabel("Q");b37.setBackground(Color.yellow);
            if(flag[36]==0)
            {
                for(int i=32;i<40;i++)
                    flag[i]=1;
                for(int i=4;i<61;i+=8)
                    flag[i]=1;
                for(int i=0;i<64;i+=9)
                    flag[i]=1;
                for(int i=15;i<58;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (5,5)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b37.setBackground(Color.RED);
                if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                else if(b5.getText().equals("Q"))
                    b5.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                else if(b1.getText().equals("Q"))
                    b1.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                 else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b38)
        {
        	
        	if(b38.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b38.setLabel("Q");b38.setBackground(Color.yellow);
            if(flag[37]==0)
            {
                for(int i=32;i<40;i++)
                    flag[i]=1;
                for(int i=5;i<62;i+=8)
                    flag[i]=1;
                for(int i=1;i<56;i+=9)
                    flag[i]=1;
                for(int i=23;i<59;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (5,6)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b38.setBackground(Color.RED);
                if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                else if(b6.getText().equals("Q"))
                    b6.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                else if(b2.getText().equals("Q"))
                    b2.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b39)
        {
        	
        	if(b39.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b39.setLabel("Q");b39.setBackground(Color.yellow);
            if(flag[38]==0)
            {
                for(int i=32;i<40;i++)
                    flag[i]=1;
                for(int i=6;i<63;i+=8)
                    flag[i]=1;
                for(int i=2;i<48;i+=9)
                    flag[i]=1;
                for(int i=31;i<60;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (5,7)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b39.setBackground(Color.RED);
                if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                else if(b7.getText().equals("Q"))
                    b7.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                else if(b3.getText().equals("Q"))
                    b3.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b40)
        {
        	
        	if(b40.getText().equals("Q"))msg.setText("Queen already placed!");
            else{b40.setLabel("Q");b40.setBackground(Color.yellow);
            if(flag[39]==0)
            {
                for(int i=32;i<40;i++)
                    flag[i]=1;
                for(int i=7;i<64;i+=8)
                    flag[i]=1;
                for(int i=3;i<40;i+=9)
                    flag[i]=1;
                for(int i=39;i<61;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (5,8)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b40.setBackground(Color.RED);
                if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b8.getText().equals("Q"))
                    b8.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                else if(b4.getText().equals("Q"))
                    b4.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b41)
        {
        	
        	if(b41.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b41.setLabel("Q");b41.setBackground(Color.yellow);
            if(flag[40]==0)
            {
                for(int i=40;i<48;i++)
                    flag[i]=1;
                for(int i=0;i<57;i+=8)
                    flag[i]=1;
                for(int i=40;i<59;i+=9)
                    flag[i]=1;
                for(int i=5;i<41;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (6,1)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b41.setBackground(Color.RED);
                if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                else if(b1.getText().equals("Q"))
                    b1.setBackground(Color.RED);
                else if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                else if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b6.getText().equals("Q"))
                    b6.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b42)
        {
        	
        	if(b42.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b42.setLabel("Q");b42.setBackground(Color.yellow);
            if(flag[41]==0)
            {
                for(int i=40;i<48;i++)
                    flag[i]=1;
                for(int i=1;i<58;i+=8)
                    flag[i]=1;
                for(int i=32;i<60;i+=9)
                    flag[i]=1;
                for(int i=6;i<49;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (6,2)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b42.setBackground(Color.RED);
                if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                else if(b2.getText().equals("Q"))
                    b2.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                else if(b7.getText().equals("Q"))
                    b7.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                else if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b43)
        {
        	
        	if(b43.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b43.setLabel("Q");b43.setBackground(Color.yellow);
            if(flag[42]==0)
            {
                for(int i=40;i<48;i++)
                    flag[i]=1;
                for(int i=2;i<59;i+=8)
                    flag[i]=1;
                for(int i=24;i<61;i+=9)
                    flag[i]=1;
                for(int i=7;i<57;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (6,3)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b43.setBackground(Color.RED);
                if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                else if(b3.getText().equals("Q"))
                    b3.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                else if(b8.getText().equals("Q"))
                    b8.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b44)
        {
        	if(b44.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b44.setLabel("Q");b44.setBackground(Color.yellow);
            if(flag[43]==0)
            {
                for(int i=40;i<48;i++)
                    flag[i]=1;
                for(int i=3;i<60;i+=8)
                    flag[i]=1;
                for(int i=16;i<62;i+=9)
                    flag[i]=1;
                for(int i=15;i<58;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (6,4)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b44.setBackground(Color.RED);
                if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                else if(b4.getText().equals("Q"))
                    b4.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                else if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b45)
        {
        	
        	if(b45.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b45.setLabel("Q");b45.setBackground(Color.yellow);
            if(flag[44]==0)
            {
                for(int i=40;i<48;i++)
                    flag[i]=1;
                for(int i=4;i<61;i+=8)
                    flag[i]=1;
                for(int i=8;i<63;i+=9)
                    flag[i]=1;
                for(int i=23;i<59;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (6,5)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b45.setBackground(Color.RED);
                if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                else if(b5.getText().equals("Q"))
                    b5.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                else if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b46)
        {
        	
        	if(b46.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b46.setLabel("Q");b46.setBackground(Color.yellow);
            if(flag[45]==0)
            {
                for(int i=40;i<48;i++)
                    flag[i]=1;
                for(int i=5;i<62;i+=8)
                    flag[i]=1;
                for(int i=0;i<64;i+=9)
                    flag[i]=1;
                for(int i=31;i<60;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (6,6)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b46.setBackground(Color.RED);
                if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                else if(b6.getText().equals("Q"))
                    b6.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                else if(b1.getText().equals("Q"))
                    b1.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b47)
        {
        	
        	if(b47.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b47.setLabel("Q");b47.setBackground(Color.yellow);
            if(flag[46]==0)
            {
                for(int i=40;i<48;i++)
                    flag[i]=1;
                for(int i=6;i<63;i+=8)
                    flag[i]=1;
                for(int i=1;i<56;i+=9)
                    flag[i]=1;
                for(int i=39;i<61;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (6,7)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b47.setBackground(Color.RED);
                if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                else if(b7.getText().equals("Q"))
                    b7.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                else if(b2.getText().equals("Q"))
                    b2.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b48)
        {
        	
        	if(b48.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b48.setLabel("Q");b48.setBackground(Color.yellow);
            if(flag[47]==0)
            {
                for(int i=40;i<48;i++)
                    flag[i]=1;
                for(int i=7;i<64;i+=8)
                    flag[i]=1;
                for(int i=2;i<48;i+=9)
                    flag[i]=1;
                for(int i=47;i<62;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (6,8)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b48.setBackground(Color.RED);
                if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b8.getText().equals("Q"))
                    b8.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                else if(b3.getText().equals("Q"))
                    b3.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b49)
        {
        	
        	if(b49.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b49.setLabel("Q");b49.setBackground(Color.yellow);
            if(flag[48]==0)
            {
                for(int i=48;i<56;i++)
                    flag[i]=1;
                for(int i=0;i<57;i+=8)
                    flag[i]=1;
                flag[58]=1;
                for(int i=6;i<49;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (7,1)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b49.setBackground(Color.RED);
                if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                else if(b1.getText().equals("Q"))
                    b1.setBackground(Color.RED);
                else if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b7.getText().equals("Q"))
                    b7.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b50)
        {
        	
        	if(b50.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b50.setLabel("Q");b50.setBackground(Color.yellow);
            if(flag[49]==0)
            {
                for(int i=48;i<56;i++)
                    flag[i]=1;
                for(int i=1;i<58;i+=8)
                    flag[i]=1;
                for(int i=40;i<59;i+=9)
                    flag[i]=1;
                for(int i=7;i<57;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (7,2)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                 b50.setBackground(Color.RED);
                if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                else if(b2.getText().equals("Q"))
                    b2.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                else if(b8.getText().equals("Q"))
                    b8.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b51)
        {
        	
        	if(b51.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b51.setLabel("Q");b51.setBackground(Color.yellow);
            if(flag[50]==0)
            {
                for(int i=48;i<56;i++)
                    flag[i]=1;
                for(int i=2;i<59;i+=8)
                    flag[i]=1;
                for(int i=32;i<60;i+=9)
                    flag[i]=1;
                for(int i=15;i<58;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (7,3)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                   b51.setBackground(Color.RED);
                if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                else if(b3.getText().equals("Q"))
                    b3.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                else if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b52)
        {
        	
        	if(b52.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b52.setLabel("Q");b52.setBackground(Color.yellow);
            if(flag[51]==0)
            {
                for(int i=48;i<56;i++)
                    flag[i]=1;
                for(int i=3;i<60;i+=8)
                    flag[i]=1;
                for(int i=24;i<61;i+=9)
                    flag[i]=1;
                for(int i=23;i<59;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (7,4)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                  b52.setBackground(Color.RED);
                if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                else if(b4.getText().equals("Q"))
                    b4.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                else if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b53)
        {
          
            if(b53.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b53.setLabel("Q");b53.setBackground(Color.yellow);
            if(flag[52]==0)
            {
                for(int i=48;i<56;i++)
                    flag[i]=1;
                for(int i=4;i<61;i+=8)
                    flag[i]=1;
                for(int i=16;i<62;i+=9)
                    flag[i]=1;
                for(int i=31;i<60;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (7,5)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b53.setBackground(Color.RED);
                if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                else if(b5.getText().equals("Q"))
                    b5.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                else if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b54)
        {
        	
        	if(b54.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b54.setLabel("Q");b54.setBackground(Color.yellow);
            if(flag[53]==0)
            {
                for(int i=48;i<56;i++)
                    flag[i]=1;
                for(int i=5;i<62;i+=8)
                    flag[i]=1;
                for(int i=8;i<63;i+=9)
                    flag[i]=1;
                for(int i=39;i<61;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (7,6)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                 b54.setBackground(Color.RED);
                if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                else if(b6.getText().equals("Q"))
                    b6.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                else if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b55)
        {
        	
        	if(b55.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b55.setLabel("Q");b55.setBackground(Color.yellow);
            if(flag[54]==0)
            {
                for(int i=48;i<56;i++)
                    flag[i]=1;
                for(int i=6;i<63;i+=8)
                    flag[i]=1;
                for(int i=0;i<64;i+=9)
                    flag[i]=1;
                for(int i=47;i<62;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (7,7)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b55.setBackground(Color.RED);
                if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                else if(b7.getText().equals("Q"))
                    b7.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                else if(b1.getText().equals("Q"))
                    b1.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b56)
        {
        	
        	if(b56.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b56.setLabel("Q");b56.setBackground(Color.yellow);
            if(flag[55]==0)
            {
                for(int i=48;i<56;i++)
                    flag[i]=1;
                for(int i=7;i<64;i+=8)
                    flag[i]=1;
                for(int i=1;i<56;i+=9)
                    flag[i]=1;
                flag[63]=1;
                msg.setText("Queen placed at (7,8)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b56.setBackground(Color.RED);
                if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b8.getText().equals("Q"))
                    b8.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                else if(b2.getText().equals("Q"))
                    b2.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b57)
        {
        	
        	if(b57.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b57.setLabel("Q");b57.setBackground(Color.yellow);
            if(flag[56]==0)
            {
                for(int i=56;i<64;i++)
                    flag[i]=1;
                for(int i=0;i<57;i+=8)
                    flag[i]=1;
                for(int i=7;i<57;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (8,1)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b57.setBackground(Color.RED);
                if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                else if(b1.getText().equals("Q"))
                    b1.setBackground(Color.RED);
                else if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b8.getText().equals("Q"))
                    b8.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b58)
        {
        	
        	if(b58.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b58.setLabel("Q");b58.setBackground(Color.yellow);
            if(flag[57]==0)
            {
                for(int i=56;i<64;i++)
                    flag[i]=1;
                for(int i=1;i<58;i+=8)
                    flag[i]=1;
                flag[49]=1;
                for(int i=15;i<58;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (8,2)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b58.setBackground(Color.RED);
                if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                else if(b2.getText().equals("Q"))
                    b2.setBackground(Color.RED);
                else if(b10.getText().equals("Q"))
                    b10.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                else if(b16.getText().equals("Q"))
                    b16.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b49.getText().equals("Q"))
                    b49.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b59)
        {
        	
        	if(b59.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b59.setLabel("Q");b59.setBackground(Color.yellow);
            if(flag[58]==0)
            {
                for(int i=56;i<64;i++)
                    flag[i]=1;
                for(int i=2;i<59;i+=8)
                    flag[i]=1;
                for(int i=40;i<59;i+=9)
                    flag[i]=1;
                for(int i=23;i<59;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (8,3)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b59.setBackground(Color.RED);
                if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                else if(b3.getText().equals("Q"))
                    b3.setBackground(Color.RED);
                else if(b11.getText().equals("Q"))
                    b11.setBackground(Color.RED);
                else if(b19.getText().equals("Q"))
                    b19.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                else if(b24.getText().equals("Q"))
                    b24.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b41.getText().equals("Q"))
                    b41.setBackground(Color.RED);
                else if(b50.getText().equals("Q"))
                    b50.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b60)
        {
        	
        	if(b60.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b60.setLabel("Q");b60.setBackground(Color.yellow);
            if(flag[59]==0)
            {
                for(int i=56;i<64;i++)
                    flag[i]=1;
                for(int i=3;i<60;i+=8)
                    flag[i]=1;
                for(int i=32;i<60;i+=9)
                    flag[i]=1;
                for(int i=31;i<60;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (8,4)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b60.setBackground(Color.RED);
                if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                else if(b4.getText().equals("Q"))
                    b4.setBackground(Color.RED);
                else if(b12.getText().equals("Q"))
                    b12.setBackground(Color.RED);
                else if(b20.getText().equals("Q"))
                    b20.setBackground(Color.RED);
                else if(b28.getText().equals("Q"))
                    b28.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                else if(b32.getText().equals("Q"))
                    b32.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b33.getText().equals("Q"))
                    b33.setBackground(Color.RED);
                else if(b42.getText().equals("Q"))
                    b42.setBackground(Color.RED);
                else if(b51.getText().equals("Q"))
                    b51.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b61)
        {
        	
        	if(b61.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b61.setLabel("Q");b61.setBackground(Color.yellow);
            if(flag[60]==0)
            {
                for(int i=56;i<64;i++)
                    flag[i]=1;
                for(int i=4;i<61;i+=8)
                    flag[i]=1;
                for(int i=24;i<61;i+=9)
                    flag[i]=1;
                for(int i=39;i<61;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (6,5)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b61.setBackground(Color.RED);
                if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                else if(b5.getText().equals("Q"))
                    b5.setBackground(Color.RED);
                else if(b13.getText().equals("Q"))
                    b13.setBackground(Color.RED);
                else if(b21.getText().equals("Q"))
                    b21.setBackground(Color.RED);
                else if(b29.getText().equals("Q"))
                    b29.setBackground(Color.RED);
                else if(b37.getText().equals("Q"))
                    b37.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                else if(b40.getText().equals("Q"))
                    b40.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b25.getText().equals("Q"))
                    b25.setBackground(Color.RED);
                else if(b34.getText().equals("Q"))
                    b34.setBackground(Color.RED);
                else if(b43.getText().equals("Q"))
                    b43.setBackground(Color.RED);
                else if(b52.getText().equals("Q"))
                    b52.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b62)
        {
        	
        	if(b62.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b62.setLabel("Q");b62.setBackground(Color.yellow);
            if(flag[61]==0)
            {
                for(int i=56;i<64;i++)
                    flag[i]=1;
                for(int i=5;i<62;i+=8)
                    flag[i]=1;
                for(int i=16;i<62;i+=9)
                    flag[i]=1;
                for(int i=47;i<62;i+=7)
                    flag[i]=1;
                msg.setText("Queen placed at (8,6)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b62.setBackground(Color.RED);
                if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                else if(b63.getText().equals("Q"))
                    b63.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                else if(b6.getText().equals("Q"))
                    b6.setBackground(Color.RED);
                else if(b14.getText().equals("Q"))
                    b14.setBackground(Color.RED);
                else if(b22.getText().equals("Q"))
                    b22.setBackground(Color.RED);
                else if(b30.getText().equals("Q"))
                    b30.setBackground(Color.RED);
                else if(b38.getText().equals("Q"))
                    b38.setBackground(Color.RED);
                else if(b46.getText().equals("Q"))
                    b46.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                else if(b48.getText().equals("Q"))
                    b48.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b17.getText().equals("Q"))
                    b17.setBackground(Color.RED);
                else if(b26.getText().equals("Q"))
                    b26.setBackground(Color.RED);
                else if(b35.getText().equals("Q"))
                    b35.setBackground(Color.RED);
                else if(b44.getText().equals("Q"))
                    b44.setBackground(Color.RED);
                else if(b53.getText().equals("Q"))
                    b53.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b63)
        {
        	
        	if(b63.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b63.setLabel("Q");b63.setBackground(Color.yellow);
            if(flag[62]==0)
            {
                for(int i=56;i<64;i++)
                    flag[i]=1;
                for(int i=6;i<63;i+=8)
                    flag[i]=1;
                for(int i=8;i<63;i+=9)
                    flag[i]=1;
                flag[56]=1;
                msg.setText("Queen placed at (8,7)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                b63.setBackground(Color.RED);
                if(b57.getText().equals("Q"))
                    b57.setBackground(Color.RED);
                else if(b58.getText().equals("Q"))
                    b58.setBackground(Color.RED);
                else if(b59.getText().equals("Q"))
                    b59.setBackground(Color.RED);
                else if(b60.getText().equals("Q"))
                    b60.setBackground(Color.RED);
                else if(b61.getText().equals("Q"))
                    b61.setBackground(Color.RED);
                else if(b62.getText().equals("Q"))
                    b62.setBackground(Color.RED);
                else if(b64.getText().equals("Q"))
                    b64.setBackground(Color.RED);
                else if(b7.getText().equals("Q"))
                    b7.setBackground(Color.RED);
                else if(b15.getText().equals("Q"))
                    b15.setBackground(Color.RED);
                else if(b23.getText().equals("Q"))
                    b23.setBackground(Color.RED);
                else if(b31.getText().equals("Q"))
                    b31.setBackground(Color.RED);
                else if(b39.getText().equals("Q"))
                    b39.setBackground(Color.RED);
                else if(b47.getText().equals("Q"))
                    b47.setBackground(Color.RED);
                else if(b55.getText().equals("Q"))
                    b55.setBackground(Color.RED);
                else if(b56.getText().equals("Q"))
                    b56.setBackground(Color.RED);
                else if(b9.getText().equals("Q"))
                    b9.setBackground(Color.RED);
                else if(b18.getText().equals("Q"))
                    b18.setBackground(Color.RED);
                else if(b27.getText().equals("Q"))
                    b27.setBackground(Color.RED);
                else if(b36.getText().equals("Q"))
                    b36.setBackground(Color.RED);
                else if(b45.getText().equals("Q"))
                    b45.setBackground(Color.RED);
                else if(b54.getText().equals("Q"))
                    b54.setBackground(Color.RED);
                msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
                ge=1;
            }}
        }

        else if(e.getSource()==b64)
        {
        	b64IsPressed();
        }
        else if(e.getSource()==replay)
        {
        	setReplay();
        }
     }

       else if(e.getSource()==replay)
        {
    	   setReplay();
        }
      else
            msg.setText("        ~0(^_^)0~");
	}

	private void b64IsPressed() {
		if(b64.getText().equals("Q"))msg.setText("Queen already placed!");
		else{
		b64.setLabel("Q");b64.setBackground(Color.yellow);
		if(flag[63]==0)
		{
		    for(int i=56;i<64;i++)
		        flag[i]=1;
		    for(int i=7;i<64;i+=8)
		        flag[i]=1;
		    for(int i=0;i<64;i+=9)
		        flag[i]=1;
		    msg.setText("Queen placed at (8,8)");
		    count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
		}
		else
		{
		    b64.setBackground(Color.RED);
		    if(b57.getText().equals("Q"))
		        b57.setBackground(Color.RED);
		    else if(b58.getText().equals("Q"))
		        b58.setBackground(Color.RED);
		    else if(b59.getText().equals("Q"))
		        b59.setBackground(Color.RED);
		    else if(b60.getText().equals("Q"))
		        b60.setBackground(Color.RED);
		    else if(b61.getText().equals("Q"))
		        b61.setBackground(Color.RED);
		    else if(b62.getText().equals("Q"))
		        b62.setBackground(Color.RED);
		    else if(b63.getText().equals("Q"))
		        b63.setBackground(Color.RED);
		    else if(b8.getText().equals("Q"))
		        b8.setBackground(Color.RED);
		    else if(b16.getText().equals("Q"))
		        b16.setBackground(Color.RED);
		    else if(b24.getText().equals("Q"))
		        b24.setBackground(Color.RED);
		    else if(b32.getText().equals("Q"))
		        b32.setBackground(Color.RED);
		    else if(b40.getText().equals("Q"))
		        b40.setBackground(Color.RED);
		    else if(b48.getText().equals("Q"))
		        b48.setBackground(Color.RED);
		    else if(b56.getText().equals("Q"))
		        b56.setBackground(Color.RED);
		    else if(b1.getText().equals("Q"))
		        b1.setBackground(Color.RED);
		    else if(b10.getText().equals("Q"))
		        b10.setBackground(Color.RED);
		    else if(b19.getText().equals("Q"))
		        b19.setBackground(Color.RED);
		    else if(b28.getText().equals("Q"))
		        b28.setBackground(Color.RED);
		    else if(b37.getText().equals("Q"))
		        b37.setBackground(Color.RED);
		    else if(b46.getText().equals("Q"))
		        b46.setBackground(Color.RED);
		    else if(b55.getText().equals("Q"))
		        b55.setBackground(Color.RED);
		    msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
		    ge=1;
		}}
	}

	private void b2IsPressed() {
		if(b2.getText().equals("Q"))msg.setText("Queen already placed!");
            else{
            b2.setLabel("Q");b2.setBackground(Color.yellow);
            if(flag[1]==0)
            {
                for(int i=0;i<8;i++)
                    flag[i]=1;
                for(int i=1;i<58;i+=8)
                    flag[i]=1;
                for(int i=1;i<56;i+=9)
                    flag[i]=1;
                flag[8]=1;
                msg.setText("Queen placed at (1,2)");
                count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
            }
            else
            {
                setBGColor1();
            }
            }
	}

	private void b1IsPressed() {
		if(b1.getText().equals("Q"))msg.setText("Queen already placed!");
		else{
		b1.setLabel("Q");
		b1.setBackground(Color.yellow);
		if(flag[0]==0)
		{
		    for(int i=0;i<8;i++)
		        flag[i]=1;
		    for(int i=0;i<57;i+=8)
		        flag[i]=1;
		    for(int i=0;i<64;i+=9)
		        flag[i]=1;
		    msg.setText("Queen placed at (1,1)");
		    count++;if(count==8) { msg.setBackground(Color.GREEN);msg.setText("Congratulations! You won!");ge=1;showStatus("Winner!!"); }
		}
		else
		{
		    b1.setBackground(Color.RED);
		    if(b2.getText().equals("Q"))
		        b2.setBackground(Color.RED);
		    else if(b10.getText().equals("Q"))
		        b10.setBackground(Color.RED);
		    else if(b19.getText().equals("Q"))
		        b19.setBackground(Color.RED);
		    else if(b28.getText().equals("Q"))
		        b28.setBackground(Color.RED);
		    else if(b37.getText().equals("Q"))
		        b37.setBackground(Color.RED);
		    else if(b46.getText().equals("Q"))
		        b46.setBackground(Color.RED);
		    else if(b55.getText().equals("Q"))
		        b55.setBackground(Color.RED);
		    else if(b64.getText().equals("Q"))
		        b64.setBackground(Color.RED);
		    else if(b3.getText().equals("Q"))
		        b3.setBackground(Color.RED);
		    else if(b4.getText().equals("Q"))
		        b4.setBackground(Color.RED);
		    else if(b5.getText().equals("Q"))
		        b5.setBackground(Color.RED);
		    else if(b6.getText().equals("Q"))
		        b6.setBackground(Color.RED);
		    else if(b7.getText().equals("Q"))
		        b7.setBackground(Color.RED);
		    else if(b8.getText().equals("Q"))
		        b8.setBackground(Color.RED);
		    else if(b9.getText().equals("Q"))
		        b9.setBackground(Color.RED);
		    else if(b17.getText().equals("Q"))
		        b17.setBackground(Color.RED);
		    else if(b25.getText().equals("Q"))
		        b25.setBackground(Color.RED);
		    else if(b33.getText().equals("Q"))
		        b33.setBackground(Color.RED);
		    else if(b41.getText().equals("Q"))
		        b41.setBackground(Color.RED);
		    else if(b49.getText().equals("Q"))
		        b49.setBackground(Color.RED);
		    else if(b57.getText().equals("Q"))
		        b57.setBackground(Color.RED);
		    msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
		    ge=1;
		}
		}
	}

	private void setReplay() {
		ge=0;
		count=0;
		msg.setBackground(Color.WHITE);
		for(int i=0;i<64;i++)
		    flag[i]=0;
		b1.setBackground(Color.LIGHT_GRAY);b2.setBackground(Color.WHITE);b3.setBackground(Color.LIGHT_GRAY);b4.setBackground(Color.WHITE);
		b5.setBackground(Color.LIGHT_GRAY);b6.setBackground(Color.WHITE);b7.setBackground(Color.LIGHT_GRAY);b8.setBackground(Color.WHITE);
		b9.setBackground(Color.WHITE);b10.setBackground(Color.LIGHT_GRAY);b11.setBackground(Color.WHITE);b12.setBackground(Color.LIGHT_GRAY);
		b13.setBackground(Color.WHITE);b14.setBackground(Color.LIGHT_GRAY);b15.setBackground(Color.WHITE);b16.setBackground(Color.LIGHT_GRAY);
		b17.setBackground(Color.LIGHT_GRAY);b18.setBackground(Color.WHITE);b19.setBackground(Color.LIGHT_GRAY);b20.setBackground(Color.WHITE);
		b21.setBackground(Color.LIGHT_GRAY);b22.setBackground(Color.WHITE);b23.setBackground(Color.LIGHT_GRAY);b24.setBackground(Color.WHITE);
		b25.setBackground(Color.WHITE);b26.setBackground(Color.LIGHT_GRAY);b27.setBackground(Color.WHITE);b28.setBackground(Color.LIGHT_GRAY);
		b29.setBackground(Color.WHITE);b30.setBackground(Color.LIGHT_GRAY);b31.setBackground(Color.WHITE);b32.setBackground(Color.LIGHT_GRAY);
		b33.setBackground(Color.LIGHT_GRAY);b34.setBackground(Color.WHITE);b35.setBackground(Color.LIGHT_GRAY);b36.setBackground(Color.WHITE);
		b37.setBackground(Color.LIGHT_GRAY);b38.setBackground(Color.WHITE);b39.setBackground(Color.LIGHT_GRAY);b40.setBackground(Color.WHITE);
		b41.setBackground(Color.WHITE);b42.setBackground(Color.LIGHT_GRAY);b43.setBackground(Color.WHITE);b44.setBackground(Color.LIGHT_GRAY);
		b45.setBackground(Color.WHITE);b46.setBackground(Color.LIGHT_GRAY);b47.setBackground(Color.WHITE);b48.setBackground(Color.LIGHT_GRAY);
		b49.setBackground(Color.LIGHT_GRAY);b50.setBackground(Color.WHITE);b51.setBackground(Color.LIGHT_GRAY);b52.setBackground(Color.WHITE);
		b53.setBackground(Color.LIGHT_GRAY);b54.setBackground(Color.WHITE);b55.setBackground(Color.LIGHT_GRAY);b56.setBackground(Color.WHITE);
		b57.setBackground(Color.WHITE);b58.setBackground(Color.LIGHT_GRAY);b59.setBackground(Color.WHITE);b60.setBackground(Color.LIGHT_GRAY);
		b61.setBackground(Color.WHITE);b62.setBackground(Color.LIGHT_GRAY);b63.setBackground(Color.WHITE);b64.setBackground(Color.LIGHT_GRAY);
		b1.setLabel("*");b2.setLabel("*");b3.setLabel("*");b4.setLabel("*");
		b5.setLabel("*");b6.setLabel("*");b7.setLabel("*");b8.setLabel("*");
		b9.setLabel("*");b10.setLabel("*");b11.setLabel("*");b12.setLabel("*");
		b13.setLabel("*");b14.setLabel("*");b15.setLabel("*");b16.setLabel("*");
		b17.setLabel("*");b18.setLabel("*");b19.setLabel("*");b20.setLabel("*");
		b21.setLabel("*");b22.setLabel("*");b23.setLabel("*");b24.setLabel("*");
		b25.setLabel("*");b26.setLabel("*");b27.setLabel("*");b28.setLabel("*");
		b29.setLabel("*");b30.setLabel("*");b31.setLabel("*");b32.setLabel("*");
		b33.setLabel("*");b34.setLabel("*");b35.setLabel("*");b36.setLabel("*");
		b37.setLabel("*");b38.setLabel("*");b39.setLabel("*");b40.setLabel("*");
		b41.setLabel("*");b42.setLabel("*");b43.setLabel("*");b44.setLabel("*");
		b45.setLabel("*");b46.setLabel("*");b47.setLabel("*");b48.setLabel("*");
		b49.setLabel("*");b50.setLabel("*");b51.setLabel("*");b52.setLabel("*");
		b53.setLabel("*");b54.setLabel("*");b55.setLabel("*");b56.setLabel("*");
		b57.setLabel("*");b58.setLabel("*");b59.setLabel("*");b60.setLabel("*");
		b61.setLabel("*");b62.setLabel("*");b63.setLabel("*");b64.setLabel("*");
		msg.setText("New game!");
	}

	
	private void setBGColor7(){
		b8.setBackground(Color.RED);
        if(b1.getText().equals("Q"))
            b1.setBackground(Color.RED);
        else if(b2.getText().equals("Q"))
            b2.setBackground(Color.RED);
        else if(b4.getText().equals("Q"))
            b4.setBackground(Color.RED);
        else if(b5.getText().equals("Q"))
            b5.setBackground(Color.RED);
        else if(b6.getText().equals("Q"))
            b6.setBackground(Color.RED);
        else if(b7.getText().equals("Q"))
            b7.setBackground(Color.RED);
        else if(b3.getText().equals("Q"))
            b3.setBackground(Color.RED);
        else if(b15.getText().equals("Q"))
            b15.setBackground(Color.RED);
        else if(b22.getText().equals("Q"))
            b22.setBackground(Color.RED);
        else if(b29.getText().equals("Q"))
            b29.setBackground(Color.RED);
        else if(b36.getText().equals("Q"))
            b36.setBackground(Color.RED);
        else if(b43.getText().equals("Q"))
            b43.setBackground(Color.RED);
        else if(b50.getText().equals("Q"))
            b50.setBackground(Color.RED);
        else if(b57.getText().equals("Q"))
            b57.setBackground(Color.RED);
        else if(b16.getText().equals("Q"))
            b16.setBackground(Color.RED);
        else if(b24.getText().equals("Q"))
            b24.setBackground(Color.RED);
        else if(b32.getText().equals("Q"))
            b32.setBackground(Color.RED);
        else if(b40.getText().equals("Q"))
            b40.setBackground(Color.RED);
        else if(b48.getText().equals("Q"))
            b48.setBackground(Color.RED);
        else if(b56.getText().equals("Q"))
            b56.setBackground(Color.RED);
        else if(b64.getText().equals("Q"))
            b48.setBackground(Color.RED);
        msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
        ge=1;
	}
	private void setBGColor4() {
		b5.setBackground(Color.RED);
		if(b1.getText().equals("Q"))
		    b1.setBackground(Color.RED);
		else if(b2.getText().equals("Q"))
		    b2.setBackground(Color.RED);
		else if(b4.getText().equals("Q"))
		    b4.setBackground(Color.RED);
		else if(b3.getText().equals("Q"))
		    b3.setBackground(Color.RED);
		else if(b6.getText().equals("Q"))
		    b6.setBackground(Color.RED);
		else if(b7.getText().equals("Q"))
		    b7.setBackground(Color.RED);
		else if(b8.getText().equals("Q"))
		    b8.setBackground(Color.RED);
		else if(b12.getText().equals("Q"))
		    b12.setBackground(Color.RED);
		else if(b19.getText().equals("Q"))
		    b19.setBackground(Color.RED);
		else if(b26.getText().equals("Q"))
		    b26.setBackground(Color.RED);
		else if(b33.getText().equals("Q"))
		    b33.setBackground(Color.RED);
		else if(b14.getText().equals("Q"))
		    b14.setBackground(Color.RED);
		else if(b23.getText().equals("Q"))
		    b23.setBackground(Color.RED);
		else if(b32.getText().equals("Q"))
		    b32.setBackground(Color.RED);
		else if(b13.getText().equals("Q"))
		    b13.setBackground(Color.RED);
		else if(b21.getText().equals("Q"))
		    b21.setBackground(Color.RED);
		else if(b29.getText().equals("Q"))
		    b29.setBackground(Color.RED);
		else if(b37.getText().equals("Q"))
		    b37.setBackground(Color.RED);
		else if(b45.getText().equals("Q"))
		    b45.setBackground(Color.RED);
		else if(b53.getText().equals("Q"))
		    b53.setBackground(Color.RED);
		else if(b61.getText().equals("Q"))
		    b61.setBackground(Color.RED);
		msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
		ge=1;
	}

	private void setBGColor6(){
		b7.setBackground(Color.RED);
        if(b1.getText().equals("Q"))
            b1.setBackground(Color.RED);
        else if(b2.getText().equals("Q"))
            b2.setBackground(Color.RED);
        else if(b4.getText().equals("Q"))
            b4.setBackground(Color.RED);
        else if(b5.getText().equals("Q"))
            b5.setBackground(Color.RED);
        else if(b6.getText().equals("Q"))
            b6.setBackground(Color.RED);
        else if(b3.getText().equals("Q"))
            b3.setBackground(Color.RED);
        else if(b8.getText().equals("Q"))
            b8.setBackground(Color.RED);
        else if(b14.getText().equals("Q"))
            b14.setBackground(Color.RED);
        else if(b21.getText().equals("Q"))
            b21.setBackground(Color.RED);
        else if(b28.getText().equals("Q"))
            b28.setBackground(Color.RED);
        else if(b35.getText().equals("Q"))
            b35.setBackground(Color.RED);
        else if(b42.getText().equals("Q"))
            b42.setBackground(Color.RED);
        else if(b49.getText().equals("Q"))
            b49.setBackground(Color.RED);
        else if(b16.getText().equals("Q"))
            b16.setBackground(Color.RED);
        else if(b15.getText().equals("Q"))
            b15.setBackground(Color.RED);
        else if(b23.getText().equals("Q"))
            b23.setBackground(Color.RED);
        else if(b31.getText().equals("Q"))
            b31.setBackground(Color.RED);
        else if(b39.getText().equals("Q"))
            b39.setBackground(Color.RED);
        else if(b47.getText().equals("Q"))
            b47.setBackground(Color.RED);
        else if(b55.getText().equals("Q"))
            b55.setBackground(Color.RED);
        else if(b63.getText().equals("Q"))
            b63.setBackground(Color.RED);
        msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
        ge=1;
	}
	private void setBGColor5(){
		b6.setBackground(Color.RED);
        if(b1.getText().equals("Q"))
            b1.setBackground(Color.RED);
        else if(b2.getText().equals("Q"))
            b2.setBackground(Color.RED);
        else if(b4.getText().equals("Q"))
            b4.setBackground(Color.RED);
        else if(b5.getText().equals("Q"))
            b5.setBackground(Color.RED);
        else if(b3.getText().equals("Q"))
            b3.setBackground(Color.RED);
        else if(b7.getText().equals("Q"))
            b7.setBackground(Color.RED);
        else if(b8.getText().equals("Q"))
            b8.setBackground(Color.RED);
        else if(b13.getText().equals("Q"))
            b13.setBackground(Color.RED);
        else if(b20.getText().equals("Q"))
            b20.setBackground(Color.RED);
        else if(b27.getText().equals("Q"))
            b27.setBackground(Color.RED);
        else if(b34.getText().equals("Q"))
            b34.setBackground(Color.RED);
        else if(b41.getText().equals("Q"))
            b41.setBackground(Color.RED);
        else if(b15.getText().equals("Q"))
            b15.setBackground(Color.RED);
        else if(b24.getText().equals("Q"))
            b24.setBackground(Color.RED);
        else if(b14.getText().equals("Q"))
            b14.setBackground(Color.RED);
        else if(b22.getText().equals("Q"))
            b22.setBackground(Color.RED);
        else if(b30.getText().equals("Q"))
            b30.setBackground(Color.RED);
        else if(b38.getText().equals("Q"))
            b38.setBackground(Color.RED);
        else if(b46.getText().equals("Q"))
            b46.setBackground(Color.RED);
        else if(b54.getText().equals("Q"))
            b54.setBackground(Color.RED);
        else if(b62.getText().equals("Q"))
            b62.setBackground(Color.RED);
        msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
        ge=1;
	}
	private void setBGColor3() {
		b4.setBackground(Color.RED);
		if(b1.getText().equals("Q"))
		    b1.setBackground(Color.RED);
		else if(b2.getText().equals("Q"))
		    b2.setBackground(Color.RED);
		else if(b3.getText().equals("Q"))
		    b3.setBackground(Color.RED);
		else if(b5.getText().equals("Q"))
		    b5.setBackground(Color.RED);
		else if(b6.getText().equals("Q"))
		    b6.setBackground(Color.RED);
		else if(b7.getText().equals("Q"))
		    b7.setBackground(Color.RED);
		else if(b8.getText().equals("Q"))
		    b8.setBackground(Color.RED);
		else if(b11.getText().equals("Q"))
		    b11.setBackground(Color.RED);
		else if(b18.getText().equals("Q"))
		    b18.setBackground(Color.RED);
		else if(b25.getText().equals("Q"))
		    b25.setBackground(Color.RED);
		else if(b13.getText().equals("Q"))
		    b13.setBackground(Color.RED);
		else if(b22.getText().equals("Q"))
		    b22.setBackground(Color.RED);
		else if(b31.getText().equals("Q"))
		    b31.setBackground(Color.RED);
		else if(b40.getText().equals("Q"))
		    b40.setBackground(Color.RED);
		else if(b12.getText().equals("Q"))
		    b12.setBackground(Color.RED);
		else if(b20.getText().equals("Q"))
		    b20.setBackground(Color.RED);
		else if(b28.getText().equals("Q"))
		    b28.setBackground(Color.RED);
		else if(b36.getText().equals("Q"))
		    b36.setBackground(Color.RED);
		else if(b44.getText().equals("Q"))
		    b44.setBackground(Color.RED);
		else if(b52.getText().equals("Q"))
		    b52.setBackground(Color.RED);
		else if(b60.getText().equals("Q"))
		    b60.setBackground(Color.RED);
		msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
		ge=1;
	}

	private void setBGColor2() {
		b3.setBackground(Color.RED);
		if(b1.getText().equals("Q"))
		    b1.setBackground(Color.RED);
		else if(b2.getText().equals("Q"))
		    b2.setBackground(Color.RED);
		else if(b4.getText().equals("Q"))
		    b4.setBackground(Color.RED);
		else if(b5.getText().equals("Q"))
		    b5.setBackground(Color.RED);
		else if(b6.getText().equals("Q"))
		    b6.setBackground(Color.RED);
		else if(b7.getText().equals("Q"))
		    b7.setBackground(Color.RED);
		else if(b8.getText().equals("Q"))
		    b8.setBackground(Color.RED);
		else if(b10.getText().equals("Q"))
		    b10.setBackground(Color.RED);
		else if(b17.getText().equals("Q"))
		    b17.setBackground(Color.RED);
		else if(b11.getText().equals("Q"))
		    b11.setBackground(Color.RED);
		else if(b19.getText().equals("Q"))
		    b19.setBackground(Color.RED);
		else if(b27.getText().equals("Q"))
		    b27.setBackground(Color.RED);
		else if(b35.getText().equals("Q"))
		    b35.setBackground(Color.RED);
		else if(b43.getText().equals("Q"))
		    b43.setBackground(Color.RED);
		else if(b51.getText().equals("Q"))
		    b51.setBackground(Color.RED);
		else if(b59.getText().equals("Q"))
		    b59.setBackground(Color.RED);
		else if(b12.getText().equals("Q"))
		    b12.setBackground(Color.RED);
		else if(b21.getText().equals("Q"))
		    b21.setBackground(Color.RED);
		else if(b30.getText().equals("Q"))
		    b30.setBackground(Color.RED);
		else if(b39.getText().equals("Q"))
		    b39.setBackground(Color.RED);
		else if(b48.getText().equals("Q"))
		    b48.setBackground(Color.RED);
		msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
		ge=1;
	}

	private void setBGColor1() {
		b2.setBackground(Color.RED);
		if(b1.getText().equals("Q"))
		    b1.setBackground(Color.RED);
		else if(b10.getText().equals("Q"))
		    b10.setBackground(Color.RED);
		else if(b18.getText().equals("Q"))
		    b18.setBackground(Color.RED);
		else if(b26.getText().equals("Q"))
		    b26.setBackground(Color.RED);
		else if(b34.getText().equals("Q"))
		    b34.setBackground(Color.RED);
		else if(b42.getText().equals("Q"))
		    b42.setBackground(Color.RED);
		else if(b50.getText().equals("Q"))
		    b50.setBackground(Color.RED);
		else if(b58.getText().equals("Q"))
		    b58.setBackground(Color.RED);
		else if(b3.getText().equals("Q"))
		    b3.setBackground(Color.RED);
		else if(b4.getText().equals("Q"))
		    b4.setBackground(Color.RED);
		else if(b5.getText().equals("Q"))
		    b5.setBackground(Color.RED);
		else if(b6.getText().equals("Q"))
		    b6.setBackground(Color.RED);
		else if(b7.getText().equals("Q"))
		    b7.setBackground(Color.RED);
		else if(b8.getText().equals("Q"))
		    b8.setBackground(Color.RED);
		else if(b9.getText().equals("Q"))
		    b9.setBackground(Color.RED);
		else if(b11.getText().equals("Q"))
		    b11.setBackground(Color.RED);
		else if(b20.getText().equals("Q"))
		    b20.setBackground(Color.RED);
		else if(b29.getText().equals("Q"))
		    b29.setBackground(Color.RED);
		else if(b38.getText().equals("Q"))
		    b38.setBackground(Color.RED);
		else if(b47.getText().equals("Q"))
		    b47.setBackground(Color.RED);
		else if(b56.getText().equals("Q"))
		    b56.setBackground(Color.RED);
		ge=1;
		msg.setBackground(Color.ORANGE);msg.setText("Oops!You've lost the game!");
	}
}