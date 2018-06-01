package es.fpbasics.servicio;

import java.util.List;

import es.fpbasics.modelo.TablaModulos;


public interface  ServicioModulos {

	List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos();
	
	TablaModulos consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo);
	
	void modificarRegistroDeLaTablaModulos(TablaModulos registro);

	List<TablaModulos> consultarRegistrosDeLaTablaModulosFiltrado(String filtro);

}
