package com.alpersapplication.app.modules.statistics.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alpersapplication.app.modules.statistics.`data`.model.StatisticsModel
import org.koin.core.KoinComponent

class StatisticsVM : ViewModel(), KoinComponent {
  val statisticsModel: MutableLiveData<StatisticsModel> = MutableLiveData(StatisticsModel())

  var navArguments: Bundle? = null
}
