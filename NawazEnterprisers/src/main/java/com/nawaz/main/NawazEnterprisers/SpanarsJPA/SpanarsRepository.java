package com.nawaz.main.NawazEnterprisers.SpanarsJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface SpanarsRepository  extends JpaRepository<Spanars, Integer>{

}
