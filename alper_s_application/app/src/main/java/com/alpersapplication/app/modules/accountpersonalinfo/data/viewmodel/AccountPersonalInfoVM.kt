package com.alpersapplication.app.modules.accountpersonalinfo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alpersapplication.app.modules.accountpersonalinfo.`data`.model.AccountPersonalInfoModel
import org.koin.core.KoinComponent

class AccountPersonalInfoVM : ViewModel(), KoinComponent {
  val accountPersonalInfoModel: MutableLiveData<AccountPersonalInfoModel> =
      MutableLiveData(AccountPersonalInfoModel())

  var navArguments: Bundle? = null
}
