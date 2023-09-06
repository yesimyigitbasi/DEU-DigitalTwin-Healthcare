package com.alpersapplication.app.modules.statisticsstepshistory.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alpersapplication.app.modules.statisticsstepshistory.`data`.model.StatisticsStepsHistoryModel
import org.koin.core.KoinComponent

class StatisticsStepsHistoryVM : ViewModel(), KoinComponent {
  val statisticsStepsHistoryModel: MutableLiveData<StatisticsStepsHistoryModel> =
      MutableLiveData(StatisticsStepsHistoryModel())

  var navArguments: Bundle? = null
}
