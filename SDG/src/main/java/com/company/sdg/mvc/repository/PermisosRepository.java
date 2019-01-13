/**
 * 
 */
package com.company.sdg.mvc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.sdg.mvc.entity.PermisosEntity;

/**
 * @author the_d
 *
 */
@Repository
public interface PermisosRepository extends CrudRepository<PermisosEntity,Integer>{

}
