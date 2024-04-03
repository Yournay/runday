package runday.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import runday.infra.AbstractEvent;

@Data
public class LogEditted extends AbstractEvent {

    private Long id;
    private String userId;
    private String userDiary;
    private String runningPhoto;
}
