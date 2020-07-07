package sistemaDeCurso;

import java.util.Scanner;

public class Teste01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("digite o nome do curso");
		String nome = leia.nextLine();

		System.out.println("digite o horario do curso");
		String horario = leia.nextLine();

		System.out.println("digite o nome do professor");
		String nomeprof = leia.nextLine();
		System.out.println("entre com o departamento do professor");
		String deparprof = leia.nextLine();
		System.out.println(" digite o email do professor");
		String emailprof = leia.nextLine();

		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);

		Professor professor = new Professor();
		professor.setNome(nomeprof);
		professor.setDepartamento(deparprof);
		professor.setEmail(emailprof);

		curso.setProfessor(professor);
		Aluno[] alunos = new Aluno[5];
		System.out.println("----Alunos-----");
		for (int i = 0; i < 5; i++) {

			leia.nextLine();

			System.out.println("Entre com o nome do aluno " + (i + 1));
			String nomeAluno = leia.nextLine();

			System.out.println("Entre com a matricula do aluno: ");
			String matAluno = leia.nextLine();

			double[] notas = new double[4];
			for (int j = 0; j < 4; j++) {
				System.out.println("Entre com a nota " + (j + 1));
				notas[j] = leia.nextDouble();
			}
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas);

			alunos[i] = aluno;
		}

		curso.setAlunos(alunos);

		System.out.println(curso.obterInfor());
     
		leia.close();
	}

}
