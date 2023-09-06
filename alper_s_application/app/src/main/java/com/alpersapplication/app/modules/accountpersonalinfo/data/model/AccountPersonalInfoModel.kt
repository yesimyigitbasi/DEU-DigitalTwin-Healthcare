package com.alpersapplication.app.modules.accountpersonalinfo.`data`.model

import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AccountPersonalInfoModel(
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
  var txtPersonalInform: String? =
      MyApp.getInstance().resources.getString(R.string.msg_personal_inform)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAge: String? = MyApp.getInstance().resources.getString(R.string.lbl_age)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_gender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_height)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etAgeboxValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGenderboxValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etHeightboxValue: String? = null
)
