package com.alpersapplication.app.modules.wanttodeleteacc.`data`.model

import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WantToDeleteAccModel(
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
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_sure_yo2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSave: String? = MyApp.getInstance().resources.getString(R.string.lbl_save)

)
