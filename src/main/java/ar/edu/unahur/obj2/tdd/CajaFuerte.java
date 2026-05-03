package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {
    private Boolean open = true;
    private Integer codigo;

    public CajaFuerte(){}   // -> Si no se arma el constructor, implicitamente existe un constructor vacío como 
                            // -> el de la línea 8.

    public Boolean estaAbierta() {
        return this.open;
    }

    public void cerrar(Integer unCodigo) {
        if (this.open) {
            this.codigo = unCodigo;
            this.open = false;
        }
    }

    public void abrir(Integer unCodigo) {
        if (this.codigo.equals(unCodigo)) {
            this.open = true;
        }
    }

}
