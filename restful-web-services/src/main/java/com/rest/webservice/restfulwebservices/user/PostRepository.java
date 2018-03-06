package com.rest.webservice.restfulwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Muhammad.Asim on 3/6/2018.
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
