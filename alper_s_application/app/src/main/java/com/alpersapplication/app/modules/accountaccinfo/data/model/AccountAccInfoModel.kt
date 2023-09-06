package com.alpersapplication.app.modules.accountaccinfo.`data`.model

import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AccountAccInfoModel(
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
  var txtAccountInforma: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_informa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_e_mail2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etUsernameboxValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailboxValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordboxValue: String? = null
)
