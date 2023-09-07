package com.alpersapplication.app.modules.cantconnecttointernet.ui

import androidx.activity.viewModels
import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.base.BaseActivity
import com.alpersapplication.app.databinding.ActivityCantConnectToInternetBinding
import com.alpersapplication.app.modules.cantconnecttointernet.`data`.viewmodel.CantConnectToInternetVM
import kotlin.String
import kotlin.Unit

class CantConnectToInternetActivity :
    BaseActivity<ActivityCantConnectToInternetBinding>(R.layout.activity_cant_connect_to_internet) {
  private val viewModel: CantConnectToInternetVM by viewModels<CantConnectToInternetVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cantConnectToInternetVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CANT_CONNECT_TO_INTERNET_ACTIVITY"

  }
}
