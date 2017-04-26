package leapyear;
import javax.swing.JOptionPane;
public class LeapYear {
    public static void main(String[] args) {
        int del = -1;
        int year;
        boolean isLeapYear;

        while(del < 0){
                String inputYear = JOptionPane.showInputDialog(null, "Please Enter A Year: (Example: 1990)");
                if(inputYear.length() > 0){
                        del++;
                        year = Integer.parseInt(inputYear);
                        isLeapYear = ((year %4 == 0) && (year /100!= 0) || (year % 400 == 0));
                        JOptionPane.showMessageDialog(
                                null,
                                "Is "+ year +" a leap year? \n" + isLeapYear, //Message
                                "Leap Year Calculator", //Title
                                JOptionPane.INFORMATION_MESSAGE //Icon
                        );
                }else{
                        JOptionPane.showMessageDialog(
		null,
		"Please Enter A Valid Year", //Message
		"Leap Year Calculator", //Title
		JOptionPane.WARNING_MESSAGE //Icon
                        );
                }
        }
     }
             
}
