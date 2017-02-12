/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author Jose Lira
 */
public class Petrolio {
    private Double diesel;
    private Double regular;
    private Double especial;
    private Double cantidad;
    private Double pago;
    
    
  public Petrolio(){
    this.diesel = 2.53;
    this.regular = 2.90;
    this.especial = 3.11;
    }

    /**
     * @return the diesel
     */
    public Double getDiesel() {
        return diesel;
    }

    /**
     * @return the regular
     */
    public Double getRegular() {
        return regular;
    }

    /**
     * @return the especial
     */
    public Double getEspecial() {
        return especial;
    }
    public Double getPago() {
        return pago;
    }

    public void setPago(Double pago) {
        this.pago = pago;
    }
       public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
    
    
    public double ventaGalones(double cantidad,double tipo)
    {
    if(tipo == 1)
    {
    tipo = this.diesel;
    }
     if(tipo == 2)
    {
    tipo = this.regular;
    }
      if(tipo == 3)
    {
    tipo = this.especial;
    }
    this.pago = cantidad * tipo;
    return 0;
    }
    public double ventaDinero(double cantidad, double tipo)
    {
    if(tipo == 1)
    {
    tipo = this.diesel;
    }
     if(tipo == 2)
    {
    tipo = this.regular;
    }
      if(tipo == 3)
    {
    tipo = this.especial;
    }
    this.cantidad = cantidad / tipo;
    return 0;
    }
}
