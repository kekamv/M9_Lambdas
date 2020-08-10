package app;

import fase1.StringList;
import fase2.Pi;
import fase3.ReverseInt;

import java.util.Arrays;
import java.util.List;

public class
Application {

    public static void main(String[] args) {

        StringList strL =new StringList();

        List<String> names = Arrays.asList("Ann", "Toni", "Ali", "Robert", "Liz", "Anne", "Paul", "Osvaldo");
        List<Integer> integers = Arrays.asList(1, 3, 5, 8, 9 ,16, 99, 145);

        System.out.println(strL.startWithCharFixedLength(names, 'a', 3));

        System.out.println(strL.oddEvenToStrList(integers));

        System.out.println(strL.containsChar(names, 'o'));

        System.out.println(strL.containsCharFixedLength(names, 'o', 5));

        strL.monthsInYear();

        strL.monthsInYearRefMethod();

        Pi myPi=()-> 3.1415;
        System.out.println(myPi.getPiValue());

        ReverseInt revStr =(s)-> new StringBuilder(s).reverse().toString();

        String str1="comprovant el resultat";

        System.out.println(revStr.reverseS(str1));

    }

}
