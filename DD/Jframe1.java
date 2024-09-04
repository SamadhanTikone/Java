import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Jframe1 extends JFrame {

    JLabel l1,l2,l3,l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2;

   public void show1(){

    Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
    Font f1 = new Font("New Times Roman",Font.BOLD,28);
        setLayout(null);
        l1 = new JLabel("Welcome To Coding World!");
        l1.setFont(f1);
        l2 =new JLabel("UserName:");
        l3 = new JLabel("Password:");
        l4 = new JLabel();

        t1 = new JTextField();
        t2 =new JPasswordField();

        b1 = new JButton("SUBMIT");
        b1.setCursor(c1);
        b2 = new JButton("CLEAR");
        b2.setCursor(c1);



        
        l1.setBounds(200,200,400,40);
        l1.setForeground(Color.RED);
        l2.setBounds(250,250,200,40);
        l3.setBounds(250,300,200,40);
        l4.setBounds(400,500,200,40);
        t1.setBounds(400,250,200,40);
        t2.setBounds(400,300,200,40);
        b1.setBounds(250,400,200,40);
        b1.setBackground(Color.GREEN);

        b2.setBounds(500,400,200,40);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        b1.addActionListener(new Log());
        b2.addActionListener(new Log1());
        // l1.addMouseListener(new Mousefun1());


    }

  
    public static void main(String[] args) {

        Jframe1 j1 = new Jframe1();
        
        j1.setSize(800,800);
        j1.setVisible(true);
        j1.setTitle("Welcome To Home");
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j1.show1();
    }

    class Log implements  ActionListener{
    
        public void actionPerformed(ActionEvent e) {
            String s1=t1.getText();
            String s2 = t2.getText();

            if(s1.equals("coding") && s2.equals("world")){
           l4.setText("Login SuccessFul");
            }
            else{
                l4.setText("Login unSuccessFul");

            }
            

        }
    }

    class Log1 implements ActionListener{

      
        public void actionPerformed(ActionEvent e) {
            t1.setText("");
            t2.setText("");
            l4.setText("");
            
        }

    //     class Mousefun1 implements MouseListener{

            
    //         @Override
    // public void mouseClicked(MouseEvent e) {
    //     // Your code for handling the mouse click
    //     l1.setText("Text");
    // }

    // @Override
    // public void mousePressed(MouseEvent e) {
    //     // Optional: Add your code here if needed
    // }

    // @Override
    // public void mouseReleased(MouseEvent e) {
    //     // Optional: Add your code here if needed
    // }

    // @Override
    // public void mouseEntered(MouseEvent e) {
    //     // Optional: Add your code here if needed
    // }

    // @Override
    // public void mouseExited(MouseEvent e) {
    //     // Optional: Add your code here if needed
    // }
            
    //     }
        
    }
}
// class A extends JFrame{
//     A(String s1){
//         super(s1);
//     }
    


// }
