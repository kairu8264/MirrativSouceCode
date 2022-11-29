package l7;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class h {
    public static int a(int i10, int i11, int i12, int i13) {
        int min = Math.min(i11 / i13, i10 / i12);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("Utils", 2) && max > 1) {
            Log.v("Utils", "Downsampling WEBP, sampleSize: " + max + ", target dimens: [" + i12 + "x" + i13 + "], actual dimens: [" + i10 + "x" + i11 + "]");
        }
        return max;
    }

    public static byte[] b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e10) {
            if (Log.isLoggable("Utils", 5)) {
                Log.w("Utils", "Error reading data from stream", e10);
                return null;
            }
            return null;
        }
    }
}
