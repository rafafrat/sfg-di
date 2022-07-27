package guru.sprinframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetngService{
    @Override
    public String sayGreeeting() {
        return "Hello World - English";
    }
}
