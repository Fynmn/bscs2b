import java.util.ArrayList;
import java.util.function.IntFunction;

public class AddressBookEntry extends ArrayList {
    //Attributes//Member variables
    private String name;
    private String address;
    private String telephoneNumber;
    private String emailAddress;

//    public AddressBookEntry(){
//    }

    @Override
    public String toString() {
        return ("StudentName: "+this.getName()+
                ", Address: "+ this.getAddress() +
                ", Tel No: "+ this.getTelephoneNumber() +
                ", Email : " + this.getEmailAddress());
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public Object[] toArray(IntFunction generator) {
        return new Object[0];
    }

}
