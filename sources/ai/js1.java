package ai;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class js1 {

    /* renamed from: a  reason: collision with root package name */
    public final ir1 f5909a;

    /* renamed from: b  reason: collision with root package name */
    public int f5910b;

    /* renamed from: c  reason: collision with root package name */
    public long f5911c;

    /* renamed from: d  reason: collision with root package name */
    public long f5912d;

    /* renamed from: e  reason: collision with root package name */
    public long f5913e;

    /* renamed from: f  reason: collision with root package name */
    public long f5914f;

    public js1(AudioTrack audioTrack) {
        if (sb.f9778a >= 19) {
            this.f5909a = new ir1(audioTrack);
            e();
            return;
        }
        this.f5909a = null;
        h(3);
    }

    @TargetApi(19)
    public final boolean a(long j10) {
        ir1 ir1Var = this.f5909a;
        if (ir1Var != null && j10 - this.f5913e >= this.f5912d) {
            this.f5913e = j10;
            boolean a10 = ir1Var.a();
            int i10 = this.f5910b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3 && a10) {
                            e();
                            return true;
                        }
                    } else if (!a10) {
                        e();
                        return false;
                    }
                } else if (a10) {
                    if (this.f5909a.c() > this.f5914f) {
                        h(2);
                        return true;
                    }
                } else {
                    e();
                }
            } else if (a10) {
                if (this.f5909a.b() < this.f5911c) {
                    return false;
                }
                this.f5914f = this.f5909a.c();
                h(1);
                return true;
            } else if (j10 - this.f5911c > 500000) {
                h(3);
            }
            return a10;
        }
        return false;
    }

    public final void b() {
        h(4);
    }

    public final void c() {
        if (this.f5910b == 4) {
            e();
        }
    }

    public final boolean d() {
        return this.f5910b == 2;
    }

    public final void e() {
        if (this.f5909a != null) {
            h(0);
        }
    }

    @TargetApi(19)
    public final long f() {
        ir1 ir1Var = this.f5909a;
        return ir1Var != null ? ir1Var.b() : C.TIME_UNSET;
    }

    @TargetApi(19)
    public final long g() {
        ir1 ir1Var = this.f5909a;
        if (ir1Var != null) {
            return ir1Var.c();
        }
        return -1L;
    }

    public final void h(int i10) {
        this.f5910b = i10;
        long j10 = 10000;
        if (i10 == 0) {
            this.f5913e = 0L;
            this.f5914f = -1L;
            this.f5911c = System.nanoTime() / 1000;
        } else if (i10 == 1) {
            this.f5912d = 10000L;
            return;
        } else {
            j10 = (i10 == 2 || i10 == 3) ? 10000000L : 500000L;
        }
        this.f5912d = j10;
    }
}
