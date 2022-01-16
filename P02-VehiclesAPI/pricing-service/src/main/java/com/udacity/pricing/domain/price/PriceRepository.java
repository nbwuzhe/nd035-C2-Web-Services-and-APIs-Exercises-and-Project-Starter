package com.udacity.pricing.domain.price;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Zhe Wu, removed for project aim 1
// @Repository
// Zhe Wu, modified for project aim 1
// public class PriceRepository {
public interface PriceRepository extends CrudRepository<Price, Long> {

}
