package v7;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class h implements m7.j<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final d f56854a = new d();

    @Override // m7.j
    /* renamed from: c */
    public o7.u<Bitmap> b(ByteBuffer byteBuffer, int i10, int i11, m7.h hVar) throws IOException {
        return this.f56854a.b(ImageDecoder.createSource(byteBuffer), i10, i11, hVar);
    }

    @Override // m7.j
    /* renamed from: d */
    public boolean a(ByteBuffer byteBuffer, m7.h hVar) throws IOException {
        return true;
    }
}
