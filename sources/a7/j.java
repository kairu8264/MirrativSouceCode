package a7;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class j implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f583a;

    /* renamed from: b  reason: collision with root package name */
    public final a f584b;

    /* renamed from: c  reason: collision with root package name */
    public final z6.b f585c;

    /* renamed from: d  reason: collision with root package name */
    public final z6.m<PointF, PointF> f586d;

    /* renamed from: e  reason: collision with root package name */
    public final z6.b f587e;

    /* renamed from: f  reason: collision with root package name */
    public final z6.b f588f;

    /* renamed from: g  reason: collision with root package name */
    public final z6.b f589g;

    /* renamed from: h  reason: collision with root package name */
    public final z6.b f590h;

    /* renamed from: i  reason: collision with root package name */
    public final z6.b f591i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f592j;

    /* loaded from: classes.dex */
    public enum a {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        a(int i10) {
            this.value = i10;
        }

        public static a a(int i10) {
            a[] values;
            for (a aVar : values()) {
                if (aVar.value == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public j(String str, a aVar, z6.b bVar, z6.m<PointF, PointF> mVar, z6.b bVar2, z6.b bVar3, z6.b bVar4, z6.b bVar5, z6.b bVar6, boolean z10) {
        this.f583a = str;
        this.f584b = aVar;
        this.f585c = bVar;
        this.f586d = mVar;
        this.f587e = bVar2;
        this.f588f = bVar3;
        this.f589g = bVar4;
        this.f590h = bVar5;
        this.f591i = bVar6;
        this.f592j = z10;
    }

    @Override // a7.c
    public u6.c a(s6.f fVar, b7.b bVar) {
        return new u6.n(fVar, bVar, this);
    }

    public z6.b b() {
        return this.f588f;
    }

    public z6.b c() {
        return this.f590h;
    }

    public String d() {
        return this.f583a;
    }

    public z6.b e() {
        return this.f589g;
    }

    public z6.b f() {
        return this.f591i;
    }

    public z6.b g() {
        return this.f585c;
    }

    public z6.m<PointF, PointF> h() {
        return this.f586d;
    }

    public z6.b i() {
        return this.f587e;
    }

    public a j() {
        return this.f584b;
    }

    public boolean k() {
        return this.f592j;
    }
}
