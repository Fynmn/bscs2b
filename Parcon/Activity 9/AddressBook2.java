public class AddressBook2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("How many books do you want to create? ");
        int howManyBooks;
        int howManyEntries;

        Book[] library = new Book[0];


        while(true){
            howManyBooks = s.nextInt();
            if (howManyBooks>0){
                library = new Book[howManyBooks];                   
                break;
            }
            else System.out.print("You must create at least 1 book.");
            }



        for (int i=0;i<library.length;i++){


            library[i] = new Book(); //Fixed reference to null because each book in the library had not been initialized yet.

            while(true){
                System.out.print("How many entries in book "+i+"? ");
                howManyEntries = s.nextInt();
                if (howManyEntries>0) {
                    library[i].initEntries(howManyEntries);                 
                    break;
                }
                else System.out.println("You must create at least 1 Entry.");
                }


        }
        boolean done = false;
        int selectedBook = 0;
        int selection;
        while (done==false){
            System.out.println("Book "+selectedBook+" is currently selected.");

            for (int i = 0;i<library[selectedBook].getEntries();i++){
                System.out.println("===========Entry "+i+" ===========");
                library[selectedBook].contents[i].readEntry(); //Accessing the array of entries INSIDE the array of books/the library
                System.out.println("================================");
            }


            System.out.println("Select an option!");
            System.out.println("1. Add an entry");
            System.out.println("2. Remove an entry");
            System.out.println("3. Edit an entry");
            System.out.println("4. Sort all entries in this book");
            System.out.println("5. Select another book");
            System.out.println("6. Move entry across books");
            System.out.println("7. Exit the menu");
            System.out.print("> ");
            selection = s.nextInt();
            String name, number, address, email;
            switch(selection){
            case 1: 
                System.out.print("Full name? ");
                name = s.next();
                System.out.print("cp number? ");
                number = s.next();
                System.out.print("Address? ");
                address = s.next();
                System.out.print("Email? ");
                email = s.next();
                library[selectedBook].add(name, number, address, email);
                break;
            case 2: 
                System.out.print("Remove which entry? ");
                int entry = s.nextInt();
                library[selectedBook].remove(entry);
                break;
            case 3:
                System.out.print("Edit which entry?");
                int whichEntry = s.nextInt();
                System.out.print("Full name? ");
                name = s.next();
                System.out.print("cp number? ");
                number = s.next();
                System.out.print("Address? ");
                address = s.next();
                System.out.print("Email? ");
                email = s.next();
                library[selectedBook].edit(name, number, address, email, whichEntry);
                break;
            case 4: 
                System.out.println("Sort alphabetically by which field?");
                System.out.println("1. Sort by fullname");
                System.out.println("2. Sort by cp number");
                System.out.println("3. Sort by address");
                System.out.println("4. Sort by email");
                library[selectedBook].sort(s.nextInt());
                break;
            case 5: 
                System.out.print("Select which book?");
                selectedBook = s.nextInt();
                break;
            case 6:
                System.out.print("Move which entry? ");
                int entryNo = s.nextInt();
                Book.Entry entryToMove = library[selectedBook].contents[entryNo];
                library[selectedBook].remove(entryNo);
                System.out.print("To which book? ");
                int whichBook = s.nextInt();
                library[whichBook].addFromCopy(entryToMove);
                break;
            case 7:
                done = true;
                break;
            default:
                System.out.print("Please choose a valid menu number");


            }

        }
    }
}
