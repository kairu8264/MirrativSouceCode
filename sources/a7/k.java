package a7;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class k implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f593a;

    /* renamed from: b  reason: collision with root package name */
    public final z6.m<PointF, PointF> f594b;

    /* renamed from: c  reason: collision with root package name */
    public final z6.m<PointF, PointF> f595c;

    /* renamed from: d  reason: collision with root package name */
    public final z6.b f596d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f597e;

    public k(String str, z6.m<PointF, PointF> mVar, z6.m<PointF, PointF> mVar2, z6.b bVar, boolean z10) {
        this.f593a = str;
        this.f594b = mVar;
        this.f595c = mVar2;
        this.f596d = bVar;
        this.f597e = z10;
    }

    @Override // a7.c
    public u6.c a(s6.f fVar, b7.b bVar) {
        return new u6.o(fVar, bVar, this);
    }

    public z6.b b() {
        return this.f596d;
    }

    public String c() {
        return this.f593a;
    }

    public z6.m<PointF, PointF> d() {
        return this.f594b;
    }

    public z6.m<PointF, PointF> e() {
        return this.f595c;
    }

    public boolean f() {
        return this.f597e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f594b + ", size=" + this.f595c + '}';
    }
}
