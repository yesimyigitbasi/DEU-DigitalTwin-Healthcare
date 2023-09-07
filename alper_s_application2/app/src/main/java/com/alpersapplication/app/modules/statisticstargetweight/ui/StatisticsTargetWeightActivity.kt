package com.alpersapplication.app.modules.statisticstargetweight.ui

import androidx.activity.viewModels
import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.base.BaseActivity
import com.alpersapplication.app.databinding.ActivityStatisticsTargetWeightBinding
import com.alpersapplication.app.modules.statisticstargetweight.`data`.viewmodel.StatisticsTargetWeightVM
import kotlin.String
import kotlin.Unit

class StatisticsTargetWeightActivity :
    BaseActivity<ActivityStatisticsTargetWeightBinding>(R.layout.activity_statistics_target_weight)
    {
  private val viewModel: StatisticsTargetWeightVM by viewModels<StatisticsTargetWeightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.statisticsTargetWeightVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "STATISTICS_TARGET_WEIGHT_ACTIVITY"

  }
}
