package com.localizecars.localizecars.controller;

import java.util.ArrayList;

import com.localizecars.localizecars.models.Marcas;
import com.localizecars.localizecars.models.Valor;
import com.localizecars.localizecars.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marcas")
public class CarroController {

	@Autowired
	private CarroService carroService;

	@GetMapping("/listar")
	public ArrayList<Marcas> getMarcas() {
		ArrayList<Marcas> marcas = carroService.findAllMarcas();

		return null;
	}

	@GetMapping("/listarValor")
	public ArrayList<Valor> getValor() {
		ArrayList<Valor> valor = carroService.findAllValor();
		return valor;
	}
}
