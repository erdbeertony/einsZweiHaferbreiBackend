package org.sbgrt.orgaappbackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EinsZweiHaferbreiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EinsZweiHaferbreiApplication.class, args);
    }

//    @Autowired private VeranstaltungAzureRepository azureRepository;

//    @Override
//    public void run(String... args) throws Exception {
////        azureRepository.upsert(Veranstaltung.getDummy());
////        Veranstaltung veranstaltung = azureRepository.getVeranstaltung();
////        veranstaltung.setTitel("Gruss aus dem Backend neu");
////        azureRepository.update(veranstaltung);
////        List<Veranstaltung> alleVeranstaltungen = azureRepository.getAlleVeranstaltungen();
////        boolean a= false;
//    }
}
