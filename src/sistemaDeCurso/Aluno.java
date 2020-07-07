package sistemaDeCurso;

public class Aluno {

	private String nome;
	private String matricula;
	private double[] notas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String obterInfor() {
		String infor = "Nome do aluno = " + nome + "; ";
		infor += "Matricula " + matricula + "; ";
		infor += "Notas: ";

		double soma = 0;
		for (double nota : notas) {
			soma += nota;
			infor += nota + " ";
		}
		double media = soma / 4;
		infor += "\n" + "Media = " + media;
		if (media >= 7) {
			infor += "Aprovador";
		} else {
			infor += "Reprovado";
		}
		return infor;

	}

	public double obterMedia() {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;

		}
		return soma / 4;
	}

}
