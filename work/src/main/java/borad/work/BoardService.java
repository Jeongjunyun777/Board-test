package borad.work;

import borad.work.dto.CreateBoardRequest;
import borad.work.dto.GetBoardListResponse;
import borad.work.dto.GetBoardResponse;
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
        List<GetBoardResponse> boardResponses = boardRepository.findAll().stream().map(board ->
                new GetBoardResponse(board.getId(), board.getTitle(), board.getDescription())
        ).collect(Collectors.toList());

        return new GetBoardListResponse(boardResponses);
    }

}
}

