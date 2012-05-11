package VampireWarGame;

/**
 *
 * @author drako
 * 
 */

public abstract class Fichas {
    protected int lifePoints;
    protected int damagePoints;
    protected int cantMovientos;
    protected static int POSICION_X;
    protected static int POSICION_Y;
    protected String nombreFicha;
    protected String colorFicha;

    public Fichas(String nombre, String color){
        nombreFicha = nombre;
        colorFicha = color;
    }
    
    public abstract void setCantMovimientos(int cant);
    
    public abstract boolean validarMovieminto(String posInicial, String posDestino);
    
    public abstract int setDamagePoints(int codigoFicha);
    
    public abstract void setMovimientos(String x, String y);
    
    public abstract void Movientos();
    
    public int y(char y){
        switch(y){   
    case 'A': return 0;
    case 'B': return 1;
    case 'C': return 2;
    case 'D': return 3;
    case 'E': return 4;
    case 'F': return 5;
    default: return -1;
        }
    }

// PROBANDO EL REPO DE GITHIB
      public abstract void prueba(){
      }

//    public abstract void setPOSICION_X(int POSICION_X);

  //  public abstract void setPOSICION_Y(int POSICION_Y);
}
