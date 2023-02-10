package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;//action listener için bunu yapınca signupthree kızıyo

public class SignupThree extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton submit,cancel;
String formno;
    public SignupThree(String formno) {
        this.formno=formno;
        setLayout(null);
        //arka plan
        getContentPane().setBackground(Color.WHITE);
        
        //normal yazı JLabel,yazı yazcak buton JRadioButton,
        JLabel l1=new JLabel("SAYFA 3: HESAP DETAYLARI");
        l1.setFont(new Font("Raleway",Font.BOLD,25));
        l1.setBounds(210,50,450,40);
        add(l1);
        
        JLabel type=new JLabel("Hesap Tipi");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1=new JRadioButton("Vadeli Hesap");//belirli bir süre için yatırılan paraya açılan(tasarruf) banka hesabı.
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,200,20);
        add(r1);
        
        r2=new JRadioButton("Sabit Mevduat Hesap");//belirli bir süre için yatırılan paraya açılan(tasarruf) banka hesabı.
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,200,20);
        add(r2);
        
        r3=new JRadioButton("Mevcut Hesap");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,200,20);
        add(r3);
        
        r4=new JRadioButton("Tekrarlı Mevduat Hesap");//belirli bir süre için yatırılan paraya açılan(tasarruf) banka hesabı.
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,200,20);
        add(r4);
        
        ButtonGroup groupaccount=new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card=new JLabel("Kart Numarası:");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number=new JLabel("xxxx-xxxx-xxxx-4184");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,250,30);
        add(number);
        
        JLabel carddetail=new JLabel("(16 Haneli Kart Numaranız)");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(100,330,310,20);
        add(carddetail);
        
        JLabel pin=new JLabel("Pin Numarası:");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pnumber=new JLabel("xxxx");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,250,30);
        add(pnumber);
        
         JLabel pindetail=new JLabel("(4 Haneli Şifreniz)");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(100,400,310,20);
        add(pindetail);
        
        JLabel services=new JLabel("Gerekli Hizmetler:");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,200,30);
        add(services);
        
        c1=new JCheckBox("ATM Kart");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font ("raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2=new JCheckBox("Internet Bankacılığı");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font ("raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        
        c3=new JCheckBox("Mobil Bankacılık");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font ("raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4=new JCheckBox("Email & SMS Uyarısı");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font ("raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5=new JCheckBox("Çek Defteri");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font ("raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6=new JCheckBox("Seçtiğim bu bilgilerin doğru olduğunu beyan ederim");
        c6.setBackground(Color.WHITE);
        c6.setForeground(Color.RED);
        c6.setFont(new Font ("raleway",Font.BOLD,14));
        c6.setBounds(175,690,600,30);
        add(c6);
        
        submit = new JButton("KAYDET");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font ("raleway",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("İPTAL");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font ("raleway",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        
        
        setSize(790,820);
        setLocation(350,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
    //kızınca
    if(ae.getSource()==submit){
        String accountType=null;
        if(r1.isSelected()){
            accountType="Vadeli Hesap";
        }else if(r2.isSelected()){
            accountType="Sabit Mevduat Hesabı";
        }else if(r3.isSelected()){
            accountType="Mevcut Hesap";
        }else if(r4.isSelected()){
            accountType="Tekrarlı Mevduat Hesabı";
        }
        
        Random random =new Random();
        String cardnumber=""+Math.abs((random.nextLong()%90000000L)+5040936000000000L);
        
        String pinnumber=""+Math.abs((random.nextLong()%9000L)+1000L);
        
        String facility="";
        if(c1.isSelected()){
            facility=facility+"ATM Kartı";
        }else if(c2.isSelected()){
            facility=facility+"Internet Bankacılığı";
        }else if(c3.isSelected()){
            facility=facility+"Mobil Bankacılık";
        }else if(c4.isSelected()){
            facility=facility+"Email & SMS Uyarısı";
        }else if(c4.isSelected()){
            facility=facility+"Çek Defteri";
        }
        
        try{
            if(accountType.equals("")){
                JOptionPane.showMessageDialog(null,"Account Type is Required");
            }else {
                Conn conn=new Conn();
                String query1="insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                String query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";

                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null,"Kart numarası:"+cardnumber+"\n Şifreniz:"+pinnumber);
              
            }
            setVisible(false);
            new Deposit(pinnumber).setVisible(false);
        
        }catch(Exception e){
            System.out.println(e);
        }
        
    }else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
    }
    }//public
    
    public static void main(String args[]){
        new SignupThree("");
    }
}
