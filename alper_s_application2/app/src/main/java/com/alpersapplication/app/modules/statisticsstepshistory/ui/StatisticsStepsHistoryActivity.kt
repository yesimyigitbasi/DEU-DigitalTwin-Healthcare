package com.alpersapplication.app.modules.statisticsstepshistory.ui

import androidx.activity.viewModels
import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.base.BaseActivity
import com.alpersapplication.app.databinding.ActivityStatisticsStepsHistoryBinding
import com.alpersapplication.app.modules.statisticsstepshistory.`data`.viewmodel.StatisticsStepsHistoryVM
import kotlin.String
import kotlin.Unit

class StatisticsStepsHistoryActivity :
    BaseActivity<ActivityStatisticsStepsHistoryBinding>(R.layout.activity_statistics_steps_history)
    {
  private val viewModel: StatisticsStepsHistoryVM by viewModels<StatisticsStepsHistoryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.statisticsStepsHistoryVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "STATISTICS_STEPS_HISTORY_ACTIVITY"

  }
}
