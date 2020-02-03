package guru.springframework.services;

import org.springframework.context.annotation.Profile;

/**
 * Created by jt on 5/24/17.
 */
public interface GreetingRepository {


    String getEnglishGreeting();


    String getSpanishGreeting();


    String getGermanGreeting();
}
