package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("podaj ilu znakowy chcesz token");
        System.out.println("5, 10 czy 15?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

       String[] token = tokenGenerator(number);
        System.out.println("twój token: ");
        for(int i =0; i<token.length; i++){
            System.out.print(token[i]);
        }
    }

    //tokenGenerator
    public static String[] tokenGenerator(int number) {
        String pattern = "abcdefghijkitd";
        String[] tokenV0 = new String[number];
        for (int i = 0; i < number; i++) {
            int a = pattern.length();
            int numerZnakuTokena = new Random().nextInt(a);
            tokenV0[i] = pattern.substring(numerZnakuTokena,numerZnakuTokena+1);

        }
        return tokenV0;


//        String[] wartosciTokena = new String[69];
//        wartosciTokena[0]="a";
//        wartosciTokena[1]="b";
//        wartosciTokena[2]="c";
//        wartosciTokena[3]="d";
//        wartosciTokena[4]="e";
//        wartosciTokena[5]="f";
//        wartosciTokena[6]="g";
//        wartosciTokena[7]="h";
//        wartosciTokena[8]="i";
//        wartosciTokena[9]="j";
//        wartosciTokena[10]="k";
//        wartosciTokena[11]="l";
//        wartosciTokena[12]="m";
//        wartosciTokena[13]="n";
//        wartosciTokena[14]="o";
//        wartosciTokena[15]="p";
//        wartosciTokena[16]="q";
//        wartosciTokena[17]="r";
//        wartosciTokena[18]="s";
//        wartosciTokena[19]="t";
//        wartosciTokena[20]="u";
//        wartosciTokena[21]="w";
//        wartosciTokena[22]="x";
//        wartosciTokena[23]="y";
//        wartosciTokena[24]="z";
//        wartosciTokena[25]="A";
//        wartosciTokena[26]="B";
//        wartosciTokena[27]="C";
//        wartosciTokena[28]="D";
//        wartosciTokena[29]="E";
//        wartosciTokena[30]="F";
//        wartosciTokena[31]="G";
//        wartosciTokena[32]="H";
//        wartosciTokena[33]="I";
//        wartosciTokena[34]="J";
//        wartosciTokena[35]="K";
//        wartosciTokena[36]="L";
//        wartosciTokena[37]="M";
//        wartosciTokena[38]="N";
//        wartosciTokena[39]="O";
//        wartosciTokena[40]="P";
//        wartosciTokena[41]="Q";
//        wartosciTokena[42]="R";
//        wartosciTokena[43]="S";
//        wartosciTokena[44]="T";
//        wartosciTokena[45]="U";
//        wartosciTokena[46]="W";
//        wartosciTokena[47]="X";
//        wartosciTokena[48]="Y";
//        wartosciTokena[49]="Z";
//        wartosciTokena[50]="1";
//        wartosciTokena[51]="2";
//        wartosciTokena[52]="3";
//        wartosciTokena[53]="4";
//        wartosciTokena[54]="5";
//        wartosciTokena[55]="6";
//        wartosciTokena[56]="7";
//        wartosciTokena[57]="8";
//        wartosciTokena[58]="9";
//        wartosciTokena[59]="0";
//        wartosciTokena[60]="!";
//        wartosciTokena[61]="@";
//        wartosciTokena[62]="#";
//        wartosciTokena[63]="$";
//        wartosciTokena[64]="%";
//        wartosciTokena[65]="^";
//        wartosciTokena[66]="*";
//        wartosciTokena[67]="(";
//        wartosciTokena[68]=")";

//
//        String[] token = new String[number];
//        for (int i = 0; i < number; i++) {
//            int a = wartosciTokena.length;
//            int numerZnakuTokena = new Random().nextInt(a);
//            token[i] = wartosciTokena[numerZnakuTokena];
//
//        }
//        return token;

//        String tokenV2 = "";
//        for (int i = 0; i < number; i++) {
//            int a = wartosciTokena.length;
//            int numerZnakuTokena = new Random().nextInt(a);
//            tokenV2 += wartosciTokena[numerZnakuTokena];
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < number; i++) {
//            int a = wartosciTokena.length;
//            int numerZnakuTokena = new Random().nextInt(a);
//            sb.append(wartosciTokena[numerZnakuTokena]);
//        }
//        String tokenV3 = sb.toString();


    }
}
