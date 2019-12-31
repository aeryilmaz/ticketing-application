package com.finartz.ticketingapplication.mapper;

import com.finartz.ticketingapplication.dto.GenericDTO;
import com.finartz.ticketingapplication.entity.GenericEntity;
import org.springframework.core.GenericTypeResolver;

public abstract class AbstractGenericMapper<E extends GenericEntity, D extends GenericDTO> implements Mapper<E,D>{


    @SuppressWarnings("unchecked")
    private Class<D> getSourceTypeDTO() {
        Class<?>[] typeArgs = GenericTypeResolver.resolveTypeArguments(getClass(), Mapper.class);
        return (Class<D>) typeArgs[1];
    }

    @SuppressWarnings("unchecked")
    private Class<E> getSourceTypeEntity() {
        Class<?>[] typeArgs = GenericTypeResolver.resolveTypeArguments(getClass(), Mapper.class);
        return (Class<E>) typeArgs[0];
    }


    private D getDTOInstance() {
        Class<D> sourceType = getSourceTypeDTO();
        D entity = null;
        try {
            entity = sourceType.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return entity;
    }

    private E getEntityInstance() {
        Class<E> sourceType = getSourceTypeEntity();
        E entity = null;
        try {
            entity = sourceType.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return entity;
    }


    @Override
    public D toDTO(E entity) {
        if (entity == null) return null;
        D dto = getDTOInstance();
        dto.setName(entity.getName());
        return dto;
    }

    @Override
    public E toEntity(D dto) {
        if (dto == null) return null;
        E entity = getEntityInstance();
        entity.setName(dto.getName());
        return entity;
    }
}
