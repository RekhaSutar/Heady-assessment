package com.heady.example.rekha.e_commerce.mvp;

import com.pretr.common.services.network.components.NetworkError;

/**
 * Created by stephen on 25/10/2016.
 */

public interface UseCaseScheduler {

    void execute(Runnable runnable);

    <V extends UseCase.ResponseValue> void notifyResponse(final V response,
                                                          final UseCase.UseCaseCallback<V> useCaseCallback);

    <V extends UseCase.ResponseValue> void onError(final NetworkError error,
                                                   final UseCase.UseCaseCallback<V> useCaseCallback);
}
