package com.skwax.dao.jpa;

import com.skwax.pojo.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DeptJpa extends JpaRepository<Dept,Long> {

    //@Modifying
    @Query(value = "select deptid,b.deptname from dept b where b.deptid = ?1",nativeQuery = true)
    public Dept findByDeptID(Long deptid);
}
