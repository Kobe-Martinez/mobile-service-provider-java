package lab04mobileserviceprovider;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *              NOTHING IN THIS FILE NEEDS TO CHANGE
 * 
 *              YOU NEED TO MAKE CHANGES TO THE MobileServiceProvider Class
 * 
 * Driver for MobileServiceProvider
 * Date Written    6/18/2014 - using InternetServiceProvider as template
 * Date Modified 6/18/2015 updated for NetBeans
 * @author Kobe L. Martinez
 * 17 April 2021
 */
public class Lab04MobileServiceProvider {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String customersPackageInput;
        char customersPackage;
        int minutesUsed;
        DecimalFormat formatter = new DecimalFormat("#,##0.00");

        MobileServiceProvider customersMobilePlan;

        customersPackageInput = JOptionPane.showInputDialog(
                "Enter Customers Mobile package (A,B,C): ");

        // check to see at least a character was entered
        if (customersPackageInput.length() > 0)
        {
            customersPackage = customersPackageInput.charAt(0);

            minutesUsed = Integer.parseInt(JOptionPane.showInputDialog(
                "Enter the number of minutes the customer used their phone: "));

            // instantiate the object
            customersMobilePlan = new MobileServiceProvider(customersPackage,
                    minutesUsed);
 
            JOptionPane.showMessageDialog(null,"Total Charges: " +
                    formatter.format(customersMobilePlan.totalCharges()));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No Package entered");             
        }
        System.exit(0); // neeed to close JOptionPane thread
    }
    
}
