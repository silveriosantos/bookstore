package com.silverio.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.silverio.bookstore.domain.Categoria;

@Repository
public interface CategoriaResository extends JpaRepository <Categoria, Integer>{

}
