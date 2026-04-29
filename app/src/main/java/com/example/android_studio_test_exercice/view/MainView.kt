package com.example.android_studio_test_exercice.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.example.android_studio_test_exercice.viewmodel.MainViewModel

@Composable
fun MainView(myViewModel: MainViewModel, modifier: Modifier = Modifier) {
    val count by myViewModel.count.observeAsState(0)

    Column(modifier = modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text(text = "Count: $count", modifier = Modifier.testTag("countText"))

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(onClick = { myViewModel.decrement() }, modifier = Modifier.testTag("decrementButton")) {
                Text("-")
            }
            Button(onClick = { myViewModel.increment() }, modifier = Modifier.testTag("incrementButton")) {
                Text("+")
            }
            Button(onClick = { myViewModel.reset() }, modifier = Modifier.testTag("resetButton")) {
                Text("Reset")
            }
        }
    }
}
