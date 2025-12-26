

import java.util.HashMap;

/*Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
  (examples)
  input: [1,2,8,9,12,46,76,82,15,20,30]
  Output: 
    {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}*/


class Problem_4 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int [] inputs = {1,2,8,9,12,46,76,82,15,20,30};
        HashMap<Integer, Integer> map = new HashMap<>();

        
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=0; j<inputs.length; j++){
                if(inputs[j] % arr[i] == 0){
                    count++;
                }
            }
            map.put(arr[i], count);
        }

        System.out.println(map);


    }
}
