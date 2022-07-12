package interfaces;

import java.util.List;

public class main {
    static CocheCRUDImpl cocheCRUD = new CocheCRUDImpl() {
    };

    public static void main(String[] args) {
        cocheCRUD.findAll();
        cocheCRUD.save(new Empleado());
    }
}
