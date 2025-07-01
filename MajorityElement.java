import java.util.*;
public class MajorityElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);           //Main funtions for Your reference 
        int a = sc.nextInt();
        int i;
        int[] arr = new int[a];
        for(i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(hash(arr));
    }

    public static int hash(int[] arr){                               //problem starts from here
        HashMap<Integer, Integer>map = new HashMap<>();                //creating a HashMap called map   
        for (int j : arr) {                                           //Enchanced for loop to travese along the Array and get values to check for frequency 
            map.put(j, map.getOrDefault(j, 0) + 1);                  // using getOrDefault method we can check the map is already exist or not, if exist value is incremented with one else new map is created
        }int max = 0;    // to check the max value 
        int op = arr[0];    // to find the highesr frequency value
        for (int key : map.keySet()){      //map.keySet to get all key values to travese along the map and key value is assigned to variable key
            int a = map.get(key);          // assign the value of ket to variable a
            if(max< a){                     // checks for highest frequency is the the value of each key
                max = a;
                op = key;                   //the highest frequency value is assigned to variable op
            }
        }
        return op;
    }

}

