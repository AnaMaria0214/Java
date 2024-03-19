package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDB {
    //Variable que va a contener el estado de la conexion

    static Connection objConnection = null;
    //metddo para abrir la conexccion entre java y ;a base de datos

    public static Connection openConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url= "jdbc:mysql://localhost:3306/01_JDBC";
            String user = "root";
            String password = "Rlwl2023.";

            objConnection=(Connection) DriverManager.getConnection(url,user,password);
            System.out.println("Se establecio conexion correctamente");
        }catch (ClassNotFoundException e){
            System.out.println("Error >> Driver no instalado");
        }catch (SQLException e){
            System.out.println("Error >> No se puedo establecer una conexion a la base de datos");
        }
        return objConnection;

    }
    public static void closeConnection(){
        try {
            if (objConnection != null) objConnection.close();
        }catch (SQLException e){
            System.out.println("Error"+e.getMessage());

        }
    }
}
