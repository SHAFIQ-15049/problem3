package com.bjit.repository;

import com.bjit.domain.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<Weather,Long> {
}
