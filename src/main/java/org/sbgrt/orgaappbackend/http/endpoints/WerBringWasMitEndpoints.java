package org.sbgrt.orgaappbackend.http.endpoints;

import org.sbgrt.orgaappbackend.model.WerBringtWasMit;
import org.sbgrt.orgaappbackend.persistence.WerBringtWasMitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wer-bringt-was-mit")
@CrossOrigin //(origins = "http://localhost:4200") // @CrossOrigin(origins = "http://example.com", maxAge = 3600) //
// @CrossOrigin(origins = {"http://localhost:8383", "http://anotherdomain:4200"})
public class WerBringWasMitEndpoints {

    // https://www.baeldung.com/spring-boot-start

    @GetMapping("/{id}")
    public WerBringtWasMit getById(@PathVariable String id) {
        return WerBringtWasMit.getDummy();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201
    public WerBringtWasMit create(@RequestBody WerBringtWasMit werBringtWasMit) {
//        String randomString = StringTools.randomString50();
//        repository.save(werBringtWasMit);
        return werBringtWasMit;
    }

    @GetMapping
    public String test() {
        WerBringtWasMit w = WerBringtWasMit.getDummy();
//        repository.save(w);

        return "Teststring aus Spring Boot xx";
    }

//    @Autowired
//    private WerBringtWasMitRepository repository;
}
