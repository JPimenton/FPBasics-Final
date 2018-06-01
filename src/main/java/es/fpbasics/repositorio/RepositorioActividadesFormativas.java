package es.fpbasics.repositorio;

import java.util.List;

import es.fpbasics.modelo.TablaActividadesFormativas;


public interface RepositorioActividadesFormativas {
	List<TablaActividadesFormativas> consultarTodosLosRegistrosDeLaTablaActividadesFormativas();
	List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloque(Integer idActividad, String Empresa,Integer idBloque);
	List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorEmpresaEIdBloque( String Empresa,Integer idBloque);
	List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloqueViaFormadores( Integer idFormador);

	void modificarRegistroDeLaTablaActividadesFormativas(TablaActividadesFormativas registro);
	
	List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasFiltrado(String filtro);
}