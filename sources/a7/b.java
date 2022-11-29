package a7;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f546a;

    /* renamed from: b  reason: collision with root package name */
    public final z6.m<PointF, PointF> f547b;

    /* renamed from: c  reason: collision with root package name */
    public final z6.f f548c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f549d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f550e;

    public b(String str, z6.m<PointF, PointF> mVar, z6.f fVar, boolean z10, boolean z11) {
        this.f546a = str;
        this.f547b = mVar;
        this.f548c = fVar;
        this.f549d = z10;
        this.f550e = z11;
    }

    @Override // a7.c
    public u6.c a(s6.f fVar, b7.b bVar) {
        return new u6.f(fVar, bVar, this);
    }

    public String b() {
        return this.f546a;
    }

    public z6.m<PointF, PointF> c() {
        return this.f547b;
    }

    public z6.f d() {
        return this.f548c;
    }

    public boolean e() {
        return this.f550e;
    }

    public boolean f() {
        return this.f549d;
    }
}
