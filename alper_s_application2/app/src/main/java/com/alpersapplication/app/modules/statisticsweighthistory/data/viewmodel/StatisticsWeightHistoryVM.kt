package com.alpersapplication.app.modules.statisticsweighthistory.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alpersapplication.app.modules.statisticsweighthistory.`data`.model.StatisticsWeightHistoryModel
import org.koin.core.KoinComponent

class StatisticsWeightHistoryVM : ViewModel(), KoinComponent {
  val statisticsWeightHistoryModel: MutableLiveData<StatisticsWeightHistoryModel> =
      MutableLiveData(StatisticsWeightHistoryModel())

  var navArguments: Bundle? = null
}
