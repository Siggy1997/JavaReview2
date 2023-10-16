package Team;

import java.util.Arrays;

//음수가 아닌 수들이 주어졌을 때 그 수들을 이어서 만들 수 있는 가장 큰 수를 구하시오.
//예를 들어 [1,2,3]이 주어졌을 때 만들 수 있는 가장 큰 수는 321이고, [3, 30, 34, 5, 9] 가 주어지면 만들 수 있는 가장 큰 수는 9534330이다.
class BigNum {   
 
   boolean swap(String a, String b) { //더 큰 값 비교
      boolean swap = false;
      if (Integer.parseInt(a + b) < Integer.parseInt(b + a)) {
         swap = true;
      }
      return swap;
   }
}
//1021 10864 8 15 71
public class Sun01 {   
   public static void main(String[] args) {
      BigNum bigNum = new BigNum(); //객체생성
      String[] strNum = {"1021", "10864", "8", "15", "13", "121" , "8777"}; //9945330121
      //System.out.println(Arrays.toString(strNum));


      
      String temp = "";
      for (int i = 0; i < strNum.length - 1; i++) {
         for (int j = i + 1; j < strNum.length; j++) {
            if (bigNum.swap(strNum[i], strNum[j])) {
               temp = strNum[i];
               strNum[i] = strNum[j];
               strNum[j] = temp;
            }
         }
      }
      System.out.println(Arrays.toString(strNum));
   }
}