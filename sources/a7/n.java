package a7;

import android.graphics.Path;

/* loaded from: classes.dex */
public class n implements c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f606a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f607b;

    /* renamed from: c  reason: collision with root package name */
    public final String f608c;

    /* renamed from: d  reason: collision with root package name */
    public final z6.a f609d;

    /* renamed from: e  reason: collision with root package name */
    public final z6.d f610e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f611f;

    public n(String str, boolean z10, Path.FillType fillType, z6.a aVar, z6.d dVar, boolean z11) {
        this.f608c = str;
        this.f606a = z10;
        this.f607b = fillType;
        this.f609d = aVar;
        this.f610e = dVar;
        this.f611f = z11;
    }

    @Override // a7.c
    public u6.c a(s6.f fVar, b7.b bVar) {
        return new u6.g(fVar, bVar, this);
    }

    public z6.a b() {
        return this.f609d;
    }

    public Path.FillType c() {
        return this.f607b;
    }

    public String d() {
        return this.f608c;
    }

    public z6.d e() {
        return this.f610e;
    }

    public boolean f() {
        return this.f611f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f606a + '}';
    }
}
