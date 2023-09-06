package com.alpersapplication.app.modules.login.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alpersapplication.app.modules.login.`data`.model.LogInModel
import org.koin.core.KoinComponent

class LogInVM : ViewModel(), KoinComponent {
  val logInModel: MutableLiveData<LogInModel> = MutableLiveData(LogInModel())

  var navArguments: Bundle? = null
}
