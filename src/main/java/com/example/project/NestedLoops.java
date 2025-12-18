package com.example.project;

/*
1.Manually test first in the Runner class.
2.Run ./gradlew test to run automated tests.
3.Once you have completed the challenges, push to your repository.
4.Submit at turninterminal.netlify.app
*/

public class NestedLoops {
               /*
return the string below for given height=5
*
**
***
****
*****  
           */
public static String starStaircase(int height){
    String result = "";

        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                result += "*";
            }
            result += "\n";
        }

        return result;
    }

          /*
return the string below for given height=5
*****
****
***
**
*
           */

public static String starStaircaseReverse(int height){
    String result = "";

        for (int i = height; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }
            /*

width=5 height=5
*****
*   *
*   *
*   *
*****
          */
    public static String emptyBox(int width, int height) {
        String result = "";

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    result += "*";
                } else {
                    result += " ";
                }
            }
            result += "\n";
        }

        return result;
    }
                    /*
return the string below for word="HELLO" rows=5                    
HELLO
ELLOH
LLOHE
LOHEL
OHELL

  i will provide a hint for this one if you get stuck.. use modulo
                */
    public static String repeatRectangle(String word, int rows){
        String result = "";
        int length = word.length();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < length; j++) {
                result += word.charAt((i + j) % length);
            }
            result += "\n";
        }

        return result;
    }

}