package danu.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("id")
@Primary
public class PrimaryIndonesianGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Halo Salam Primary";
    }
}
