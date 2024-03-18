# LEARN

## States

- Statefull Composables
- Stateless Composables
- State hosting (Stateless to Stateful)
  - In the composable function, add reusable parts as parameters. Pass those parameters as values in the composable function body

## TextField

- Container
- Leading Icons
- Trailing Icons
- Label Text
- Input Text
- Active Indicator
- Supporting Text

## Positional Formating

- Displays dynamic ocntent
- Eg: in res>strings>intro.xml
  - \<string name="intro">Hello, %s</string>\
- Using it dynamically
  - <code>Text(text = stingResource(R.string.intro, "Georges"))</code>

## Setting action buttons

- keyboardOptions: KeyboardOptions
- keyboardOptions.Done/Next/Number/Url/etc...

## Adding a switch

## Support for orientation

- Potrait and Landscape
