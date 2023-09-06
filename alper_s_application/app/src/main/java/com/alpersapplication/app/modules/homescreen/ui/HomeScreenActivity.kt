package com.alpersapplication.app.modules.homescreen.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.base.BaseActivity
import com.alpersapplication.app.databinding.ActivityHomeScreenBinding
import com.alpersapplication.app.modules.createanaccount.ui.CreateAnAccountActivity
import com.alpersapplication.app.modules.homescreen.`data`.viewmodel.HomeScreenVM
import kotlin.String
import kotlin.Unit

class HomeScreenActivity : BaseActivity<ActivityHomeScreenBinding>(R.layout.activity_home_screen) {
  private val viewModel: HomeScreenVM by viewModels<HomeScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeScreenVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = CreateAnAccountActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "HOME_SCREEN_ACTIVITY"

    }
  }
