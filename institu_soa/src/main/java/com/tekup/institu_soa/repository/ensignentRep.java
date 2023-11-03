package com.tekup.institu_soa.repository;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tekup.institu_soa.models.ensignent;



@Repository
public interface ensignentRep extends JpaRepository<ensignent, Long>{
    
}