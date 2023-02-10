package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField pan,tc;
    JButton next;
    JRadioButton eyes,sno,syes,eno;
    JComboBox religion,category,occupation,education,income;
    String formno;

     SignupTwo(String formno) {
         this.formno=formno;
         
         setLayout(null);
         
         setTitle("YENİ HESAP AÇMA SAYFASI-2");
         
         
         JLabel additionDetails=new JLabel("SAYFA 2: Ek Detaylar" );
         additionDetails.setFont(new Font("Raleway",Font.BOLD,22));
         additionDetails.setBounds(290,80,300,30);
         add(additionDetails);
         
         //İSİM
         JLabel name=new JLabel("Din:");
         name.setFont(new Font("Raleway",Font.BOLD,20));
         name.setBounds(100,140,100,30);
         add(name);
         
         String valReligion[]={"İslam","Hristiyanlık","Hinduizm","Budizm","Diğer"};
          religion =new JComboBox(valReligion);
         religion.setBounds(300,140,400,30);
         religion.setBackground(Color.WHITE);
         add(religion);
         
         
         JLabel fname=new JLabel("Katagori:");
         fname.setFont(new Font("Raleway",Font.BOLD,20));
         fname.setBounds(100,190,100,30);
         add(fname);
         
         String valCategory[]={"Banka Kartı","Kredi Kartı","Hepsi"};
          category =new JComboBox(valCategory);
         category.setBounds(300,190,400,30);
         category.setBackground(Color.WHITE);
         add(category);
         
         JLabel dob=new JLabel("Gelir:");
         dob.setFont(new Font("Raleway",Font.BOLD,20));
         dob.setBounds(100,240,150,30);
         add(dob);
         
         String incomeCategory[]={"<4500","<10000","10000 üstü"};
          income =new JComboBox(incomeCategory);
         income.setBounds(300,240,400,30);
         income.setBackground(Color.WHITE);
         add(income);
        
         
          JLabel gender=new JLabel("Eğitim");
         gender.setFont(new Font("Raleway",Font.BOLD,20));
         gender.setBounds(100,298,100,30);
         add(gender);
         
   
         JLabel email=new JLabel("Vasıf:");
         email.setFont(new Font("Raleway",Font.BOLD,20));
         email.setBounds(100,320,150,30);
         add(email);
         
         String educationValues[]={"-","ilkokul","ortaokul","lise","üniversite"};
          education =new JComboBox(educationValues);
         education.setBounds(300,315,400,30);
         education.setBackground(Color.WHITE);
         add(education);
         
         
         JLabel marital=new JLabel("Meslek:");
         marital.setFont(new Font("Raleway",Font.BOLD,20));
         marital.setBounds(100,390,150,30);
         add(marital);
         
         
         String occupationalValues[]={"-","maaşlı","emekli","serbest meslek","öğrenci"};
          occupation =new JComboBox(occupationalValues);
         occupation.setBounds(300,390,400,30);
         occupation.setBackground(Color.WHITE);
         add(occupation);
         
         
         JLabel address=new JLabel("Seri numarası:");
         address.setFont(new Font("Raleway",Font.BOLD,20));
         address.setBounds(100,440,150,30);
         add(address);
         
         pan =new JTextField();
         pan.setFont(new Font("Raleway",Font.BOLD,14));
         pan.setBounds(300,440,400,30);
         add(pan);
         
         JLabel city=new JLabel("TC numara:");
         city.setFont(new Font("Raleway",Font.BOLD,20));
         city.setBounds(100,490,150,30);
         add(city);
         
         tc =new JTextField();
         tc.setFont(new Font("Raleway",Font.BOLD,14));
         tc.setBounds(300,490,400,30);
         add(tc);
         
         JLabel state=new JLabel("Yaşlı:");
         state.setFont(new Font("Raleway",Font.BOLD,20));
         state.setBounds(100,540,100,30);
         add(state);
         
         syes=new JRadioButton("Evet");
         syes.setBounds(300,540,100,30);
         syes.setBackground(Color.WHITE);
         add(syes);
         
         sno=new JRadioButton("Hayır");
         sno.setBounds(450,540,100,30);
         sno.setBackground(Color.WHITE);
         add(sno);
         
         JLabel pincode=new JLabel("Mevcut Hesap:");
         pincode.setFont(new Font("Raleway",Font.BOLD,20));
         pincode.setBounds(100,590,150,30);
         add(pincode);
         
         eyes=new JRadioButton("Evet");
         eyes.setBounds(300,590,100,30);
         eyes.setBackground(Color.WHITE);
         add(eyes);
         
         eno=new JRadioButton("Hayır");
         eno.setBounds(450,590,100,30);
         eno.setBackground(Color.WHITE);
         add(eno);
         
         ButtonGroup emaritalgroup=new ButtonGroup();
         emaritalgroup.add(syes);
         emaritalgroup.add(sno);
         ButtonGroup smaritalgroup=new ButtonGroup();
         smaritalgroup.add(eyes);
         smaritalgroup.add(eno);
         
                  
         next =new JButton("Next");
         next.setBackground(Color.BLACK);
         next.setForeground(Color.WHITE);
         next.setFont(new Font("Raleway",Font.BOLD,14));
         next.setBounds(620,660,80,30);
         next.addActionListener(this);
         add(next);
         
         getContentPane().setBackground(Color.WHITE);
         
         setSize(850,800);
         setLocation(350,10);
         setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){//şu event varya şu event
         
         String sreligion=(String)religion.getSelectedItem();
         String scategory=(String)category.getSelectedItem();
         String sincome=(String)income.getSelectedItem();
         String seducation=(String)education.getSelectedItem();
         String soccupation=(String)occupation.getSelectedItem();
         String seniorcitizen=null;
         if(syes.isSelected()){
             seniorcitizen="Evet";
         }else if(sno.isSelected()){
             seniorcitizen="Hayır";
         }
         
         String exisitingaccount=null;
         if(eyes.isSelected()){
             exisitingaccount="Evet";
         }else if(eno.isSelected()){
             exisitingaccount="Hayır"; 
         }
         
         String span=pan.getText();
         String stc=tc.getText();
         
         try{
                 Conn c=new Conn();
                 String query="insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+stc+"','"+seniorcitizen+"','"+exisitingaccount+"')";
                 c.s.executeUpdate(query);
                 
             //Singup3 Object
             setVisible(false);//formno kızdı diye
             new SignupThree(formno).setVisible(true);
         }catch(Exception e){
             System.out.println(e);
         }
     }
    
    public static void main(String args[]){
        new SignupTwo("");
    }

  

   

   
}

