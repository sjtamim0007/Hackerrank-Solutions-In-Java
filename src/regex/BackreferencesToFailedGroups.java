/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tamim
 */
public class BackreferencesToFailedGroups {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d{2}(-?)\\d{2}\\1\\d{2}\\1\\d{2}$");

    }
}

class Regex_Test17 {

    public void checker(String Regex_Pattern) {

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }

}
