package org.sbgrt.orgaappbackend.endpoints;

import org.sbgrt.orgaappbackend.model.WerBringtWasMit;
import org.sbgrt.orgaappbackend.utils.StringTools;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wer-bringt-was-mit")
public class WerBringWasMitEndpoints {

    // https://www.baeldung.com/spring-boot-start

    @GetMapping("/{id}")
    public WerBringtWasMit getById(@PathVariable String id) {
        return WerBringtWasMit.getDummy();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201
    public WerBringtWasMit create(@RequestBody WerBringtWasMit werBringtWasMit) {
        String randomString = StringTools.randomString50();
        return WerBringtWasMit.getDummy();
    }

    @GetMapping
    public String test() {
        return "Teststring aus Spring Boot";
    }
}
