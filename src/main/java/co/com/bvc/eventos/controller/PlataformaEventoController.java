package co.com.bvc.eventos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import co.com.bvc.eventos.dto.PlataformaEventoDto;
import co.com.bvc.eventos.entity.PlataformaEvento;
import co.com.bvc.eventos.service.PlataformaEventoService;

@RestController
@RequestMapping("/evento")
@CrossOrigin(origins = "*")
public class PlataformaEventoController {

	@Autowired
	private PlataformaEventoService plataformaEventoService;

	@PostMapping
	public void createEvento(@RequestBody PlataformaEventoDto dto) {
		plataformaEventoService.createEventoByPlataforma(dto);
	}

	@GetMapping("{plataforma}")
	public List<PlataformaEvento> getEventos(@PathVariable String plataforma) {
		return plataformaEventoService.getEventosByPlataforma(plataforma);
	}
}
