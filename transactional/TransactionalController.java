package com.orhankaya.n11h2.transactional;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/transactional")
public class TransactionalController {

    private final TransactionalService transactionalService;

    @PostMapping("/updatePrice")
    public void ts6() {
        transactionalService.saveButError();
    }

}
