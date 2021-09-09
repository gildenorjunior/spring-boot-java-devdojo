package academy.devdojo.springboot2.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class AnimePostRequestBody {
    @NotNull(message = "Field name cannot be null.")
    @NotEmpty(message = "Field name cannot be empty.")
    private String name;
}
