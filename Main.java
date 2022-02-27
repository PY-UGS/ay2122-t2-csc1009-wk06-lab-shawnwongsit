import java.util.*;

public class Main {

    public static void main(String[] args) {
        //LinkedList
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 1; i<12; i+=2){
            linkedList.add(i);
        }
        System.out.println("Before adding integer: " + linkedList);
        
        LinkedListArrayFunctions slla = new LinkedListArrayFunctions();
        slla.addAndSort(linkedList, 8);
        System.out.println("After adding integer: " + linkedList);

        slla.swapValues(linkedList, 1, 5);
        System.out.println("After swapping integers: " + linkedList);
        
        LinkedList<Integer> rdmNumbersLL = new LinkedList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 500; i++){
            //Random from 1000 - 9999
            int n = rand.nextInt(9000);
            n += 1000;
            rdmNumbersLL.add(n);
        }
        System.out.println("" + rdmNumbersLL);

        int x = rand.nextInt(9000);
        x += 1000;
        int pos = slla.findValue(rdmNumbersLL, x);
        System.out.println("Value of x: " + x);
        System.out.println("Position of found number: " + pos);

        //Hashmap
        /*HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        hashMap.put(0,1);
        hashMap.put(1,3);
        hashMap.put(2,5);
        hashMap.put(3,7);
        hashMap.put(4,9);
        hashMap.put(5,11);
        System.out.println("Before adding integer: " + hashMap);

        HashMapFunctions shm = new HashMapFunctions();
        shm.addAndSort(hashMap, 8);
        System.out.println("After adding integer: " + hashMap);

        shm.swapValues(hashMap, 1, 6);
        System.out.println("After swapping integers: " + hashMap);

        HashMap<Integer, Integer> rdmNumbersHm = new HashMap<Integer, Integer>();
        Random rand = new Random();
        for (int i = 0; i < 500; i++){
            //Random from 1000 - 9999
            int n = rand.nextInt(9000);
            n += 1000;
            rdmNumbersHm.put(i, n);
        }
        System.out.println("" + rdmNumbersHm);

        int x = rand.nextInt(9000);
        x += 1000;
        int pos = shm.findValue(rdmNumbersHm, x);
        System.out.println("Value of x: " + x);
        System.out.println("Position of found number: " + pos);*/
    }
    
}
