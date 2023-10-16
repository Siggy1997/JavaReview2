package Team;

import java.util.Arrays;

class Test {
   public static int Number(int i) {
      while (i >= 10) {
         i /= 10;
      }
      return i;
   }

   boolean swap(int n1, int n2) {
      String s1 = Integer.toString(n1) + Integer.toString(n2);
      String s2 = Integer.toString(n2) + Integer.toString(n1);

      if (Integer.parseInt(s1) < Integer.parseInt(s2))
         return true;
      else {
         return false;
      }
   }
}

//메인
public class Chae {

   public static void main(String[] args) {

      Test check = new Test();

      int[] arr01 = { 5, 575, 25, 22, 8, 22089 }; // 주어진 배열
      int n = arr01.length;
      int temp = 0;

      for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - i - 1; j++) {
            int num1 = Test.Number(arr01[j]);
            int num2 = Test.Number(arr01[j + 1]);
            if (num1 < num2) {//앞자리 비교
               temp = arr01[j];
               arr01[j] = arr01[j + 1];
               arr01[j + 1] = temp;
            } else if (num1 == num2) {//앞자리가 똑같을 때 비교
               if (check.swap(arr01[j], arr01[j + 1])) {
                  temp = arr01[j];
                  arr01[j] = arr01[j + 1];
                  arr01[j + 1] = temp;
               }
            }
         }
      }
      System.out.println(Arrays.toString(arr01));
   }
}