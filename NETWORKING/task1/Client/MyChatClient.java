import java.net.*; 
import java.io.*; 
import java.awt.*;
import java.awt.event.*;
public class MyChatClient extends Frame implements ActionListener
{ 
    static Button b;
    static TextArea ta;
    static TextField t;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    static String str="";
    static String str2="";
     MyChatClient()
     {
        setTitle("My Chat Client");
        b=new Button("Send");
        ta=new TextArea("",20,30);
        ta.setBounds(100,100,100, 40);
        t=new TextField(20);
	setSize(300,400);
        setLayout(new FlowLayout());
        add(ta);
	add(t);
	add(b);
        b.addActionListener(this); 
        setVisible(true);
        
	
      }

     public void actionPerformed(ActionEvent e) 
      {
          
	
          try {
		str2=t.getText().trim();
	        dout.writeUTF(str2);
	        dout.flush();
	        t.setText("");	
	        ta.setText(ta.getText().trim() + "\n Sent :" + str2);
		
              }
          catch(Exception ee){} 	
	         
     } 
 
     public static void main(String args[]) 
       { 
        
        new MyChatClient();  
        try
         {
	    s=new Socket("localhost",3333); 
            din=new DataInputStream(s.getInputStream()); 
            dout=new DataOutputStream(s.getOutputStream());
            while (!str.equals("exit")) 
                {  
                   str = din.readUTF();  
                   ta.setText(ta.getText().trim() + "\n Received :" + str);  
                }
         } 
         catch(Exception eee){ }   
          
         
      }
}
