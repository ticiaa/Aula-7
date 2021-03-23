package Programa;

import Classes.Aluno;

public class AlunoProg {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Leticia", "123.456.789-00");
        aluno.setEndereco("Rua Abc, 123");
        aluno.setTelefone("2742-5599");
        aluno.setMatricula("4444");

        System.out.println("Aluno:" + aluno.getNome());
        System.out.println("Endereço: " + aluno.getEndereco());
        System.out.println("Telefone: " + aluno.getTelefone());
    }

}
