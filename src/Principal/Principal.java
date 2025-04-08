package Principal;
import javax.swing.JOptionPane;
import model.Veiculo;
public class Principal {

    public static void main(String[] args) {
        Veiculo ve = new Veiculo();
        ve.setKm(Double.parseDouble(JOptionPane.showInputDialog("Digite a distancia percorrida em KM: ")));
        ve.setLitros(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros de gasolina gastos: ")));
        double gastos = 0;
        JOptionPane.showMessageDialog(null, "O gasto é de " + ve.gastos(gastos) + " km/l");
    }
    
}
