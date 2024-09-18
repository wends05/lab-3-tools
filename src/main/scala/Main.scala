@main def hello(): Unit =
  println("Hello world!")
  println(msg)

def msg = "I was compiled by Scala 3. :)"


type Lyrics = Map[List[Float], String]


def lyric_displayer(lyrics: Lyrics) = 
  for ((word_delay, line_delay), line) <- lyrics do
    for character <- line do
      print(character)
      Thread.sleep((word_delay * 1000).toLong)



