package borad.work.dto;

public class CreateBoardRequest {

        private String title;
        private String description;

        public CreateBoardRequest(String title, String description) {
            this.title = title;
            this.description = description;
        }

        public CreateBoardRequest() {}

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }
    }

