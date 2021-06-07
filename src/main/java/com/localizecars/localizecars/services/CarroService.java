package com.localizecars.localizecars.services;

import java.util.ArrayList;
import com.localizecars.localizecars.models.Anos;
import com.localizecars.localizecars.models.Marcas;
import com.localizecars.localizecars.models.Modelos;
import com.localizecars.localizecars.models.Valor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class CarroService {

	@Autowired
	private WebClient webClient;

	public ArrayList<Marcas> findAllMarcas() {
		Mono<ArrayList> monoMarca = webClient.method(HttpMethod.GET).uri("/marcas").retrieve()
				.bodyToMono(ArrayList.class);

		monoMarca.subscribe(marcas -> {
			System.out.println(marcas);
		});
		return null;
	}

	public ArrayList<Modelos> findAllModelos() {
		Mono<ArrayList> monoModelo = webClient.method(HttpMethod.GET).uri("/{codigo}/modelos").retrieve()
				.bodyToMono(ArrayList.class);

		monoModelo.subscribe(modelos -> {
			System.out.println(modelos);
		});

		return null;
	}

	public ArrayList<Anos> findAllAnos() {
		Mono<ArrayList> monoAno = webClient.method(HttpMethod.GET).uri("/{codigo}/anos").retrieve()
				.bodyToMono(ArrayList.class);

		monoAno.subscribe(anos -> {
			System.out.println(anos);
		});

		return null;
	}

	public ArrayList<Valor> findAllValor() {
		Mono<ArrayList> monoValor = webClient.method(HttpMethod.GET).uri("/anos/{codigo}").retrieve()
				.bodyToMono(ArrayList.class);

		monoValor.subscribe(valor -> {
			System.out.println(valor);
		});

		return null;
	}

}