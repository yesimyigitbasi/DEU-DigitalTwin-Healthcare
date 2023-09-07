package com.alpersapplication.app.modules.statisticsstepshistoryone.`data`.model

import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StatisticsStepsHistoryOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtStatistics: String? = MyApp.getInstance().resources.getString(R.string.lbl_statistics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBMIHistory: String? = MyApp.getInstance().resources.getString(R.string.lbl_bmi_history)

)
