public class Main {

    public static void main(String[] args) {

        try {

            Estudiante e1 = new Estudiante("Marjorie", 21, 9.5);
            e1.mostrarDatos();

            Estudiante e2 = new Estudiante("Carlos", -5, 8.7);
            e2.mostrarDatos();

            Estudiante e3 = new Estudiante("Lucia", 22, 9.1);
            e3.mostrarDatos();

        } catch (EdadInvalidaException e) {

            System.out.println(e.getMessage());
        }

    }
}