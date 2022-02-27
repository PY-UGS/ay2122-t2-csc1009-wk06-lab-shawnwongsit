import java.util.HashMap;

public class HashMapFunctions{
    public void addAndSort(HashMap<Integer, Integer> hm, int value){
        hm.put(hm.size(), value);

        for(int i = 0; i<hm.size();i++){
            if(hm.get(hm.size()-1) <= hm.get(i)){
                int temp = hm.get(i);
                hm.put(i, hm.get(hm.size()-1));
                hm.put(hm.size()-1, temp);
            }
        }
    }

    public void swapValues(HashMap<Integer, Integer> hm, int indexOne, int indexTwo){
        int firstValue = hm.get(indexOne);
        int secondValue = hm.get(indexTwo);
        hm.put(indexOne, secondValue);
        hm.put(indexTwo, firstValue);
    }

    public int findValue(HashMap<Integer, Integer> hm, int searchVal){
        int pos = -1;
        for (int key : hm.keySet()){
            if (hm.get(key).equals(searchVal)){
                pos = key;
                break;
            }
        }
        return pos;
    }
}
