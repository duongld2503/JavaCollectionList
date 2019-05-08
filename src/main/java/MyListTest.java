

public class MyListTest {
    public static void main(String[] args) {

        MyList<Integer> myList = new MyList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));

    }
}
