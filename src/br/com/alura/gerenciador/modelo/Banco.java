package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresas = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		//Cria duas empresas por default, ou seja, a aplica��o vai sempre iniciar com duas empresas
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
		
		//cria dois usu�rios por default (idem empresa)
		Usuario u1 = new Usuario();
		u1.setLogin("jonas");
		u1.setSenha("123");
		Usuario u2 = new Usuario();
		u2.setLogin("ana");
		u2.setSenha("123");
		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
	}

	//M�todo para adicionar/criar uma nova empresa
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.listaEmpresas.add(empresa);
	}
	
	//M�todo para carregar todas as empresas cadastradas
	public List<Empresa> getEmpresas(){
		return Banco.listaEmpresas;
	}

	//M�todo para remover/excluir uma empresa via id
	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = listaEmpresas.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}
	}

	//M�todo para buscar/encontrar empresa pelo id
	public Empresa buscaEmpresaPelaId(Integer id) {
		for (Empresa empresa : listaEmpresas) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	//M�todo para verificar se o usu�rio e senha informados existem
	public Usuario existeUsuario(String login, String senha) {
		for(Usuario usuario : listaUsuarios) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}

}
