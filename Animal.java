public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected double peso;
    protected String habitat;
    protected String color;

    public Animal(String nombre, int edad, double peso, String habitat, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.habitat = habitat;
        this.color = color;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void amamantar() {
        System.out.println(nombre + " está amamantando.");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Peso: " + peso + 
               ", Hábitat: " + habitat + ", Color: " + color;
    }
}