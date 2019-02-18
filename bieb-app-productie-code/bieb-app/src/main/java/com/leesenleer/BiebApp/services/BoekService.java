package com.leesenleer.BiebApp.services;

import com.leesenleer.BiebApp.model.Boek;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoekService extends CrudRepository <Boek, Integer> {
}