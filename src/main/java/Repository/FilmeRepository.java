package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.topicosspingboot.Entity.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long>{

}
