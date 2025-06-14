package board.work.controller;

import board.work.Service.BoardService;
import board.work.dto.response.GetBoardListResponse;
import board.work.dto.request.CreateBoardRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService){
        this.boardService = boardService;
    }

    // /board POST 요청이 들어올 곳을 만들어주기
    @PostMapping
    public ResponseEntity<Void> createBoard(@RequestBody CreateBoardRequest request){
        boardService.createBoard(request);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<GetBoardListResponse> getBoardList(){
        GetBoardListResponse response = boardService.getBoardList();
        return ResponseEntity.ok().body(response);
    }
}




