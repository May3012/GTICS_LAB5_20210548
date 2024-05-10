package com.example.lab5m.repository;

import com.example.lab5m.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
    @Query(nativeQuery = true,value = "select * from ticket where TechnicianID = ?1;")
    List<Ticket> listaticketsportecnico(int id);

    @Transactional
    @Modifying
    @Query(nativeQuery = true,value = "delete from ticket where TechnicianID = ?1;")
    void borrarTickets(int idTecnico);


}