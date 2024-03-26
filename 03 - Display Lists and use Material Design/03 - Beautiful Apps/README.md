# Making Beautiful App

## Animations & Theming

- Cooming soon

## Conclusion Woof App

- You just created your first Material app! You created a custom color palette for both light and dark themes, created shapes for different components, downloaded fonts and added them to the app, and created a beautiful top bar to tie it all together.
- Take the skills you learned in this codelab and change colors, shapes, and typography to make apps completely your own!

## Summary

1. Material Theming allows you to use Material Design in your app, with guidance on customizing colors, typography, and shapes.
2. The Theme.kt file is where the theme is defined, through a composable named [your app name]+Theme()—WoofTheme() in the case of this app. Within this function, the MaterialTheme object sets the color, typography, shapes, and content of the app.
3. Color.kt is where you list the colors you use in the app.
   - Then in Theme.kt, you assign the colors in LightColorPalette and DarkColorPalette to specific slots. Not all slots need to be assigned.
4. Your app can opt-in to Force Dark, which means the system will implement a dark theme for you.

   - However, it is a better experience for your users if you implement the dark theme so that you maintain full control over the app theme.

5. Shape.kt is where you define your app shapes. There are three shape sizes (small, medium, large), and you can specify how the corners are rounded.
   - Shapes direct attention, identify components, communicate state, and express brand.
6. Type.kt is where you initialize your fonts and assign fontFamily, fontWeight, and fontSize for the Material Design type scale
7. The Material Design type scale includes a range of contrasting styles that support the needs of your app and its content. The type scale is a combination of 15 styles that are supported by the type system.
