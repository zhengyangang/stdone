package org.std.spider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.std.spider.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

	Country findByName(String name);

    //@Query("from t_uc_user u where u.user_name=:name")
    //User findUser(@Param("name") String name);
}