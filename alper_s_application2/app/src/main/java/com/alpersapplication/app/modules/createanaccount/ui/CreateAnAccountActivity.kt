package com.alpersapplication.app.modules.createanaccount.ui

import androidx.activity.viewModels
import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.base.BaseActivity
import com.alpersapplication.app.databinding.ActivityCreateAnAccountBinding
import com.alpersapplication.app.modules.createanaccount.`data`.viewmodel.CreateAnAccountVM
import kotlin.String
import kotlin.Unit

class CreateAnAccountActivity :
    BaseActivity<ActivityCreateAnAccountBinding>(R.layout.activity_create_an_account) {
  private val viewModel: CreateAnAccountVM by viewModels<CreateAnAccountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createAnAccountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "CREATE_AN_ACCOUNT_ACTIVITY"

  }
}
