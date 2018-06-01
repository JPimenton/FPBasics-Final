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
	
	int idModulo,duracion;
	String nombre, curso;
	
	public int getIdModulo() {
		return idModulo;
	}


	public void setIdModulo(int idModulo) {
		this.idModulo = idModulo;
		System.out.println("setid");
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
		System.out.println("setdur");
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
		System.out.println("setnom");
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
		System.out.println("setcur");
	}


	public void botonParaUnaPrimaria(int idModulo) {
		System.out.println(idModulo);
		registroModulos = this.devolverRegistro(idModulo);
		
	}

	public TablaModulos devolverRegistro (int idModulo) {
		final TablaModulos registro = this.servicio.consultarRegistrosDeLaTablaModulosPorIdModulo(idModulo);
		return registro;
	}
	
		
	public void confirmarModificacion() {
		//TablaModulos registroConfirmado = new TablaModulos(idModulo,nombre,duracion,curso);
		//System.out.println(registroConfirmado);
		
	}

	public TablaModulos getRegistroModulos() {
		return registroModulos;
	}

}
