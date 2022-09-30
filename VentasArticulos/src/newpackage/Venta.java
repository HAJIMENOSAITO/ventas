package newpackage;


public class Venta {
    private String fecha = "";
    private double neto =0;
    private double iva =0;
    private double total =0;
    private int articulos =0;
    
    //creamos constructor

    public Venta(String fecha, double neto, double iva, double total, int articulos) {
        this.fecha=fecha;
        this.neto=neto;
        this.iva=iva;
        this.total=total;
        this.articulos=articulos;
        
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getArticulos() {
        return articulos;
    }

    public void setArticulos(int articulos) {
        this.articulos = articulos;
    }
    
}
