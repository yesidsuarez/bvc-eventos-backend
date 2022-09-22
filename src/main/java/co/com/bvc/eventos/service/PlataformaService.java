package co.com.bvc.eventos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.bvc.eventos.entity.Plataforma;
import co.com.bvc.eventos.repository.PlataformaRepository;

@Service
public class PlataformaService {

	@Autowired
	private PlataformaRepository plataformaRepository;

	public List<Plataforma> getPlataformas() {
		return plataformaRepository.findAll();
	}

}
