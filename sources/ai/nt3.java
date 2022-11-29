package ai;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class nt3 {

    /* renamed from: c  reason: collision with root package name */
    public boolean f7523c;

    /* renamed from: e  reason: collision with root package name */
    public int f7525e;

    /* renamed from: a  reason: collision with root package name */
    public mt3 f7521a = new mt3();

    /* renamed from: b  reason: collision with root package name */
    public mt3 f7522b = new mt3();

    /* renamed from: d  reason: collision with root package name */
    public long f7524d = C.TIME_UNSET;

    public final void a() {
        this.f7521a.a();
        this.f7522b.a();
        this.f7523c = false;
        this.f7524d = C.TIME_UNSET;
        this.f7525e = 0;
    }

    public final void b(long j10) {
        this.f7521a.f(j10);
        if (this.f7521a.b()) {
            this.f7523c = false;
        } else if (this.f7524d != C.TIME_UNSET) {
            if (!this.f7523c || this.f7522b.c()) {
                this.f7522b.a();
                this.f7522b.f(this.f7524d);
            }
            this.f7523c = true;
            this.f7522b.f(j10);
        }
        if (this.f7523c && this.f7522b.b()) {
            mt3 mt3Var = this.f7521a;
            this.f7521a = this.f7522b;
            this.f7522b = mt3Var;
            this.f7523c = false;
        }
        this.f7524d = j10;
        this.f7525e = this.f7521a.b() ? 0 : this.f7525e + 1;
    }

    public final boolean c() {
        return this.f7521a.b();
    }

    public final int d() {
        return this.f7525e;
    }

    public final long e() {
        return this.f7521a.b() ? this.f7521a.d() : C.TIME_UNSET;
    }

    public final long f() {
        return this.f7521a.b() ? this.f7521a.e() : C.TIME_UNSET;
    }

    public final float g() {
        if (this.f7521a.b()) {
            return (float) (1.0E9d / this.f7521a.e());
        }
        return -1.0f;
    }
}
