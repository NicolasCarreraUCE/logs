package nc.ec.edu.uce.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MatriculaSingletonServiceImpl implements IMatriculaSingletonService {

	private String codigo;
	
	@Override
	public void establecerDato(String valor) {
		// TODO Auto-generated method stub
		this.codigo = valor;
	}

	@Override
	public String obtenerDato() {
		// TODO Auto-generated method stub
		return codigo;
	}
	
	// SET-GET
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	
	
	

}
