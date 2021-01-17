package com.mysql.springbootmysql.repository;

import com.mysql.springbootmysql.num.num;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import javax.transaction.Transactional;

public interface numRepository extends JpaRepository<num,Integer> {
    @Transactional
    @Modifying
    @Query("Update num set number =:number+number where id =:id")
    void updateNum(@Param("id") int num,@Param("number") Integer number);

}
