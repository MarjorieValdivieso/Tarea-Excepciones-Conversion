import java.util.Scanner;
public class Main {
    public void main(){
        Scanner sc=new Scanner(System.in);
        ConversorMonedas conversor =new ConversorMonedas();
        try{
            System.out.print("Ingrese moneda origen (USD/EUR): ");
            String origen=sc.nextLine();
            System.out.print("Ingrese moneda destino (USD/EUR)");
            String destino=sc.nextLine();
            System.out.print("Ingrese cantidad");
            String cantidad=sc.nextLine();
            //Convertit String a double
            double cantidad1=Double.parseDouble(cantidad);
            double Resultado=conversor.convertir(origen,destino,cantidad1);
            //mostrar con 2 decimales
            System.out.println("Resultado: "+String.format("%.2f",Resultado));

        } catch (NumberFormatException e){
            System.out.println("Debe ingresar una cantidad valida");
        } catch (MonedaNoSoportadaException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Programa finalizado");
        }
        sc.close();
    }
}
