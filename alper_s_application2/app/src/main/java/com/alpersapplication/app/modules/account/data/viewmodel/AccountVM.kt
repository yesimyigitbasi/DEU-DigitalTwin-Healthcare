package com.alpersapplication.app.modules.account.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alpersapplication.app.modules.account.`data`.model.AccountModel
import org.koin.core.KoinComponent

class AccountVM : ViewModel(), KoinComponent {
  val accountModel: MutableLiveData<AccountModel> = MutableLiveData(AccountModel())

  var navArguments: Bundle? = null
}
