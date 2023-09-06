package com.alpersapplication.app.modules.homescreen.`data`.model

import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLearnyourbody: String? =
      MyApp.getInstance().resources.getString(R.string.msg_learn_your_body)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsstartbuil: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_start_bui)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)

)
