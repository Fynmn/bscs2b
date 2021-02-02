import java.util.ArrayList;
import java.util.Scanner;

class AddressBook {
    //instantiating the variables for the colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static Boolean x = true; //variable for the while loop

    public static Scanner scanner = new Scanner(System.in); //creating a Scanner object

    public String name, address, telephoneNumber, emailAddress; //variables for the attributes

    private ArrayList<AddressBookEntry> entryList = new ArrayList<AddressBookEntry>(); //ArrayList of all entries
    AddressBookEntry entry1 = new AddressBookEntry(); //creating an object to store the pre-defined values of the attributes in main
    AddressBookEntry entry2 = new AddressBookEntry(); //creating an object to store the pre-defined values of the attributes in main

    public AddressBook() {
        entryList = new ArrayList<>();
    }

    //method for adding an entry
    public void addEntry(){
        AddressBookEntry newEntry = new AddressBookEntry(); //creating an object of class AddressBookEntry to store the values for the attributes
        System.out.println("\n==============Add Entry==============");
        System.out.print("Enter Name$ ");
        name = scanner.nextLine();
        System.out.print("Enter Address$ ");
        address = scanner.nextLine();
        System.out.print("Enter Telephone Number$ ");
        telephoneNumber = scanner.nextLine();
        System.out.print("Enter Email Address$ ");
        emailAddress = scanner.nextLine();

        newEntry.setName(name);
        newEntry.setAddress(address);
        newEntry.setTelephoneNumber(telephoneNumber);
        newEntry.setEmailAddress(emailAddress);
        entryList.add(newEntry);

        System.out.println(ANSI_GREEN + "Entry successfully added!" + ANSI_RESET); System.out.println("\n");
    }
    //method for deleting an entry
    public void deleteEntry(){
        int i = 1;
        System.out.println("\n====================Delete Entry====================");
        System.out.println(ANSI_PURPLE+ "Here are your choices: ");
        for (AddressBookEntry element : entryList){
            System.out.print("\n" + i + " ");
            System.out.print(element);
            i++;
        }
        System.out.println("\n" + ANSI_RESET);
        System.out.print("Enter Entry No. to Delete$ ");
        String entrynum = scanner.nextLine();
        int entryNum = Integer.parseInt(entrynum);
        if(entryNum <= entryList.size() && entryNum != 0){
            entryList.remove(entryNum-1);
            System.out.println(ANSI_GREEN + "Entry " + entrynum + " was successfully deleted!" + ANSI_RESET + "\n");
        } else{
            System.out.println(ANSI_RED + "Invalid Entry. Please try again." + ANSI_RESET);
            deleteEntry();
        }

    }
    //method for updating an entry
    public void updateEntry(){
        int i = 1;
        System.out.println("\n====================Update an Entry====================");
        System.out.println(ANSI_PURPLE+ "Here are your choices: ");
        for (AddressBookEntry element : entryList){
            System.out.print("\n" + i + " ");
            System.out.print(element);
            i++;
        }
        System.out.println("\n" + ANSI_RESET);
        System.out.print("Enter Entry No. to Update$ ");
        String entrynum = scanner.nextLine();
        int entryNum = Integer.parseInt(entrynum);
        if(entryNum <= entryList.size() && entryNum != 0){
            AddressBookEntry newEntry = new AddressBookEntry();
            System.out.print("Enter New Name$ ");
            name = scanner.nextLine();
            System.out.print("Enter New Address$ ");
            address = scanner.nextLine();
            System.out.print("Enter New Telephone Number$ ");
            telephoneNumber = scanner.nextLine();
            System.out.print("Enter New Email Address$ ");
            emailAddress = scanner.nextLine();

            newEntry.setName(name);
            newEntry.setAddress(address);
            newEntry.setTelephoneNumber(telephoneNumber);
            newEntry.setEmailAddress(emailAddress);
            entryList.set(entryNum-1, newEntry);
            System.out.println(ANSI_GREEN + "Entry " + entrynum + " was successfully updated!" + ANSI_RESET + "\n");
        } else{
            System.out.println(ANSI_RED + "Invalid Entry. Please try again." + ANSI_RESET);
            updateEntry();
        }

    }
    //method for viewing all entries
    public void viewAllEntries(){
        AddressBook ab = new AddressBook();
        System.out.println("\n==================================================================View all Entries=================================================================");
        for(AddressBookEntry element: entryList){
            System.out.println(element);
        }
        System.out.println("\n===================================================================================================================================================");
        System.out.println("\n");
    }
    //method for exiting the program
    public static void exit(){
        x = false;
    }

    //main method
    public static void main(String[] args) {

        AddressBook ab = new AddressBook(); //creating an object of AddressBook Class
        //setting default entries(1)
        ab.entry1.setName("Natalie Jane Pacificar");
        ab.entry1.setAddress("Don T. Lutero West, Janiuay, Iloilo");
        ab.entry1.setTelephoneNumber("09123456789");
        ab.entry1.setEmailAddress("nataliejanepacificar@yahoo.com");
        ab.entryList.add(ab.entry1);
        //setting default entries(2)
        ab.entry2.setName("Justin Asher");
        ab.entry2.setAddress("Brgy. Canhing, Janiuay, Iloilo");
        ab.entry2.setTelephoneNumber("(033)320-34-31");
        ab.entry2.setEmailAddress("justinasher@yahoo.com");
        ab.entryList.add(ab.entry2);

        //menu
        while (x){
            System.out.println(ANSI_YELLOW + "***************************************");
            System.out.println("*      Finals Output in CIT207      *");
            System.out.println("*  Written by Natalie Jane Pacificar  *");
            System.out.println("***************************************" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "\n=======Options========");
            System.out.println("1. Add Entry" +
                    "\n2. Delete Entry" +
                    "\n3. View All Elements" +
                    "\n4. Update an Entry" +
                    "\n0. Exit" + ANSI_RESET);

            System.out.println("\nSelect an Option");
            System.out.print("$ ");
            String choice = scanner.nextLine();
            int action = Integer.parseInt(choice);
            switch (action){
                case 0:
                    exit();
                    break;
                case 1:
                    ab.addEntry();
                    break;
                case 2:
                    ab.deleteEntry();
                    break;
                case 3:
                    ab.viewAllEntries();
                    break;
                case 4:
                    ab.updateEntry();
                    break;
                default:
                    System.out.println("\n" + "\u001B[31m" + "Please try a valid input. :)");
                    System.out.println("\u001B[0m");
                    break;

            }
        }
    }
}
