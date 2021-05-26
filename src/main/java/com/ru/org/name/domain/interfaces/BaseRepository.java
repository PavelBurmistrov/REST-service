package com.ru.org.name.domain.interfaces;

import database.DataBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepository extends JpaRepository<DataBase, Integer> {

}