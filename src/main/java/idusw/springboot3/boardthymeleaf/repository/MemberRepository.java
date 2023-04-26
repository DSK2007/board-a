package idusw.springboot3.boardthymeleaf.repository;

import idusw.springboot3.boardthymeleaf.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

}
