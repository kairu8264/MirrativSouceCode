package f8;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class c<T> implements j<T> {

    /* renamed from: w  reason: collision with root package name */
    public final int f31826w;

    /* renamed from: x  reason: collision with root package name */
    public final int f31827x;

    /* renamed from: y  reason: collision with root package name */
    public e8.d f31828y;

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // f8.j
    public final e8.d b() {
        return this.f31828y;
    }

    @Override // f8.j
    public final void d(i iVar) {
    }

    @Override // f8.j
    public void f(Drawable drawable) {
    }

    @Override // f8.j
    public final void j(e8.d dVar) {
        this.f31828y = dVar;
    }

    @Override // f8.j
    public void k(Drawable drawable) {
    }

    @Override // f8.j
    public final void l(i iVar) {
        iVar.d(this.f31826w, this.f31827x);
    }

    @Override // b8.m
    public void onDestroy() {
    }

    @Override // b8.m
    public void onStart() {
    }

    @Override // b8.m
    public void onStop() {
    }

    public c(int i10, int i11) {
        if (i8.k.u(i10, i11)) {
            this.f31826w = i10;
            this.f31827x = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }
}
