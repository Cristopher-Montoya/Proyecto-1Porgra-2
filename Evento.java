
package proyecto1programacion2;

import java.util.Calendar;
public abstract class Evento {
    private int codigo;
    private String titulo;
    private String descripcion;
    private Calendar fecha;
    private double montoRentaEstadio;
    private boolean cancelado;
    private boolean multa;

    public Evento(int codigo, String titulo, String descripcion, Calendar fecha, double montoRentaEstadio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.montoRentaEstadio = montoRentaEstadio;
        this.cancelado=false;
        this.multa=false;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public double getMontoRentaEstadio() {
        return montoRentaEstadio;
    }
    public boolean isCancelado() {
        return cancelado;
    }
    public boolean isMultaPagada(){
        return multa;
    }
    public void setisMultaCancelada(boolean cancel){
        this.multa=cancel;
    }
    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }
  
    @Override
    public String toString() {
        return "Evento{" + "codigo=" + codigo + ", titulo=" + titulo + ", descripcion=" + descripcion + ", fecha=" + fecha + ", montoRentaEstadio=" + montoRentaEstadio + ", cancelado=" + cancelado + ", multa=" + multa + '}';
    }
      public boolean puedeSerCancelado() {
        Calendar fechaActual = Calendar.getInstance();
        long diferenciaEnMilisegundos = fecha.getTimeInMillis() - fechaActual.getTimeInMillis();
        long diferenciaEnDias = diferenciaEnMilisegundos / (24 * 60 * 60 * 1000);
        return !cancelado && diferenciaEnDias >= 1;
    }
    public abstract double CalcularCadaEvento();

   
}
