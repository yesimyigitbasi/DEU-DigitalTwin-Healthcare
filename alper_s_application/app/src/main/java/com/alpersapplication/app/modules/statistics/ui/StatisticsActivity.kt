package com.alpersapplication.app.modules.statistics.ui

import androidx.activity.viewModels
import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.base.BaseActivity
import com.alpersapplication.app.databinding.ActivityStatisticsBinding
import com.alpersapplication.app.modules.statistics.`data`.viewmodel.StatisticsVM
import kotlin.String
import kotlin.Unit

class StatisticsActivity : BaseActivity<ActivityStatisticsBinding>(R.layout.activity_statistics) {
  private val viewModel: StatisticsVM by viewModels<StatisticsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.statisticsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "STATISTICS_ACTIVITY"

  }
}
