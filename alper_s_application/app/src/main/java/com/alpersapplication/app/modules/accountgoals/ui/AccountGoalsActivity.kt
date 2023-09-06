package com.alpersapplication.app.modules.accountgoals.ui

import androidx.activity.viewModels
import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.base.BaseActivity
import com.alpersapplication.app.databinding.ActivityAccountGoalsBinding
import com.alpersapplication.app.modules.accountgoals.`data`.viewmodel.AccountGoalsVM
import kotlin.String
import kotlin.Unit

class AccountGoalsActivity :
    BaseActivity<ActivityAccountGoalsBinding>(R.layout.activity_account_goals) {
  private val viewModel: AccountGoalsVM by viewModels<AccountGoalsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountGoalsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ACCOUNT_GOALS_ACTIVITY"

  }
}
