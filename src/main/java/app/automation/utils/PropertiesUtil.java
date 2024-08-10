package app.automation.utils;

import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;
import org.apache.commons.lang3.StringUtils;

import java.util.Properties;

public class PropertiesUtil {
    private static final EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

    private PropertiesUtil() {
    }

    public static Properties getPropertiesWhitPrefix(String prefix) {
        return environmentVariables.getPropertiesWithPrefix(prefix);
    }

    public static EnvironmentVariables getEnvironmentVariables() {
        return environmentVariables;
    }

    public static String getProperty(String nombrePropiedad) {
        String valorPropiedad = environmentVariables.getProperty(nombrePropiedad);
        if (StringUtils.isBlank(valorPropiedad)) {
            valorPropiedad = environmentVariables.getValue(nombrePropiedad);
        }
        return valorPropiedad;
    }
}
