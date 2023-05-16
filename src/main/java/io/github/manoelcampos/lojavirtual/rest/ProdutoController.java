package io.github.manoelcampos.lojavirtual.rest;

import io.github.manoelcampos.lojavirtual.model.Produto;
import io.github.manoelcampos.lojavirtual.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RequestMapping("/produto")
@RestController
public class ProdutoController {
    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    public Long insert(@RequestBody Produto produto){
        repository.save(produto);
        return produto.getId();
    }

    @PutMapping
    public void update(@RequestBody Produto produto){
        repository.save(produto);
    }

    @GetMapping("/all")
    public List<Produto> findAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Produto findById(@PathVariable Long id){
        System.out.println("findById: " + id);
        return
                repository
                        .findById(id)
                        .orElseThrow(
                                () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/modelo/{id}")
    public List<Produto> findAllByModeloId(@PathVariable Long id) {
        return repository.findAllByModeloId(id);
    }

    @GetMapping("/em-estoque")
    public List<Produto> findAllProdutosEmEstoque() {
        return repository.findAllProdutosEmEstoque();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        repository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        repository.deleteById(id);
    }
}
