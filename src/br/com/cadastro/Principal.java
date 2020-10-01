package br.com.cadastro;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import br.com.cadastro.model.Jogador;
import br.com.cadastro.negocio.JogadorImpl;


public class Principal {
	public static void main(String[] args) {
		JogadorImpl jogImpl = new JogadorImpl();
		String enderecoDir = "C:\\workspaces\\StreamsExample\\resources";
		String nomeArquivo = "jogadores.txt";
		List<Jogador> listaDeJogadores = null;
		try {
			listaDeJogadores = jogImpl.getListaDeJogadores(Paths.get(enderecoDir + "\\" + nomeArquivo));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (!jogImpl.verificarArquivoExiste(Paths.get(enderecoDir))){
			System.out.println("Arquivo não encontrado");
		}
		else
		{  
			//jogImpl.imprimirListaJogadores(listaDeJogadores);
			//jogImpl.imprimirJogadorArtilheiro(listaDeJogadores);   
			//jogImpl.imprimirJogadorMaisVelho(listaDeJogadores); 
			//jogImpl.imprimirJogadorMaisNovo(listaDeJogadores);
			jogImpl.imprimirJogadorMaisNovoDaLista(listaDeJogadores);
		}
	}
}