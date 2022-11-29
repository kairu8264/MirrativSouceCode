package ai;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class g34 {
    public static Pair<ByteBuffer, Long> a(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> e10 = e(randomAccessFile, 0);
        return e10 != null ? e10 : e(randomAccessFile, 65535);
    }

    public static long b(ByteBuffer byteBuffer) {
        f(byteBuffer);
        return g(byteBuffer, byteBuffer.position() + 16);
    }

    public static void c(ByteBuffer byteBuffer, long j10) {
        f(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j10 >= 0 && j10 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + position, (int) j10);
            return;
        }
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("uint32 value of out range: ");
        sb2.append(j10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static long d(ByteBuffer byteBuffer) {
        f(byteBuffer);
        return g(byteBuffer, byteBuffer.position() + 12);
    }

    public static Pair<ByteBuffer, Long> e(RandomAccessFile randomAccessFile, int i10) throws IOException {
        int i11;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i10, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        f(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i12 = capacity2 - 22;
            int min = Math.min(i12, 65535);
            for (int i13 = 0; i13 < min; i13++) {
                i11 = i12 - i13;
                if (allocate.getInt(i11) == 101010256 && ((char) allocate.getShort(i11 + 20)) == i13) {
                    break;
                }
            }
        }
        i11 = -1;
        if (i11 == -1) {
            return null;
        }
        allocate.position(i11);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i11));
    }

    public static void f(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static long g(ByteBuffer byteBuffer, int i10) {
        return byteBuffer.getInt(i10) & 4294967295L;
    }
}
