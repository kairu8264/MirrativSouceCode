package z7;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o7.u;

/* loaded from: classes.dex */
public class j implements m7.j<InputStream, c> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f62637a;

    /* renamed from: b  reason: collision with root package name */
    public final m7.j<ByteBuffer, c> f62638b;

    /* renamed from: c  reason: collision with root package name */
    public final p7.b f62639c;

    public j(List<ImageHeaderParser> list, m7.j<ByteBuffer, c> jVar, p7.b bVar) {
        this.f62637a = list;
        this.f62638b = jVar;
        this.f62639c = bVar;
    }

    public static byte[] e(InputStream inputStream) {
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
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
                return null;
            }
            return null;
        }
    }

    @Override // m7.j
    /* renamed from: c */
    public u<c> b(InputStream inputStream, int i10, int i11, m7.h hVar) throws IOException {
        byte[] e10 = e(inputStream);
        if (e10 == null) {
            return null;
        }
        return this.f62638b.b(ByteBuffer.wrap(e10), i10, i11, hVar);
    }

    @Override // m7.j
    /* renamed from: d */
    public boolean a(InputStream inputStream, m7.h hVar) throws IOException {
        return !((Boolean) hVar.c(i.f62636b)).booleanValue() && com.bumptech.glide.load.a.e(this.f62637a, inputStream, this.f62639c) == ImageHeaderParser.ImageType.GIF;
    }
}
