package app.automation.utils;

import app.automation.exceptions.AppException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FileUtils {
    private FileUtils() {
    }

    public static void guardarArchivoBugs(Map<String, String> datos) {

        String directorioProyecto = System.getProperty("user.dir") + File.separator + "src" + File.separator +
                "main" + File.separator + "java" + File.separator + "app" + File.separator + "deuna" + File.separator +
                "integrations" + File.separator + "azure";

        String rutaCarpetaBugs = directorioProyecto + File.separator + "bugs";
        File carpetaBugs = new File(rutaCarpetaBugs);
        if (!carpetaBugs.exists()) {
            carpetaBugs.mkdirs();
        }

        String nombreArchivo = rutaCarpetaBugs + File.separator + datos.get("tag");
        File archivo = new File(nombreArchivo);

        if (!archivo.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
                writer.write("status: " + datos.get("status"));
                writer.newLine();
                writer.write("tag: " + datos.get("tag"));
                writer.newLine();
                writer.write("url: " + datos.get("url"));
                writer.newLine();
                writer.write("error: " + datos.get("error"));
            } catch (IOException e) {
                throw new AppException(e.getMessage());
            }
        }
    }
}
