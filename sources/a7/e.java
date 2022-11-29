package a7;

import android.graphics.Path;

/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public final g f553a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f554b;

    /* renamed from: c  reason: collision with root package name */
    public final z6.c f555c;

    /* renamed from: d  reason: collision with root package name */
    public final z6.d f556d;

    /* renamed from: e  reason: collision with root package name */
    public final z6.f f557e;

    /* renamed from: f  reason: collision with root package name */
    public final z6.f f558f;

    /* renamed from: g  reason: collision with root package name */
    public final String f559g;

    /* renamed from: h  reason: collision with root package name */
    public final z6.b f560h;

    /* renamed from: i  reason: collision with root package name */
    public final z6.b f561i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f562j;

    public e(String str, g gVar, Path.FillType fillType, z6.c cVar, z6.d dVar, z6.f fVar, z6.f fVar2, z6.b bVar, z6.b bVar2, boolean z10) {
        this.f553a = gVar;
        this.f554b = fillType;
        this.f555c = cVar;
        this.f556d = dVar;
        this.f557e = fVar;
        this.f558f = fVar2;
        this.f559g = str;
        this.f560h = bVar;
        this.f561i = bVar2;
        this.f562j = z10;
    }

    @Override // a7.c
    public u6.c a(s6.f fVar, b7.b bVar) {
        return new u6.h(fVar, bVar, this);
    }

    public z6.f b() {
        return this.f558f;
    }

    public Path.FillType c() {
        return this.f554b;
    }

    public z6.c d() {
        return this.f555c;
    }

    public g e() {
        return this.f553a;
    }

    public String f() {
        return this.f559g;
    }

    public z6.d g() {
        return this.f556d;
    }

    public z6.f h() {
        return this.f557e;
    }

    public boolean i() {
        return this.f562j;
    }
}
