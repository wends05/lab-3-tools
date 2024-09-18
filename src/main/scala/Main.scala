@main def hello(): Unit =
  println("Hello world!")
  printLyrics(close_to_you_gracie)

type Lyrics = Map[Double, String]

def printLyrics(lyrics: Lyrics) =
  lyrics.foreach((delay_per_word, line) =>
    println(delay_per_word.toFloat * 1000)
    Thread.sleep((delay_per_word.toLong * 1000))
    println(line)
  )

val close_to_you_gracie : Lyrics = Map(
  0.5 -> "Pull the trigger on the gun",
  0.5 -> "I gave you when we met",
  0.5 -> "I want to be",
  0.5 -> "Close to you",
  1.0 -> "Break my heart and start a fire",
  0.6 -> "You've got me overnight",
  0.5 -> "Just let me be",
  1.0 -> "Close to you",
)