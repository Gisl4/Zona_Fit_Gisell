package gl.zona_fit.repositorio;

import gl.zona_fit.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

}
