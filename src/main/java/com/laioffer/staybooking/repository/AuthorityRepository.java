package com.laioffer.staybooking.repository;

import com.laioffer.staybooking.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {
// string is primary key type for this project, could be integer etc.
// repository is also bean, all thing created and handle by spring framework is bean?~!
    Authority findAuthorityByUsername(String username);
}

