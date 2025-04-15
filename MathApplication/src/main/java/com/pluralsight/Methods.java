package com.pluralsight;

public class Methods {
    public static void main(String[] args) {
        String brushTeeth = "Brushed teeth";
        String brushTeeth2 = brushedTeeth("Tooth Brush", "Tooth Paste", "Mouthwash");
        System.out.println(brushTeeth);

        String tvShow = favoriteTVShow();
        System.out.println("My favoriteTVShow is" + " " + tvShow);

        int sum = addTwoNumbers (95, 66);
        System.out.println(sum);

    }
    public static String brushedTeeth(String step1, String step2, String step3){
        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        return "Brushed Teeth";
    }

    public static String favoriteTVShow(){
        return "Dragon Ball";
    }
    public static int addTwoNumbers (int a, int b){
        int sum = a + b;
        return sum;
    }
}
