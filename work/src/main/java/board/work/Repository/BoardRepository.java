package board.work.Repository;

import board.work.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BoardRepository extends JpaRepository<Board, Long> {

}
