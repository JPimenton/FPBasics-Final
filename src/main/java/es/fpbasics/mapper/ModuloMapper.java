package es.fpbasics.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import es.fpbasics.modelo.TablaModulos;


public interface ModuloMapper {

	public int modificarRegistroDeLaTablaModulos(@Param("modulo")TablaModulos registro);	
	
	public List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos();

	public TablaModulos consultarRegistrosDeLaTablaModulosPorIdModulo(@Param("idModulo")Integer idModulo) ;

	public List<TablaModulos> consultarRegistrosDeLaTablaModuloFiltrado(@Param("filtro")String filtro);
}
