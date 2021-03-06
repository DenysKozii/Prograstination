package com.progastination.web;

import com.progastination.dto.ProductDto;
import com.progastination.service.BuckwheatService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/buckwheat")
public class BuckwheatController {
    private final BuckwheatService buckwheatService;

    @GetMapping("/search")
    public List<ProductDto> buckwheatSearch() {
        log.info("Request on getting buckwheat");
        return buckwheatService.buckwheatSearch();
    }

}
