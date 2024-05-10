package com.example.lab5m.repository;

import com.example.lab5m.dto.IntervencionesPorSitioDto;
import com.example.lab5m.entity.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SiteRepository extends JpaRepository<Site,Integer> {
    @Query(nativeQuery = true,value = "SELECT s.SiteName, COUNT(t.TicketID) AS Cantidad_Intervenciones FROM ticket t\n" +
            "inner JOIN site s ON t.SiteID = s.SiteID\n" +
            "GROUP BY s.SiteName")
    List<IntervencionesPorSitioDto> listaIntervencionesPorSitio();
}
