package com.alpersapplication.app.modules.wanttosignout.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alpersapplication.app.modules.wanttosignout.`data`.model.WantToSignOutModel
import org.koin.core.KoinComponent

class WantToSignOutVM : ViewModel(), KoinComponent {
  val wantToSignOutModel: MutableLiveData<WantToSignOutModel> =
      MutableLiveData(WantToSignOutModel())

  var navArguments: Bundle? = null
}
