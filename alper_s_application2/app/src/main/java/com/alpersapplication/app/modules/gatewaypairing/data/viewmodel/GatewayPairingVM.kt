package com.alpersapplication.app.modules.gatewaypairing.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alpersapplication.app.modules.gatewaypairing.`data`.model.GatewayPairingModel
import org.koin.core.KoinComponent

class GatewayPairingVM : ViewModel(), KoinComponent {
  val gatewayPairingModel: MutableLiveData<GatewayPairingModel> =
      MutableLiveData(GatewayPairingModel())

  var navArguments: Bundle? = null
}
