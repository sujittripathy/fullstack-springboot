package com.example.fullstackboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullstackboot.entity.Tip;

public interface TipRepository extends JpaRepository<Tip, Integer>{

}
