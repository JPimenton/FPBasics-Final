package es.fpbasics.vistas;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import es.fpbasics.modelo.TablaModulos;
import es.fpbasics.servicio.ServicioModulos;



@ManagedBean
@SessionScoped
public class BotonModificarVista extends ApplicationContextHerency implements Serializable  {

	public ServicioModulos servicio;
	
	TablaModulos registroModulos;

	@PostConstruct
	public void init(){
		
		servicio = (ServicioModulos)this.context.getBean("servicioModulos");

	}

	public void botonParaUnaPrimaria(Integer idModulo) {
		System.out.println(idModulo);
		registroModulos = this.servicio.consultarRegistrosDeLaTablaModulosPorIdModulo(idModulo);
		System.out.println(registroModulos);
		
	}

	public void generarNuevoObjetoAPartirDeRegistro (Integer idModulo,String nombre,Integer duracion,String curso) { 
		registroModulos.setIdModulo(idModulo);
		registroModulos.setNombre(nombre);
		registroModulos.setDuracion(duracion);
		registroModulos.setCurso(curso);
			
		System.out.println(registroModulos);
	}
	
		
	public void confirmarModificacion() {
		System.out.println("Entrando");
		this.servicio.modificarRegistroDeLaTablaModulos(registroModulos);
			
		System.out.println("Actualizacion realizada con exito.");
	}

	public TablaModulos getRegistroModulos() {
		return registroModulos;
	}
}
