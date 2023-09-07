package com.alpersapplication.app.modules.statisticstargetweight.`data`.model

import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StatisticsTargetWeightModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtStatistics: String? = MyApp.getInstance().resources.getString(R.string.lbl_statistics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTargetWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_target_weight)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCurrentWeight: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_current_weight)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTargetWeightOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_target_weight)

)
