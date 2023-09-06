package com.alpersapplication.app.modules.wanttodeleteacc.ui

import androidx.activity.viewModels
import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.base.BaseActivity
import com.alpersapplication.app.databinding.ActivityWantToDeleteAccBinding
import com.alpersapplication.app.modules.wanttodeleteacc.`data`.viewmodel.WantToDeleteAccVM
import kotlin.String
import kotlin.Unit

class WantToDeleteAccActivity :
    BaseActivity<ActivityWantToDeleteAccBinding>(R.layout.activity_want_to_delete_acc) {
  private val viewModel: WantToDeleteAccVM by viewModels<WantToDeleteAccVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.wantToDeleteAccVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "WANT_TO_DELETE_ACC_ACTIVITY"

  }
}
