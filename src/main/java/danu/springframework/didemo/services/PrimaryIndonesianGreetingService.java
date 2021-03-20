package danu.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("id")
@Primary
public class PrimaryIndonesianGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimaryIndonesianGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getIndonesianGreeting();
    }
}
