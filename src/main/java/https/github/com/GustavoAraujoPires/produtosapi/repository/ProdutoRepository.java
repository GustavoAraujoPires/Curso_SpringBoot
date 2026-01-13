package https.github.com.GustavoAraujoPires.produtosapi.repository;

import https.github.com.GustavoAraujoPires.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
