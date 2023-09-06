package com.alpersapplication.app.modules.gatewaypairing.ui

import androidx.activity.viewModels
import com.alpersapplication.app.R
import com.alpersapplication.app.appcomponents.base.BaseActivity
import com.alpersapplication.app.databinding.ActivityGatewayPairingBinding
import com.alpersapplication.app.modules.gatewaypairing.`data`.viewmodel.GatewayPairingVM
import kotlin.String
import kotlin.Unit

class GatewayPairingActivity :
    BaseActivity<ActivityGatewayPairingBinding>(R.layout.activity_gateway_pairing) {
  private val viewModel: GatewayPairingVM by viewModels<GatewayPairingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.gatewayPairingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "GATEWAY_PAIRING_ACTIVITY"

  }
}
