import java.util.LinkedList;

public class LinkedListArrayFunctions{

    public void addAndSort(LinkedList<Integer> list, int value){
        int pos = 0;
        for (int i = 0; i < list.size(); i++){
            if(value >= list.get(i)){
                pos = i+1;
            }
        }
        list.add(pos, value);
    }

    public void swapValues(LinkedList<Integer> list, int indexOne, int indexTwo){
        int firstValue = list.get(indexOne);
        int secondValue = list.get(indexTwo);
        list.set(indexOne, secondValue);
        list.set(indexTwo, firstValue);
    }

    public int findValue(LinkedList<Integer> list, int searchVal){
        if(list.contains(searchVal)){
            return list.indexOf(searchVal);
        }
        else{
            return -1;
        }
    }

}
