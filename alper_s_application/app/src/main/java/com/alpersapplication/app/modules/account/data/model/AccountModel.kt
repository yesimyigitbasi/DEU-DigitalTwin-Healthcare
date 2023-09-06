package com.alpersapplication.app.modules.account.`data`.model

import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AccountModel(
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
  var txtJadeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_jade)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_e_mail2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_jade_mail_com)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
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
  var txtTwentyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_21)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGenderOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_female)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_height)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_170_cm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoals: String? = MyApp.getInstance().resources.getString(R.string.lbl_goals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTargetWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_target_weight)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTargetStepCou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_target_step_cou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDailyCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_000_daily)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeleteAccount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_delete_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordOneValue: String? = null
)
