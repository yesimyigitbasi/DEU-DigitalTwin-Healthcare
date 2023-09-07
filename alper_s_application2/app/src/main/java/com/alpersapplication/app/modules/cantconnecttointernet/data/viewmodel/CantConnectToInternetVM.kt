package com.alpersapplication.app.modules.cantconnecttointernet.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alpersapplication.app.modules.cantconnecttointernet.`data`.model.CantConnectToInternetModel
import org.koin.core.KoinComponent

class CantConnectToInternetVM : ViewModel(), KoinComponent {
  val cantConnectToInternetModel: MutableLiveData<CantConnectToInternetModel> =
      MutableLiveData(CantConnectToInternetModel())

  var navArguments: Bundle? = null
}
