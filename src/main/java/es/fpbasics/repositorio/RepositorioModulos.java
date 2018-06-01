package es.fpbasics.repositorio;

import java.util.List;

import es.fpbasics.modelo.TablaModulos;


public interface RepositorioModulos {


	List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos();
	
	TablaModulos consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo);
	
	void modificarRegistroDeLaTablaModulos(TablaModulos registro);
	
	 List<TablaModulos> consultarRegistrosDeLaTablaModulosFiltrado(String filtro);
	
}
