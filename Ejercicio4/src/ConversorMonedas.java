public class ConversorMonedas {

    public double convertir(String monedaOrigen,
                            String monedaDestino,
                            double cantidad)
            throws MonedaNoSoportadaException {

        // USD -> EUR
        if (monedaOrigen.equalsIgnoreCase("USD")
                && monedaDestino.equalsIgnoreCase("EUR")) {

            return cantidad * 0.92;
        }

        // EUR -> USD
        else if (monedaOrigen.equalsIgnoreCase("EUR")
                && monedaDestino.equalsIgnoreCase("USD")) {

            return cantidad * 1.09;
        }

        // Moneda no soportada
        else {

            throw new MonedaNoSoportadaException(
                    "Moneda no soportada");
        }
    }
}