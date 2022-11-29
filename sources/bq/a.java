package bq;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class a implements Serializable {
    public double A;
    public long B;
    public double C;
    public double D;
    public final boolean E;

    /* renamed from: w  reason: collision with root package name */
    public double f18586w;

    /* renamed from: x  reason: collision with root package name */
    public double f18587x;

    /* renamed from: y  reason: collision with root package name */
    public double f18588y;

    /* renamed from: z  reason: collision with root package name */
    public double f18589z;

    public a() {
        this(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(double r22, double r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r3 = r24
            long r5 = r0.B
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 != 0) goto L13
            r0.C = r1
            r0.D = r3
            goto L51
        L13:
            boolean r7 = r0.E
            if (r7 == 0) goto L51
            double r7 = (double) r5
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r7 + r9
            double r11 = (double) r5
            double r13 = (double) r5
            double r13 = r13 + r9
            double r11 = r11 / r13
            double r9 = r0.C
            double r13 = r1 - r9
            r15 = r5
            double r5 = r0.D
            double r17 = r3 - r5
            double r3 = r0.f18587x
            double r19 = r13 * r13
            double r19 = r19 * r11
            double r3 = r3 + r19
            r0.f18587x = r3
            double r3 = r0.f18589z
            double r19 = r17 * r17
            double r19 = r19 * r11
            double r3 = r3 + r19
            r0.f18589z = r3
            double r3 = r0.A
            double r19 = r13 * r17
            double r19 = r19 * r11
            double r3 = r3 + r19
            r0.A = r3
            double r13 = r13 / r7
            double r9 = r9 + r13
            r0.C = r9
            double r17 = r17 / r7
            double r5 = r5 + r17
            r0.D = r5
            goto L52
        L51:
            r15 = r5
        L52:
            boolean r3 = r0.E
            if (r3 != 0) goto L6b
            double r3 = r0.f18587x
            double r5 = r1 * r1
            double r3 = r3 + r5
            r0.f18587x = r3
            double r3 = r0.f18589z
            double r5 = r24 * r24
            double r3 = r3 + r5
            r0.f18589z = r3
            double r3 = r0.A
            double r5 = r1 * r24
            double r3 = r3 + r5
            r0.A = r3
        L6b:
            double r3 = r0.f18586w
            double r3 = r3 + r1
            r0.f18586w = r3
            double r1 = r0.f18588y
            double r1 = r1 + r24
            r0.f18588y = r1
            r1 = 1
            long r5 = r15 + r1
            r0.B = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.a.a(double, double):void");
    }

    public double b() {
        if (this.E) {
            return c(d());
        }
        return 0.0d;
    }

    public final double c(double d10) {
        if (this.E) {
            return (this.f18588y - (d10 * this.f18586w)) / this.B;
        }
        return 0.0d;
    }

    public double d() {
        if (this.B >= 2 && cq.a.a(this.f18587x) >= 4.9E-323d) {
            return this.A / this.f18587x;
        }
        return Double.NaN;
    }

    public a(boolean z10) {
        this.f18586w = 0.0d;
        this.f18587x = 0.0d;
        this.f18588y = 0.0d;
        this.f18589z = 0.0d;
        this.A = 0.0d;
        this.B = 0L;
        this.C = 0.0d;
        this.D = 0.0d;
        this.E = z10;
    }
}
