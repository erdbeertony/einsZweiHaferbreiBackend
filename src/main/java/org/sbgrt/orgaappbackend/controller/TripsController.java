package org.sbgrt.orgaappbackend.controller;

import org.sbgrt.orgaappbackend.model.Trip;
import org.sbgrt.orgaappbackend.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
//@CrossOrigin //(origins = "http://localhost:4200") // @CrossOrigin(origins = "http://example.com", maxAge = 3600) //
// @CrossOrigin(origins = {"http://localhost:8383", "http://anotherdomain:4200"})
public class TripsController {

    // https://www.baeldung.com/spring-boot-start

    @Autowired
    TripService tripService;

    @GetMapping
    public List<Trip> getAll() {
        return tripService.getAllTrips();
    }

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED) // 201
//    public Veranstaltung create(@RequestBody Veranstaltung werBringtWasMit) {
////        String randomString = StringTools.randomString50();
////        repository.save(werBringtWasMit);
//        return werBringtWasMit;
//    }

//    @GetMapping
//    public String test() {
//        Veranstaltung w = Veranstaltung.getDummy();
////        repository.save(w);
//
//        return "Teststring aus Spring Boot xx";
//    }

//    @Autowired
//    private WerBringtWasMitRepository repository;
}
