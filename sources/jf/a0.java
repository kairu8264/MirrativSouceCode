package jf;

import com.dena.mirrorman.net.fme.ChangeColorFlag;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class a0 implements Serializable {
    public static final a E = new a(null);
    public static final int F = 8;
    public final List<b> A;
    public final List<q0> B;
    public List<r0> C;
    public final int D;

    /* renamed from: w  reason: collision with root package name */
    public final int f37824w;

    /* renamed from: x  reason: collision with root package name */
    public final int f37825x;

    /* renamed from: y  reason: collision with root package name */
    public final int f37826y;

    /* renamed from: z  reason: collision with root package name */
    public final ChangeColorFlag f37827z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public a0(int i10, int i11, int i12, ChangeColorFlag changeColorFlag, List<b> list, List<q0> list2, List<r0> list3, int i13) {
        jo.p.h(changeColorFlag, "changeColorFlag");
        jo.p.h(list, "characterInfoList");
        jo.p.h(list2, "rubyInfoList");
        jo.p.h(list3, "speedInfoList");
        this.f37824w = i10;
        this.f37825x = i11;
        this.f37826y = i12;
        this.f37827z = changeColorFlag;
        this.A = list;
        this.B = list2;
        this.C = list3;
        this.D = i13;
    }

    public final ChangeColorFlag a() {
        return this.f37827z;
    }

    public final List<b> b() {
        return this.A;
    }

    public final List<m> c(int i10) {
        int e10;
        int g10 = g(i10);
        ArrayList arrayList = new ArrayList();
        if (i10 >= this.f37825x) {
            g10 += 1000;
        }
        if (this.f37824w <= i10) {
            for (b bVar : this.A) {
                if (bVar.f()) {
                    g10 += bVar.e();
                }
            }
        }
        int i11 = -1;
        float f10 = 0.0f;
        for (b bVar2 : this.A) {
            if (i11 == -1) {
                i11 = bVar2.c();
            } else if (bVar2.c() != 0 && bVar2.c() != i11) {
                f10 += 12;
                i11 = bVar2.c();
            }
            float f11 = g10;
            if (bVar2.e() + f10 < f11 && !bVar2.f()) {
                arrayList.add(new m(bVar2.b(), bVar2.e(), bVar2.e(), 0.0f, f10, false, 32, null));
                e10 = bVar2.e();
            } else if (f10 <= f11 && bVar2.e() + f10 >= f11 && !bVar2.f()) {
                arrayList.add(new m(bVar2.b(), bVar2.e(), f11 - f10, 0.0f, f10, false, 32, null));
                e10 = bVar2.e();
            } else {
                arrayList.add(new m(bVar2.b(), bVar2.e(), 0.0f, 0.0f, f10, false, 32, null));
                e10 = bVar2.e();
            }
            f10 += e10;
        }
        for (q0 q0Var : this.B) {
            String a10 = q0Var.a();
            float f12 = 0.0f;
            for (int i12 = 0; i12 < a10.length(); i12++) {
                char charAt = a10.charAt(i12);
                float d10 = q0Var.d() + f12 + (q0Var.c() * 12);
                float f13 = 24;
                float f14 = d10 + f13;
                float f15 = g10;
                if (f14 <= f15) {
                    arrayList.add(new m(String.valueOf(charAt), 24, 24.0f, 0.0f, d10, true));
                } else if (d10 <= f15 && f14 >= f15) {
                    arrayList.add(new m(String.valueOf(charAt), 24, f15 - f12, 0.0f, d10, true));
                } else {
                    arrayList.add(new m(String.valueOf(charAt), 24, 0.0f, 0.0f, d10, true));
                }
                f12 += f13;
            }
        }
        return arrayList;
    }

    public final int d() {
        return this.f37825x;
    }

    public final int e() {
        return this.D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return this.f37824w == a0Var.f37824w && this.f37825x == a0Var.f37825x && this.f37826y == a0Var.f37826y && this.f37827z == a0Var.f37827z && jo.p.c(this.A, a0Var.A) && jo.p.c(this.B, a0Var.B) && jo.p.c(this.C, a0Var.C) && this.D == a0Var.D;
        }
        return false;
    }

    public final int f() {
        return this.f37826y;
    }

    public final int g(int i10) {
        int a10;
        int b10;
        int i11 = 0;
        for (r0 r0Var : this.C) {
            if (i10 > r0Var.a()) {
                a10 = r0Var.a() - r0Var.c();
                b10 = r0Var.b();
            } else if (r0Var.c() < i10) {
                a10 = i10 - r0Var.c();
                b10 = r0Var.b();
            }
            i11 += (a10 * b10) / 1000;
        }
        return i11;
    }

    public final List<q0> h() {
        return this.B;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f37824w) * 31) + Integer.hashCode(this.f37825x)) * 31) + Integer.hashCode(this.f37826y)) * 31) + this.f37827z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + Integer.hashCode(this.D);
    }

    public final int i() {
        return this.f37824w;
    }

    public final List<r0> j() {
        return this.C;
    }

    public final int k() {
        int i10 = 0;
        for (b bVar : this.A) {
            i10 += bVar.e();
        }
        return i10;
    }

    public final boolean l(int i10) {
        po.i iVar = new po.i(this.f37824w, this.f37825x);
        return i10 <= iVar.m() && iVar.k() <= i10;
    }

    public final void m(List<r0> list) {
        jo.p.h(list, "<set-?>");
        this.C = list;
    }

    public String toString() {
        return "LyricsData(showTime=" + this.f37824w + ", hideTime=" + this.f37825x + ", positionY=" + this.f37826y + ", changeColorFlag=" + this.f37827z + ", characterInfoList=" + this.A + ", rubyInfoList=" + this.B + ", speedInfoList=" + this.C + ", mergeNum=" + this.D + ')';
    }

    public /* synthetic */ a0(int i10, int i11, int i12, ChangeColorFlag changeColorFlag, List list, List list2, List list3, int i13, int i14, jo.h hVar) {
        this(i10, i11, i12, changeColorFlag, list, list2, list3, (i14 & 128) != 0 ? 0 : i13);
    }
}
