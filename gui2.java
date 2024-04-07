import javax.swing.*;
public class gui2
{
    public gui2()
    {
        
        
        JFrame frame1 = new JFrame();
        
        JLabel register = new JLabel("Student's Registration Form");
        
        JLabel studID = new JLabel("Student ID:", JLabel.RIGHT);
        JLabel schoolYear = new JLabel("School Year:");
        
        JLabel fname = new JLabel("First Name:", JLabel.RIGHT);
        JLabel lname = new JLabel("Last Name:");
        JLabel mname = new JLabel("Middle Name:");
        
        JLabel address = new JLabel("Address:", JLabel.RIGHT);
        JLabel DOB = new JLabel("Date of Birth:");
        JLabel POB = new JLabel("Place of Birth:");
        
        JLabel age = new JLabel("Age:", JLabel.RIGHT);
        JLabel gender = new JLabel("Gender:");
        JLabel status = new JLabel("Status:");
        
        JLabel year = new JLabel("Year:", JLabel.RIGHT);
        JLabel guardian = new JLabel("Guardian:");
        JLabel relation = new JLabel("Relation:");
        
        JLabel address2 = new JLabel("Address:", JLabel.RIGHT);
        JLabel contact = new JLabel("Contact #:");
        //END OF LABELS
        
        
        //OTHER STUFF
        JTextField studTxt = new JTextField();
        //insert school year here
        
        JTextField fnameTxt = new JTextField();
        JTextField lnameTxt = new JTextField();
        JTextField mnameTxt = new JTextField();
        
        JTextArea addressArea = new JTextArea();
        JTextArea POBArea = new JTextArea();
        
        JTextField ageTxt = new JTextField();
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        String stat[] = {"Single", "Married"};
        JComboBox statDropdown = new JComboBox(stat);
        
        String yearArr[] = {"1st", "2nd", "3rd"};
        JComboBox yearDropdown = new JComboBox(yearArr);
        JTextField guardianTxt = new JTextField();
        JTextField relationTxt = new JTextField();
        
        JTextArea address2Area = new JTextArea();
        JTextField contactTxt = new JTextField();
        //END OF OTHER STUFF
        
        
        //BUTTONNNSSSSSS
        JButton leftEnd = new JButton("|<");
        JButton left = new JButton("<<");
        JButton right = new JButton(">>");
        JButton rightEnd = new JButton(">|");
        JLabel page = new JLabel("1  OF  1");
        
        JButton newButton = new JButton("New");
        JButton save = new JButton("Save");
        
        
        //LABEL dimensions
        studID.setBounds(20, 50, 70, 20);
        schoolYear.setBounds(540,50,100,20);
        
        fname.setBounds(20, 80, 70, 20);
        lname.setBounds(280, 80, 70, 20);
        mname.setBounds(540, 80, 100, 20); 
        
        address.setBounds(20, 120, 70, 20);
        DOB.setBounds(280, 120, 80, 20);
        POB.setBounds(540, 120, 100, 20);
        
        age.setBounds(20, 160, 70, 20);
        gender.setBounds(280, 160, 70, 20);
        status.setBounds(540, 160, 70, 20);
        
        year.setBounds(20, 200, 70, 20);
        guardian.setBounds(280, 200, 70, 20);
        relation.setBounds(540, 200, 70, 20);
        
        address2.setBounds(20, 240, 70, 20);
        contact.setBounds(280, 240, 70, 20);
        //END OF LABEL DIMENSIONS
        
        
        //OTHER STUFF DIMENSIONS
        studTxt.setBounds(100,50, 100, 25);
        
        fnameTxt.setBounds(100,80, 100, 25);
        lnameTxt.setBounds(360,80, 100, 25);
        mnameTxt.setBounds(620,80, 100, 25);
        
        addressArea.setBounds(100, 120, 140, 35);
        POBArea.setBounds(620, 120, 140, 35);
        
        ageTxt.setBounds(100, 160, 50, 25);
        male.setBounds(340, 160, 60, 20);
        female.setBounds(410, 160, 100, 20);
        statDropdown.setBounds(620, 160, 100,20);
        
        yearDropdown.setBounds(100, 200, 50, 20);
        guardianTxt.setBounds(340, 200, 100, 25);
        relationTxt.setBounds(620, 200, 100, 25);
        
        address2Area.setBounds(100, 240, 140, 35);
        contactTxt.setBounds(500, 240, 140, 25);
        //END OF OTHER STUFF DIMENSIONS
        
        
        //BUTTON DIMENSIONS
        leftEnd.setBounds(20, 300, 50 , 25);
        left.setBounds(80, 300, 50, 25);
        right.setBounds(140, 300, 50, 25);
        rightEnd.setBounds(200, 300, 50, 25);
        page.setBounds(260, 300, 100, 25);
        
        newButton.setBounds(540, 300, 80, 35);
        save.setBounds(630, 300, 80, 35);
        
        //ADDING THE LABELS
        frame1.add(studID);
        frame1.add(schoolYear);
        
        frame1.add(fname);
        frame1.add(lname);
        frame1.add(mname);
        
        frame1.add(address);
        frame1.add(DOB);
        frame1.add(POB);
        
        frame1.add(age);
        frame1.add(gender);
        frame1.add(status);
        
        frame1.add(year);
        frame1.add(guardian);
        frame1.add(relation);
        
        frame1.add(address2);
        frame1.add(contact);
        
        
        //ADDING THE OTHER STUFF
        frame1.add(studTxt);
        
        frame1.add(fnameTxt);
        frame1.add(lnameTxt);
        frame1.add(mnameTxt);
        
        frame1.add(addressArea);
        frame1.add(POBArea); 
        
        frame1.add(ageTxt);
        frame1.add(male);
        frame1.add(female);
        
        frame1.add(statDropdown);
        
        frame1.add(yearDropdown);
        frame1.add(guardianTxt);
        frame1.add(relationTxt);
        
        frame1.add(address2Area);
        frame1.add(contactTxt);
        
        frame1.add(leftEnd);
        frame1.add(left);
        frame1.add(right);
        frame1.add(rightEnd);
        frame1.add(page);
        
        frame1.add(newButton);
        frame1.add(save);
        
        frame1.setLayout(null);
        frame1.setSize(800, 500);
        frame1.setVisible(true);
        
    }
    
    public static void main(String[] args)
    {
        new gui2();
    }
}