package danu.springframework.didemo.services;


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
