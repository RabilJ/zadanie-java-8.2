import java.util.Objects;

public class Snake {
    private String species;
    private double lenght;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public Snake(String species, double lenght) {
        this.species = species;
        this.lenght = lenght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snake snake = (Snake) o;
        return lenght == snake.lenght &&
                Objects.equals(species, snake.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, lenght);
    }

    @Override
    public String toString() {
        return "Gatunek: "+getSpecies()+"\n"+"Długość: "+getLenght()+"\n";
    }
}
