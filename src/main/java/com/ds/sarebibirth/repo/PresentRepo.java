package com.ds.sarebibirth.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.ds.sarebibirth.entity.Present;

@RepositoryRestResource
public interface PresentRepo extends JpaRepository<Present, String> {

    // Prevents DELETE /books/:id
    @Override
    @RestResource(exported = false)
    void delete(Present t);
}
