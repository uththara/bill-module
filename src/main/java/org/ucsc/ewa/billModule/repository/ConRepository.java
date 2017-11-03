package org.ucsc.ewa.billModule.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.ucsc.ewa.billModule.model.ConDetails;


@Repository
public interface ConRepository extends JpaRepository<ConDetails, Long> {

    @Query("select c from ConDetails c  where c.mobileNo = ?1 and c.connectionStatus='ACTIVE'")
    public ConDetails findConnectionByMobileNo(String mobileNo);
}
