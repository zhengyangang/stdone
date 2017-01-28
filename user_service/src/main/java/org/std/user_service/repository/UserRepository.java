package org.std.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.std.user_service.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String name);

    //@Query("from t_uc_user u where u.user_name=:name")
    //User findUser(@Param("name") String name);
}
