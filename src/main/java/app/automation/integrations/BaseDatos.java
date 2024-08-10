package app.automation.integrations;

import app.automation.exceptions.AppException;
import app.automation.utils.PropertiesUtil;
import app.automation.utils.QueryLoader;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.Query;
import org.jdbi.v3.core.statement.Update;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.Optional;

public class BaseDatos {
    public static final String MEMSAJE_ERROR_CONSULTA = "Error al ejecutar la consulta {}";
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseDatos.class);
    private static Connection connection;

    private BaseDatos() {
    }

    private static Jdbi conexion(String nombreDB) {
        String url = PropertiesUtil.getProperty("DB_URL");
        String user = PropertiesUtil.getProperty("DB_USER");
        String password = PropertiesUtil.getProperty("DB_CREDENTIAL");
        try {
            if (connection != null) {
                connection.close();
            }
            connection = DriverManager.getConnection(String.format(url, nombreDB), user, password);
            return Jdbi.create(connection);
        } catch (SQLException e) {
            throw new AppException(e.getMessage(), e);
        }
    }

    public static <T> T ejecutarConsulta(String nombreBaseDatos, String nombreConsulta,
                                         Map<String, Object> parametros, Class<T> clase) {
        T resultadoConsulta = null;
        try (Handle handle = conexion(nombreBaseDatos).open()) {
            try (Query query = handle
                    .createQuery(QueryLoader.CONSULTAS_BD.getString(nombreConsulta)).bindMap(parametros)) {

                Optional<T> optionalResult = query.mapToBean(clase).findOne();
                if (optionalResult.isPresent()) {
                    resultadoConsulta = optionalResult.get();
                }
            }
        } catch (Exception e) {
            LOGGER.error(MEMSAJE_ERROR_CONSULTA, e.getMessage());
        }
        return resultadoConsulta;
    }

    public static int ejecutarUpdates(String nombreBaseDatos, String nombreConsulta, Map<String, Object> parametros) {
        int registrosAfectados = 0;
        try (Handle handle = conexion(nombreBaseDatos).open()) {
            try (Update update = handle.createUpdate(QueryLoader.CONSULTAS_BD.getString(nombreConsulta))
                    .bindMap(parametros)) {
                registrosAfectados = update.execute();
            }
        } catch (Exception e) {
            LOGGER.error(MEMSAJE_ERROR_CONSULTA, e.getMessage());
        }
        return registrosAfectados;
    }

}
