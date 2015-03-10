/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vza.vaz.CurrentRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dmitri
 */
public class ParseRegex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String r1 ="(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*";
        String r2 = "ГОСТ(\\s[0-9]+(\\-[0-9]+)+)";
        

String s = "адреса эл.почты:mymail@tut.by и rom@bsu.by";
String s2 = "Круг 25.0 М2 ГОСТ 23456-09 / ДКХМЛ М2 ТУ 3444-0392-222-1 ГОСТ 23456-079-9";
String s3 = "Круг 25.0 М2 ДСТУ 4322:2323 (ГОСТ 23456-09) / ДКХМЛ М2 ТУ 3444-0392-222-1";
String s4 = "Круг 25.0 М2 ГОСТ 23456-09 / ДКХМЛ М2 ОСТ 3343-2828001 ТУ 3444-0392-222-1";

Pattern p2 = Pattern.compile(r2);

Matcher m2 = p2.matcher(s2);

while (m2.find())
    {
        System.out.println("ГОСТ: " + m2.group());
     }
    }
    
}
