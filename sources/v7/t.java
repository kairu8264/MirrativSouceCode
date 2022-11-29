package v7;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class t implements m7.j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final d f56902a = new d();

    @Override // m7.j
    /* renamed from: c */
    public o7.u<Bitmap> b(InputStream inputStream, int i10, int i11, m7.h hVar) throws IOException {
        return this.f56902a.b(ImageDecoder.createSource(i8.a.b(inputStream)), i10, i11, hVar);
    }

    @Override // m7.j
    /* renamed from: d */
    public boolean a(InputStream inputStream, m7.h hVar) throws IOException {
        return true;
    }
}
