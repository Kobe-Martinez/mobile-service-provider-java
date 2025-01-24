# Mobile Service Provider Charges Calculator

This Java project calculates the total charges for a mobile service provider based on customer usage and their selected plan. It features a `MobileServiceProvider` class for managing plans and a driver program, `Lab04MobileServiceProvider`, that uses graphical input/output dialogs to interact with users and display the results.


## Table of Contents

- [Features](#features)
- [Usage](#usage)
- [Code Structure](#code-structure)
- [Requirements](#requirements)
- [File Output](#file-output)
- [License](#license)
- [Important Note](#important-note)


## Features

- **MobileServiceProvider Class**: 

  - Encapsulates the customer's package and minutes used
  
  - Provides methods to:

      - Set and retrieve the customer's package and minutes

      - Calculate total charges based on package:

           - Package A: $39.99/month, $0.45/min over 450 minutes

           - Package B: $59.99/month, $0.40/min over 900 minutes

           - Package C: $69.99/month, unlimited minutes
    
- **Driver Program (Lab04MobileServiceProvider)**: 

  - Prompts the user via graphical input dialogs for:

           - Mobile package (A, B, or C)
    
           - Minutes used
    
  - Calculates and displays the total charges using a graphical output dialog
      

## Usage

1. **Compile the files**:
   
   ```bash
   javac MobileServiceProvider.java Lab04MobileServiceProvider.java

2. **Run the program**:
   
   ```bash
   java lab04mobileserviceprovider.Lab04MobileServiceProvider
   
3. **Input the radius**:
   
   - Enter the customer's mobile package (A, B, or C)
     
   - Enter the number of minutes used
   
4. **View results**:
   
   - The program will display the total charges in a graphical output dialog
     

## Code Structure

- **MobileServiceProvider.java**:
  
  - Defines the `Circle` class with fields, methods, and logic for calculating charges
    
- **Lab04MobileServiceProvider.java**:
  
   - A driver program that:
     
           - Collects user input via `JOptionPane`

           - Instantiates the `MobileServiceProvider` class

           - Displays the calculated charges using graphical dialogs
     

## Requirements

- Java Development Kit (JDK) 8 or later
  
- An IDE or terminal that supports running Java programs


## File Output

- **User Interaction**:

  - Input dialogs prompt for the package and minutes used

  - Output dialog displays the total charges based on the input

- **Example Output**:
  
    ```bash
    Enter Customers Mobile package (A, B, C): A
    Enter the number of minutes the customer used their phone: 500
    Total Charges: $62.49
 

## License

This project is licensed under the MIT License. See the LICENSE file for details.


## Important Note

This project was created as part of a learning exercise and demonstrates object-oriented programming concepts and graphical user interface interaction using `JOptionPane`
