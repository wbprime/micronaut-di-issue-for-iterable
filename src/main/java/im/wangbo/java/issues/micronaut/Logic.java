package im.wangbo.java.issues.micronaut;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO add description here.
 *
 * @author Elvis Wang
 * @since 1.0.0
 */
@Singleton
public class Logic {
    private final Iterable<ServiceApi> apis;

    //    public Logic(final Collection<ServiceApi> apis) {
    @Inject
    public Logic(final Iterable<ServiceApi> apis) {
        this.apis = apis;
    }

    public String getNames() {
        final List<String> list = new ArrayList<>();
        for (ServiceApi api : apis) {
            list.add(api.getClass().getName());
        }
        return list.toString();
    }
}
