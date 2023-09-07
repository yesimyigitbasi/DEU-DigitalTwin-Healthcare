package com.alpersapplication.app.modules.homescreen.ui

import androidx.activity.viewModels
import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.base.BaseActivity
import com.alpersapplication.app.databinding.ActivityHomeScreenBinding
import com.alpersapplication.app.modules.homescreen.`data`.viewmodel.HomeScreenVM
import kotlin.String
import kotlin.Unit

class HomeScreenActivity : BaseActivity<ActivityHomeScreenBinding>(R.layout.activity_home_screen) {
  private val viewModel: HomeScreenVM by viewModels<HomeScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOME_SCREEN_ACTIVITY"

  }
}
