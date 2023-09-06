package com.alpersapplication.app.modules.gatewaypairing.`data`.model

import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GatewayPairingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHELLO: String? = MyApp.getInstance().resources.getString(R.string.lbl_hello)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJade: String? = MyApp.getInstance().resources.getString(R.string.lbl_jade)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGatewayPairing: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_gateway_pairing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvailableDevic: String? =
      MyApp.getInstance().resources.getString(R.string.msg_available_devic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceTwoValue: String? = null
)
