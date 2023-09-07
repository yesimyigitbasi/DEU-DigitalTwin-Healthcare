package com.alpersapplication.app.modules.wanttodeleteacc.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alpersapplication.app.modules.wanttodeleteacc.`data`.model.WantToDeleteAccModel
import org.koin.core.KoinComponent

class WantToDeleteAccVM : ViewModel(), KoinComponent {
  val wantToDeleteAccModel: MutableLiveData<WantToDeleteAccModel> =
      MutableLiveData(WantToDeleteAccModel())

  var navArguments: Bundle? = null
}
