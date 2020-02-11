package br.com.marmita;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.marmita.model.Usuario;
import br.com.marmita.model.enums.NivelAcesso;
import br.com.marmita.repositories.UsuarioRepository;

@SpringBootApplication
public class MarmitaApplication implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MarmitaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{

		Usuario user1 = new Usuario(null, "Felizberto", "abacaxi20", "abacaxi20", NivelAcesso.USUARIO);
		
		usuarioRepository.saveAll(Arrays.asList(user1));
	}

}