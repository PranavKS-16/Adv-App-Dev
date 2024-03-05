package corprate.mugil.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobsDetailsResponse {
    private String jobname;
    private String description;
    private String location;
    private int salary;
}


