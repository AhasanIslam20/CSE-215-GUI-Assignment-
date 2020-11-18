package guiassignment;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AllInformation {
    public AllInformation()
    {}
    public static void initComponets()
    {
        JFrame frame = new JFrame();
        JLabel name = new JLabel("Name");
        JTextField name1 = new JTextField();
        JLabel id = new JLabel("ID Number");
        JTextField id1 = new JTextField();
        JLabel uni = new JLabel("University");
        JTextField uni1 = new JTextField();
        JLabel sem = new JLabel("Semester");
        JTextField sem1 = new JTextField();
        JLabel gen = new JLabel("Gender");
        JTextField gen1 = new JTextField();
        JRadioButton male = new JRadioButton("Male");
	JRadioButton female = new JRadioButton("Female");
        JLabel DoB = new JLabel("Date OF Birth");
        JLabel dep = new JLabel("Department");
        String[] dep1 = {"", "Electrical And Comp. Engineering", "Civil & Env. Engineering", "Pharmacy", "Bachelor Of Business Administration","Architechture", "Math & Physics", "Public Health", "Environmental Science" ,"English", "Law"};
        JLabel day = new JLabel("Day");
        JLabel month = new JLabel("Month");
        String[] month1 = {"","January", "February", "March", "April", "May", "June", "July", "August", "Spetember", "October", "November", "December"};
        String day1[]=new String[31];
        for(int i=1;i<=31;i++)
        {
            day1[i-1]=Integer.toString(i); 
        }
        JLabel year = new JLabel("Year");
        String year1[]=new String[70];
        for(int i=1951;i<=2020;i++)
        {
            year1[i-1951]=Integer.toString(i);
        }
        JLabel con = new JLabel("Contact Number");
        JTextField con1= new JTextField();
        
        
        JComboBox combo = new JComboBox(dep1);
        JComboBox combo1 = new JComboBox(day1);
        JComboBox combo2 = new JComboBox(month1);
        JComboBox combo3 = new JComboBox(year1);
        ButtonGroup bg = new ButtonGroup();
        JButton submit = new JButton("Submit");
     
        
        frame.setVisible(true);
        frame.setSize(300, 700);
       
        frame.setTitle("All Information");
        frame.setResizable(false);
        frame.setLayout(null);
         frame.getContentPane().setBackground(Color.BLUE);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             
        name.setBounds(20, 30, 50, 20);
        name1.setBounds(20, 50, 180, 30);
        id.setBounds(20, 100, 120, 20);
        id1.setBounds(20, 120, 180, 30);
        uni.setBounds(20, 170, 80, 20);
        uni1.setBounds(20, 190, 180, 30);
        sem.setBounds(20, 240, 80, 20);
        sem1.setBounds(20, 260, 180, 30);
        gen.setBounds(20, 310, 80, 20);
        male.setBounds(20, 330, 80, 20);
        female.setBounds(20, 350, 80, 20);
        dep.setBounds(20, 380, 80, 20);
        combo.setBounds(20, 400, 240, 20);
        DoB.setBounds(20, 430, 80, 20);
        day.setBounds(20,450,30,20);
        month.setBounds(90, 450, 40, 20);
        year.setBounds(20, 500, 40, 20);
        combo1.setBounds(20, 470, 60, 20);
        combo2.setBounds(70, 470, 100, 20);
        combo3.setBounds(60, 500, 160, 20);
        con.setBounds(20, 530, 100, 20);
        con1.setBounds(20, 550, 180, 30);
        submit.setBounds(50, 600, 200, 30);
        
        
        
        
        frame.add(name);
        frame.add(name1);
        frame.add(id);
        frame.add(id1);
        frame.add(uni);
        frame.add(uni1);
        frame.add(sem);
        frame.add(sem1);
        frame.add(gen);
        bg.add(male);
        bg.add(female);
        frame.add(male);
        frame.add(female);
        frame.add(dep);
        frame.add(combo);
        frame.add(DoB);
        frame.add(day);
        frame.add(combo1);
        frame.add(submit);
        frame.add(month);
        frame.add(combo2);
        frame.add(year);
        frame.add(combo3);
        frame.add(con);
        frame.add(con1);
        
        submit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
               String name = name1.getText();
               String id = id1.getText();
               String uni = uni1.getText();
               String sem = sem1.getText();
               String gen = "Male";
               String con = con1.getText();
               if(female.isSelected()==true)
               {
                   gen="Female";
               }
               String day=(String)combo2.getSelectedItem();
               String month=(String)combo2.getSelectedItem();
               String year=(String)combo3.getSelectedItem();
               JTextField name1 = new JTextField("Name: "+name);
               JTextField id1 = new JTextField("ID: "+id);
               JTextField uni1 = new JTextField("University: "+uni);
               JTextField sem1 = new JTextField("Semester: "+sem);
               JTextField gen1 = new JTextField("Gender: "+gen);
               JTextField DoB = new JTextField("Day: \n"+day + "  Month: \n"+month + "  Year: "+year);
               JLabel DoB1 = new JLabel("Date Of Birth");
               JTextField con1 = new JTextField("Contact Number: "+con);
               
               
               JFrame frame = new JFrame();
               frame.setVisible(true);
               frame.setSize(400, 500);
               frame.setBackground(Color.yellow);
               frame.getContentPane().setBackground(Color.LIGHT_GRAY);
               frame.setTitle("Information Summary");
               frame.setResizable(false);
               frame.setLayout(null);
               frame.setLocationRelativeTo(null);
               frame.setBackground(Color.BLACK);
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
               
               
               name1.setBounds(20, 50, 180, 30);
               name1.setEditable(false);
               name1.setBackground(Color.GREEN);
               id1.setBounds(20, 100, 150, 30);
               id1.setEditable(false);
               id1.setBackground(Color.GREEN);
               frame.add(name1);
               frame.add(id1);
               uni1.setBounds(20, 150, 150, 30);
               uni1.setBackground(Color.GREEN);
               sem1.setBounds(20, 200, 150, 30);
               uni1.setEditable(false);
               sem1.setEditable(false);
               sem1.setBackground(Color.GREEN);
               gen1.setBounds(20, 250, 150, 30);
               gen1.setEditable(false);
               gen1.setBackground(Color.GREEN);
               DoB1.setBounds(20, 300, 250, 30);
               DoB.setBounds(20, 350, 250, 30);
               DoB.setEditable(false);
               DoB.setBackground(Color.GREEN);
               
               con1.setBounds(20, 400, 250, 30);
               con1.setEditable(false);
               con1.setBackground(Color.GREEN);
               
               frame.add(uni1);
               frame.add(sem1);
               frame.add(gen1);
               frame.add(DoB);
               frame.add(DoB1);
               frame.add(con1);
          }
        });
    }
    public static void main(String[] args) {
        initComponets();
    }
}
