/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.awt.*;  
import java.awt.event.*;  

/**
 *
 * @author atri
 */
public class MouseListenerExample extends Frame  implements MouseListener, ActionListener{   
    int x,y;
   
    Button b;  
     TextField tf; 
     String s1;
    MouseListenerExample(){  
        addMouseListener(this);  
          b=new Button("Instruction");  
          b.setForeground(Color.RED);
          b.setBackground(Color.yellow);
        b.setBounds(560,44,70,35);  
        b.addActionListener(this);    
        add(b);
          tf=new TextField(s1);   
        tf.setBounds(350,46,210,30);
       tf.setBackground(Color.white);
        tf.setEditable(false);
        
          add(tf);
            
        setSize(900,900);  
        setLayout(null); 
         //setBackground(Color.white);
        setVisible(true);  
    }  
    public void actionPerformed(ActionEvent f) { 
      
          if(f.getSource()==b){  
             for(int i=1;i<6;i++) {
                 if(i==1){
                  tf.setForeground(Color.red);
             
           tf.setText("   CLICK ON ANY RANDOM POINT. " );
               	try {
		
			//sleep 5 seconds
			Thread.sleep(1500);
			
			 tf.setText("   CLICK ON ANY RANDOM POINT. " );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
               if(i==2){
                  tf.setForeground(Color.blue);
             
           tf.setText("   USING MOUSE OR TOUCHPAD. " );
               try {
		
			//sleep 5 seconds
			Thread.sleep(1500);
			
			 tf.setText("   USING MOUSE OR TOUCHPAD. " );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}}
               if(i==3){
                  tf.setForeground(Color.magenta);
             
           tf.setText("   YOU WILL GET CO-ORDINATES. " );
               try {
		
			//sleep 5 seconds
			Thread.sleep(1500);
			
			 tf.setText("   YOU WILL GET CO-ORDINATES " );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}}
               if(i==4){
                  tf.setForeground(Color.green);
             
           tf.setText("  AND THE COLOR OF THE SQUARE OR LINE. " );
               try {
		
			//sleep 5 seconds
			Thread.sleep(1500);
			
			 tf.setText("  AND THE COLOR OF THE SQUARE OR LINE. " );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}}
               if(i==5){
                  tf.setForeground(Color.MAGENTA);
             
           tf.setText("  ~JAVA PROJECT BY ATRI RAHA." );
               try {
		
			//sleep 5 seconds
			Thread.sleep(1500);
			
			 tf.setText("  ~JAVA PROJECT BY ATRI RAHA." );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
               break;}
               
        }
       
          }
        
        
      }
   
    
    public void mouseClicked(MouseEvent e) {  
        // l.setText("Co-ordinates are : " + e.getX()+" , "+e.getY());
         int x= getX();
          int y= getY();
          if(e.getX()<449 && e.getY()<459){
                //System.out.println("YOU CLICKED ON RED AREA"};
         System.out.println("YOU CLICKED ON RED AREA. YOUR CO-ORDINATES ARE : " + e.getX()+" , "+e.getY() );}
          else if(e.getX()<450 && e.getY()>470){
                //System.out.println("YOU CLICKED ON RED AREA"};
         System.out.println("YOU CLICKED ON BLUE AREA. YOUR CO-ORDINATES ARE : " + e.getX()+" , "+e.getY());}
            else if(e.getX()>459 && e.getY()<458){
                //System.out.println("YOU CLICKED ON RED AREA"};
         System.out.println("YOU CLICKED ON GREEN AREA. YOUR CO-ORDINATES ARE : " + e.getX()+" , "+e.getY());}
               else if(e.getX()>450 && e.getY()>470){
                //System.out.println("YOU CLICKED ON RED AREA"};
         System.out.println("YOU CLICKED ON YELLOW AREA. YOUR CO-ORDINATES ARE : " + e.getX()+" , "+e.getY());}
    else{  System.out.println("YOU CLICKED ON BLACK LINE. YOUR CO-ORDINATES ARE : " + e.getX()+" , "+e.getY());}
       Graphics g=getGraphics();  
       
        //g.setBackground(Color,blue);
        for(int i=0;i<450;i++){
            g.setColor(Color.red); 
            for(int j=0;j<450;j++){
        g.fillOval(i,j,10,10); 
            }
       
        }
         for(int m=450;m<900;m++){
            for(int n=450;n<900;n++){
                g.setColor(Color.yellow); 
        g.fillOval(m,n,10,10); 
            }
        }
            for(int k=450;k<900;k++){
            for(int z=0;z<450;z++){
                g.setColor(Color.green); 
        g.fillOval(k,z,10,10); 
            }
        }
             for(int u=0;u<441;u++){
            for(int v=459;v<900;v++){
                g.setColor(Color.blue); 
        g.fillOval(u,v,10,10); 
            }
        }
             for(int p =0;p<900;p++){
                 g.setColor(Color.black); 
                 g.fillOval(p,459,12,12);
             }
               for(int d =0;d<900;d++){
                 g.setColor(Color.black); 
                 g.fillOval(449,d,12,12);
             }
         /* for(int i=getX();i<400;i=i*2){
            for(int j=getY();j<400;j=j*2)
        g.fillOval(i,j,10,10); 
       
        }*/
         // g.drawString(str,getX(),getY());
         }
    
    public void mouseEntered(MouseEvent e) {  
     // l.setText("JAVA PROJECT");
        
    }  
    public void mouseExited(MouseEvent e) {  
      // l.setText("");  
    }  
    public void mousePressed(MouseEvent e) {  
       // l.setText("BY");
       Graphics g=getGraphics();
       g.setColor(Color.darkGray); 
       g.drawOval(e.getX(),e.getY(),12,12);
        b.setBackground(Color.white);
        b.setForeground(Color.blue);
      
    }  
    public void mouseReleased(MouseEvent e) {
     
      //l.setText("ATRI RAHA"); 
       b.setBackground(Color.yellow);
        b.setForeground(Color.red);
      
    }  
   
public static void main(String[] args) {  
    new MouseListenerExample();  
}  


}
