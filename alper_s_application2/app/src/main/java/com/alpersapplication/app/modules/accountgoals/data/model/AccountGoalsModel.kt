package com.alpersapplication.app.modules.accountgoals.`data`.model

import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AccountGoalsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHELLO: String? = MyApp.getInstance().resources.getString(R.string.lbl_hello)
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

)
