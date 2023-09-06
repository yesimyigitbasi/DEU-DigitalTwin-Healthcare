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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStepsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_10000_steps)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStepsCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_5000_steps)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStepsCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_6000_steps)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStepsCounterThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_9000_steps)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStepsCounterFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_5500_steps)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStepsCounterFive: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_6000_steps)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStepsCounterSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_7000_steps)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStepsCounterSeven: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_5000_steps)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupEightyEightValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupNinetyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupEightySixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupNinetyEightValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup100Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupNinetySixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupNinetyTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupNinetyFourValue: String? = null
)
