package es.fpbasics.vistas;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import es.fpbasics.modelo.TablaModulos;
import es.fpbasics.servicio.ServicioModulos;



@ManagedBean
@SessionScoped
public class BotonModificarModulosVista extends ApplicationContextHerency implements Serializable  {

	public ServicioModulos servicio;
	
	TablaModulos registroModulos;
	BotonModificarModulosVista nuevoRegistroModulos;
	
	Integer idModulos,duracion;
	String nombre,curso;

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
		nuevoRegistroModulos=new BotonModificarModulosVista();
		nuevoRegistroModulos.setIdModulos(idModulo);
		nuevoRegistroModulos.setNombre(nombre);
		nuevoRegistroModulos.setDuracion(duracion);
		nuevoRegistroModulos.setCurso(curso);
			
		System.out.println(nuevoRegistroModulos.getCurso());
		System.out.println(nuevoRegistroModulos.getNombre());
	}
	
		
	public void confirmarModificacion() {
		System.out.println("Entrando");
		System.out.println(nuevoRegistroModulos.getNombre());
		this.servicio.modificarRegistroDeLaTablaModulos(nuevoRegistroModulos);
			
		System.out.println("Actualizacion realizada con exito.");
	}

	public TablaModulos getRegistroModulos() {
		return registroModulos;
	}

	public BotonModificarModulosVista getNuevoRegistroModulos() {
		return nuevoRegistroModulos;
	}

	public void setNuevoRegistroModulos(BotonModificarModulosVista nuevoRegistroModulos) {
		this.nuevoRegistroModulos = nuevoRegistroModulos;
	}

	public Integer getIdModulos() {
		return idModulos;
	}

	public void setIdModulos(Integer idModulos) {
		this.idModulos = idModulos;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
