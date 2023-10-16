
package Team;public class Hell {

	public static void main(String[] args) {
		int[] arr01 = { 1021, 10864, 8, 15, 130, 71}; // 주어진 배열
        String[] arr02 = {"1021", "10864", "8", "15", "130", "71"}; // 주어진 배열
        int n = arr01.length;
        int temp = 0;
        char[] chArray = new char[arr01.length];

        for (int i1 = 0; i1 < n - 1; i1++) {
            for (int j1 = 0; j1 < n - i1 - 1; j1++) {
                int num1 = Number(arr01[j1]);
                int num2 = Number(arr01[j1 + 1]);
                System.out.println(j1 + "()" + Number(arr01[j1]) + "  " + (j1 + 1) + "()" + Number(arr01[j1 + 1]));
                System.out.println(Number(arr01[j1]) + "" + Number(arr01[j1 + 1]));

                System.out.println("");

                if (num1 < num2) {
                    temp = arr01[j1];
                    arr01[j1] = arr01[j1 + 1];
                    arr01[j1 + 1] = temp;
                } else if (num1 == num2) {
                    for (int i = 0; i < arr01.length; i++) {
                        for (int j = 0; j < arr02[i].length(); j++) {
                            chArray[i] = arr02[i].charAt(j);
                            if (chArray[j] < chArray[j + 1]) {
                                char temp01 = chArray[j + 1];
                                chArray[j + 1] = chArray[j];
                                chArray[j] = temp01;

                                temp = arr01[j + 1];
                                arr01[j + 1] = arr01[j];
                                arr01[j] = temp;

                            }
                        }
                    }
                }
            }
        }

        // 출력을 원하는 순서로 재정렬
 
    }

    public static int Number(int i) {
        while (i >= 10) {
            i /= 10;
        }
        return i;
    }
}