package ai;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class mt3 {

    /* renamed from: a  reason: collision with root package name */
    public long f7049a;

    /* renamed from: b  reason: collision with root package name */
    public long f7050b;

    /* renamed from: c  reason: collision with root package name */
    public long f7051c;

    /* renamed from: d  reason: collision with root package name */
    public long f7052d;

    /* renamed from: e  reason: collision with root package name */
    public long f7053e;

    /* renamed from: f  reason: collision with root package name */
    public long f7054f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean[] f7055g = new boolean[15];

    /* renamed from: h  reason: collision with root package name */
    public int f7056h;

    public final void a() {
        this.f7052d = 0L;
        this.f7053e = 0L;
        this.f7054f = 0L;
        this.f7056h = 0;
        Arrays.fill(this.f7055g, false);
    }

    public final boolean b() {
        return this.f7052d > 15 && this.f7056h == 0;
    }

    public final boolean c() {
        long j10 = this.f7052d;
        if (j10 == 0) {
            return false;
        }
        return this.f7055g[(int) ((j10 - 1) % 15)];
    }

    public final long d() {
        return this.f7054f;
    }

    public final long e() {
        long j10 = this.f7053e;
        if (j10 == 0) {
            return 0L;
        }
        return this.f7054f / j10;
    }

    public final void f(long j10) {
        long j11 = this.f7052d;
        if (j11 == 0) {
            this.f7049a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f7049a;
            this.f7050b = j12;
            this.f7054f = j12;
            this.f7053e = 1L;
        } else {
            long j13 = j10 - this.f7051c;
            int i10 = (int) (j11 % 15);
            if (Math.abs(j13 - this.f7050b) <= 1000000) {
                this.f7053e++;
                this.f7054f += j13;
                boolean[] zArr = this.f7055g;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f7056h--;
                }
            } else {
                boolean[] zArr2 = this.f7055g;
                if (!zArr2[i10]) {
                    zArr2[i10] = true;
                    this.f7056h++;
                }
            }
        }
        this.f7052d++;
        this.f7051c = j10;
    }
}
