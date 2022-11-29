package kf;

import android.content.SharedPreferences;
import java.util.Set;
import kf.o;

/* loaded from: classes2.dex */
public interface x extends o {

    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(x xVar) {
            o.a.a(xVar);
        }

        public static SharedPreferences b(x xVar) {
            return o.a.b(xVar);
        }

        public static boolean c(x xVar) {
            return xVar.Z() == 0;
        }

        public static void d(x xVar, String str, int i10) {
            jo.p.h(str, "key");
            o.a.d(xVar, str, i10);
        }

        public static void e(x xVar, String str, long j10) {
            jo.p.h(str, "key");
            o.a.e(xVar, str, j10);
        }

        public static void f(x xVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            o.a.f(xVar, str, str2);
        }

        public static void g(x xVar, String str, Set<String> set) {
            jo.p.h(str, "key");
            jo.p.h(set, "default");
            o.a.g(xVar, str, set);
        }

        public static void h(x xVar, String str, boolean z10) {
            jo.p.h(str, "key");
            o.a.h(xVar, str, z10);
        }

        public static int i(x xVar, String str, int i10) {
            jo.p.h(str, "key");
            return o.a.j(xVar, str, i10);
        }

        public static long j(x xVar, String str, long j10) {
            jo.p.h(str, "key");
            return o.a.k(xVar, str, j10);
        }

        public static String k(x xVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            return o.a.l(xVar, str, str2);
        }

        public static Set<String> l(x xVar, String str, Set<String> set) {
            jo.p.h(str, "key");
            jo.p.h(set, "default");
            return o.a.m(xVar, str, set);
        }

        public static boolean m(x xVar, String str, boolean z10) {
            jo.p.h(str, "key");
            return o.a.n(xVar, str, z10);
        }
    }

    void C2(long j10);

    void C4(String str);

    int E();

    void E0(int i10);

    void E1(int i10);

    void F(boolean z10);

    Set<String> G1();

    void H(int i10);

    boolean H0();

    void H2(int i10);

    String H3();

    void J1(boolean z10);

    void L(boolean z10);

    boolean L0();

    void L1(int i10);

    void M4(int i10);

    boolean N4();

    void O0(String str);

    String P();

    boolean P1();

    int Q0();

    String Q1();

    void Q3(int i10);

    void R1(String str);

    void R2(String str);

    boolean S();

    void S2(String str);

    int S3();

    void T0(int i10);

    void T2(int i10);

    String T4();

    boolean U3();

    void U4(String str);

    long V4();

    void W(String str);

    void W1(boolean z10);

    String W4();

    void X(int i10);

    void X3(String str);

    void X4(String str);

    int Z();

    String Z3();

    String a();

    boolean a1();

    void a3(String str);

    int a4();

    int c();

    boolean c2();

    void d0(boolean z10);

    void d2(int i10);

    void e(int i10);

    int e1();

    void f2(boolean z10);

    String g();

    void g3(String str);

    String h0();

    boolean h3();

    void i4(boolean z10);

    int j0();

    void j2(int i10);

    void k0(String str);

    void k1(int i10);

    void k3(String str);

    String k5();

    void l5(String str);

    void m(boolean z10);

    void m1(boolean z10);

    void n0(boolean z10);

    boolean n3();

    void n5(boolean z10);

    long o5();

    void p1(int i10);

    String p5();

    void r1(long j10);

    void r5(boolean z10);

    int s();

    int s3();

    void s5(Set<String> set);

    void t(boolean z10);

    void t2(int i10);

    String t4();

    void t5(boolean z10);

    int u();

    String u1();

    String u2();

    boolean u4();

    void u5(String str);

    void v(long j10);

    void v3(boolean z10);

    boolean w2();

    void w3(String str);

    void y(String str);

    void y0(int i10);

    void y1(boolean z10);

    int y2();

    long z2();
}
