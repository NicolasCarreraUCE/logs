package nc.ec.edu.uce.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MatriculaPrototypeServiceImpl implements IMatriculaPrototypeService {

	private String nombre;

	@Override
	public String obtenerDato() {
		// TODO Auto-generated method stub
		return nombre;
	}
	@Override
	public void establecerDato(String valor) {
		// TODO Auto-generated method stub
		this.nombre = valor;
	}
	
	// SET-GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
