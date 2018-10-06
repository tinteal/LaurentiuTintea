/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsandnumbers;

import java.text.DecimalFormat;

/**
 *
 * @author Laurentiu
 */
public class DecimalFormatDemo {

    static public void customFormat(String pattern, double value ) {
DecimalFormat myFormatter = new DecimalFormat(pattern);
String output = myFormatter.format(value);
System.out.println(value + " " + pattern + " " + output);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
customFormat("###,###.###", 123456.789);
customFormat("###.##", 123456.789);
customFormat("000000.000", 123.78);
customFormat("$###,###.###", 12345.67);
}
    }
   
