package co.com.bvc.eventos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import co.com.bvc.eventos.entity.Plataforma;
import co.com.bvc.eventos.service.PlataformaService;

@RestController
@RequestMapping("/plataforma")
@CrossOrigin(origins = "*")
public class PlataformaController {

	@Autowired
	private PlataformaService plataformaService;

	@GetMapping
	public List<Plataforma> getPlataformas() {
		return plataformaService.getPlataformas();
	}
}
