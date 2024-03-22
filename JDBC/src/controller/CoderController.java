package controller;

import entity.Coder;
import model.CoderModel;

import javax.swing.*;
import java.util.List;

public class CoderController {

    CoderModel objCoderModel;

    public CoderController() {
        //Crear una instancia del model
        this.objCoderModel = new CoderModel();
    }

    public void delete() {
        String listCoderString = this.getAll(this.objCoderModel.findAll());

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

        String list = this.getAll(this.objCoderModel.findAll());

        //Mostramos toda la lista
        JOptionPane.showMessageDialog(null,list);
    }

    public String getAll(List <Object> listObject){
        String list = "list coders \n";

        //Iteramos sobre la lista que devuelve el metodo find All
        for (Object obj : listObject) {

            //Convertimos o casteamos el objeto tipo object a un coder
            Coder objCoder = (Coder) obj;

            list += objCoder.toString() + "\n";
        }
        return  list;
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

    public void update(){
        //Listamos
        String listCoderString = this.getAll(this.objCoderModel.findAll());

        //Pedimos el Id
        int iUpdate = Integer.parseInt(JOptionPane.showInputDialog(listCoderString +"\n Enter the ID of the coder to edit" ));

        //Verificamos el Id
        Coder objCoder = (Coder) this.objCoderModel.findById(iUpdate);

        if (objCoder == null){
            JOptionPane.showMessageDialog(null,"Coder not found");
        }else{
            String name = JOptionPane.showInputDialog(null,"Enter new name", objCoder.getName());
            int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter new age", String.valueOf(objCoder.getAge())));
            String clan  = JOptionPane.showInputDialog(null,"Enter new clan", objCoder.getClan());

            objCoder.setName(name);
            objCoder.setAge(age);
            objCoder.setClan(clan);

             this.objCoderModel.update(objCoder);
        }
    }



}