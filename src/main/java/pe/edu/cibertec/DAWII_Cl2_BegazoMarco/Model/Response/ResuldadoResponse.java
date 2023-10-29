package pe.edu.cibertec.DAWII_Cl2_BegazoMarco.Model.Response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResuldadoResponse {
    private Boolean respuesta;
    private String mensaje;
}
