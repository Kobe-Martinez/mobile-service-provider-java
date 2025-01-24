package lab04mobileserviceprovider;
/**
  * THE ONLY THING YOU NEED TO CHANGE IS THE totalCharges() METHOD AT THE BOTTOM
  * 
  * MobileServiceProvider class for Lab 4   
  * Date Written  6/18/2014 (using InternetServiceProvider as template)
  * Date Modified 6/18/2015 - removed "logic" for totalCharges
  *                         - updated for NetBeans
  * 
  * @author Kobe L. Martinez
  * 17 April 2021
*/

public class MobileServiceProvider
{
    private char customerPackage;
    private int numberOfMinutesUsed;

    /**
      Constructor
      @param newCustomerPackage the letter for the package
      @param newNumberOfMinutesUsed the number of Minutes used.

    */
    public MobileServiceProvider(char newCustomerPackage,
                                 int newNumberOfMinutesUsed)
    {
        setCustomerPackage(newCustomerPackage);
        numberOfMinutesUsed = newNumberOfMinutesUsed;
    }

    /**
      The setCustomerPackage method stores a value in the customerPackage
      field for the MobileServiceProvider object.
      @param newCustomerPackage the letter for the package
    */
    public void setCustomerPackage(char newCustomerPackage)
    {
        switch (newCustomerPackage)
        {
            case 'a': case 'A':
            case 'b': case 'B':
            case 'c': case 'C':
                customerPackage = newCustomerPackage;
                break;
            default:
                customerPackage = 'A';
        }
    }

    /**
      The setNumberOfMinutesUsed method stores a value in the numberOfMinutesUsed
      field for the MobileServiceProvider object.
      @param newNumberOfMinutesUsed usage in Minutes
    */
    public void setNumberOfMinutesUsed(int newNumberOfMinutesUsed)
    {
        numberOfMinutesUsed = newNumberOfMinutesUsed;
    }

    /**
       The getCustomerPackage method returns the objects's customer package
       @return value in customerPackage
    */
    public char getCustomerPackage()
    {
        return customerPackage;
    }

    /**
       The getNumberOfMinutesUsed method returns the objects's numberOfMinutesUsed
       @return value in numberOfMinutesUsed
    */
    public int getNumberOfMinutesUsed()
    {
        return numberOfMinutesUsed;
    }

    /**
       The totalCharges method returns the total charges
       based on the numberOfMinutesUsed and the customerPackage
       @return dollar amount of total charges
    */
    public double totalCharges()
    {
        double chargesToReturn = 0;
        
        // replace the next statement with an else-if chain to 
        // calculate chargesToReturn based on the character customerPackage
        // for details see: Mobile Service Provider
        if((customerPackage == 'A') || (customerPackage == 'a'))
        {
         if(numberOfMinutesUsed <= 450)
         {
            chargesToReturn = 39.99;
         }
                    
         else if(numberOfMinutesUsed > 450) 
         { 
            chargesToReturn = 39.99 + (0.45*(numberOfMinutesUsed-450));  
         }
        } 
        
        else if((customerPackage == 'B') || (customerPackage == 'b'))
        {
         if(numberOfMinutesUsed <= 900)
         {
            chargesToReturn = 59.99;
         }
                    
         else if(numberOfMinutesUsed > 900) 
         { 
            chargesToReturn = 59.99 + (0.40*(numberOfMinutesUsed-900));  
         }
        } 
        
        else if((customerPackage == 'C') || (customerPackage == 'c'))
        {
          chargesToReturn = 69.99;
        }       
                
        return chargesToReturn;

    }
}