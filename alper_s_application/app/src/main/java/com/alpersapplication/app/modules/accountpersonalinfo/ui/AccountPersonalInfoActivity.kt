package com.alpersapplication.app.modules.accountpersonalinfo.ui

import androidx.activity.viewModels
import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.base.BaseActivity
import com.alpersapplication.app.databinding.ActivityAccountPersonalInfoBinding
import com.alpersapplication.app.modules.accountpersonalinfo.`data`.viewmodel.AccountPersonalInfoVM
import kotlin.String
import kotlin.Unit

class AccountPersonalInfoActivity :
    BaseActivity<ActivityAccountPersonalInfoBinding>(R.layout.activity_account_personal_info) {
  private val viewModel: AccountPersonalInfoVM by viewModels<AccountPersonalInfoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountPersonalInfoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ACCOUNT_PERSONAL_INFO_ACTIVITY"

  }
}
