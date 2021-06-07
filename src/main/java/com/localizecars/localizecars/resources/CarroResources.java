package com.localizecars.localizecars.resources;

import java.util.List;

import com.localizecars.localizecars.models.Carro;
import com.localizecars.localizecars.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@CrossOrigin
@Api(tags = { "Carro" })
public class CarroResources {

    @Autowired
    private CarroRepository carroRepository;

    @PostMapping("/registrarCarros")
    @ResponseStatus(HttpStatus.CREATED)
    public Carro registrarCarros(Carro carro) {
        return carroRepository.save(carro);
    }

    @GetMapping("/buscaCarros")
    public List<Carro> buscaCarro() {
        return carroRepository.findAll();
    }

}
