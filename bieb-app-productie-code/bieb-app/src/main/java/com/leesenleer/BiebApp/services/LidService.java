package com.leesenleer.BiebApp.services;

import com.leesenleer.BiebApp.model.Lid;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LidService extends CrudRepository<Lid, Long> {
}
