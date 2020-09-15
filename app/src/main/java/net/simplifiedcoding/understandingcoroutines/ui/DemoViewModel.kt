package net.simplifiedcoding.understandingcoroutines.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class DemoViewModel : ViewModel() {
    init {
        viewModelScope.launch {

        }
    }
}