
package ejercicio6.Entidades;


public class Ahorcado {
    private char vector [];
    private int letrasEncontradas;
    private int jugadas;

    public Ahorcado() {
    }

    public Ahorcado(char[] vector, int letrasEncontradas, int jugadas) {
        this.vector = vector;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadas = jugadas;
    }

    public char[] getVector() {
        return vector;
    }

    public void setVector(char  [] vector) {
        this.vector = vector;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }
    
    
}
