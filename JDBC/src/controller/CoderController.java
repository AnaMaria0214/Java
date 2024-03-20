package controller;

import entity.Coder;
import model.CoderModel;

import javax.swing.*;

public class CoderController {

    CoderModel objCoderModel;

    public CoderController() {
        //Crear una instancia del model
        this.objCoderModel = new CoderModel();
    }

    public void delete() {
        String listCoderString = "CODER LIST \n";

        for (Object obj : this.objCoderModel.findAll()) {
            Coder objCoder = (Coder) obj;
            listCoderString += objCoder.toString() + "\n";
        }

        int confirm =1;
        int idDelete = Integer.parseInt(JOptionPane.showInputDialog(listCoderString + "Enter the ID of the coder to delete"));
        Coder objCoder = (Coder) this.objCoderModel.findById(idDelete);

        if (objCoder == null) {
            JOptionPane.showMessageDialog(null, "Coder not found");
        } else {
            confirm = JOptionPane.showConfirmDialog(null,"Are your sure want to delete the coder> \n" + objCoder.toString());

            // si el usuario escogio que si eliminamos
            if (confirm == 0);
            this.objCoderModel.delete(objCoder);

        }
    }

    //Metodo para listar os coders
    public void getAll() {

        String list = "list coders";
        //Iteramos sobre la lista que devuelve el metodo find All
        for (Object obj : this.objCoderModel.findAll()) {
            //Convertimos o casteamos
            Coder objCoder = (Coder) obj;

            list += objCoder.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null,list);
    }

    public void Create(){
        Coder objCoder = new Coder();
        String name = JOptionPane.showInputDialog("Inser name: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Inser age: "));
        String clan = JOptionPane.showInputDialog("Inser clan: ");

        objCoder.setName(name);
        objCoder.setAge(age);
        objCoder.setClan(clan);

        objCoder = (Coder) this.objCoderModel.insert(objCoder);

        JOptionPane.showMessageDialog(null, objCoder.toString());
    }


}