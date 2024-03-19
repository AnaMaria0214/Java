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