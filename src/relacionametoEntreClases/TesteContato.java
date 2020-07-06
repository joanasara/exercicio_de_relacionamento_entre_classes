package relacionametoEntreClases;

public class TesteContato {

	

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("joana");
		// contato.setTelefone("999999");

		Endereco end = new Endereco();
		end.setNomeDaRua("rua jose jathay");
		end.setNumero("999999999");
		end.setComplemento("_");
		end.setCidade("Fortaleza");
		end.setEstado("Ceara");
		end.setCep("9999999");

		contato.setEndereco(end);
		

		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("86");
		telefone.setNumero("8598648752");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("casa");
		telefone2.setDdd("85");
		telefone2.setNumero("8599332458");
		
		Telefone[]  telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		
		
		System.out.println(contato.getNome());
		

		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());

		}
       if(contato != null && contato.getTelefones() != null) {
    	   for(Telefone t : contato.getTelefones()) {
    		   System.out.println(t.getDdd() +" " + t.getNumero());
    	   }
    	   
       }

	}

}
