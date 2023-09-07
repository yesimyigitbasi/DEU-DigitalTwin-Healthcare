package com.alpersapplication.app.modules.statisticsstepshistoryone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alpersapplication.app.modules.statisticsstepshistoryone.`data`.model.StatisticsStepsHistoryOneModel
import org.koin.core.KoinComponent

class StatisticsStepsHistoryOneVM : ViewModel(), KoinComponent {
  val statisticsStepsHistoryOneModel: MutableLiveData<StatisticsStepsHistoryOneModel> =
      MutableLiveData(StatisticsStepsHistoryOneModel())

  var navArguments: Bundle? = null
}
