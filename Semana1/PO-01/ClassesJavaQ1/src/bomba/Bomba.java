package bomba;

public class Bomba {
	private float potencia;
	private int bombTimer;
	
    public float getPotencia(){
        return this.potencia;
    }

    void setPotencia(float potencia){
        this.potencia = potencia;
    }

    int getBombTimer(){
        return this.bombTimer;
    }

    void setBombTimer(int bombTimer){
        this.bombTimer = bombTimer;
    }

    void explodir(){
        System.out.println("'Explosao'");
    }
}
