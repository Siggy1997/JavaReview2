package Team;

public class Tp01StringSort {
   String[] sortByIni(String[] arr) {
      String temp;
      for(int i = 0; i < arr.length - 1; i++) {
         for(int j = i + 1; j < arr.length; j++) {
            if(arr[i].charAt(0) < arr[j].charAt(0)) {
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
      }
      
      return arr;
   }
   
   boolean shouldSwap(String s1, String s2) {
      boolean swap = false;
      
      if(Integer.parseInt(s1+s2) < Integer.parseInt(s2 + s1))
         swap = true;
      
      return swap;
   }
   
   String[] getMaxArr(String[] arr) {
      String temp;
      
      for(int i = 0; i < arr.length - 1; i++) {
         Check : for(int j = i + 1; j < arr.length; j++) {
            if(arr[i].charAt(0) == arr[j].charAt(0)) {
               if(shouldSwap(arr[i], arr[j])) {
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
               }
            } else {
               break Check;
            }
         }
      }
      
      return arr;
   }
}