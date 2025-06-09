package board.work.Service;

import board.work.Entity.Board;
import board.work.Repository.BoardRepository;
import board.work.dto.request.CreateBoardRequest;
import board.work.dto.response.GetBoardListResponse;
import board.work.dto.response.GetBoardResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public void createBoard(CreateBoardRequest request) {
        Board board = Board.builder()
                .title(request.getTitle())
                .description(request.getDescription())
                .build();
        boardRepository.save(board);
    }

    public GetBoardListResponse getBoardList() {
        List<GetBoardResponse> boardResponses = boardRepository.findAll()
                .stream()
                .map(board ->
                        new GetBoardResponse(
                                board.getId(),
                                board.getTitle(),
                                board.getDescription()
                        )
                )
                .toList();

        return new GetBoardListResponse(boardResponses);
    }
}