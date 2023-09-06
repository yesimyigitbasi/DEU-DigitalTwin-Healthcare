package com.alpersapplication.app.modules.cantconnecttointernet.`data`.model

import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CantConnectToInternetModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtConnecttothe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_connect_to_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoureoffline: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_you_re_offline)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRetrybutton: String? = MyApp.getInstance().resources.getString(R.string.lbl_retry)

)
