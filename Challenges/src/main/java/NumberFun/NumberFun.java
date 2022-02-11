package NumberFun;

import java.util.Arrays;

public class NumberFun {


    public static Boolean ascending(String s){

        int digits = 1;
        int p; //previous number
        int c; //current number
        int l = s.length();

        while (digits <= l/2) {
            if (l % digits == 0) {
                p = Integer.parseInt(s.substring(0,digits));
                for (int i = digits; i < l; i+=digits) {
                    c = Integer.parseInt(s.substring(i, digits + i));
                    if (p <= c) {
                        if (i == l - digits) {
                            return true;
                        }
                        p = c;
                    } else {
                        break;
                    }
                }
            }

            digits ++;
        }
        return false;
    }

    public static int [][] squarePatch(int a){

        int[][] square = new int [a][a];

        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                square[i][j] = a;
            }
        }

        return square;
    }


    public static void main(String[] args){
        System.out.println(Arrays.deepToString(squarePatch(2)).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        System.out.println();
        System.out.println(Arrays.deepToString(squarePatch(1)).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        System.out.println();
        System.out.println(Arrays.deepToString(squarePatch(5)).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        System.out.println();
        System.out.println(Arrays.deepToString(squarePatch(7)).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        System.out.println();
        System.out.println(Arrays.deepToString(squarePatch(0)).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        System.out.println();


        System.out.println(ascending("232425"));
        System.out.println(ascending("2324256"));
        System.out.println(ascending("444445"));

    }
}
