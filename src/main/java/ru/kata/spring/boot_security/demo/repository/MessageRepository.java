package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.model.Message;

import java.util.List;

@Repository
@Transactional
public interface MessageRepository extends JpaRepository<Message,Long> {
    @Override
    Message getById(Long id);
    @Override
    List<Message> findAll();
}
