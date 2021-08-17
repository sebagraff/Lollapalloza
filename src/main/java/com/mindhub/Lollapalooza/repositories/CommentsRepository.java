package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CommentsRepository extends JpaRepository<Comments, Long> {
}
