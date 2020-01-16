/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookbook;

import javax.swing.JOptionPane;

/**
 *
 * @author 7302
 */
public class CookBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        LinkedList food = new LinkedList();
        Recipe rcp;

        do {
            String operation = JOptionPane.showInputDialog("ADD, DELETE, SHOW-ALL, SHOW-ONE,QUIT");

            if (operation.equalsIgnoreCase("Add")) {
                String name = "";
                String type = "";
                String instructions = "";
                String date = "";
                String serving = "";
                try {

                    name = JOptionPane.showInputDialog("Enter food Name ");
                    type = JOptionPane.showInputDialog("Enter food type ");
                    instructions = JOptionPane.showInputDialog("Enter cooking instructions ");
                    date = JOptionPane.showInputDialog("Enter last date of use ");
                    serving = JOptionPane.showInputDialog(" Serving for ? ");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "invalid Input");
                }
                rcp = new Recipe(name, type, instructions, date, serving);
                food.insert(rcp);

            } else if (operation.equalsIgnoreCase("Delete")) {
                String rem = "";
                try {
                    rem = JOptionPane.showInputDialog("enter name of item to delete");
                    food.delete(rem);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Sorry " + rem + " can not be found or deleted");
                }
            } else if (operation.equalsIgnoreCase("SHOW-ALL")) {
                String show = JOptionPane.showInputDialog("Enter Type of food to show");
                food.showAll(show);
            } else if (operation.equalsIgnoreCase("SHOW-ONE")) {
                String showOne = JOptionPane.showInputDialog("Enter Name of food to show");
                rcp = food.showOne(showOne);
                JOptionPane.showMessageDialog(null, rcp.toString());
            } else if (operation.equalsIgnoreCase("QUIT")) {
                JOptionPane.showMessageDialog(null, "Thank you for using Cook Book");
                System.exit(0);

            }
        } while (JOptionPane.showConfirmDialog(null, "continue") == 0);

    }

}
