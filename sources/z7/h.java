package z7;

import android.graphics.Bitmap;
import o7.u;

/* loaded from: classes.dex */
public final class h implements m7.j<i7.a, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final p7.e f62634a;

    public h(p7.e eVar) {
        this.f62634a = eVar;
    }

    @Override // m7.j
    /* renamed from: c */
    public u<Bitmap> b(i7.a aVar, int i10, int i11, m7.h hVar) {
        return v7.e.f(aVar.getNextFrame(), this.f62634a);
    }

    @Override // m7.j
    /* renamed from: d */
    public boolean a(i7.a aVar, m7.h hVar) {
        return true;
    }
}
