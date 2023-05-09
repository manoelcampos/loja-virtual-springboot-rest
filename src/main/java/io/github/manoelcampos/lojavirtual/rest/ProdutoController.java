package io.github.manoelcampos.lojavirtual.rest;

import io.github.manoelcampos.lojavirtual.model.Produto;
import io.github.manoelcampos.lojavirtual.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/produto")
@RestController
public class ProdutoController {
    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/all")
    public List<Produto> findAll(){
        return repository.findAll();
    }
}
