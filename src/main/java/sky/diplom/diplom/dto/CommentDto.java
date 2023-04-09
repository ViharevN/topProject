package sky.diplom.diplom.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class CommentDto {

    private long pk;
    private int author;
    private String createdAt;
    @NotBlank
    @Size(min = 8)
    private String text;

}
