public class EdadInvalidaException extends  Exception{
    private int edadIngresada;

    public EdadInvalidaException(int edadIngresada) {
        super("Error la edad ingresada("+edadIngresada+") no es valida");
        this.edadIngresada = edadIngresada;
    }

    public int getEdadIngresada() {
        return edadIngresada;
    }
}
