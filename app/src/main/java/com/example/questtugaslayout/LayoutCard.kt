package com.example.questtugaslayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questtugaslayout.ui.theme.QuestTugasLayoutTheme

// FUNGSI UTAMA
@Composable
fun LayoutCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(25.dp))

        // Card 1 - Kim Taehyung
        ItemCard(
            warnaCard = R.color.card_1_bg,
            gambar = R.drawable.taehyung,
            nama = stringResource(id = R.string.nama_1),
            alamat = stringResource(id = R.string.alamat_1),
            warnaNama = R.color.text_nama_1,
            warnaAlamat = R.color.text_alamat_1
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Card 2 - Jeon Jungkook
        ItemCard(
            warnaCard = R.color.card_2_bg,
            gambar = R.drawable.jungkook,
            nama = stringResource(id = R.string.nama_2),
            alamat = stringResource(id = R.string.alamat_2),
            warnaNama = R.color.text_nama_2,
            warnaAlamat = R.color.text_alamat_2
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Card 3 - Park Jimin
        ItemCard(
            warnaCard = R.color.card_3_bg,
            gambar = R.drawable.jimin,
            nama = stringResource(id = R.string.nama_3),
            alamat = stringResource(id = R.string.alamat_3),
            warnaNama = R.color.text_nama_3,
            warnaAlamat = R.color.text_alamat_3
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Card 4 - Kim Seokjin
        ItemCard(
            warnaCard = R.color.card_4_bg,
            gambar = R.drawable.jin,
            nama = stringResource(id = R.string.nama_4),
            alamat = stringResource(id = R.string.alamat_4),
            warnaNama = R.color.text_nama_4,
            warnaAlamat = R.color.text_alamat_4
        )

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = stringResource(id = R.string.copyright),
            fontSize = 14.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
    }
}

// FUNGSI CARD REUSABLE
@Composable
fun ItemCard(
    warnaCard: Int,
    gambar: Int,
    nama: String,
    alamat: String,
    warnaNama: Int,
    warnaAlamat: Int
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = warnaCard)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = gambar),
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
            )


        }














