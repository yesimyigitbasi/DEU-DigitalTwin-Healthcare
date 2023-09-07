package com.alpersapplication.app.modules.statistics.`data`.model

import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StatisticsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtStatistics: String? = MyApp.getInstance().resources.getString(R.string.lbl_statistics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_weight)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLastMeasuremen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_last_measuremen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSteps: String? = MyApp.getInstance().resources.getString(R.string.lbl_steps)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTodayOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBMI: String? = MyApp.getInstance().resources.getString(R.string.lbl_bmi)

)
