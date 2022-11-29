package kf;

import android.content.SharedPreferences;
import kf.o;

/* loaded from: classes2.dex */
public interface t extends o {

    /* loaded from: classes2.dex */
    public static final class a {
        public static SharedPreferences a(t tVar) {
            return o.a.b(tVar);
        }

        public static void b(t tVar, String str, float f10) {
            jo.p.h(str, "key");
            o.a.c(tVar, str, f10);
        }

        public static void c(t tVar, String str, int i10) {
            jo.p.h(str, "key");
            o.a.d(tVar, str, i10);
        }

        public static void d(t tVar, String str, long j10) {
            jo.p.h(str, "key");
            o.a.e(tVar, str, j10);
        }

        public static void e(t tVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            o.a.f(tVar, str, str2);
        }

        public static void f(t tVar, String str, boolean z10) {
            jo.p.h(str, "key");
            o.a.h(tVar, str, z10);
        }

        public static float g(t tVar, String str, float f10) {
            jo.p.h(str, "key");
            return o.a.i(tVar, str, f10);
        }

        public static int h(t tVar, String str, int i10) {
            jo.p.h(str, "key");
            return o.a.j(tVar, str, i10);
        }

        public static long i(t tVar, String str, long j10) {
            jo.p.h(str, "key");
            return o.a.k(tVar, str, j10);
        }

        public static String j(t tVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            return o.a.l(tVar, str, str2);
        }

        public static boolean k(t tVar, String str, boolean z10) {
            jo.p.h(str, "key");
            return o.a.n(tVar, str, z10);
        }

        public static void l(t tVar, String str) {
            jo.p.h(str, "key");
            o.a.o(tVar, str);
        }
    }

    void A0(int i10);

    boolean C();

    float D0();

    void E3(long j10);

    void F2(boolean z10);

    boolean H1();

    void I1(boolean z10);

    void I4(int i10);

    boolean J0();

    void K3(boolean z10);

    void M(int i10);

    void M3(boolean z10);

    boolean R0();

    void S0(int i10);

    int S4();

    void U0(String str);

    void U2(boolean z10);

    void W2(boolean z10);

    boolean Y1();

    boolean Y3();

    int Z1();

    int b0();

    boolean b2();

    void c3(float f10);

    boolean c5();

    void d(boolean z10);

    void d4(boolean z10);

    void e2(boolean z10);

    boolean f();

    boolean f1();

    boolean f4();

    boolean g0();

    void h1();

    void h2(int i10);

    int h5();

    boolean i();

    void i0(boolean z10);

    boolean i5();

    void k2(boolean z10);

    boolean l3();

    boolean m3();

    boolean n2();

    void o1(boolean z10);

    void o3(boolean z10);

    void p3(boolean z10);

    void q(boolean z10);

    void q1(boolean z10);

    void q4(boolean z10);

    boolean r4();

    void s1(boolean z10);

    int t1();

    void u3();

    long v4();

    boolean w1();

    int x();

    String y3();

    void y5(boolean z10);

    void z0(boolean z10);
}
