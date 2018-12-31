import java.util.*;

class HashSet_Practice
{
    public static void main(String...strings) {
        
        // normally adding elements
        HashSet<Integer> obj1 = new HashSet<>();
        System.out.println("obj1 Is Empty ? " + obj1.isEmpty()); //isEmpty()
        obj1.add(0);
        obj1.add(1);
        obj1.add(2);
        obj1.add(3);
        obj1.add(4);
        obj1.add(5);
        obj1.add(6);
        obj1.add(7);
        obj1.add(8);
        obj1.add(9);
        obj1.add(null); //adding null to set
        obj1.add(null); //trying to add duplicate values which is unfortunately not possible
        System.out.println("obj1 now has " + obj1.size() + " elements which are :-");
        System.out.println(obj1);

        System.out.println("Do obj1 contains 5 ?" + obj1.contains(5));  //contains()
        System.out.println("Do obj1 contains 50 ?" + obj1.contains(50)); //contains()


        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(5);
        arr1.add(10);
        arr1.add(10); //trying to add duplicate values in an arraylist which is fortunately possible
        arr1.add(15);
        arr1.add(20);
        arr1.add(25);
        arr1.add(30);
        arr1.add(null);  //adding null to arraylist
        System.out.println("The elements of a Array List arr1 are : " + arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(0);
        arr2.add(10);
        arr2.add(40);
        arr2.add(15);
        arr2.add(21);
        arr2.add(18);
        System.out.println("The elements of a Array List arr2 are : " + arr2);
        // Adding elements from different collection objects
        Set<Integer> obj2 = new HashSet<>(arr1);  
        obj2.addAll(arr2); 

        System.out.println("The elements of Linked Lists arr1 and arr2 when added to HashSet obj2 are : "+obj2);


        //removing elements :- null , 0 , 1 and 8 from the obj1;

        System.out.println("removing elements :- null , 0 , 1 and 8 from the obj1");
        System.out.println(" null deleted ? "+ obj1.remove(null));
        System.out.println(" 0 deleted ? "+  obj1.remove(0));
        System.out.println(" 1 deleted ? "+  obj1.remove(1));
        System.out.println(" 8 deleted ? "+  obj1.remove(8));
        
        System.out.println("Lets try to delete an element that is not present in list (50) : ");
        System.out.println(" 50 deleted ? " + obj1.remove(50));

        System.out.println("obj1 now has " + obj1.size() + " elements which are :-");
        System.out.println(obj1);

        //removeAll();
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(0);
        arr3.add(4);
        arr3.add(9);
        arr3.add(1);

        System.out.println("arr3 contains 0 4 9 and 1");
        System.out.println("removing arr3 from obj1");
        obj1.removeAll(arr3);
        System.out.println("arr3 elements : " + obj1);

        //removeIf()
        System.out.println("Removing Elements greater than 3 from obj1");
        obj1.removeIf(num -> num > 3);
        System.out.println("obj1 now contains : " + obj1);

        //clear();
        System.out.println("Removing ALL Elements now : ");
        obj1.clear();
        System.out.println("obj1 : " + obj1);


        //time to iterate over elements in obj2
        System.out.println("obj2 has elements : " + obj2);

        System.out.println("Iterate over a HashSet using Java 8 forEach and lambda expression.");
        obj2.forEach(value -> System.out.print(value + " "));

        System.out.println("\nIterate over a HashSet using iterator()");
        Iterator<Integer> iter = obj2.iterator();

        while(iter.hasNext())
        {
            System.out.print(iter.next() + " ");
        }

        System.out.println("\nIterate over a HashSet using iterator() and Java 8 forEachRemaining() method");
        iter = obj2.iterator();
        iter.forEachRemaining(value -> System.out.print(value +" "));

        System.out.println("\nIterate over a HashSet using simple for-each loop");
        for(Integer value : obj2)
        {
            System.out.print(value + " ");
        }
    }
}