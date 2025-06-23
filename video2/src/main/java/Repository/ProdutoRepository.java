package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
