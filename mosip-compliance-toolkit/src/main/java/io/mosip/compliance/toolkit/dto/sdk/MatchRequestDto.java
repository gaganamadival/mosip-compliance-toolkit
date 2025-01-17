package io.mosip.compliance.toolkit.dto.sdk;


import io.mosip.kernel.biometrics.constant.BiometricType;
import io.mosip.kernel.biometrics.entities.BiometricRecord;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MatchRequestDto {
    private BiometricRecord sample;
    private BiometricRecord[] gallery;
    private List<BiometricType> modalitiesToMatch;
    private Map<String, String> flags;
}

