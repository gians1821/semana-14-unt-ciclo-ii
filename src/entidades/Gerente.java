package entidades;

public class Gerente {
    private String nombre;
    private String profesion;

    public Gerente() {
        this("NN", "NP");
    }

    public Gerente(String nombre, String profesion) {
        this.nombre = nombre;
        this.profesion = profesion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "\nNombre y apellidos: " + getNombre() + 
               "\nProfesión: " + getProfesion();
    }    
}