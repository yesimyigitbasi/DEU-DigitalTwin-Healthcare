package com.alpersapplication.app.modules.accountaccinfo.ui

import androidx.activity.viewModels
import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.base.BaseActivity
import com.alpersapplication.app.databinding.ActivityAccountAccInfoBinding
import com.alpersapplication.app.modules.accountaccinfo.`data`.viewmodel.AccountAccInfoVM
import kotlin.String
import kotlin.Unit

class AccountAccInfoActivity :
    BaseActivity<ActivityAccountAccInfoBinding>(R.layout.activity_account_acc_info) {
  private val viewModel: AccountAccInfoVM by viewModels<AccountAccInfoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountAccInfoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ACCOUNT_ACC_INFO_ACTIVITY"

  }
}
