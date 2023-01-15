/*
    *
    *
    Realisé par : FAHAM Hassan et BENAMAR Zaid
    *
    *
*/
package com.genuinecoder.springserver.model.command;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandRepository extends CrudRepository<Command, Integer> {

}