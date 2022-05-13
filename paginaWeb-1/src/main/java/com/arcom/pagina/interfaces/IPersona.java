package com.arcom.pagina.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.arcom.pagina.modelo.Persona;
@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{

}
