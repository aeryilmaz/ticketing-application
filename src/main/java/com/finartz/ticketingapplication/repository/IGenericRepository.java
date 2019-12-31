package com.finartz.ticketingapplication.repository;

import com.finartz.ticketingapplication.entity.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IGenericRepository<E extends GenericEntity> extends JpaRepository<E,Long> {



}
