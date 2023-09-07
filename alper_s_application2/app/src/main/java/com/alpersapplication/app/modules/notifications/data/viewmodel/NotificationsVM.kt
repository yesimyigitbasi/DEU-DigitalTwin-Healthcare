package com.alpersapplication.app.modules.notifications.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alpersapplication.app.modules.notifications.`data`.model.NotificationsModel
import org.koin.core.KoinComponent

class NotificationsVM : ViewModel(), KoinComponent {
  val notificationsModel: MutableLiveData<NotificationsModel> =
      MutableLiveData(NotificationsModel())

  var navArguments: Bundle? = null
}
