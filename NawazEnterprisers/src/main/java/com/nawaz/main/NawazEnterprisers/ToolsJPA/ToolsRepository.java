package com.nawaz.main.NawazEnterprisers.ToolsJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ToolsRepository extends JpaRepository<Tools, Integer>{

}
