package import1;

/*
 * Program.java        VERSION DATE
 *
 * Calculate the area of circle.
 *
 * Copyright 2014 Marta Corchado <gcatram@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {

    /**
     * METHOD DESCRIPTION
     * Returns perimeter or area of a circle with radius given
     * 
     * @param radi is a real number
     * @return result is a real number with the area and perimeter of circle
     */
    public double perimeter(double radi) { 
        //Declare a variable perimeter
        double result;
        //add the input data
        result = 2 * Math.PI * radi ;
        //return the output data
        return result;        
    }
    public double area(double radi) { 
        //Declare a variable area
        double result;
        //add the input data
        result = Math.pow(Math.PI * radi,2);
        //return the output data
        return result;
    }
}
