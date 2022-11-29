package o1;

import java.util.ArrayList;
import m2.v;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final c[] f43814a;

    /* renamed from: b  reason: collision with root package name */
    public int f43815b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f43816c;

    public g() {
        c[] cVarArr = new c[20];
        for (int i10 = 0; i10 < 20; i10++) {
            cVarArr[i10] = null;
        }
        this.f43814a = cVarArr;
        this.f43816c = true;
    }

    public final void a(long j10, long j11) {
        int i10 = (this.f43815b + 1) % 20;
        this.f43815b = i10;
        this.f43814a[i10] = new c(j11, j10, null);
    }

    public final long b() {
        if (this.f43816c) {
            return c();
        }
        long b10 = d().b();
        return v.a(b1.f.m(b10), b1.f.n(b10));
    }

    public final long c() {
        c cVar = this.f43814a[this.f43815b];
        if (cVar == null) {
            return v.a(0.0f, 0.0f);
        }
        a aVar = new a();
        a aVar2 = new a();
        int i10 = this.f43815b;
        int i11 = 0;
        c cVar2 = cVar;
        do {
            i10 = (i10 + 1) % 20;
            c cVar3 = this.f43814a[i10];
            if (cVar3 != null) {
                long b10 = cVar.b() - cVar3.b();
                long abs = Math.abs(cVar3.b() - cVar2.b());
                if (b10 <= 100) {
                    if (abs > 40) {
                        aVar.c();
                        aVar2.c();
                    }
                    long j10 = -b10;
                    aVar.a(j10, b1.f.m(cVar3.a()));
                    aVar2.a(j10, b1.f.n(cVar3.a()));
                    i11++;
                }
                cVar2 = cVar;
            }
            if (i10 == this.f43815b) {
                break;
            }
        } while (i11 < 20);
        if (i11 < 3) {
            return v.a(0.0f, 0.0f);
        }
        return v.a(aVar.b(), aVar2.b());
    }

    public final f d() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i10 = this.f43815b;
        c cVar = this.f43814a[i10];
        if (cVar == null) {
            return f.f43808e.a();
        }
        int i11 = 0;
        c cVar2 = cVar;
        while (true) {
            c cVar3 = this.f43814a[i10];
            if (cVar3 != null) {
                float b10 = (float) (cVar.b() - cVar3.b());
                float abs = (float) Math.abs(cVar3.b() - cVar2.b());
                if (b10 > 100.0f || abs > 40.0f) {
                    break;
                }
                long a10 = cVar3.a();
                arrayList.add(Float.valueOf(b1.f.m(a10)));
                arrayList2.add(Float.valueOf(b1.f.n(a10)));
                arrayList3.add(Float.valueOf(-b10));
                if (i10 == 0) {
                    i10 = 20;
                }
                i10--;
                i11++;
                if (i11 >= 20) {
                    cVar2 = cVar3;
                    break;
                }
                cVar2 = cVar3;
            } else {
                break;
            }
        }
        if (i11 >= 3) {
            try {
                d d10 = h.d(arrayList3, arrayList, 2);
                d d11 = h.d(arrayList3, arrayList2, 2);
                float f10 = 1000;
                return new f(b1.g.a(d10.a().get(1).floatValue() * f10, d11.a().get(1).floatValue() * f10), d10.b() * d11.b(), cVar.b() - cVar2.b(), b1.f.q(cVar.a(), cVar2.a()), null);
            } catch (IllegalArgumentException unused) {
                return f.f43808e.a();
            }
        }
        return new f(b1.f.f16721b.c(), 1.0f, cVar.b() - cVar2.b(), b1.f.q(cVar.a(), cVar2.a()), null);
    }
}
