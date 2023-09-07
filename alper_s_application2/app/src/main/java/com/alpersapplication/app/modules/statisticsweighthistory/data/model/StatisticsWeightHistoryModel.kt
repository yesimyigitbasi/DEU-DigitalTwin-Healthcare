package com.alpersapplication.app.modules.statisticsweighthistory.`data`.model

import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StatisticsWeightHistoryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtStatistics: String? = MyApp.getInstance().resources.getString(R.string.lbl_statistics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignout: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightHistory: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_weight_history)

)
