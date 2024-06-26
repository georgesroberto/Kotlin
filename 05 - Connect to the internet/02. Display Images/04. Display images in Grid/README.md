# Procedure

## Display Single

> AsyncImage Composable

- Almost same as Image composable but with model, error, placeholder and contentScale

- Coil dependency is helpful in decoding images and caching them

```kt
import androidx.compose.material.Card
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding

@Composable
fun MarsPhotoCard(photo: MarsPhoto, modifier: Modifier = Modifier) {

    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {

        AsyncImage(
            model = ImageRequest.Builder(context = LocalContext.current)
                .data(photo.imgSrc)
                .crossfade(true)
                .build(),
            error = painterResource(R.drawable.ic_broken_image),
            placeholder = painterResource(R.drawable.loading_img),
            contentDescription = stringResource(R.string.mars_photo),
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
    }
}
```

## Add grid of images

> LazyVerticalGrid Composable

- In a new composable PhotoGridScreen pass photos as argument with the list of photos

```kt

when (marsUiState) {
       // ...
       is MarsUiState.Success -> PhotosGridScreen(marsUiState.photos, modifier)
       // ...
}


// Additional code

import androidx.compose.foundation.lazy.grid.items

@Composable
fun PhotosGridScreen(
    photos: List<MarsPhoto>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
) {
   LazyVerticalGrid(
       // ...
   ) {
       items(items = photos, key = { photo -> photo.id }) {
            photo -> MarsPhotoCard(photo)
        }
   }
}

```

## Retry Button

- Adding a retry button to cal getPhotos again

```kt

@Composable
fun ErrorScreen(retryAction: () -> Unit, modifier: Modifier = Modifier) {
    Column(
        // ...
    ) {
        Image(
            // ...
        )
        Text(//...)
        Button(onClick = retryAction) {
            Text(stringResource(R.string.retry))
        }
    }
}

@Composable
fun HomeScreen(
   marsUiState: MarsUiState, retryAction: () -> Unit, modifier: Modifier = Modifier
) {
   when (marsUiState) {
       //...

       is MarsUiState.Error -> ErrorScreen(retryAction, modifier = modifier.fillMaxSize())
   }
}

```
