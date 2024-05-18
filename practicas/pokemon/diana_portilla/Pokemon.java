package practicas.pokemon.diana_portilla;


interface Elemento {
    String getElementType();
}

class Pokemon {
    private String nombre;
    private int nivel;
    private int edad;

    public Pokemon(String nombre, int nivel, int edad) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.edad = edad;
    }

    public void atacar() {
        System.out.println(nombre + " Ataca!!");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNivel() {
        return nivel;
    }
}

