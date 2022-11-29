package kf;

import android.content.SharedPreferences;
import kf.o;

/* loaded from: classes2.dex */
public interface p extends o {

    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(p pVar) {
            o.a.a(pVar);
        }

        public static SharedPreferences b(p pVar) {
            return o.a.b(pVar);
        }

        public static void c(p pVar, String str, long j10) {
            jo.p.h(str, "key");
            o.a.e(pVar, str, j10);
        }

        public static long d(p pVar, String str, long j10) {
            jo.p.h(str, "key");
            return o.a.k(pVar, str, j10);
        }
    }

    long A();

    void C0(long j10);

    long H4();

    long U();

    void U1(long j10);

    void Y2(long j10);

    void Z2(long j10);

    long b5();

    long d3();

    long f3();

    long g4();

    long i3();

    long l1();

    void p(long j10);

    void q0(long j10);

    void q2(long j10);

    void r2(long j10);

    long v1();

    void w0(long j10);
}
