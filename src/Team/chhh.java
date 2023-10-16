package Team;

import java.util.Arrays;

public class chhh {
   public static void main(String[] args) {
      String[] sArr = {"541", "5700", "56", "3", "30", "34", "5", "90", "9"};
      String[] rArr = new String[sArr.length];
      
      String[] tArr = new String[sArr.length];
      tArr = sArr.clone();
      
      int[] iArr = new int[sArr.length];
      for(int i = 0; i < iArr.length; i++)
         iArr[i] = i;
      
      int nDigit = 0;
      for(int i = 0; i < sArr.length; i++) {
         nDigit = nDigit > sArr[i].length() ? nDigit : sArr[i].length();
      }
      
      int n;
      for(int i = 0; i < sArr.length; i++) {
         n = sArr[i].length();
         for(int j = 0; sArr[i].length() != nDigit; j = j == n ? 0 : ++j) {
            sArr[i] += sArr[i].charAt(j);
         }
      }
      
       System.out.println(Arrays.toString(sArr));
       System.out.println(Arrays.toString(tArr));
      String strTemp;
      int intTemp;
      for(int i = 0; i < sArr.length - 1; i++) {
         for(int j = i + 1; j < sArr.length; j++) {
            if(Integer.parseInt(sArr[i]) < Integer.parseInt(sArr[j])) {
               strTemp = sArr[i];
               sArr[i] = sArr[j];
               sArr[j] = strTemp;
               
               intTemp = iArr[i];
               iArr[i] = iArr[j];
               iArr[j] = intTemp;
            }
         }
      }
      
      System.out.println(Arrays.toString(sArr));
      System.out.println(Arrays.toString(tArr));
      
      for(int i = 0; i < iArr.length; i++) {
         System.out.print(tArr[iArr[i]] + " ");
      }
   }
}