package com.jspider.collectionframework.iterable.iterator.collection.list.arraylist;

import java.util.*;

/**
 * <h2>Arraylist Define<h2/>
 * <p>An ArrayList is a resizable array, also referred to as a dynamic array. It automatically
 *  * grows its size to accommodate new elements and shrinks when elements are removed.<p/>
 *
 * <p>Key characteristics of Java ArrayList:</p>
 * <ul>
 *   <li>Internally uses an array to store elements.</li>
 *   <li>Allows retrieval of elements by their index, similar to arrays.</li>
 *   <li>Permits duplicate and null values.</li>
 *   <li>Maintains the insertion order of elements as it is an ordered collection.</li>
 * </ul>
 *
 * <p>Important considerations:</p>
 * <ul>
 *   <li>You cannot create an ArrayList of primitive types (e.g., int, char). Instead, use boxed types
 *       like Integer, Character, Boolean, etc.</li>
 *   <li>ArrayList is not synchronized. If multiple threads modify an ArrayList simultaneously,
 *       the outcome may be non-deterministic. Explicit synchronization is required when
 *       using ArrayList in a multithreaded environment.</li>
 * </ul>
 */


public class _ArrayList {

    /**
     * <h3>Example 0<h3/>
     * <p>new "null" elements to an ArrayList using the add() method.<p/>
     */
    private void Example0(){
        List<Integer> list = new ArrayList<>();
         list.add(null);
        System.out.println("size "+list.size()+" "+list);

    }



    /**
     * <h3>Example 1<h3/>
     * <p>How to create an ArrayList using ArrayList(), Constructor.<p/>
     * <ul>
     * <li>using default constructor ArrayList()<li/>
     * <ul/>
     * <p>new elements to an ArrayList using the add() method.<p/>
     */
    private void Example1(){
        List<String> fruit = new ArrayList<>();
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        System.out.println("size "+fruit.size()+" "+fruit);
    }







    /**
     * <h3>Example 2<h3/>
     * <ul>
     * <li> using constructor ArrayList(int initialCapacity)<li/>
     * <ul/>
     * <p>new elements to an ArrayList using the add() method.<p/>
     */
    private void Example2(){
        List<String> fruit = new ArrayList<>(5);
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("lemon");
        System.out.println("size "+fruit.size()+" "+fruit);
    }






    /**
     * <h3>Example 3<h3/>
     * <ul>
     * <li>using constructor ArrayList(Collection<? extends E> c)<li/>
     * <ul/><p>new elements to an ArrayList using the add() method.<p/>
     */
    private void Example3(){
        // default constructor.
        List<Integer> fiveFirstPrimeNumber = new ArrayList<>();
        fiveFirstPrimeNumber.add(3);
        fiveFirstPrimeNumber.add(5);
        fiveFirstPrimeNumber.add(7);
        fiveFirstPrimeNumber.add(11);
        fiveFirstPrimeNumber.add(13);

        // collection constructor and pass the collection<Integer>
        List<Integer> tenPrimeNumber = new ArrayList<>(fiveFirstPrimeNumber);
        System.out.println("step 1 : "+ tenPrimeNumber);


        // default constructor to add more object in a previous collection
        // to passing new another constructor<Integer>
        List<Integer> nextFivePrimeNumber = new ArrayList<>();
        nextFivePrimeNumber.add(17);
        nextFivePrimeNumber.add(19);
        nextFivePrimeNumber.add(23);
        nextFivePrimeNumber.add(29);
        nextFivePrimeNumber.add(31);

        tenPrimeNumber.addAll(nextFivePrimeNumber);
    }







    /**
     * <h3>Example 4<h3/>
     * <p>Access element from ArrayList<p/>
     * <div>check ArrayList is isEmpty()<div/>
     */
    private void Example4(){
        List<String> list = new ArrayList<>();
        System.out.println("1 "+list.isEmpty()); // return true
        list.add("element 1");
        System.out.println("2 "+list.isEmpty()); // return false

        list.add("C");
        list.add("C++");
        list.add("java");

        System.out.println("3 "+list.size());
        System.out.println("4 "+list.get(1));
        System.out.println("5 "+list.set(2,"HTML"));
        System.out.println("6 "+list.get(2));
        System.out.println("all "+list);
//        System.out.println(list.removeFirst());
//        System.out.println(list.remove("java"));
//        System.out.println(list.remove(2));
//        System.out.println(list.removeLast());
//        System.out.println(list.reversed());
        list.clear();
        System.out.println(list);
    }






    /**
     * <h3>Example 5<h3/>
     * <p>Iteration to assesses ArrayList() element<p/>
     * <p>using for enhanced loop<p/>
     */
    private void Example5(){
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");
        list.add("Orange");
        list.add("lemon");
        System.out.println(list);
        for (String element : list)
            System.out.println(element);
    }






    /**
     * <h1>Example 6<h1/>
     * <p>Iteration to assesses ArrayList() element<p/>
     * <p>using for loop<p/>
     */
    private void Example6(){
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");
        list.add("Orange");
        list.add("lemon");
        System.out.println(list);
        for (int i = 0; i <list.size() ; i++) {
            String element = list.get(i);
            System.out.println(element);
        }
    }







    /**
     * <h1>Example 7<h1/>
     * Arrays class contains various methods for manipulating arrays (such as
     *  sorting and searching). This class also contains a static factory
     *  that allows arrays to be viewed as lists.
     * <p>Using this Arrays Class method for performed operation on Arraylist()<p/>
     */
    private void Example7(){
        try {
            List<String> list = Arrays.asList("apple","Ball","Cat","Dam","Elephant",null);
            for (String element : list)
                System.out.print(element+" ");
            System.out.println(); // line change

            for (int i = 0; i <list.size() ; i++) {
                System.out.print(list.get(i)+" ");
            }
            System.out.println(); // line change

        } catch (NullPointerException | ArrayIndexOutOfBoundsException | NoSuchElementException e) {
            System.err.println(e.getMessage());
        }
    }







    /**
     * <h1>Example 8<h1/>
     * <div>Array list element gets by using Iterator Interface, <div/>
     * <div>which has a method name iterator and also some method like <div/>
     * <code>hasNest()<code/> and <code>next()<code/>
     *
     */
    private void Example8(){
        try {
            List<String> list = Arrays.asList("apple","Ball","Cat","Dam","Elephant",null,null);

            Iterator<String> iterator = list.iterator();

            // By using For loop
            for ( ;iterator.hasNext();){
                String element = iterator.next();
                System.out.print(element+" ");
            }
            System.out.println(); // line change


            // By Using While Loop
            while (iterator.hasNext()){
                System.out.print(iterator.next()+" ");
            }
            System.out.println(); // line change
        }
        catch (NullPointerException | ArrayIndexOutOfBoundsException | NoSuchElementException e) {
            System.err.println(e.getMessage());
        }
    }







    /**
     *
     * <h2>Example 9<h2/>
     * ArrayList to get an element by using
     * <code>Java 8 stream + lambda expression<code/>
     */
    private void example9(){
        List<String> list = Arrays.asList("apple","Ball","Cat","Dam","Elephant",null,null);
//        list.stream().forEach(listStream -> System.out.println(listStream));
        // or
//        list.stream().forEach(System.out::println);
        //or
        list.forEach(System.out::println);
    }





    /**
     * <h1>Example 10:<h1/>
     * Sorting ArrayList in Ascending and
     * Descending
     */
    private void example10(){
        List<Integer> arrayList = Arrays.asList(12,34,5,87,87,9,10,23,86,89,54,32,21);

        Collections.sort(arrayList); // by default, arrange in ascending order
        System.out.println(arrayList);

        Collections.reverse(arrayList); // short arrayList in Descending order.
        System.out.println(arrayList);
    }







    /**
     * <h1>Example 11<h1/>
     * <div>Sorting non-primitive data by using Custom logic, Comparator Interface<div/>
     * <code>Collections.sort(employeeList, new MySort());<code/>
     * <div>MySort is custom class for Employee entity sort by salary of Employee<div/>
     */
    private void example11(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(100,"kamlesh",26,45000));
        employeeList.add(new Employee(120,"Ding",20,45070));
        employeeList.add(new Employee(101,"Ramesh",46,85000));
        employeeList.add(new Employee(130,"Mohan",18,47700));
        employeeList.add(new Employee(160,"Sohan",83,98000));

//        System.out.println(employeeList);

        // According and Descending by MySort class
        Collections.sort(employeeList, new MySort());
        employeeList.forEach(System.out::println);
    }





    /**
     * <h1>Example 12<h1/>
     * <div>Sorting non-primitive data by using anonymous Comparator Interface implantation<div/>
     *
     */
    private void example12(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(100,"kamlesh",26,45000));
        employeeList.add(new Employee(120,"Ding",20,45070));
        employeeList.add(new Employee(101,"Ramesh",46,85000));
        employeeList.add(new Employee(130,"Mohan",18,47700));
        employeeList.add(new Employee(160,"Sohan",83,98000));

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                // 1. for ascending order return(o1-o2)
                return (int)(o1.getSalary()-o2.getSalary());

                // 2.  for descending order return(o2-o1)
//                return (int)(o2.getSalary()-o1.getSalary());
            }
        });
        employeeList.forEach(System.out::println);
    }







    /**
     *<h1>Example 13</h1>
     * @since java 8
     * <code>stream + lambda expression</code>
     * <div>sort non-primitive data type using lambda expression</div>
     */
    private void example13(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(100,"kamlesh",26,45000));
        employeeList.add(new Employee(120,"Ding",20,45070));
        employeeList.add(new Employee(101,"Ramesh",46,85000));
        employeeList.add(new Employee(130,"Mohan",18,47700));
        employeeList.add(new Employee(160,"Sohan",83,98000));
        employeeList.add(new Employee());

        // ascending order.
        Collections.sort(employeeList,(e1,e2)->(int)(e1.getSalary()-e2.getSalary()));
        employeeList.forEach(System.out::println); // print object

        // descending order.
        Collections.sort(employeeList,(e1,e2)->(int)(e2.getSalary()-e1.getSalary()));
        employeeList.forEach(System.out::println);
    }






    /**
     * <h1>main() method<h1/>
     * @param args passing String type array
     */
    public static void main(String[] args) {

        _ArrayList ac = new _ArrayList();
//        ac.Example0();
//        ac.Example1();
//        ac.Example2();
//        ac.Example3();
//        ac.Example4();
//        ac.Example5();
//        ac.Example6();
//        ac.Example7();
//        ac.Example8();
//        ac.example9();
//        ac.example10();
//        ac.example11();
//        ac.example12();
        ac.example13();
    }
}
