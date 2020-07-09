/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico.pago;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class PagoTarjeta implements Pago{
    protected float pago;
    protected String monto, propietario, banco;
    protected Date expira;

    @Override
    public boolean realizarPago(float monto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
