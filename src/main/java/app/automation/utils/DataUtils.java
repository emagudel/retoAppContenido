package app.automation.utils;

import app.automation.exceptions.AppException;

import java.security.SecureRandom;

public class DataUtils {
    private static final SecureRandom random = new SecureRandom();

    private DataUtils() {
    }

    public static int numeroAleatorio(int tamano) {
        if (tamano < 1) {
            throw new AppException("tamaño debe ser mayor a 0");
        }
        return random.nextInt(tamano) + 1;
    }

    public static int numeroAleatorioLista(int tamano) {
        if (tamano < 1) {
            throw new AppException("tamaño debe ser mayor a 0");
        }
        return random.nextInt(tamano);
    }
}
