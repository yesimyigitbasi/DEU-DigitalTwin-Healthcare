package com.alpersapplication.app.modules.statisticstargetweight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alpersapplication.app.modules.statisticstargetweight.`data`.model.StatisticsTargetWeightModel
import org.koin.core.KoinComponent

class StatisticsTargetWeightVM : ViewModel(), KoinComponent {
  val statisticsTargetWeightModel: MutableLiveData<StatisticsTargetWeightModel> =
      MutableLiveData(StatisticsTargetWeightModel())

  var navArguments: Bundle? = null
}
