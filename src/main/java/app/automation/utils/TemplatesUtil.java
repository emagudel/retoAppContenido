package app.automation.utils;

import app.automation.exceptions.AppException;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

import static org.apache.commons.lang3.StringUtils.EMPTY;

public class TemplatesUtil {
    private TemplatesUtil() {
    }

    public static String processTemplate(String nombrePlantilla, Map<String, String> variables) {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_31);
        cfg.setClassLoaderForTemplateLoading(TemplatesUtil.class.getClassLoader(), EMPTY);
        Template template;
        try {
            template = cfg.getTemplate(nombrePlantilla);
            Writer out = new StringWriter();
            template.process(variables, out);
            String templateString = out.toString();
            out.close();
            return templateString;
        } catch (IOException | TemplateException e) {
            throw new AppException(e.getMessage(), e);
        }
    }
}
