package nc.ec.edu.uce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import nc.ec.edu.uce.service.IMatriculaPrototypeService;
import nc.ec.edu.uce.service.IMatriculaSingletonService;

@SpringBootApplication
public class LogsApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(LogsApplication.class);
	
	@Autowired
	private IMatriculaSingletonService objeto1;
	@Autowired
	private IMatriculaSingletonService objeto2;
	@Autowired
	private IMatriculaSingletonService objeto3;
	
	//Scope Protopy
	@Autowired
	private IMatriculaPrototypeService pro1;
	@Autowired
	private IMatriculaPrototypeService pro2;
	
	public static void main(String[] args) {
		SpringApplication.run(LogsApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("Impresion valor del objeto");
		this.objeto1.establecerDato("NICOLAS");
		LOG.info(this.objeto1.obtenerDato());
		LOG.info("Objeto 2");
		LOG.info(this.objeto2.obtenerDato());
		LOG.info("Objeto 3");
		LOG.info(this.objeto3.obtenerDato());
		this.objeto3.establecerDato("PEPITO");
		LOG.info("Objeto 1 nuevo");
		LOG.info(this.objeto1.obtenerDato());
		
		
		LOG.info("******Prototype*****");
		this.pro1.establecerDato("JUANITO");
		LOG.info(this.pro1.obtenerDato());
		LOG.info("Pro2");
		LOG.info(this.pro2.obtenerDato());
		this.pro2.establecerDato("MARIA");
		LOG.info(this.pro2.obtenerDato());
		LOG.info(this.pro1.obtenerDato());
	}
	
	
	
}
