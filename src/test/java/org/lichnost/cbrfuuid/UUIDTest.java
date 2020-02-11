package org.lichnost.cbrfuuid;

import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;


public class UUIDTest {

    private static final String UUID_REGEXP = "[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}-[0-9a-f]{1}";

    @Test
    public void generateUUIDTest() {
        CBRFUUID.uid_init();
        byte[] buffer = new byte[CBRFUUID.UID_BUFFER_SIZE];
        CBRFUUID.uid_create(buffer);
        CBRFUUID.uid_deinit();
        Assert.assertTrue(new String(buffer, StandardCharsets.US_ASCII).trim().matches(UUID_REGEXP));
    }
}
