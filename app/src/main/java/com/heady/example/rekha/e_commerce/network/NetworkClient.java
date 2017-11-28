package com.heady.example.rekha.e_commerce.network;


/**
 * Created by Rekha on 10/24/2016.
 */
public interface NetworkClient {

   void makeNetworkCall(Request request);

   void cancelAll(Object tag);

   void setDefaultRetryPolicy(RetryPolicy retryPolicy);
}
