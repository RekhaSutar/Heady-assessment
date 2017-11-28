package com.heady.example.rekha.e_commerce.domain

import com.heady.example.rekha.e_commerce.domain.entity.Data

/**
 * Created by rekha on 28/11/17.
 */

interface DataRepository{
    fun getData()
    interface DataCallBack{
        fun onSuccess(data: Data)
        fun onError(errorMessage: String)
    }
}
