package Team;

public class Tp01IntSort {
   int getIni(int num) {
      int dec = 1;
      while(true) {
         if(num < dec * 10)
            return num / dec;
         else
            dec *= 10;
      }
   }
   
   int[] sortByIni(int[] arr) {
      int temp;
      for(int i = 0; i < arr.length - 1; i++) {
         for(int j = i + 1; j < arr.length; j++) {
            if(getIni(arr[i]) < getIni(arr[j])) {
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
      }
      
      return arr;
   }
   
   boolean decSwap(int n1, int n2) {
      String s1 = Integer.toString(n1) + Integer.toString(n2);
      String s2 = Integer.toString(n2) + Integer.toString(n1);
      
      if(Integer.parseInt(s1) < Integer.parseInt(s2))
         return true;
      else
         return false;
   }
   
   int[] getMaxArr(int[] arr) {
      int temp;
      
      for(int i = 0; i < arr.length - 1; i++) {
         Check : for(int j = i + 1; j < arr.length; j++) {
            if(getIni(arr[i]) == getIni(arr[j])) {
               if(decSwap(arr[i], arr[j])) {
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
               }
            }
            else
               break Check;
         }
      }
      
      return arr;
   }
}