package my.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadMeFile {


    public void saveToReadMeFile(String s) throws IOException {
        Path path = Paths.get("readme.txt");
        SeekableByteChannel fileChannel = Files.newByteChannel(path);
        ByteBuffer byteBuffer = ByteBuffer.allocate(10).put(s.getBytes());
        fileChannel.write(byteBuffer);
        fileChannel.close();
    }

    public String readFromReadMeFile() {
        String s = null;

        return s;
    }
}