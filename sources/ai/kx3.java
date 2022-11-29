package ai;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class kx3 implements mv3 {

    /* renamed from: b  reason: collision with root package name */
    public pv3 f6397b;

    /* renamed from: c  reason: collision with root package name */
    public int f6398c;

    /* renamed from: d  reason: collision with root package name */
    public int f6399d;

    /* renamed from: e  reason: collision with root package name */
    public int f6400e;

    /* renamed from: g  reason: collision with root package name */
    public o9 f6402g;

    /* renamed from: h  reason: collision with root package name */
    public nv3 f6403h;

    /* renamed from: i  reason: collision with root package name */
    public nx3 f6404i;

    /* renamed from: j  reason: collision with root package name */
    public jz3 f6405j;

    /* renamed from: a  reason: collision with root package name */
    public final hb f6396a = new hb(6);

    /* renamed from: f  reason: collision with root package name */
    public long f6401f = -1;

    public final int a(nv3 nv3Var) throws IOException {
        this.f6396a.i(2);
        ((hv3) nv3Var).c(this.f6396a.q(), 0, 2, false);
        return this.f6396a.w();
    }

    public final void b() {
        c(new u7[0]);
        pv3 pv3Var = this.f6397b;
        Objects.requireNonNull(pv3Var);
        pv3Var.x();
        this.f6397b.s(new kw3(C.TIME_UNSET, 0L));
        this.f6398c = 6;
    }

    public final void c(u7... u7VarArr) {
        pv3 pv3Var = this.f6397b;
        Objects.requireNonNull(pv3Var);
        pw3 p10 = pv3Var.p(1024, 4);
        t4 t4Var = new t4();
        t4Var.m(MimeTypes.IMAGE_JPEG);
        t4Var.l(new v7(u7VarArr));
        p10.b(t4Var.I());
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x015c  */
    @Override // ai.mv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(ai.nv3 r24, ai.iw3 r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kx3.e(ai.nv3, ai.iw3):int");
    }

    @Override // ai.mv3
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.f6398c = 0;
            this.f6405j = null;
        } else if (this.f6398c == 5) {
            jz3 jz3Var = this.f6405j;
            Objects.requireNonNull(jz3Var);
            jz3Var.g(j10, j11);
        }
    }

    @Override // ai.mv3
    public final void h(pv3 pv3Var) {
        this.f6397b = pv3Var;
    }

    @Override // ai.mv3
    public final boolean i(nv3 nv3Var) throws IOException {
        if (a(nv3Var) != 65496) {
            return false;
        }
        int a10 = a(nv3Var);
        this.f6399d = a10;
        if (a10 == 65504) {
            this.f6396a.i(2);
            hv3 hv3Var = (hv3) nv3Var;
            hv3Var.c(this.f6396a.q(), 0, 2, false);
            hv3Var.r(this.f6396a.w() - 2, false);
            a10 = a(nv3Var);
            this.f6399d = a10;
        }
        if (a10 == 65505) {
            hv3 hv3Var2 = (hv3) nv3Var;
            hv3Var2.r(2, false);
            this.f6396a.i(6);
            hv3Var2.c(this.f6396a.q(), 0, 6, false);
            if (this.f6396a.B() == 1165519206 && this.f6396a.w() == 0) {
                return true;
            }
        }
        return false;
    }
}
