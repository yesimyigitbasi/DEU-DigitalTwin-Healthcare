package com.alpersapplication.app.modules.notificationsviewmessage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alpersapplication.app.modules.notificationsviewmessage.`data`.model.NotificationsViewMessageModel
import org.koin.core.KoinComponent

class NotificationsViewMessageVM : ViewModel(), KoinComponent {
  val notificationsViewMessageModel: MutableLiveData<NotificationsViewMessageModel> =
      MutableLiveData(NotificationsViewMessageModel())

  var navArguments: Bundle? = null
}
