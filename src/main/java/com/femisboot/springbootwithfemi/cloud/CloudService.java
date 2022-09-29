package com.femisboot.springbootwithfemi.cloud;

import java.io.IOException;
import java.util.Map;

public interface CloudService {
    String upload(byte[] bytes, Map<?,?> map) throws IOException;
}
