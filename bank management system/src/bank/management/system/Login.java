package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
public class Login extends JFrame implements ActionListener{//Login Giriş Yap ekranı kullanıcı bilgilerini girerek yetkili alana geçiş yapabilmemiz için sunulan bir giriş kapısıdır.
     
   JButton login,signup,clear;
   JTextField cardTextField;
   JPasswordField pinTextField;//şifre tutucu saklı yazar yukarıdaki değişkene(JTextField) koyarsan görürsün
    Login(){
          setTitle("OTOMATİK VEZNE MAKİNESİ");//frame'nin titlesine yazar
          
          setLayout(null);//Java'da Component'lerin nereye nasıl konacağını belirleyen
          
          ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
          Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
          ImageIcon i3=new ImageIcon(i2);
          JLabel label=new JLabel(i3);//ekrana resmi sabitler
          label.setBounds(70,10,100,100);
          add(label);
          //WELCOME
          JLabel text=new JLabel("ATM' YE HOŞGELDİN");
          text.setFont(new Font("Osward",Font.BOLD,38));
          text.setBounds(200,40,400,50);//2. aşağı yukarı hizalar
          add(text);//ekrana ekler
          //CARDNO
          JLabel cardno=new JLabel("Card No: ");
          cardno.setFont(new Font("Raleway",Font.BOLD,28));
          cardno.setBounds(120,150,150,30);//3. yazının boy düzenler
          add(cardno);//ekrana ekler
          //cardnoyaz
          cardTextField=new JTextField();//cardnoyu yazacağımız alan
          cardTextField.setBounds(300,150,230,30);
          cardTextField.setFont(new Font("Arial",Font.BOLD,14));
          add(cardTextField);
          
          //PİN
          JLabel pin=new JLabel("PIN: ");
          pin.setFont(new Font("Raleway",Font.BOLD,28));
          pin.setBounds(120,220,250,30);//4 yazının en düzenlemesi
          add(pin);//ekrana ekler
          
          //pinyaz
          pinTextField=new JPasswordField();//cardnoyu yazacağımız alan
          pinTextField.setBounds(300,220,230,30);
          pinTextField.setFont(new Font("Arial",Font.BOLD,14));
          add(pinTextField);
          
          login =new JButton("GİRİŞ");//sign in
          login.setBounds(300,300,100,30);
          login.setBackground(Color.black);//buton reng
          login.setForeground(Color.white);//buton yazı reng
          login.addActionListener(this);
          add(login);
          
          clear =new JButton("SİL");//sign in
          clear.setBounds(430,300,100,30);//430la az yana aldı
          clear.setBackground(Color.black);//buton reng
          clear.setForeground(Color.white);//buton yazı reng
          clear.addActionListener(this);
          add(clear);
          
          signup =new JButton("ÜYE OL");//sign in
          signup.setBounds(300,350,230,30);//430la az yana aldı
          signup.setBackground(Color.black);//buton reng
          signup.setForeground(Color.white);//buton yazı reng
          signup.addActionListener(this);
          add(signup);
          
          getContentPane().setBackground(Color.GRAY);//arkafon
          
          setSize(800,480);//ekran boyutu
          setVisible(true);//Frame'in gösterilmesini sağlar
          setLocation(350,200);//ekranın köşelerine olan uzaklığı belirler
      }
    
      public void actionPerformed(ActionEvent ae){
          if(ae.getSource()==clear){
              cardTextField.setText("");
              pinTextField.setText("");
          }else if(ae.getSource()==login){
              Conn conn=new Conn();
              String cardnumber=cardTextField.getText();
              String pinnumber =pinTextField.getText();
              String query ="select*from login where cardnumber='"+cardnumber+"'and pin='"+pinnumber+"'";
              try{
                  ResultSet rs=conn.s.executeQuery(query);
                  if(rs.next()){
                      setVisible(false);
                      new Transactions(pinnumber).setVisible(true);
                  }else{
                      JOptionPane.showMessageDialog(null, "Yanlış Kart Numarası veya Şifre");
                  }
              }catch(Exception e){
                  System.out.println(e);
              }
              
              
          }else if(ae.getSource()==signup){
              setVisible(false);
              new SignupOne().setVisible(true);
          }
      }
    
    public static void main(String args[] ){
      
        new Login();
    }
}
