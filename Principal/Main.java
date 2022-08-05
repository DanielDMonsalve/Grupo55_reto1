package Principal;
import Vistas.*;
import Modelo.*;

public class Main {
    
    public static void main(String[] args) {
        Conexion conexionDB = new Conexion();
        Login login = new Login();
        login.setVisible(true);
    }
    
}
