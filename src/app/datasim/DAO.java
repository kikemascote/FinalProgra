package app.datasim;


import app.model.User;

public class DAO {
    User usuario = new User();

    //simular acceso a datos guardados en una BD
    public void setUsers() {
        usuario.setNombre("Admin");
        usuario.setPassword("password");
    }

    public boolean isValid(String uname, String passwd) {
        if (usuario.getNombre().equals(uname.toString()) && usuario.getPassword().equals(passwd.toString())) {
            return true;
        } else {
            return false;
        }
    }
}