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
  var txtWeightOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_67_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredEighty: String? = MyApp.getInstance().resources.getString(R.string.lbl_180)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredSixty: String? = MyApp.getInstance().resources.getString(R.string.lbl_160)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredForty: String? = MyApp.getInstance().resources.getString(R.string.lbl_140)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredTwenty: String? = MyApp.getInstance().resources.getString(R.string.lbl_120)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_100)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEighty: String? = MyApp.getInstance().resources.getString(R.string.lbl_80)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSixty: String? = MyApp.getInstance().resources.getString(R.string.lbl_60)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForty: String? = MyApp.getInstance().resources.getString(R.string.lbl_40)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwenty: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0409: String? = MyApp.getInstance().resources.getString(R.string.lbl_04_09)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0509: String? = MyApp.getInstance().resources.getString(R.string.lbl_05_09)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0609: String? = MyApp.getInstance().resources.getString(R.string.lbl_06_09)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0709: String? = MyApp.getInstance().resources.getString(R.string.lbl_07_09)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0809: String? = MyApp.getInstance().resources.getString(R.string.lbl_08_09)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0909: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_09)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZero: String? = MyApp.getInstance().resources.getString(R.string.lbl_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTargetWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_target_weight)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightHistory: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_weight_history)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSteps: String? = MyApp.getInstance().resources.getString(R.string.lbl_steps)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStepsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_5000_steps)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStepsHistory: String? = MyApp.getInstance().resources.getString(R.string.lbl_steps_history)

)
