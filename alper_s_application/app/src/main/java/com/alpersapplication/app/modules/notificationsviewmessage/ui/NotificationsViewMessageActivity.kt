package com.alpersapplication.app.modules.notificationsviewmessage.ui

import androidx.activity.viewModels
import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.base.BaseActivity
import com.alpersapplication.app.databinding.ActivityNotificationsViewMessageBinding
import com.alpersapplication.app.modules.notificationsviewmessage.`data`.viewmodel.NotificationsViewMessageVM
import kotlin.String
import kotlin.Unit

class NotificationsViewMessageActivity :
    BaseActivity<ActivityNotificationsViewMessageBinding>(R.layout.activity_notifications_view_message)
    {
  private val viewModel: NotificationsViewMessageVM by viewModels<NotificationsViewMessageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationsViewMessageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_VIEW_MESSAGE_ACTIVITY"

  }
}
