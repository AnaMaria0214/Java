import controller.CoderController;
import database.ConfigDB;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CoderController objCoderController = new CoderController();
        String option="";

        do{

            option = JOptionPane.showInputDialog("""
                    
                    MENU
                    1. List Coders
                    2. Inser Coder
                    3. Update Coder
                    4. Delete Coder
                    5. Get By Name
                    6. Exit
                    
                    Choose an option.
                    """);

            switch (option){

                case"1"://Lista all coders
                    objCoderController.getAll();
                    break;

                case"2":
                    objCoderController.Create();
                    break;
            }
        }while (!option.equals("6"));

    }
}