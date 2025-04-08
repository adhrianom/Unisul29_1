
package model;

public class Veiculo {
    private double km;
    private double litros;

    public Veiculo() {
    }

    public Veiculo(double km, double litros) {
        this.km = km;
        this.litros = litros;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
    
    public double gastos(double gasto){
        return km / litros;
    }
    
}
