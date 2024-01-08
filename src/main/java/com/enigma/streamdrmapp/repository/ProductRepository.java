package com.enigma.streamdrmapp.repository;

import com.enigma.streamdrmapp.entity.Product;
import com.enigma.streamdrmapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {
//    @Modifying
//    @Query(nativeQuery = true,value = "Insert Into mst_product (id,product_name,product_description) values (gen_random_uuid(),:product_name,:,:product_description)")
//    void insertProductNative(@Param("name")String name, @Param("product_description")String productDescription, @Param("product_name")String productName);

    @Query(nativeQuery = true,value = "SELECT * from mst_product where id=:id")
    User findProductByIdNative(@Param("id")String id);

    @Query(nativeQuery = true,value = "select * from mst_product where name=:name")
    User findProductByNameNative(@Param("name")String name);

    @Query(nativeQuery = true,value = "SELECT * from mst_product where email=:email")
    User findProductByEmailNative(@Param("email")String email);

    @Query(nativeQuery = true,value = "select * from mst_product")
    List<User> findAllProductNative();

//    @Modifying
//    @Query(nativeQuery = true,value = "UPDATE mst_product set (product_name=:name,product_description=:productDescription) where id=:id")
//    void updateProductNative(@Param("name")String name,@Param("id")String id,@Param("product_description")String productDescription);

    @Query(value = "SELECT id FROM mst_product ORDER BY id DESC LIMIT 1", nativeQuery = true)
    String findLastInsertedId();
}
