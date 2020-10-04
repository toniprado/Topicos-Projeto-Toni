package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.topicosspingboot.Entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
