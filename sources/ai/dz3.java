package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;

/* loaded from: classes3.dex */
public final class dz3 {

    /* renamed from: a  reason: collision with root package name */
    public final pw3 f3469a;

    /* renamed from: d  reason: collision with root package name */
    public rz3 f3472d;

    /* renamed from: e  reason: collision with root package name */
    public zy3 f3473e;

    /* renamed from: f  reason: collision with root package name */
    public int f3474f;

    /* renamed from: g  reason: collision with root package name */
    public int f3475g;

    /* renamed from: h  reason: collision with root package name */
    public int f3476h;

    /* renamed from: i  reason: collision with root package name */
    public int f3477i;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3480l;

    /* renamed from: b  reason: collision with root package name */
    public final qz3 f3470b = new qz3();

    /* renamed from: c  reason: collision with root package name */
    public final hb f3471c = new hb();

    /* renamed from: j  reason: collision with root package name */
    public final hb f3478j = new hb(1);

    /* renamed from: k  reason: collision with root package name */
    public final hb f3479k = new hb();

    public dz3(pw3 pw3Var, rz3 rz3Var, zy3 zy3Var) {
        this.f3469a = pw3Var;
        this.f3472d = rz3Var;
        this.f3473e = zy3Var;
        c(rz3Var, zy3Var);
    }

    public final void c(rz3 rz3Var, zy3 zy3Var) {
        this.f3472d = rz3Var;
        this.f3473e = zy3Var;
        this.f3469a.b(rz3Var.f9637a.f8186f);
        d();
    }

    public final void d() {
        qz3 qz3Var = this.f3470b;
        qz3Var.f9246d = 0;
        qz3Var.f9259q = 0L;
        qz3Var.f9260r = false;
        qz3Var.f9254l = false;
        qz3Var.f9258p = false;
        qz3Var.f9256n = null;
        this.f3474f = 0;
        this.f3476h = 0;
        this.f3475g = 0;
        this.f3477i = 0;
        this.f3480l = false;
    }

    public final long e() {
        return !this.f3480l ? this.f3472d.f9642f[this.f3474f] : this.f3470b.b(this.f3474f);
    }

    public final long f() {
        return !this.f3480l ? this.f3472d.f9639c[this.f3474f] : this.f3470b.f9248f[this.f3476h];
    }

    public final int g() {
        return !this.f3480l ? this.f3472d.f9640d[this.f3474f] : this.f3470b.f9250h[this.f3474f];
    }

    public final int h() {
        int i10;
        if (this.f3480l) {
            i10 = this.f3470b.f9253k[this.f3474f] ? 1 : 0;
        } else {
            i10 = this.f3472d.f9643g[this.f3474f];
        }
        return k() != null ? i10 | 1073741824 : i10;
    }

    public final boolean i() {
        this.f3474f++;
        if (this.f3480l) {
            int i10 = this.f3475g + 1;
            this.f3475g = i10;
            int[] iArr = this.f3470b.f9249g;
            int i11 = this.f3476h;
            if (i10 == iArr[i11]) {
                this.f3476h = i11 + 1;
                this.f3475g = 0;
                return false;
            }
            return true;
        }
        return false;
    }

    public final int j(int i10, int i11) {
        hb hbVar;
        pz3 k10 = k();
        if (k10 == null) {
            return 0;
        }
        int i12 = k10.f8757d;
        if (i12 != 0) {
            hbVar = this.f3470b.f9257o;
        } else {
            byte[] bArr = (byte[]) sb.I(k10.f8758e);
            hb hbVar2 = this.f3479k;
            int length = bArr.length;
            hbVar2.j(bArr, length);
            hbVar = this.f3479k;
            i12 = length;
        }
        boolean c10 = this.f3470b.c(this.f3474f);
        boolean z10 = c10 || i11 != 0;
        this.f3478j.q()[0] = (byte) ((true != z10 ? 0 : 128) | i12);
        this.f3478j.p(0);
        this.f3469a.d(this.f3478j, 1, 1);
        this.f3469a.d(hbVar, i12, 1);
        if (z10) {
            if (!c10) {
                this.f3471c.i(8);
                byte[] q10 = this.f3471c.q();
                q10[0] = 0;
                q10[1] = 1;
                q10[2] = 0;
                q10[3] = (byte) i11;
                q10[4] = (byte) ((i10 >> 24) & 255);
                q10[5] = (byte) ((i10 >> 16) & 255);
                q10[6] = (byte) ((i10 >> 8) & 255);
                q10[7] = (byte) (i10 & 255);
                this.f3469a.d(this.f3471c, 8, 1);
                return i12 + 9;
            }
            hb hbVar3 = this.f3470b.f9257o;
            int w10 = hbVar3.w();
            hbVar3.s(-2);
            int i13 = (w10 * 6) + 2;
            if (i11 != 0) {
                this.f3471c.i(i13);
                byte[] q11 = this.f3471c.q();
                hbVar3.u(q11, 0, i13);
                int i14 = (((q11[2] & TagConstant.TAG_CAT_RESERVED) << 8) | (q11[3] & TagConstant.TAG_CAT_RESERVED)) + i11;
                q11[2] = (byte) ((i14 >> 8) & 255);
                q11[3] = (byte) (i14 & 255);
                hbVar3 = this.f3471c;
            }
            this.f3469a.d(hbVar3, i13, 1);
            return i12 + 1 + i13;
        }
        return i12 + 1;
    }

    public final pz3 k() {
        if (this.f3480l) {
            qz3 qz3Var = this.f3470b;
            zy3 zy3Var = qz3Var.f9243a;
            int i10 = sb.f9778a;
            int i11 = zy3Var.f13281a;
            pz3 pz3Var = qz3Var.f9256n;
            if (pz3Var == null) {
                pz3Var = this.f3472d.f9637a.a(i11);
            }
            if (pz3Var == null || !pz3Var.f8754a) {
                return null;
            }
            return pz3Var;
        }
        return null;
    }
}
