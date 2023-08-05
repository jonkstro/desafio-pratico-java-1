
### Exercício para a Prova de Conhecimentos Aplicados

Contexto:

Uma instituição de ensino deseja desenvolver um sistema simples de gerenciamento de alunos. Este sistema deve ser capaz de armazenar informações básicas dos alunos, como nome, matrícula e notas das disciplinas cursadas.

Requisitos:

O sistema deve permitir a inserção de um novo aluno, com nome e número de matrícula.
Deve ser possível inserir notas para cada aluno em disciplinas específicas.
O sistema deve listar todos os alunos e suas respectivas notas.
Deve ser possível calcular a média das notas de um aluno.
O sistema deve identificar e listar alunos com média abaixo de 7.0, considerando-os como "em recuperação".

**Questão 1:** Desenvolver um programa que permita a inserção de um novo aluno com as informações de nome e matrícula. (Avaliação da funcionalidade básica do sistema)

**Questão 2:** Expanda o programa anterior para que possa inserir notas para cada aluno em disciplinas específicas. (Manipulação de estruturas de dados)

**Questão 3:** Desenvolva uma funcionalidade que liste todos os alunos e suas respectivas notas. (Manipulação e exibição de dados)

**Questão 4:** Implemente uma função que calcule a média das notas de um aluno específico. (Cálculo e manipulação de dados)

**Questão 5:** No código a seguir, identifique e corrija os erros que impedem o correto funcionamento do sistema. (Análise e correção de código-fonte)

	public class Aluno {
	    private String nome;
	    privte int matricula;
	    private double nota1, nota2, nota3;
    
	    public String getNome() {
	        return nome
	    }
	    
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    
	    public int getMatricula() {
	        return matricula;
	    }
	    
	    public void setMatricula(int matricula) {
	        this.matricula == matricula;
	    }
	    
	    public double calculaMedia() {
	        return (nota1 + nota2 + nota3) / 2;
	    }
	}
**Questão 6:** Refatore o código acima para que esteja de acordo com as boas práticas de desenvolvimento, mantendo a sua funcionalidade. (Refatoração e Clean Code)

**Questão 7:** Desenvolva um teste unitário para validar a funcionalidade de cálculo da média das notas de um aluno. (Elaboração de testes)

Instruções:

Utilize a linguagem Java para o desenvolvimento da solução.
Atenção à sintaxe e boas práticas de programação.
Avalie o resultado (saída do software) e garanta a correta execução do software a partir dos requisitos descritos.
Boa sorte!







RESPOSTAS:

Questão 5: No código a seguir, identifique e corrija os erros que impedem o correto funcionamento do sistema. (Análise e correção de código-fonte)


CÓDIGO ANTIGO:

	public class Aluno {
		private String nome;
		privte int matricula;
		private double nota1, nota2, nota3;

		public String getNome() {
			return nome
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public int getMatricula() {
			return matricula;
		}
		
		public void setMatricula(int matricula) {
			this.matricula == matricula;
		}
		
		public double calculaMedia() {
			return (nota1 + nota2 + nota3) / 2;
		}
	}



CÓDIGO REFATORADO:

	public class Aluno {
		private String nome;
		private int matricula; //adicionado 'a'
		private double nota1, nota2, nota3;

		public String getNome() {
			// adicionado ';'
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public int getMatricula() {
			return matricula;
		}
		
		public void setMatricula(int matricula) {
			this.matricula == matricula;
		}
		
		public double calculaMedia() {
			return (nota1 + nota2 + nota3) / 2;
		}
	}