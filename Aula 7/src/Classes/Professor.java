package Classes;

public class Professor extends Funcionario {
    private String materia;

    public Professor(String empresa, String nome) {
        super(empresa, nome);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

}