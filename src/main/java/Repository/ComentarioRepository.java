package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.topicosspingboot.Entity.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long>{

}
