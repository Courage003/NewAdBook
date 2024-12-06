public class AddressBookNode <T>  {
    T data;
    AddressBookNode<T> next;

    @Override
    public String toString() {
        return "AddressBookNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    public AddressBookNode<T> createNode(T c1){
        AddressBookNode<T> t1=new AddressBookNode<>();
        t1.data =c1;
        t1.next=null;
        return t1;


    }
}
