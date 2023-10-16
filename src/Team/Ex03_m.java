package Team;

import java.util.Arrays;

public class Ex03_m {
   public static void main(String[] args) {
      String[] sArr = {"561", "5500", "56", "3", "30", "34", "5", "90", "9"};

      Tp01StringSort ss = new Tp01StringSort();
      
      sArr = ss.sortByIni(sArr);
      System.out.println(Arrays.toString(sArr));
      
      sArr = ss.getMaxArr(sArr);
      System.out.println(Arrays.toString(sArr));
      
      
      int[] iArr = {561, 5500, 56, 3, 30, 34, 5, 90, 9};
      
      Tp01IntSort is = new Tp01IntSort();
      
      iArr = is.sortByIni(iArr);
      System.out.println(Arrays.toString(iArr));
      
      iArr = is.getMaxArr(iArr);
      System.out.println(Arrays.toString(iArr));
   }
}