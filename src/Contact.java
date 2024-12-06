import java.util.Scanner;

public class Contact {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String state;

    public Contact(String name, String email, String state, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.state = state;
        this.phoneNumber = phoneNumber;
    }

    private int phoneNumber;


    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public static Contact createContact(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter email");
        String email = sc.next();
        System.out.println("Enter State");
        String state = sc.next();
        System.out.println("Enter phone number");
        int phone = sc.nextInt();

        return new Contact(name,email,state,phone);

    }
}

//it is not secured - anything can be accessed outside, have the ability to change outisde the scope, use getter and setters.


//We don't need generic in contact as it is lowest fundamental object- anything which will be created will be based on it, so we can't create object anymore,
//it should be treated as a Struct but since our code requires an interface to work- we need to implement