package ai;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class v4 {
    public static final v4 G = new v4(new t4());
    public static final x2<v4> H = s4.f9709a;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public int F;

    /* renamed from: a  reason: collision with root package name */
    public final String f10949a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10950b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10951c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10952d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10953e;

    /* renamed from: f  reason: collision with root package name */
    public final int f10954f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10955g;

    /* renamed from: h  reason: collision with root package name */
    public final int f10956h;

    /* renamed from: i  reason: collision with root package name */
    public final String f10957i;

    /* renamed from: j  reason: collision with root package name */
    public final v7 f10958j;

    /* renamed from: k  reason: collision with root package name */
    public final String f10959k;

    /* renamed from: l  reason: collision with root package name */
    public final String f10960l;

    /* renamed from: m  reason: collision with root package name */
    public final int f10961m;

    /* renamed from: n  reason: collision with root package name */
    public final List<byte[]> f10962n;

    /* renamed from: o  reason: collision with root package name */
    public final ru3 f10963o;

    /* renamed from: p  reason: collision with root package name */
    public final long f10964p;

    /* renamed from: q  reason: collision with root package name */
    public final int f10965q;

    /* renamed from: r  reason: collision with root package name */
    public final int f10966r;

    /* renamed from: s  reason: collision with root package name */
    public final float f10967s;

    /* renamed from: t  reason: collision with root package name */
    public final int f10968t;

    /* renamed from: u  reason: collision with root package name */
    public final float f10969u;

    /* renamed from: v  reason: collision with root package name */
    public final byte[] f10970v;

    /* renamed from: w  reason: collision with root package name */
    public final int f10971w;

    /* renamed from: x  reason: collision with root package name */
    public final vq3 f10972x;

    /* renamed from: y  reason: collision with root package name */
    public final int f10973y;

    /* renamed from: z  reason: collision with root package name */
    public final int f10974z;

    public v4(t4 t4Var) {
        this.f10949a = t4.A(t4Var);
        this.f10950b = t4.J(t4Var);
        this.f10951c = sb.V(t4.K(t4Var));
        this.f10952d = t4.L(t4Var);
        this.f10953e = 0;
        int M = t4.M(t4Var);
        this.f10954f = M;
        int N = t4.N(t4Var);
        this.f10955g = N;
        this.f10956h = N != -1 ? N : M;
        this.f10957i = t4.O(t4Var);
        this.f10958j = t4.P(t4Var);
        this.f10959k = t4.Q(t4Var);
        this.f10960l = t4.R(t4Var);
        this.f10961m = t4.S(t4Var);
        this.f10962n = t4.T(t4Var) == null ? Collections.emptyList() : t4.T(t4Var);
        ru3 U = t4.U(t4Var);
        this.f10963o = U;
        this.f10964p = t4.V(t4Var);
        this.f10965q = t4.W(t4Var);
        this.f10966r = t4.X(t4Var);
        this.f10967s = t4.Y(t4Var);
        this.f10968t = t4.Z(t4Var) == -1 ? 0 : t4.Z(t4Var);
        this.f10969u = t4.a0(t4Var) == -1.0f ? 1.0f : t4.a0(t4Var);
        this.f10970v = t4.b0(t4Var);
        this.f10971w = t4.c0(t4Var);
        this.f10972x = t4.d0(t4Var);
        this.f10973y = t4.e0(t4Var);
        this.f10974z = t4.f0(t4Var);
        this.A = t4.g0(t4Var);
        this.B = t4.h0(t4Var) == -1 ? 0 : t4.h0(t4Var);
        this.C = t4.a(t4Var) != -1 ? t4.a(t4Var) : 0;
        this.D = t4.b(t4Var);
        this.E = (t4.c(t4Var) != 0 || U == null) ? t4.c(t4Var) : 1;
    }

    public final t4 a() {
        return new t4(this, null);
    }

    public final v4 b(int i10) {
        t4 t4Var = new t4(this, null);
        t4Var.H(i10);
        return new v4(t4Var);
    }

    public final int c() {
        int i10;
        int i11 = this.f10965q;
        if (i11 == -1 || (i10 = this.f10966r) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final boolean d(v4 v4Var) {
        if (this.f10962n.size() == v4Var.f10962n.size()) {
            for (int i10 = 0; i10 < this.f10962n.size(); i10++) {
                if (!Arrays.equals(this.f10962n.get(i10), v4Var.f10962n.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && v4.class == obj.getClass()) {
            v4 v4Var = (v4) obj;
            int i11 = this.F;
            if ((i11 == 0 || (i10 = v4Var.F) == 0 || i11 == i10) && this.f10952d == v4Var.f10952d && this.f10954f == v4Var.f10954f && this.f10955g == v4Var.f10955g && this.f10961m == v4Var.f10961m && this.f10964p == v4Var.f10964p && this.f10965q == v4Var.f10965q && this.f10966r == v4Var.f10966r && this.f10968t == v4Var.f10968t && this.f10971w == v4Var.f10971w && this.f10973y == v4Var.f10973y && this.f10974z == v4Var.f10974z && this.A == v4Var.A && this.B == v4Var.B && this.C == v4Var.C && this.D == v4Var.D && this.E == v4Var.E && Float.compare(this.f10967s, v4Var.f10967s) == 0 && Float.compare(this.f10969u, v4Var.f10969u) == 0 && sb.H(this.f10949a, v4Var.f10949a) && sb.H(this.f10950b, v4Var.f10950b) && sb.H(this.f10957i, v4Var.f10957i) && sb.H(this.f10959k, v4Var.f10959k) && sb.H(this.f10960l, v4Var.f10960l) && sb.H(this.f10951c, v4Var.f10951c) && Arrays.equals(this.f10970v, v4Var.f10970v) && sb.H(this.f10958j, v4Var.f10958j) && sb.H(this.f10972x, v4Var.f10972x) && sb.H(this.f10963o, v4Var.f10963o) && d(v4Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.F;
        if (i10 == 0) {
            String str = this.f10949a;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f10950b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f10951c;
            int hashCode3 = (((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f10952d) * 961) + this.f10954f) * 31) + this.f10955g) * 31;
            String str4 = this.f10957i;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            v7 v7Var = this.f10958j;
            int hashCode5 = (hashCode4 + (v7Var == null ? 0 : v7Var.hashCode())) * 31;
            String str5 = this.f10959k;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f10960l;
            int hashCode7 = ((((((((((((((((((((((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f10961m) * 31) + ((int) this.f10964p)) * 31) + this.f10965q) * 31) + this.f10966r) * 31) + Float.floatToIntBits(this.f10967s)) * 31) + this.f10968t) * 31) + Float.floatToIntBits(this.f10969u)) * 31) + this.f10971w) * 31) + this.f10973y) * 31) + this.f10974z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E;
            this.F = hashCode7;
            return hashCode7;
        }
        return i10;
    }

    public final String toString() {
        String str = this.f10949a;
        String str2 = this.f10950b;
        String str3 = this.f10959k;
        String str4 = this.f10960l;
        String str5 = this.f10957i;
        int i10 = this.f10956h;
        String str6 = this.f10951c;
        int i11 = this.f10965q;
        int i12 = this.f10966r;
        float f10 = this.f10967s;
        int i13 = this.f10973y;
        int i14 = this.f10974z;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder sb2 = new StringBuilder(length + 104 + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb2.append("Format(");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str4);
        sb2.append(", ");
        sb2.append(str5);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(str6);
        sb2.append(", [");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(f10);
        sb2.append("], [");
        sb2.append(i13);
        sb2.append(", ");
        sb2.append(i14);
        sb2.append("])");
        return sb2.toString();
    }
}
