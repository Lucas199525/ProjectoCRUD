package com.arcom.pagina.interfacesServices;

import java.util.Optional;
import java.util.List;
import com.arcom.pagina.modelo.Persona;

public interface IPersonaService {

	//metodos
	
	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delete(int id);
	
	
}
