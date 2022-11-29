package a7;

import u6.s;

/* loaded from: classes.dex */
public class r implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f631a;

    /* renamed from: b  reason: collision with root package name */
    public final a f632b;

    /* renamed from: c  reason: collision with root package name */
    public final z6.b f633c;

    /* renamed from: d  reason: collision with root package name */
    public final z6.b f634d;

    /* renamed from: e  reason: collision with root package name */
    public final z6.b f635e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f636f;

    /* loaded from: classes.dex */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a a(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type " + i10);
            }
            return SIMULTANEOUSLY;
        }
    }

    public r(String str, a aVar, z6.b bVar, z6.b bVar2, z6.b bVar3, boolean z10) {
        this.f631a = str;
        this.f632b = aVar;
        this.f633c = bVar;
        this.f634d = bVar2;
        this.f635e = bVar3;
        this.f636f = z10;
    }

    @Override // a7.c
    public u6.c a(s6.f fVar, b7.b bVar) {
        return new s(bVar, this);
    }

    public z6.b b() {
        return this.f634d;
    }

    public String c() {
        return this.f631a;
    }

    public z6.b d() {
        return this.f635e;
    }

    public z6.b e() {
        return this.f633c;
    }

    public a f() {
        return this.f632b;
    }

    public boolean g() {
        return this.f636f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f633c + ", end: " + this.f634d + ", offset: " + this.f635e + "}";
    }
}
