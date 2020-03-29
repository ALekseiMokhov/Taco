package com.example.Taco.data;

import com.example.Taco.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository <Taco,Long> {

}