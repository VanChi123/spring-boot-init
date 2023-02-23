package com.example.demo.repository;

import com.example.demo.domain.Goods;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsRepository extends JpaRepository<Goods, String>, JpaSpecificationExecutor<Goods> {

//    @Query("" +
//            "select g from Goods g" +
//            " where (:name is null or g.name like concat('%', :name, '%')) " +
//            "")


//    @Query("" +
//            "select g from Goods g" +
//            " where (lower(g.name) like lower(concat('%', :name, '%')) or :name is null) " +
//            "")

    @Query("" +
            "select g from Goods g" +
            " where (:name is null or lower(g.name) like lower(concat('%', :name, '%'))) " +
            "")
    Page<Goods> getGoods(
            @Param("name") String nameFind,
            Pageable pageable
            );



    // câu lệnh dưới ko chạy đc vì sai tham số sql ????
//    @Query(value = "select g from Goods g "+
//            "where (:name is null or lower(g.name) like lower(concat('%', :name1, '%'))) ", nativeQuery = true)
////            "where p.CONTRACTOR_CODE like ?1 or p.P_TRANS_CODE like ?1 or p.NOTE like ?1 ", nativeQuery = true)
//    Page<Goods> getGoods(
//            @Param("name") String nameFind,
//            @Param("name1") String nameFind1,
//            Pageable pageable
//    );
}
