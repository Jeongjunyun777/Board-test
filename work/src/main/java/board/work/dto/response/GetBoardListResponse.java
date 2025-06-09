package board.work.dto.response;

import java.util.List;

public class GetBoardListResponse {
 private List<GetBoardResponse> boards;

 public GetBoardListResponse(List<GetBoardResponse> boards) {
  this.boards = boards;

 }
 public GetBoardListResponse() {}
 public List<GetBoardResponse> getBoards() {
  return boards;
 }

}
