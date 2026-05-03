package ar.edu.unahur.obj2.tdd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CajaFuerteTest {

    @Test
    public void queLaCajaFuerteEsteAbiertaALCrearse(){
        CajaFuerte caja = new CajaFuerte();
        assertTrue(caja.estaAbierta());
    }

    // También se puede crear metodos que se llamen en los tests para hacer
    // código más legible (NIVEL PURISTA)

    @Test
    public void queLaCajaFuerteEsteAbiertaALCrearse2(){
        CajaFuerte caja = crearCaja();
        verificarQueLaCajaEsteAbierta(caja);
    }

    private CajaFuerte crearCaja(){
        CajaFuerte caja = new CajaFuerte();
        return caja;
    }

    private void verificarQueLaCajaEsteAbierta(CajaFuerte caja){
        assertTrue(caja.estaAbierta());
    }

    @Test
    public void queSePuedaCerrarLaCajaFuerteConUnCodigo(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        assertFalse(caja.estaAbierta());
    }

    @Test
    public void queLaCajaFuerteSePuedaAbrirConElMismoCodigo(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.abrir(1234);
        assertTrue(caja.estaAbierta());
    }

    @Test
    public void queNoSePuedeAbrirLaCajaFuerteConElCodigoIncorrecto(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.abrir(0000);
        assertFalse(caja.estaAbierta());
    }
    
    @Test
    public void queNoSePuedeCerrarLaCajaFuerteEstandoCerrada(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.cerrar(5678);
        caja.abrir(1234);
        assertTrue(caja.estaAbierta());
    }

} 
