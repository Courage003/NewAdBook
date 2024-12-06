public class AddressBook<T> {
    AddressBookNode<T> head=null;
    AddressBookNode<T> current =null;

    public void addToAdBook(T a){
        AddressBookNode<T> a1= new AddressBookNode<>();

        if(head==null){
            head= a1.createNode(a);


        }

        else{
            current=head;
            while(current.next != null){
                current=current.next;
            }
            current.next=a1.createNode(a);

        }
    }

    public void display(){
        if(head==null){
            System.out.println("AddressBook is empty");
        }
        else{
            current=head;
            while(current!=null){
                System.out.println(current);
                current=current.next;
            }
        }
    }
}
