package com.example.GB_Eml2Sem6SpringCore.repositories;

import com.example.GB_Eml2Sem6SpringCore.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
