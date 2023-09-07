package com.alpersapplication.app.modules.wanttosignout.ui

import androidx.activity.viewModels
import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.base.BaseActivity
import com.alpersapplication.app.databinding.ActivityWantToSignOutBinding
import com.alpersapplication.app.modules.wanttosignout.`data`.viewmodel.WantToSignOutVM
import kotlin.String
import kotlin.Unit

class WantToSignOutActivity :
    BaseActivity<ActivityWantToSignOutBinding>(R.layout.activity_want_to_sign_out) {
  private val viewModel: WantToSignOutVM by viewModels<WantToSignOutVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.wantToSignOutVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "WANT_TO_SIGN_OUT_ACTIVITY"

  }
}
