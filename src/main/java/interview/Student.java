package interview;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author YatXue
 * @date 2019/9/30 20:06
 */
@Data
@Accessors(chain = true)
@RequiredArgsConstructor(staticName = "of")
public class Student {
    @NonNull private String name;
    private int age;
}
