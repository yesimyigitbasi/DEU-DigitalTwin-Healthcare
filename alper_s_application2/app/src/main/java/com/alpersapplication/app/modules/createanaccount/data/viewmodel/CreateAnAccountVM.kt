package com.alpersapplication.app.modules.createanaccount.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alpersapplication.app.modules.createanaccount.`data`.model.CreateAnAccountModel
import org.koin.core.KoinComponent

class CreateAnAccountVM : ViewModel(), KoinComponent {
  val createAnAccountModel: MutableLiveData<CreateAnAccountModel> =
      MutableLiveData(CreateAnAccountModel())

  var navArguments: Bundle? = null
}
