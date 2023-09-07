package com.alpersapplication.app.modules.statisticsstepshistory.`data`.model

import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StatisticsStepsHistoryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtStatistics: String? = MyApp.getInstance().resources.getString(R.string.lbl_statistics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStepsHistory: String? = MyApp.getInstance().resources.getString(R.string.lbl_steps_history)

)
