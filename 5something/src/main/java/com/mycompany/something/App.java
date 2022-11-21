/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.something;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class App {

    public static void main(String[] args) {
        int[] again = {0, 0, 3};
        float[] z = {0};

        String[] choose = {" "};
        String[] options = {"The Area Of A Cirle", "Volume Of A Cone", "Surface Area OF A Pyramid", "Volume OF A Pyramid", "Prime Number Checker"};

        do {
            again[2] = 3;
            again[1] = JOptionPane.showOptionDialog(null, "CHOOSE AN OPERATION", "Welcome", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            switch (again[1]) {
                //Area of Circle

                case 0:
                    do {
                        again[2] = 2;
                        JOptionPane.showMessageDialog(null, Area_Circle());
                        again[0] = JOptionPane.showConfirmDialog(null, "TRY ANOTHER PROGRAM?");
                    } while (again[0] == 1);
                    break;
                //Volume of Cone
                case 1:
                    do {
                        again[2] = 2;
                        JOptionPane.showMessageDialog(null, Volume_Cone());
                        again[0] = JOptionPane.showConfirmDialog(null, "TRY ANOTHER PROGRAM?");
                    } while (again[0] == 1);
                    break;
                //Surface Are of Pyramid
                case 2:
                    do {
                        again[2] = 2;
                        JOptionPane.showMessageDialog(null, Surface_Area());
                        again[0] = JOptionPane.showConfirmDialog(null, "TRY ANOTHER PROGRAM?");
                    } while (again[0] == 1);
                    break;
                case 3:
                    do {
                        again[2] = 2;
                        JOptionPane.showMessageDialog(null, Volume_area_Pyramid());
                        again[0] = JOptionPane.showConfirmDialog(null, "TRY ANOTHER PROGRAM?");
                    } while (again[0] == 1);
                    break;
                case 4:
                    do {
                        again[2] = 2;
                        z[0] = Prime_Number_Checker();
                        if (z[0] == 2) {
                            JOptionPane.showMessageDialog(null, "PRIME NUMBER");
                        } else {
                            JOptionPane.showMessageDialog(null, "NOT A PRIME NUMBER");
                        }
                        again[0] = JOptionPane.showConfirmDialog(null, "TRY ANOTHER PROGRAM?");
                    } while (again[0] == 1);
            }
            //para ma break if e x
            if (again[2] == 3) {
                break;
            }

        } while (again[0] == 0);

    }

    static double Area_Circle() {
        String c = JOptionPane.showInputDialog(null, "INPUT RADIUS");
        double radius = Double.parseDouble(c);
        double answer = Math.PI * Math.pow(radius, 2);
        return answer;
    }

    static double Volume_Cone() {
        //arrays
        double[] values = {0.33333, Math.PI, 0, 0, 0};
        String[] input = {"", ""};

        //computations
        input[0] = JOptionPane.showInputDialog("INPUT RADIUS");
        values[3] = Double.parseDouble(input[0]);

        input[1] = JOptionPane.showInputDialog("iINPUT HEIGHT");
        values[4] = Double.parseDouble(input[1]);

        values[2] = ((values[0] * values[1]) * (Math.pow(values[3], 2) * values[4]));
        return values[2];
    }

    static float Surface_Area() {
        float[] values = {12, 0, 0, 0, 0};
        String[] input = {"", "", ""};
        //perimeter
        input[0] = JOptionPane.showInputDialog("INPUT PERIMETER OF THE BASE: ");
        values[1] = Float.parseFloat(input[0]);
        //Base
        input[1] = JOptionPane.showInputDialog("INPUT AREA OF THE BASE: ");
        values[2] = Float.parseFloat(input[1]);
        //Slant Height
        input[2] = JOptionPane.showInputDialog("INPUT SLANT HEIGHT: ");
        values[3] = Float.parseFloat(input[2]);

        values[4] = ((values[0] * (values[1] * values[3])) + values[2]);
        return values[4];
    }

    static float Volume_area_Pyramid() {
        float[] values = {0.33333f, 0, 0, 0};
        String[] input = {"", ""};
        //base
        input[0] = JOptionPane.showInputDialog("INPUT BASE:");
        values[1] = Float.parseFloat(input[0]);
        //height
        input[1] = JOptionPane.showInputDialog("INPUT HEIGHT:");
        values[2] = Float.parseFloat(input[1]);

        values[3] = (values[0] * values[1] * values[2]);

        return values[3];
    }

    static float Prime_Number_Checker() {
        //arrays
        String[] input = {"", ""};
        float[] values = {0, 0, 0};

        input[0] = JOptionPane.showInputDialog("TYPE A NUMBER");
        values[0] = Float.parseFloat(input[0]);
        //loops
        for (int i = 1; i <= values[0]; i++) {
            float y = values[0] / i;
            //conditions
            if (values[0] % i == 0) {
                values[1] = values[1] + 1;
            }
        }
        return values[1];

    }
}
    

