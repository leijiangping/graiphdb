package cn.aipm.test

import java.io.File
import org.junit.{Assert, Test}

import cn.aipm.audio.AudioRecongnizer
import org.neo4j.blob.Blob

class AudioRecongnizerTest extends TestBase {
  val audioRecongnizer = new AudioRecongnizer()
  audioRecongnizer.initialize(config)

  @Test
  def test1():Unit={
    var imagePath1 = "C:\\Users\\hai\\Desktop\\temp.wav"
    val res = audioRecongnizer.extract(Blob.fromFile(new File(imagePath1)))
    print(res)
  }
}




