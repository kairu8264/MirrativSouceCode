package ai;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class b14 {

    /* renamed from: a  reason: collision with root package name */
    public final pw3 f2191a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2192b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2193c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2194d;

    /* renamed from: e  reason: collision with root package name */
    public int f2195e;

    /* renamed from: f  reason: collision with root package name */
    public int f2196f;

    /* renamed from: g  reason: collision with root package name */
    public long f2197g;

    /* renamed from: h  reason: collision with root package name */
    public long f2198h;

    public b14(pw3 pw3Var) {
        this.f2191a = pw3Var;
    }

    public final void a() {
        this.f2192b = false;
        this.f2193c = false;
        this.f2194d = false;
        this.f2195e = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r5, long r6) {
        /*
            r4 = this;
            r4.f2195e = r5
            r0 = 0
            r4.f2194d = r0
            r1 = 179(0xb3, float:2.51E-43)
            r2 = 182(0xb6, float:2.55E-43)
            r3 = 1
            if (r5 == r2) goto L12
            if (r5 != r1) goto L10
            r5 = r1
            goto L12
        L10:
            r1 = r0
            goto L13
        L12:
            r1 = r3
        L13:
            r4.f2192b = r1
            if (r5 != r2) goto L18
            goto L19
        L18:
            r3 = r0
        L19:
            r4.f2193c = r3
            r4.f2196f = r0
            r4.f2198h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.b14.b(int, long):void");
    }

    public final void c(byte[] bArr, int i10, int i11) {
        if (this.f2193c) {
            int i12 = this.f2196f;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.f2196f = i12 + (i11 - i10);
                return;
            }
            this.f2194d = ((bArr[i13] & 192) >> 6) == 0;
            this.f2193c = false;
        }
    }

    public final void d(long j10, int i10, boolean z10) {
        if (this.f2195e == 182 && z10 && this.f2192b) {
            long j11 = this.f2198h;
            if (j11 != C.TIME_UNSET) {
                long j12 = this.f2197g;
                this.f2191a.e(j11, this.f2194d ? 1 : 0, (int) (j10 - j12), i10, null);
            }
        }
        if (this.f2195e != 179) {
            this.f2197g = j10;
        }
    }
}
