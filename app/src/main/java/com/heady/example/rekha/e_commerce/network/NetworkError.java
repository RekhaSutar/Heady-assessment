package com.heady.example.rekha.e_commerce.network;

import java.util.Map;

/**
 * Created by Rekha on 10/24/2016.
 */
public class NetworkError {

    private final boolean notModified;
    public long networkTimeMs;
    public final int statusCode;
    public final Map<String, String> headers;
    public final byte[] data;

    public NetworkError(int statusCode, byte[] data, Map<String, String> headers, boolean notModified, long networkTimeMs) {
        this.statusCode = statusCode;
        this.data = data;
        this.headers = headers;
        this.notModified = notModified;
        this.networkTimeMs = networkTimeMs;
    }


}
