package com.alpersapplication.app.modules.notifications.`data`.model

import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMessageCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_message_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMessageCounterOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_message_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMessageCounterFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_message_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etMessageCounterTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etMessageCounterThreeValue: String? = null
)
