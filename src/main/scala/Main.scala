
@main def hello(): Unit =
  printLyrics(so_long_london_taylor)

type Lyrics = List[((Double, Double), String)]

def printLyrics(lyrics: Lyrics) =

  for (((delay_per_character, delay_after_line), line) <- lyrics) do
    for character <- line do
      print(character)
      Thread.sleep((delay_per_character * 1000).toLong)
    println("")
    Thread.sleep((delay_after_line * 1000).toLong)
  

val close_to_you_gracie = List(
  (0.05, 0.5) -> "Pull the trigger on the gun",
  (0.1, 0.5) -> "I gave you when we met",
  (0.1, 0.5) -> "I want to be",
  (0.2, 0.5) -> "Close to you",
  (0.1, 0.5) -> "Break my heart and start a fire",
  (0.1, 0.5) -> "You've got me overnight",
  (0.1, 0.5)-> "Just let me be",
  (0.1, 0.5) -> "Close to you",
)

val so_long_london_taylor : Lyrics = List(
  0.5 -> "And you say I abandoned the ship",
  0.5 -> "But I was going down with it",
  0.5 -> "My white-knuckle dying grip",
  0.5 -> "Holding tight to your quiet resentment",
  0.5 -> "And my friends said it isn't right to be scared",
  0.5 -> "Every day of a love affair",
  0.5 -> "Every breath feels like rarest air",
  0.5 -> "When you're not sure if he wants to be there"
)