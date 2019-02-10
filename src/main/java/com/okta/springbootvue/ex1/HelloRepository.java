package com.okta.springbootvue.ex1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface HelloRepository extends JpaRepository<Hello, Long> {
}
