package pe.edu.cibertec.DAWII_Cl2_BegazoMarco.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWII_Cl2_BegazoMarco.Model.Usuario;

@Repository
public class UsuarioRepository {
    JpaRepository<Usuario, Integer>

    {
        Usuario findByEmail (String email);
        Usuario findByNomusuario (String nomusuario);
    }
}
