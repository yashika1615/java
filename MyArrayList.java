import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {
    
    ArrayList<Integer> list = new ArrayList<>();

    public MyArrayList() {
        // Add elements - O(1)
        list.add(1);
        list.add(3);
        list.add(4);
        // or
        list.add(1, 9);
        list.add(4, 6);
        System.out.println(list);

        // Get element
        int el = list.get(2);
        System.out.println(el);

        // Delete
        list.remove(4);
        System.out.println(list);

        // Set
        list.set(2, 10);
        System.out.println(list);

        // Contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(5));

        // Size
        System.out.println(list.size());

        // Print ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Reverse of ArrayList
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Find max in ArrayList
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        System.out.println(max);
    }

    // Swap method
    public void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String args[]) {
        MyArrayList myArrayList = new MyArrayList();

        // Swap numbers in the ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(8);
        list.add(5);
        MyArrayList List = new MyArrayList();
        List.swap(list, 0, 2);
        System.out.println("After swap: " + list); 

      //Sorting 
     //Collections.Sort()- Collections- class
     //collection - interface
     //import collections class

        Collections.sort(list);
        System.out.println(list);

        //sorting in reverse order
        Collections.sort(list, Collections.reverseOrder()); //here collections is a comparator 
        System.out.println(list);

        //multi dimensional arraylist
        //2-D arraylist / ArrayList that stores ArrayList / ArrayList of ArrayList
  //   ArrayList<ArrayList<Integer>> mainList= new ArrayList <>();
  //     ArrayList<Integer> arr= new ArrayList<>();
  // arr.add(1);
  // arr.add(2);
  // mainList.add(arr);
  //     ArrayList<Integer> List2= new ArrayList<>();
  //     List2.add(3);
  //     List2.add(4);
  //     mainList.add(List2);
  //     // print arraylist
  //     for(int i=0; i<mainList.size();i++){
  //       ArrayList<Integer> currList= mainList.get(i);
  //       for(int j=0; j<currList.size();j++){
  //         System.out.println(currList.get(j)+" ");
  //       }
  //       System.out.println(mainList);
  //     }

      //now lets print this arraylist
      // list 1: 1 2 3 4 5  (table of 1)
      // list 2: 2 4 6 8 10  (table of 2)
      // list 3: 3 6 9 12 15  (table of 3)
      
      //create a mainlist first
      ArrayList<ArrayList<Integer>> ListMain = new ArrayList<>();
      //CREATE OTHER 3 LIST
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
       
        //store elements in those 3 lists
        for(int i=1; i<5;i++){
          list1.add(i*1);
          list2.add(i*2);
          list3.add(i*3);
        }
        ListMain.add(list1);
        ListMain.add(list2);
        ListMain.add(list3);
        //print the main list now using the nested loops
        for(int i=0;i<ListMain.size();i++){
          ArrayList<Integer> ListCurr=new ArrayList<>();
          for(int j=0; j<ListCurr.size();j++){
            System.out.println(ListCurr.get(j)+ " ");
          }
          System.out.println();
        }
    }
}
     
   


       