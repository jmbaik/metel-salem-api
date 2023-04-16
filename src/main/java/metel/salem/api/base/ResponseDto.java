package metel.salem.api.base;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDto<T> {
    private final String code;
    private final String message;
    private final T result;

}
