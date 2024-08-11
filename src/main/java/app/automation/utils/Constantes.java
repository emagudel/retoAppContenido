package app.automation.utils;

import org.apache.commons.lang3.StringUtils;

public class Constantes {

    public static final String PAQUETE_NAVEGADOR = "com.android.chrome";
    public static final String PAQUETE_APPQA = "com.appqa";
    public static final long TIME_OUT_5 = 5;
    public static final long TIME_OUT_10 = 10;
    public static final long TIME_OUT_15 = 15;
    public static final long TIME_OUT_30 = 30;
    public static final long TIME_OUT_60 = 60;
    public static final long TIME_OUT_120 = 120;
    public static final String ENVIRONMENT = StringUtils.defaultString(System.getProperty("env"), "qa");
    public static final String QA = "qa";
    public static final String PLATFORM = StringUtils.defaultString(System.getProperty("platform"), "android");
    public static final String PLATFORM_ANDROID = "android";
    public static final String PLATFORM_IOS = "ios";
    public static final String APP_ROUTE = "src/test/resources/apps/app-test-QA.apk";
    public static final String VALOR_INICIAL = "valor_inicial";
    public static final String PENDIENTE_IOS = "pendiente mapeo de iOS";
    private Constantes() {
    }
}
