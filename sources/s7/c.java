package s7;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class c implements m7.d<ByteBuffer> {
    @Override // m7.d
    /* renamed from: c */
    public boolean a(ByteBuffer byteBuffer, File file, m7.h hVar) {
        try {
            i8.a.e(byteBuffer, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }
}
