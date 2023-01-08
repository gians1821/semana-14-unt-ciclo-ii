package entidades;

import java.util.*;

public class Concesionario {

    // Clase interna miembro
    public class Automovil {
        private String marca;
        private String modelo;
        private String placa;

        public Automovil() {
            this("NM", "NM", "NP");
        }

        public Automovil(String marca, String modelo, String placa) {
            this.marca = marca;
            this.modelo = modelo;
            this.placa = placa;
        }

        public String getPlaca() {
            return placa;
        }

        public void setPlaca(String placa) {
            this.placa = placa;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        @Override
        public String toString() {
            return "\nMarca: " + getMarca() + 
                   "\nModelo: " + getModelo() + 
                   "\nPlaca: " + getPlaca();
        }        
    } // fin de la clase interna Automovil
    
    private String compañia;
    private Gerente gerente;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Automovil> automoviles;

    public Concesionario() {
        this("NC", new Gerente());
    }

    public Concesionario(String compañia) {
        this(compañia, new Gerente());
    }    

    public Concesionario(String compañia, Gerente gerente) {
        this.compañia = compañia;
        this.gerente = gerente;
        vendedores = new ArrayList<>();
        automoviles = new ArrayList<>();
    }
    
    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }
     
    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Automovil> getAutomoviles() {
        return automoviles;
    }

    public void setAutomoviles(ArrayList<Automovil> automoviles) {
        this.automoviles = automoviles;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public void setAutomovil(Automovil automovil) {
        automoviles.add(automovil);
    }    
    
    public Automovil getAutomovil(int pos) {
        if(pos>=0 && pos<automoviles.size())
            return automoviles.get(pos);
        return null;
    }
    
    public void setVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }
    
    public Vendedor getVendedor(int pos) {
        if(pos>=0 && pos<vendedores.size())
            return vendedores.get(pos);
        return null;
    }
    
    @Override
    public String toString() {
        return "\nNombre de la compañi­a: " + getCompañia() +
               "\nDatos del gerente:" + gerente.toString();
    }
    
    public String getListadoAutomoviles() {
        Iterator<Automovil> iterador = automoviles.iterator();
        Automovil automovil;
        String contenido = "";
        int i = 0;
        while(iterador.hasNext()) {
            automovil = iterador.next();
            contenido += "\nAutomovil " + (++i) + ":" + automovil.toString();
        }
        return contenido;
    }
    
    public String getListadoVendedores() {
        Iterator<Vendedor> iterador = vendedores.iterator();
        Vendedor vendedor;
        String contenido = "";
        int i = 0;
        while(iterador.hasNext()) {
            vendedor = iterador.next();
            contenido += "\nVendedor " + (++i) + ": " + vendedor.toString();
        }
        return contenido;
    }
}