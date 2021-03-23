package Programa;

import Classes.Professor;

public class Programa {
    public static void main(String[] args) {
        Professor professor = new Professor("OSNF", "Rafael");
        professor.setNome("Rafael");
        professor.setCargo("Professor");
        professor.setMateria("História");
        professor.setHorario("7h30 - 13h00");
        professor.setTelefone("0000-0000");
        professor.setSalario(3500.00);

        System.out.println("Funcionário:" + professor.getNome());
        System.out.println("Cargo:" + professor.getCargo());
        System.out.println("Formação:" + professor.getMateria());
        System.out.println("Carga horária:" + professor.getHorario());

    }

}
