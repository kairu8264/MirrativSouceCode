package mp;

import jo.p;
import rp.f;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final rp.f f41226d;

    /* renamed from: e  reason: collision with root package name */
    public static final rp.f f41227e;

    /* renamed from: f  reason: collision with root package name */
    public static final rp.f f41228f;

    /* renamed from: g  reason: collision with root package name */
    public static final rp.f f41229g;

    /* renamed from: h  reason: collision with root package name */
    public static final rp.f f41230h;

    /* renamed from: i  reason: collision with root package name */
    public static final rp.f f41231i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f41232j = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f41233a;

    /* renamed from: b  reason: collision with root package name */
    public final rp.f f41234b;

    /* renamed from: c  reason: collision with root package name */
    public final rp.f f41235c;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    static {
        f.a aVar = rp.f.f51677z;
        f41226d = aVar.d(":");
        f41227e = aVar.d(":status");
        f41228f = aVar.d(":method");
        f41229g = aVar.d(":path");
        f41230h = aVar.d(":scheme");
        f41231i = aVar.d(":authority");
    }

    public b(rp.f fVar, rp.f fVar2) {
        p.h(fVar, "name");
        p.h(fVar2, "value");
        this.f41234b = fVar;
        this.f41235c = fVar2;
        this.f41233a = fVar.G() + 32 + fVar2.G();
    }

    public final rp.f a() {
        return this.f41234b;
    }

    public final rp.f b() {
        return this.f41235c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return p.c(this.f41234b, bVar.f41234b) && p.c(this.f41235c, bVar.f41235c);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        rp.f fVar = this.f41234b;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        rp.f fVar2 = this.f41235c;
        return hashCode + (fVar2 != null ? fVar2.hashCode() : 0);
    }

    public String toString() {
        return this.f41234b.L() + ": " + this.f41235c.L();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            jo.p.h(r2, r0)
            java.lang.String r0 = "value"
            jo.p.h(r3, r0)
            rp.f$a r0 = rp.f.f51677z
            rp.f r2 = r0.d(r2)
            rp.f r3 = r0.d(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mp.b.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(rp.f fVar, String str) {
        this(fVar, rp.f.f51677z.d(str));
        p.h(fVar, "name");
        p.h(str, "value");
    }
}
