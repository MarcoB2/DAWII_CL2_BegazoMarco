package pe.edu.cibertec.DAWII_Cl2_BegazoMarco.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWII_Cl2_BegazoMarco.Model.Rol;

@Repository
public class RolRepository extends JpaRepository<Rol, Integer> {
    Rol findByNomrol(String nombrerol);
}
