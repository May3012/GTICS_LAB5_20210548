package com.example.lab5m.controller;

import com.example.lab5m.entity.Site;
import com.example.lab5m.repository.DeviceRepository;
import com.example.lab5m.repository.SiteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {
    final SiteRepository siteRepository;
    public SiteController(SiteRepository siteRepository) {
        this.siteRepository = siteRepository;
    }
    @GetMapping("/Estadisticas")
    public String estadisticas(Model model){
        model.addAttribute("listaIntervenciones",siteRepository.listaIntervencionesPorSitio());
        return "estadisticas";
    }
}
