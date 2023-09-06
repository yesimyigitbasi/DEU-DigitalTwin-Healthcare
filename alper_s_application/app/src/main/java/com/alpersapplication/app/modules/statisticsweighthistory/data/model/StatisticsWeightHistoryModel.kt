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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_66_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_66_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_66_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_66_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_66_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_66_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_66_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_66_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup106Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup108Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup104Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup116Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup118Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup114Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup110Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup112Value: String? = null
)
