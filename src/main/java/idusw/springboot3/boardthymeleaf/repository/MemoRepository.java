package idusw.springboot3.boardthymeleaf.repository;

import idusw.springboot3.boardthymeleaf.entity.MemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<MemoEntity, Long> {

}
