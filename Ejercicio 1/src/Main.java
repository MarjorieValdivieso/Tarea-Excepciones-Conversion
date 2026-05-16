import java.util.Scanner;
public class Main {
    public void main(){
        Scanner sc= new Scanner(System.in);
        try{
            System.out.println("Ingrese un numero entero: ");
            //convertir de String  a entero
            int numero=Integer.parseInt(sc.nextLine());
            double resultado=100/ numero;
            System.out.println("Resultado: "+resultado);

        } catch (ArithmeticException e ){
            System.out.println("No se puede dividir para cero");

        }catch (NumberFormatException e){
            System.out.println("Debe ingresar un numero validp");

        }finally {
            System.out.println("Programa finalizado");
        }
        sc.close();
    }
}
