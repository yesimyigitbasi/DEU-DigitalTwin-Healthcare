package com.alpersapplication.app.modules.accountgoals.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alpersapplication.app.modules.accountgoals.`data`.model.AccountGoalsModel
import org.koin.core.KoinComponent

class AccountGoalsVM : ViewModel(), KoinComponent {
  val accountGoalsModel: MutableLiveData<AccountGoalsModel> = MutableLiveData(AccountGoalsModel())

  var navArguments: Bundle? = null
}
