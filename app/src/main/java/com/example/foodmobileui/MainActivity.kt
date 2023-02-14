package com.example.foodmobileui

import android.graphics.fonts.FontStyle
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodmobileui.ui.theme.FoodMobileUITheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodMobileUITheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.primary
                ) {
                    Line1()
                    CardUi()
                }
            }
        }
    }
}
@Composable
fun Line1(){

    Row(modifier = Modifier
        .size(300.dp, 60.dp)
        .padding(25.dp)
   ){

      Text(modifier = Modifier
          .width(250.dp)
          .height(200.dp)
          .padding(8.dp),
          text="Hi, Jackie, what do you want to eat today?",
          fontSize = 23.sp
      )

       Image(painter = painterResource(id = R.drawable.ellipse_5), contentDescription ="Profile Picture" ,
           modifier = Modifier
               .size(150.dp)

       )

   }
}
@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun CardUi() {
    Column(modifier = Modifier.padding(top = 100.dp)) {
        Card(
            modifier = Modifier
                .fillMaxSize(),
            RoundedCornerShape(20, 20, 0, 0),
            backgroundColor = Color.White
        )
        {
            Row(
                modifier = Modifier
                    .padding(14.dp),
            ) {
                Card(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .height(50.dp)
                        .fillMaxWidth(), RoundedCornerShape(20.dp),
                    backgroundColor = Color(0xFFECECEC)
                ) {
                    Row(horizontalArrangement = Arrangement.Start, modifier = Modifier
                        .padding(top = 2.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.vector__4_),
                            contentDescription = null, Modifier.size(30.dp)
                        )
                    Text("  Search")
                    }

                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp, 100.dp, 10.dp, 22.dp),

                RoundedCornerShape(20, 20, 20, 20),
                backgroundColor = Color(0xFFECECEC)
            )
            {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(top = 33.dp), content = {
                        Text(
                            text = "   Recent orders:",
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF406A52),
                            fontSize = 25.sp
                        )

                        Row(horizontalArrangement = Arrangement.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.food_content_1),
                                contentDescription = null,
                                modifier = Modifier.size(170.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.food_content_2),
                                contentDescription = null,
                                modifier = Modifier.size(170.dp)
                            )

                        }

                        Row(horizontalArrangement = Arrangement.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.food_content_3),
                                contentDescription = null,
                                modifier = Modifier.size(170.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.food_content_4),
                                contentDescription = null,
                                modifier = Modifier.size(170.dp)
                            )

                        }

                        Row(horizontalArrangement = Arrangement.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.food_content_6),
                                contentDescription = null,
                                modifier = Modifier.size(170.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.food_content_5),
                                contentDescription = null,
                                modifier = Modifier.size(170.dp)
                            )

                        }

                    }
                )
                }


            }
        }
    Row(horizontalArrangement = Arrangement.End,
            modifier = Modifier
            .padding(top=520.dp),
    ) {
        Card(
            modifier = Modifier
                .padding(top = 205.dp, start = 12.dp,end=12.dp)
                .height(50.dp)
                .fillMaxWidth(), RoundedCornerShape(20.dp),
            backgroundColor = Color(0xFFECECEC)
        ) {
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier
                .padding( start = 12.dp)
                )
             {
                Image(
                    painter = painterResource(id = R.drawable.vector),
                    contentDescription = null, Modifier.size(30.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.vector__1_),
                    contentDescription = null, Modifier.size(30.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.vector__2_),
                    contentDescription = null, Modifier.size(30.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.vector__5_),
                    contentDescription = null, Modifier.size(30.dp)
                )

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FoodMobileUITheme {

    }
}