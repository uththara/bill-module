package org.ucsc.ewa.billModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.ucsc.ewa.billModule.model.AccDetails;


@Repository
public interface AccRepository extends JpaRepository<AccDetails, Long> {

}
