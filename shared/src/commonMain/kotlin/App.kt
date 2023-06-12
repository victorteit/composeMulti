@file:OptIn(ExperimentalMaterialApi::class, ExperimentalMaterialApi::class)
package ui.theme
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Shapes
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ui.theme.AppTheme



import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.resource

fun greeting(name: String, age: Int): String {
    var message = "Hello $name, you are now $age old"
    println(message)
    return message;
}

fun arrayTest() {

}

fun makeArray() {
    var nums = IntArray(10, { it })
    for (num in nums) {
        println(num.toString())
    }
}

fun makeMap() {
    var map = mapOf<Int, String>(
        0 to "Hello",
        1 to "World",
        2 to "Bye",
        3 to "for",
        4 to "now"
    )
    var message = ""
    for (string in map) {
        message += "${string.value} "
    }
    println(message)
}

fun rangeTest() {
    val stepRange = 1..10 step 2
    for (num in stepRange) {
        println(num)
    }
}

fun rangeValue() {
    val range = 1..100
    val value = 125
    if (value in range) {
        println("$value is within the range")
    } else {
        println("$value is outside the range")
    }
}

fun dayToday() {
    val dayOfWeek = 3

    val dayOfWeekString = when (dayOfWeek) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day of the week"
    }
    println("Today is $dayOfWeekString")
}

fun calculating() {
    val square: (Int) -> Int = ::calculateSquare
    val number = 5
    val squareResult = square(number)
    println("Square of $number is $squareResult")
    val cube: (Int) -> Int = { num -> num * num * num }
    val cubeResult = cube(3)
    println("Cube of 3 is $cubeResult")
}

fun geography() {
    val countryCapitalMap = mapOf(
        "USA" to "Washington",
        "Canada" to "Ottawa",
        "France" to "Paris",
        "Russia" to "Moscow"
    )
    val getCapital: (String) -> String = { country ->
        countryCapitalMap[country] ?: "Capital not found"
    }
    val country = "Russia"

    val capital = getCapital(country)
    println("The capital of $country is $capital")
}

fun calculateSquare(number: Int): Int {
    return number * number
}

open class Country(val name: String, val capital: String, val population: Int) {
    open fun about() {
        println("Name: $name")
        println("Capital: $capital")
        println("Population: $population")
    }
}

class Canada : Country("Canada", "Ottawa", 37) {
    override fun about() {
        println("Additional information about Canada...")
        super.about()
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable

fun App() {
    AppTheme {
       // Banner("Jane")
        WellnessScreen()
    }
}
@OptIn(ExperimentalResourceApi::class)
@Composable
fun Banner(name: String) {
    val text = rememberSaveable { mutableStateOf("") }
    TextField(
        value = text.value,

        onValueChange = { text.value = it },

        textStyle = TextStyle(textAlign = TextAlign.Center),

        label = { Text(text = "Please enter your name") }

    )
    Scaffold(
        topBar = { TopAppBar(title = { Text("VICTOR") }) },
        bottomBar = { BottomAppBar { Text("Copyright (c) 2023 CoolEntertainment, Inc.") } },
        floatingActionButton = { FloatingActionButton(onClick = {}) { Text("Click Me") } }
    ) {
        Text("android")
    }
    MaterialTheme {
        var greetingText by remember { mutableStateOf(greeting("Victor", 37)) }
        var showImage by remember { mutableStateOf(false) }
        makeMap()
        rangeTest()
        rangeValue()
        dayToday()
        calculating()
        geography()
        val canada = Canada()
        canada.about()

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                greetingText = "Hello "
                showImage = !showImage
            }) {
                Text(greetingText)
            }
            AnimatedVisibility(showImage) {
                Image(
                    painterResource("compose-multiplatform.xml"),
                    null
                )
            }
        }

        Column(
            modifier = Modifier.padding(24.dp).fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Text("Hello $name")
                Spacer(modifier = Modifier.height(20.dp).width(20.dp))
                Text("Welcome to my app")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                Text("Hello $name")
                Spacer(modifier = Modifier.height(20.dp).width(20.dp))
                Text("Welcome to my app")

            }
        }
    }
}


//expect fun getPlatformName(): String
