
@main def hello(): Unit =
  printLyrics(close_to_you_gracie)

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