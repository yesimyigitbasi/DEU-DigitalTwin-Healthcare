package com.alpersapplication.app.modules.statisticsweighthistory.ui

import androidx.activity.viewModels
import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.base.BaseActivity
import com.alpersapplication.app.databinding.ActivityStatisticsWeightHistoryBinding
import com.alpersapplication.app.modules.statisticsweighthistory.`data`.viewmodel.StatisticsWeightHistoryVM
import kotlin.String
import kotlin.Unit

class StatisticsWeightHistoryActivity :
    BaseActivity<ActivityStatisticsWeightHistoryBinding>(R.layout.activity_statistics_weight_history)
    {
  private val viewModel: StatisticsWeightHistoryVM by viewModels<StatisticsWeightHistoryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.statisticsWeightHistoryVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "STATISTICS_WEIGHT_HISTORY_ACTIVITY"

  }
}
