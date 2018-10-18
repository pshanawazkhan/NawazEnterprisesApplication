package com.nawaz.main.NawazEnterprisers.SplikerJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

 //@Component()
@Repository

public interface SplinkerRepository  extends JpaRepository<Splinkers, Integer>{

	

}
