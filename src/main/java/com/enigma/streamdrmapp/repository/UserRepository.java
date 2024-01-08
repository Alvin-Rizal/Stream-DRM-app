package com.enigma.streamdrmapp.repository;

import com.enigma.streamdrmapp.entity.User;
import com.enigma.streamdrmapp.response.ResponseUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    Optional<User> findByEmail(String email);
    Optional<User> findByName(String name);

    @Modifying
    @Query(nativeQuery = true,value = "Insert Into mst_user (id,name,phone_number,email) values (gen_random_uuid(),:name,:phoneNumber,:email)")
    void insertUserNative(@Param("name")String name,@Param("email")String email,@Param("phoneNumber")String phoneNumber);

    @Query(nativeQuery = true,value = "SELECT * from mst_user where id=:id")
    User findByIdNative(@Param("id")String id);

    @Query(nativeQuery = true,value = "select * from mst_user where name=:name")
    User findByNameNative(@Param("name")String name);

    @Query(nativeQuery = true,value = "SELECT * from mst_user where email=:email")
    User findByEmailNative(@Param("email")String email);

    @Query(nativeQuery = true,value = "select * from mst_user")
    List<User> findAllUserNative();

    @Modifying
    @Query(nativeQuery = true,value = "UPDATE mst_user set (name=:name,phone_number=:phoneNumber,email=:email) where id=:id")
    void updateUserNative(@Param("name")String name,@Param("id")String id,@Param("phoneNumber")String phoneNumber,@Param("email")String email);

    @Query(value = "SELECT id FROM m_user ORDER BY id DESC LIMIT 1", nativeQuery = true)
    String findLastInsertedId();
}
