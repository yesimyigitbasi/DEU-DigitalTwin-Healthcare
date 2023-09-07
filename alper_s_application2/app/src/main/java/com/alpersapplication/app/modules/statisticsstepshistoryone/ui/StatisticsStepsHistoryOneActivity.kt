package com.alpersapplication.app.modules.statisticsstepshistoryone.ui

import androidx.activity.viewModels
import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.base.BaseActivity
import com.alpersapplication.app.databinding.ActivityStatisticsStepsHistoryOneBinding
import com.alpersapplication.app.modules.statisticsstepshistoryone.`data`.viewmodel.StatisticsStepsHistoryOneVM
import kotlin.String
import kotlin.Unit

class StatisticsStepsHistoryOneActivity :
    BaseActivity<ActivityStatisticsStepsHistoryOneBinding>(R.layout.activity_statistics_steps_history_one)
    {
  private val viewModel: StatisticsStepsHistoryOneVM by viewModels<StatisticsStepsHistoryOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.statisticsStepsHistoryOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "STATISTICS_STEPS_HISTORY_ONE_ACTIVITY"

  }
}
