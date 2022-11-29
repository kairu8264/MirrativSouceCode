package l7;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;
import o7.u;

/* loaded from: classes.dex */
public class c implements m7.j<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final j f39611a;

    public c(j jVar) {
        this.f39611a = jVar;
    }

    @Override // m7.j
    /* renamed from: c */
    public u<Bitmap> b(ByteBuffer byteBuffer, int i10, int i11, m7.h hVar) throws IOException {
        return this.f39611a.d(i8.a.f(byteBuffer), i10, i11, hVar);
    }

    @Override // m7.j
    /* renamed from: d */
    public boolean a(ByteBuffer byteBuffer, m7.h hVar) throws IOException {
        return this.f39611a.m(byteBuffer, hVar);
    }
}
