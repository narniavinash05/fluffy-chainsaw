package org.studyeasy.SpringStarter.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.studyeasy.SpringStarter.Models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    
}