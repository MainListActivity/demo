package test;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 版权所有：   y.
 * 创建日期：   18-1-3.
 * 重要说明：
 * 修订历史：
 */
public class ArrayTest {
    @Test
    public void nio() {

        try {
            RandomAccessFile file = new RandomAccessFile("/home/y/IdeaProjects/demo/test/src/main/resources/abc.xml", "rw");
            FileChannel fileChannel = file.getChannel();
            int i;
            ByteBuffer byteBuffer = ByteBuffer.allocate(255);
            StringBuilder stringBuilder = new StringBuilder();
            while ((i = fileChannel.read(byteBuffer)) != -1) {
                byteBuffer.flip();
                System.out.printf("读到 %d 个字符", i).println();
                byte[] s=byteBuffer.array();
//                while (byteBuffer.hasRemaining()) {
//                    stringBuilder.append((char) byteBuffer.get());
//                }
                stringBuilder.append(new String(s));
                byteBuffer.clear();
            }
            fileChannel.close();
            file.close();
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void io() throws Exception {
        File file = new File("/home/y/IdeaProjects/demo/test/src/main/resources/abc.xml");
        FileInputStream fileInputStream = new FileInputStream(file);
        int i;
        StringBuilder sb = new StringBuilder();
        byte[] s = new byte[255];
        while ((i = fileInputStream.read(s)) != -1) {
            byte[] d = new byte[i];
            System.out.printf("读到 %d 个字符", i).println();
            System.arraycopy(s, 0, d, 0, i);
            sb.append(new java.lang.String(d));
        }
        System.out.println(sb.toString());
    }
}
