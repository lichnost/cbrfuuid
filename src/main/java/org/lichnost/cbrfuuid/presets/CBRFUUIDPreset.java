package org.lichnost.cbrfuuid.presets;

import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

@Properties (
        value = @Platform(
            cinclude={ "uuid.h", "uid.h" },
            link = { "uuid", "uid" }
        ),
        target = "org.lichnost.cbrfuuid.CBRFUUID"
)
public class CBRFUUIDPreset implements InfoMapper {


    public void map(InfoMap infoMap) {

    }
}
