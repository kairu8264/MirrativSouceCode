package v7;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class g implements m7.j<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final m f56853a;

    public g(m mVar) {
        this.f56853a = mVar;
    }

    @Override // m7.j
    /* renamed from: c */
    public o7.u<Bitmap> b(ByteBuffer byteBuffer, int i10, int i11, m7.h hVar) throws IOException {
        return this.f56853a.e(i8.a.f(byteBuffer), i10, i11, hVar);
    }

    @Override // m7.j
    /* renamed from: d */
    public boolean a(ByteBuffer byteBuffer, m7.h hVar) {
        return this.f56853a.q(byteBuffer);
    }
}
