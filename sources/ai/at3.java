package ai;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class at3 {

    /* renamed from: d  reason: collision with root package name */
    public static final us3 f2069d = new us3(0, C.TIME_UNSET, null);

    /* renamed from: e  reason: collision with root package name */
    public static final us3 f2070e = new us3(1, C.TIME_UNSET, null);

    /* renamed from: f  reason: collision with root package name */
    public static final us3 f2071f = new us3(2, C.TIME_UNSET, null);

    /* renamed from: g  reason: collision with root package name */
    public static final us3 f2072g = new us3(3, C.TIME_UNSET, null);

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f2073a = sb.Q("ExoPlayer:Loader:ProgressiveMediaPeriod");

    /* renamed from: b  reason: collision with root package name */
    public vs3<? extends ws3> f2074b;

    /* renamed from: c  reason: collision with root package name */
    public IOException f2075c;

    public at3(String str) {
    }

    public static us3 e(boolean z10, long j10) {
        return new us3(z10 ? 1 : 0, j10, null);
    }

    public final boolean f() {
        return this.f2075c != null;
    }

    public final void g() {
        this.f2075c = null;
    }

    public final <T extends ws3> long h(T t10, ss3<T> ss3Var, int i10) {
        Looper myLooper = Looper.myLooper();
        u9.e(myLooper);
        this.f2075c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new vs3(this, myLooper, t10, ss3Var, i10, elapsedRealtime).b(0L);
        return elapsedRealtime;
    }

    public final boolean i() {
        return this.f2074b != null;
    }

    public final void j() {
        vs3<? extends ws3> vs3Var = this.f2074b;
        u9.e(vs3Var);
        vs3Var.c(false);
    }

    public final void k(ys3 ys3Var) {
        vs3<? extends ws3> vs3Var = this.f2074b;
        if (vs3Var != null) {
            vs3Var.c(true);
        }
        this.f2073a.execute(new zs3(ys3Var));
        this.f2073a.shutdown();
    }

    public final void l(int i10) throws IOException {
        IOException iOException = this.f2075c;
        if (iOException != null) {
            throw iOException;
        }
        vs3<? extends ws3> vs3Var = this.f2074b;
        if (vs3Var != null) {
            vs3Var.a(i10);
        }
    }
}
