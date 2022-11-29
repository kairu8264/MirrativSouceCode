package ai;

import com.google.android.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class wh implements ve {

    /* renamed from: e  reason: collision with root package name */
    public uh f11616e;

    /* renamed from: f  reason: collision with root package name */
    public uh f11617f;

    /* renamed from: g  reason: collision with root package name */
    public oc f11618g;

    /* renamed from: h  reason: collision with root package name */
    public oc f11619h;

    /* renamed from: i  reason: collision with root package name */
    public long f11620i;

    /* renamed from: k  reason: collision with root package name */
    public vh f11622k;

    /* renamed from: l  reason: collision with root package name */
    public final wi f11623l;

    /* renamed from: a  reason: collision with root package name */
    public final th f11612a = new th();

    /* renamed from: b  reason: collision with root package name */
    public final sh f11613b = new sh();

    /* renamed from: c  reason: collision with root package name */
    public final nj f11614c = new nj(32);

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f11615d = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public int f11621j = C.DEFAULT_BUFFER_SEGMENT_SIZE;

    public wh(wi wiVar, byte[] bArr) {
        this.f11623l = wiVar;
        uh uhVar = new uh(0L, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.f11616e = uhVar;
        this.f11617f = uhVar;
    }

    @Override // ai.ve
    public final void a(oc ocVar) {
        oc ocVar2 = ocVar == null ? null : ocVar;
        boolean j10 = this.f11612a.j(ocVar2);
        this.f11619h = ocVar;
        vh vhVar = this.f11622k;
        if (vhVar == null || !j10) {
            return;
        }
        vhVar.f(ocVar2);
    }

    @Override // ai.ve
    public final void b(long j10, int i10, int i11, int i12, ue ueVar) {
        if (q()) {
            try {
                this.f11612a.k(j10, i10, this.f11620i - i11, i11, ueVar);
                return;
            } finally {
                r();
            }
        }
        this.f11612a.l(j10);
    }

    @Override // ai.ve
    public final void c(nj njVar, int i10) {
        if (q()) {
            while (i10 > 0) {
                int t10 = t(i10);
                njVar.k(this.f11617f.f10703d.f9448a, this.f11621j, t10);
                this.f11621j += t10;
                this.f11620i += t10;
                i10 -= t10;
            }
            r();
            return;
        }
        njVar.j(i10);
    }

    @Override // ai.ve
    public final int d(le leVar, int i10, boolean z10) throws IOException, InterruptedException {
        if (!q()) {
            int c10 = leVar.c(i10);
            if (c10 != -1) {
                return c10;
            }
            throw new EOFException();
        }
        try {
            int a10 = leVar.a(this.f11617f.f10703d.f9448a, this.f11621j, t(i10));
            if (a10 != -1) {
                this.f11621j += a10;
                this.f11620i += a10;
                return a10;
            }
            throw new EOFException();
        } finally {
            r();
        }
    }

    public final void e(boolean z10) {
        int andSet = this.f11615d.getAndSet(true != z10 ? 2 : 0);
        s();
        this.f11612a.b();
        if (andSet == 2) {
            this.f11618g = null;
        }
    }

    public final int f() {
        return this.f11612a.c();
    }

    public final void g() {
        if (this.f11615d.getAndSet(2) == 0) {
            s();
        }
    }

    public final boolean h() {
        return this.f11612a.d();
    }

    public final oc i() {
        return this.f11612a.e();
    }

    public final long j() {
        return this.f11612a.f();
    }

    public final void k() {
        long h10 = this.f11612a.h();
        if (h10 != -1) {
            p(h10);
        }
    }

    public final boolean l(long j10, boolean z10) {
        long i10 = this.f11612a.i(j10, z10);
        if (i10 == -1) {
            return false;
        }
        p(i10);
        return true;
    }

    public final int m(pc pcVar, ee eeVar, boolean z10, boolean z11, long j10) {
        int g10 = this.f11612a.g(pcVar, eeVar, z10, z11, this.f11618g, this.f11613b);
        if (g10 == -5) {
            this.f11618g = pcVar.f8372a;
            return -5;
        } else if (g10 != -4) {
            return -3;
        } else {
            if (!eeVar.c()) {
                if (eeVar.f3617d < j10) {
                    eeVar.f(Integer.MIN_VALUE);
                }
                if (eeVar.i()) {
                    sh shVar = this.f11613b;
                    long j11 = shVar.f9832b;
                    int i10 = 1;
                    this.f11614c.a(1);
                    o(j11, this.f11614c.f7359a, 1);
                    long j12 = j11 + 1;
                    byte b10 = this.f11614c.f7359a[0];
                    int i11 = b10 & 128;
                    int i12 = b10 & Byte.MAX_VALUE;
                    ce ceVar = eeVar.f3615b;
                    if (ceVar.f2792a == null) {
                        ceVar.f2792a = new byte[16];
                    }
                    o(j12, ceVar.f2792a, i12);
                    long j13 = j12 + i12;
                    if (i11 != 0) {
                        this.f11614c.a(2);
                        o(j13, this.f11614c.f7359a, 2);
                        j13 += 2;
                        i10 = this.f11614c.m();
                    }
                    int i13 = i10;
                    ce ceVar2 = eeVar.f3615b;
                    int[] iArr = ceVar2.f2795d;
                    if (iArr == null || iArr.length < i13) {
                        iArr = new int[i13];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = ceVar2.f2796e;
                    if (iArr3 == null || iArr3.length < i13) {
                        iArr3 = new int[i13];
                    }
                    int[] iArr4 = iArr3;
                    if (i11 != 0) {
                        int i14 = i13 * 6;
                        this.f11614c.a(i14);
                        o(j13, this.f11614c.f7359a, i14);
                        j13 += i14;
                        this.f11614c.i(0);
                        for (int i15 = 0; i15 < i13; i15++) {
                            iArr2[i15] = this.f11614c.m();
                            iArr4[i15] = this.f11614c.u();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = shVar.f9831a - ((int) (j13 - shVar.f9832b));
                    }
                    ue ueVar = shVar.f9834d;
                    ce ceVar3 = eeVar.f3615b;
                    ceVar3.a(i13, iArr2, iArr4, ueVar.f10679b, ceVar3.f2792a, 1);
                    long j14 = shVar.f9832b;
                    int i16 = (int) (j13 - j14);
                    shVar.f9832b = j14 + i16;
                    shVar.f9831a -= i16;
                }
                eeVar.h(this.f11613b.f9831a);
                sh shVar2 = this.f11613b;
                long j15 = shVar2.f9832b;
                ByteBuffer byteBuffer = eeVar.f3616c;
                int i17 = shVar2.f9831a;
                p(j15);
                while (i17 > 0) {
                    int i18 = (int) (j15 - this.f11616e.f10700a);
                    int min = Math.min(i17, C.DEFAULT_BUFFER_SEGMENT_SIZE - i18);
                    ri riVar = this.f11616e.f10703d;
                    byteBuffer.put(riVar.f9448a, i18, min);
                    j15 += min;
                    i17 -= min;
                    if (j15 == this.f11616e.f10701b) {
                        this.f11623l.d(riVar);
                        uh uhVar = this.f11616e;
                        uhVar.f10703d = null;
                        this.f11616e = uhVar.f10704e;
                    }
                }
                p(this.f11613b.f9833c);
            }
            return -4;
        }
    }

    public final void n(vh vhVar) {
        this.f11622k = vhVar;
    }

    public final void o(long j10, byte[] bArr, int i10) {
        p(j10);
        int i11 = 0;
        while (i11 < i10) {
            int i12 = (int) (j10 - this.f11616e.f10700a);
            int min = Math.min(i10 - i11, C.DEFAULT_BUFFER_SEGMENT_SIZE - i12);
            ri riVar = this.f11616e.f10703d;
            System.arraycopy(riVar.f9448a, i12, bArr, i11, min);
            j10 += min;
            i11 += min;
            if (j10 == this.f11616e.f10701b) {
                this.f11623l.d(riVar);
                uh uhVar = this.f11616e;
                uhVar.f10703d = null;
                this.f11616e = uhVar.f10704e;
            }
        }
    }

    public final void p(long j10) {
        while (true) {
            uh uhVar = this.f11616e;
            if (j10 < uhVar.f10701b) {
                return;
            }
            this.f11623l.d(uhVar.f10703d);
            uh uhVar2 = this.f11616e;
            uhVar2.f10703d = null;
            this.f11616e = uhVar2.f10704e;
        }
    }

    public final boolean q() {
        return this.f11615d.compareAndSet(0, 1);
    }

    public final void r() {
        if (this.f11615d.compareAndSet(1, 0)) {
            return;
        }
        s();
    }

    public final void s() {
        this.f11612a.a();
        uh uhVar = this.f11616e;
        if (uhVar.f10702c) {
            uh uhVar2 = this.f11617f;
            boolean z10 = uhVar2.f10702c;
            int i10 = (z10 ? 1 : 0) + (((int) (uhVar2.f10700a - uhVar.f10700a)) / C.DEFAULT_BUFFER_SEGMENT_SIZE);
            ri[] riVarArr = new ri[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                riVarArr[i11] = uhVar.f10703d;
                uhVar.f10703d = null;
                uhVar = uhVar.f10704e;
            }
            this.f11623l.e(riVarArr);
        }
        uh uhVar3 = new uh(0L, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.f11616e = uhVar3;
        this.f11617f = uhVar3;
        this.f11620i = 0L;
        this.f11621j = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.f11623l.f();
    }

    public final int t(int i10) {
        if (this.f11621j == 65536) {
            this.f11621j = 0;
            uh uhVar = this.f11617f;
            if (uhVar.f10702c) {
                this.f11617f = uhVar.f10704e;
            }
            uh uhVar2 = this.f11617f;
            ri c10 = this.f11623l.c();
            uh uhVar3 = new uh(this.f11617f.f10701b, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            uhVar2.f10703d = c10;
            uhVar2.f10704e = uhVar3;
            uhVar2.f10702c = true;
        }
        return Math.min(i10, C.DEFAULT_BUFFER_SEGMENT_SIZE - this.f11621j);
    }
}
