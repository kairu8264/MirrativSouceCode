package kf;

import android.content.SharedPreferences;
import kf.o;

/* loaded from: classes2.dex */
public interface v extends o {

    /* loaded from: classes2.dex */
    public static final class a {
        public static SharedPreferences a(v vVar) {
            return o.a.b(vVar);
        }

        public static void b(v vVar, String str, int i10) {
            jo.p.h(str, "key");
            o.a.d(vVar, str, i10);
        }

        public static void c(v vVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            o.a.f(vVar, str, str2);
        }

        public static void d(v vVar, String str, boolean z10) {
            jo.p.h(str, "key");
            o.a.h(vVar, str, z10);
        }

        public static int e(v vVar, String str, int i10) {
            jo.p.h(str, "key");
            return o.a.j(vVar, str, i10);
        }

        public static String f(v vVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            return o.a.l(vVar, str, str2);
        }

        public static boolean g(v vVar, String str, boolean z10) {
            jo.p.h(str, "key");
            return o.a.n(vVar, str, z10);
        }
    }

    int A1();

    void A2(int i10);

    boolean B0();

    boolean B4();

    boolean C3();

    void E4(boolean z10);

    void F1(boolean z10);

    void F4(boolean z10);

    boolean G4();

    int J3();

    boolean K();

    void L3(boolean z10);

    boolean L4();

    void N1(boolean z10);

    void N2(int i10);

    int N3();

    void P2(boolean z10);

    void P4(int i10);

    boolean Q();

    void S1(boolean z10);

    void V1(boolean z10);

    boolean V3();

    void c0(int i10);

    void c1(boolean z10);

    boolean c4();

    void d(boolean z10);

    boolean f();

    boolean f5();

    int g1();

    void g2(boolean z10);

    void i1(boolean z10);

    boolean j3();

    String l();

    boolean l2();

    void m2(boolean z10);

    void m4(boolean z10);

    void n(int i10);

    boolean n1();

    boolean p4();

    int r0();

    int s0();

    boolean v5();

    void w4(boolean z10);

    void x0(boolean z10);

    void z5(String str);
}
