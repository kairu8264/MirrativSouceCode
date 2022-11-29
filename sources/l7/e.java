package l7;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import o7.u;

/* loaded from: classes.dex */
public class e implements m7.j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final a f39616a;

    public e(a aVar) {
        this.f39616a = aVar;
    }

    @Override // m7.j
    /* renamed from: c */
    public u<Bitmap> b(InputStream inputStream, int i10, int i11, m7.h hVar) throws IOException {
        return this.f39616a.a(inputStream, i10, i11, hVar);
    }

    @Override // m7.j
    /* renamed from: d */
    public boolean a(InputStream inputStream, m7.h hVar) throws IOException {
        return this.f39616a.c(inputStream, hVar);
    }
}
