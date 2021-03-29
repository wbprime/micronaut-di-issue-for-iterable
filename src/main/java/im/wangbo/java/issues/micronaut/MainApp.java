package im.wangbo.java.issues.micronaut;

import io.micronaut.context.ApplicationContext;

/**
 * TODO add description here.
 *
 * @author Elvis Wang
 * @since 1.0.0
 */
public class MainApp {
    public static void main(String[] args) {
        try (final ApplicationContext context = ApplicationContext.run()) {
            final Logic logic = context.getBean(Logic.class);
            System.out.println(logic.getNames());
        }
    }
}
