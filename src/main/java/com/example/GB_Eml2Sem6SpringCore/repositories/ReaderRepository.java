package com.example.GB_Eml2Sem6SpringCore.repositories;

import com.example.GB_Eml2Sem6SpringCore.models.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepository extends JpaRepository<Reader, Long> {
}
