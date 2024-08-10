package app.automation.utils;

import app.automation.models.DataManager;
import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.person.Person;
import com.github.javafaker.Faker;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.util.Locale;

public class GeneradorDatos {

    private static final Fairy FAIRY = Fairy.create(Locale.forLanguageTag("es"));
    private static final Faker FAKER = new Faker();
    private static final SecureRandom random = new SecureRandom();

    private GeneradorDatos() {
    }

    public static Person getPersona() {
        return FAIRY.person();
    }

    public static String cedulaValida() {

        StringBuilder cedulaBuilder = new StringBuilder();

        // Generar los primeros 9 dígitos (posiciones 0 a 8)
        for (int i = 0; i < 9; i++) {
            int digit = random.nextInt(10); // Generar un dígito aleatorio del 0 al 9
            cedulaBuilder.append(digit);
        }

        // Calcular el último dígito (posición 9) utilizando el algoritmo de validación de cédula
        int total = 0;
        String cedula = cedulaBuilder.toString();
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(cedula.charAt(i));
            if (i % 2 == 0) {
                int doubled = digit * 2;
                total += (doubled > 9) ? doubled - 9 : doubled;
            } else {
                total += digit;
            }
        }
        int lastDigit = (total % 10 == 0) ? 0 : 10 - (total % 10);
        cedulaBuilder.append(lastDigit);

        return cedulaBuilder.toString();
    }

    public static String cedulaInvalida() {
        StringBuilder cedulaBuilder = new StringBuilder();

        // Generar los primeros 9 dígitos (posiciones 0 a 8)
        for (int i = 0; i < 9; i++) {
            int digit = random.nextInt(10); // Generar un dígito aleatorio del 0 al 9
            cedulaBuilder.append(digit);
        }

        // Generar un último dígito aleatorio diferente al calculado por el algoritmo de validación
        int randomDigit = random.nextInt(10); // Generar un dígito aleatorio del 0 al 9
        cedulaBuilder.append(randomDigit);

        return cedulaBuilder.toString();
    }

    public static Faker getFaker() {
        return FAKER;
    }

    public static String generatePassword() {
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        // Generar 2 dígitos no consecutivos
        int digitCount = 0;
        int prevDigitIndex = -1;
        while (digitCount < 2) {
            int digitIndex = random.nextInt(digits.length());
            if (digitIndex != prevDigitIndex + 1) {
                password.append(digits.charAt(digitIndex));
                prevDigitIndex = digitIndex;
                digitCount++;
            }
        }

        // Generar el resto de la contraseña (mínimo 7 caracteres)
        int remainingLength = 7;
        while (remainingLength > 0) {
            int charType = random.nextInt(2); // 0: minúscula, 1: mayúscula
            if (charType == 0) {
                password.append(lowerCase.charAt(random.nextInt(lowerCase.length())));
            } else {
                password.append(upperCase.charAt(random.nextInt(upperCase.length())));
            }
            remainingLength--;
        }

        return password.toString();
    }

    public static String cambioComaPunto(String valor) {
        return valor.replace(",", ".");
    }

    public static String cambioPuntoComa(String valor) {
        return valor.replace(".", ",");
    }

    public static String generarRecarga(String valor) {
        BigDecimal mitad = new BigDecimal(cambioComaPunto(valor)).divide(new BigDecimal(4), RoundingMode.HALF_UP);
        String valorGenerado = cambioPuntoComa(String.valueOf(mitad.multiply(BigDecimal.valueOf(random.nextDouble()))
                .setScale(2, RoundingMode.HALF_UP)));
        DataManager.getInstance().getDatosPrueba().put("valor", GeneradorDatos.cambioComaPunto(valorGenerado));
        return valorGenerado;
    }


}
