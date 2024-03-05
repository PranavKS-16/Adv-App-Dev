package corprate.mugil.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobsRequest {
    private String jobname;
    private String description;
    private String location;
    private int salary;
}

