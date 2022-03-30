package com.cenfotec.lab5.lab5.repository;

import com.cenfotec.lab5.lab5.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepository extends JpaRepository<Journal, Long> {
    Journal findJournalByTitle(String title);
}
