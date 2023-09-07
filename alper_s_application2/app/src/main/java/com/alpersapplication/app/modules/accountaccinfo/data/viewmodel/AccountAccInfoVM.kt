package com.alpersapplication.app.modules.accountaccinfo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alpersapplication.app.modules.accountaccinfo.`data`.model.AccountAccInfoModel
import org.koin.core.KoinComponent

class AccountAccInfoVM : ViewModel(), KoinComponent {
  val accountAccInfoModel: MutableLiveData<AccountAccInfoModel> =
      MutableLiveData(AccountAccInfoModel())

  var navArguments: Bundle? = null
}
