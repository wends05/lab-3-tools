
@main def hello(): Unit =
  printLyrics(so_long_london_taylor)

type Lyrics = List[(Double, String)]

def printLyrics(lyrics: Lyrics) =

  for ((time, line) <- lyrics) do
    println(line)
    Thread.sleep((time * 1000).toLong)
  

val close_to_you_gracie = List(
  1.8 -> "Pull the trigger on the gun",
  1.8 -> "I gave you when we met",
  1.7 -> "I want to be",
  2.3 -> "Close to you",
  1.8 -> "Break my heart and start a fire",
  1.7 -> "You've got me overnight",
  1.8 -> "Just let me be",
  2.0 -> "Close to you",
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