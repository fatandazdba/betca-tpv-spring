package es.upm.miw.repositories;

import es.upm.miw.documents.User;
import es.upm.miw.dtos.UserMinimumDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    User findByMobile(String mobile);

    @Query(value = "{'roles' : 'CUSTOMER'}", fields = "{ '_id' : 0, 'mobile' : 1, 'username' : 1}")
    List<UserMinimumDto> findCustomerAll();


}
