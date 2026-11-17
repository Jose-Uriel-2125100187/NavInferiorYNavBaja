package com.example.navinferiorynavbaja.iu.profile

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ProfileViewModel : ViewModel(){
    private val _uistate = MutableStateFlow(ProfileUiState())
    val uiState : StateFlow<ProfileUiState> = _uistate.asStateFlow()
}