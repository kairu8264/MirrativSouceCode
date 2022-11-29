package s7;

import android.util.Log;
import com.google.android.exoplayer2.C;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class t implements m7.d<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final p7.b f52292a;

    public t(p7.b bVar) {
        this.f52292a = bVar;
    }

    @Override // m7.d
    /* renamed from: c */
    public boolean a(InputStream inputStream, File file, m7.h hVar) {
        byte[] bArr = (byte[]) this.f52292a.c(C.DEFAULT_BUFFER_SEGMENT_SIZE, byte[].class);
        boolean z10 = false;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        } catch (IOException e10) {
                            e = e10;
                            fileOutputStream = fileOutputStream2;
                            if (Log.isLoggable("StreamEncoder", 3)) {
                                Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            this.f52292a.e(bArr);
                            return z10;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            this.f52292a.e(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream2.close();
                    z10 = true;
                    fileOutputStream2.close();
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (IOException unused2) {
        }
        this.f52292a.e(bArr);
        return z10;
    }
}
