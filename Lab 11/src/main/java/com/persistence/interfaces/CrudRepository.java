package com.persistence.interfaces;

public interface CrudRepository<T> {
    T getById(Long id);
    Long save(T object);
}
