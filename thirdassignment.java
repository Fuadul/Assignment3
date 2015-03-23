import javax.swing.JOptionPane;
public class thirdassignment {
public enum AccountType {Admin, Student, Staff}
public static void main(String[] args) {
AccountType[] choices = { AccountType.Admin, AccountType.Student, AccountType.Staff};
AccountType input = (AccountType) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[0]);
String inuser, inpw;
int limit = 3,trial=0;
inuser = JOptionPane.showInputDialog("Enter username: ");
if (!inuser.equals("fuad")){
trial = trial + 1;
while(!inuser.equals("fuad") && trial<limit){
JOptionPane.showMessageDialog(null,"Invalid Username");
inuser = JOptionPane.showInputDialog("Enter username: ");
if(!inuser.equals("fuad")){
trial++;
}
else{
trial = trial + 0;
}
}
}
if (trial<limit){
inpw = JOptionPane.showInputDialog("Enter password: ");
trial = trial + 1;
while(!inpw.equals("123") && trial<limit){
JOptionPane.showMessageDialog(null,"Invalid password");
inpw = JOptionPane.showInputDialog("Enter password: ");
if(!inpw.equals("123")){
trial++;
}
else{
trial = trial+0;	
}
}			
}		
if(trial<limit){
switch (input){
case Admin:
JOptionPane.showMessageDialog(null,"Welcome Admin! You can update and read file");
break;
case Student:
JOptionPane.showMessageDialog(null,"Welcome Student! You can only read file.");
break;
case Staff:
JOptionPane.showMessageDialog(null,"Welcome Staff! You can update, read, add, delete file.");
break;
default:
JOptionPane.showMessageDialog(null,"Select the right account type.");
}
}
else{
JOptionPane.showMessageDialog(null,"Contact Administrator");
}		
}
}
