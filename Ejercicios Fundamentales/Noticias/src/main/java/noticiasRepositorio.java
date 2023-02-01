
import com.example.Noticias.entidades.noticias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface noticiasRepositorio extends JpaRepository<noticias, Integer>  {
    @Query ("SELECT n FROM noticias n WHERE n.titulo= :titulo")
    public noticias buscarTitulo(@Param("titulo")String titulo);
    
}
