package com.edu.unbosque.Alemmakeup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.CrudRepository;

import com.edu.unbosque.Alemmakeup.model.Productos;

@Repository //Realiza operaciones CRUD
public interface ProductosRepository extends JpaRepository<Productos, Integer>{

}

