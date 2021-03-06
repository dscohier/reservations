package be.icc.repository;

import be.icc.entity.RepresentationUserEntity;
import be.icc.entity.UsersEntity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("representationUserRepository")
public interface RepresentationUserRepository extends CrudRepository<RepresentationUserEntity, Long> {

    List<RepresentationUserEntity> findByUser(UsersEntity user);

}
