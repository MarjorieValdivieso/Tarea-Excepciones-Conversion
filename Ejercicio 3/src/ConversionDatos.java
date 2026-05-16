import java.lang.reflect.AnnotatedArrayType;

public class ConversionDatos {
    public void main(){
        //Parte A
        System.out.println("Parte A Conversion Implicita");
        byte b= 10;
        short s= b;
        int i= s;
        long l=i;
        float f=l;
        double d=f;

        System.out.println("Byte: "+b);
        System.out.println("Short: "+s);
        System.out.println("Int: "+i);
        System.out.println("Long: "+l);
        System.out.println("Float: "+f);
        System.out.println("Double"+d);
        //Parte B
        System.out.println("Parte B Casting explicito");
        double numero=45.89;
        float numFloat=(float) numero;
        int numInt = (int) numero;
        short numShort = (short) numero;
        byte numByte = (byte) numero;

        System.out.println("double: " + numero);
        System.out.println("float: " + numFloat);
        System.out.println("int: " + numInt);
        System.out.println("short: " + numShort);
        System.out.println("byte: " + numByte);
        //Se pierde la parte decimal al convertir a int, short y byte.
        //Parte C
        System.out.println("Parte C Conversion con String");

        String textoInt = "2024";
        String textoDouble = "98.6";
        String textoBoolean = "false";

        int numeroInt = Integer.parseInt(textoInt);
        double numeroDouble = Double.parseDouble(textoDouble);
        boolean valorBoolean = Boolean.parseBoolean(textoBoolean);

        System.out.println("int: " + numeroInt);
        System.out.println("double: " + numeroDouble);
        System.out.println("boolean: " + valorBoolean);
        String s1 = String.valueOf(numeroInt);
        String s2 = Double.toString(numeroDouble);
        String s3 = Boolean.toString(valorBoolean);

        System.out.println("Convertidos nuevamente a String:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //parte D
        System.out.println("Parte D Casting de objetos");
        Animal animal=new Perro();
        animal.hacerSonido();

        if (animal instanceof Perro) {

            Perro perro = (Perro) animal;

            perro.ladrar();}

    }
}
