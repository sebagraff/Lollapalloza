package com.mindhub.Lollapalooza.repositories;

import com.mindhub.Lollapalooza.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CommentsRepository extends JpaRepository<Comment, Long> {
    Comment findById (long id);
    List<Comment> findByPhotoId(long id);


}
