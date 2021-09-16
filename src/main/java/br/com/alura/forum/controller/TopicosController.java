package br.com.alura.forum.controller;



import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Pessoa;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {

	
	
	
	@RequestMapping("/topicos")
	@ResponseBody
	public List<TopicoDto> lista(){
		final Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programacao"));
		
		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
	}
	
	
	@RequestMapping("/nome")
	@ResponseBody
	public List<Pessoa> listarNome(){
		final Pessoa p1 = new Pessoa("Igor", "Coreano", 15, "nao binario");
		Pessoa p2 = new Pessoa("Rafael", "Coreano", 15, "nao binario");
		p2 =  new Pessoa("João", "Coreano", 15, "nao binario");
		return Arrays.asList(p1, new Pessoa("Ricardo", "Africano", 30, "Trans"), p2);
	}
}
