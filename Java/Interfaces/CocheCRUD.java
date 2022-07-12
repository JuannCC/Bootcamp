package interfaces;
import java.util.List;

public interface CocheCRUD {

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);

    public interface EmpleadosCRUD {
        void save(Empleado empleado);

        List<Empleado> findAll();

        void delete(Empleado empleado);
    }
}
