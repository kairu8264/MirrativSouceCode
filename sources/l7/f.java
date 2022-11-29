package l7;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import o7.u;

/* loaded from: classes.dex */
public class f implements m7.j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final j f39617a;

    /* renamed from: b  reason: collision with root package name */
    public final p7.b f39618b;

    public f(j jVar, p7.b bVar) {
        this.f39617a = jVar;
        this.f39618b = bVar;
    }

    @Override // m7.j
    /* renamed from: c */
    public u<Bitmap> b(InputStream inputStream, int i10, int i11, m7.h hVar) throws IOException {
        return this.f39617a.d(inputStream, i10, i11, hVar);
    }

    @Override // m7.j
    /* renamed from: d */
    public boolean a(InputStream inputStream, m7.h hVar) throws IOException {
        return this.f39617a.l(inputStream, hVar);
    }
}
