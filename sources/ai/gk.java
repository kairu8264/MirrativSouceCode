package ai;

import android.annotation.TargetApi;

@TargetApi(16)
/* loaded from: classes3.dex */
public final class gk {

    /* renamed from: a  reason: collision with root package name */
    public final fk f4488a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4489b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4490c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4491d;

    /* renamed from: e  reason: collision with root package name */
    public long f4492e;

    /* renamed from: f  reason: collision with root package name */
    public long f4493f;

    /* renamed from: g  reason: collision with root package name */
    public long f4494g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4495h;

    /* renamed from: i  reason: collision with root package name */
    public long f4496i;

    /* renamed from: j  reason: collision with root package name */
    public long f4497j;

    /* renamed from: k  reason: collision with root package name */
    public long f4498k;

    public gk(double d10) {
        long j10;
        boolean z10 = d10 != -1.0d;
        this.f4489b = z10;
        if (z10) {
            this.f4488a = fk.a();
            long j11 = (long) (1.0E9d / d10);
            this.f4490c = j11;
            j10 = (j11 * 80) / 100;
        } else {
            this.f4488a = null;
            j10 = -1;
            this.f4490c = -1L;
        }
        this.f4491d = j10;
    }

    public final void a() {
        this.f4495h = false;
        if (this.f4489b) {
            this.f4488a.b();
        }
    }

    public final void b() {
        if (this.f4489b) {
            this.f4488a.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(long r12, long r14) {
        /*
            r11 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            boolean r2 = r11.f4495h
            if (r2 == 0) goto L41
            long r2 = r11.f4492e
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 == 0) goto L18
            long r2 = r11.f4498k
            r4 = 1
            long r2 = r2 + r4
            r11.f4498k = r2
            long r2 = r11.f4494g
            r11.f4493f = r2
        L18:
            long r2 = r11.f4498k
            r4 = 6
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 0
            if (r4 < 0) goto L39
            long r6 = r11.f4497j
            long r6 = r0 - r6
            long r6 = r6 / r2
            long r2 = r11.f4493f
            long r2 = r2 + r6
            boolean r4 = r11.d(r2, r14)
            if (r4 == 0) goto L32
            r11.f4495h = r5
            goto L41
        L32:
            long r4 = r11.f4496i
            long r4 = r4 + r2
            long r6 = r11.f4497j
            long r4 = r4 - r6
            goto L43
        L39:
            boolean r2 = r11.d(r0, r14)
            if (r2 == 0) goto L41
            r11.f4495h = r5
        L41:
            r4 = r14
            r2 = r0
        L43:
            boolean r6 = r11.f4495h
            r7 = 0
            if (r6 != 0) goto L52
            r11.f4497j = r0
            r11.f4496i = r14
            r11.f4498k = r7
            r14 = 1
            r11.f4495h = r14
        L52:
            r11.f4492e = r12
            r11.f4494g = r2
            ai.fk r12 = r11.f4488a
            if (r12 == 0) goto L84
            long r12 = r12.f4065w
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 != 0) goto L61
            goto L84
        L61:
            ai.fk r12 = r11.f4488a
            long r12 = r12.f4065w
            long r14 = r11.f4490c
            long r0 = r4 - r12
            long r0 = r0 / r14
            long r0 = r0 * r14
            long r12 = r12 + r0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L73
            long r14 = r12 - r14
            goto L77
        L73:
            long r14 = r14 + r12
            r9 = r12
            r12 = r14
            r14 = r9
        L77:
            long r0 = r12 - r4
            long r4 = r4 - r14
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L7f
            goto L80
        L7f:
            r12 = r14
        L80:
            long r14 = r11.f4491d
            long r12 = r12 - r14
            return r12
        L84:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.gk.c(long, long):long");
    }

    public final boolean d(long j10, long j11) {
        return Math.abs((j11 - this.f4496i) - (j10 - this.f4497j)) > 20000000;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public gk(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r0 = r3.getDefaultDisplay()
            if (r0 == 0) goto L18
            android.view.Display r3 = r3.getDefaultDisplay()
            float r3 = r3.getRefreshRate()
            double r0 = (double) r3
            goto L1a
        L18:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L1a:
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.gk.<init>(android.content.Context):void");
    }
}
