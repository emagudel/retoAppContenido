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

    public static final String RUTA_PLANTILLAS = "/plantillas/%s.ftl";
    public static final String TOKEN_TYPE = "Bearer";
    public static final String SCOPE = "read:users delete:users read:users_app_metadata update:users create:users";
    public static final String SCOPE_AUTH_USER = "openid profile email read:current_user update:current_user_metadata delete:current_user_metadata create:current_user_metadata create:current_user_device_credentials delete:current_user_device_credentials update:current_user_identities offline_access";
    public static final int TOKEN_EXPIRES_IN = 1680;
    public static final String USERID_AUTH0 = "userid_auth0";
    public static final String ENVIRONMENT = StringUtils.defaultString(System.getProperty("env"), "qa");
    public static final String QA = "qa";
    public static final String PLATFORM = StringUtils.defaultString(System.getProperty("platform"), "android");
    public static final String PLATFORM_ANDROID = "android";
    public static final String PLATFORM_IOS = "ios";
    public static final String IPHONE_12PRO = "iPhone 12 Pro";
    public static final String PASSWD_FAKEAPP_YISUS = "Pichincha01";
    public static final String APP_ROUTE = "src/test/resources/apps/app-test-QA.apk";
    public static final String BS_MID_INSTALL = "browserstack.midSessionInstallApps";
    public static final String SALDO_INICIAL = "saldo_inicial";
    public static final String PENDIENTE_IOS = "pendiente mapeo de iOS";
    private Constantes() {
    }
}
