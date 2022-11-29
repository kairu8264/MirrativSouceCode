package kf;

import android.content.SharedPreferences;
import kf.o;

/* loaded from: classes2.dex */
public interface i extends o {

    /* loaded from: classes2.dex */
    public static final class a {
        public static SharedPreferences a(i iVar) {
            return o.a.b(iVar);
        }

        public static void b(i iVar, String str, int i10) {
            jo.p.h(str, "key");
            o.a.d(iVar, str, i10);
        }

        public static void c(i iVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            o.a.f(iVar, str, str2);
        }

        public static void d(i iVar, String str, boolean z10) {
            jo.p.h(str, "key");
            o.a.h(iVar, str, z10);
        }

        public static int e(i iVar, String str, int i10) {
            jo.p.h(str, "key");
            return o.a.j(iVar, str, i10);
        }

        public static String f(i iVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            return o.a.l(iVar, str, str2);
        }

        public static boolean g(i iVar, String str, boolean z10) {
            jo.p.h(str, "key");
            return o.a.n(iVar, str, z10);
        }
    }

    void B(String str);

    void B1(int i10);

    void B2(boolean z10);

    String B3();

    boolean C1();

    int D();

    void D2(int i10);

    void E2(int i10);

    int F3();

    void G0(boolean z10);

    void G2(boolean z10);

    int G3();

    int I();

    String I0();

    void I2(String str);

    boolean I3();

    void J(boolean z10);

    String K0();

    boolean K1();

    String K2();

    String K4();

    void M1(int i10);

    void M2(boolean z10);

    boolean N();

    void N0(boolean z10);

    String O();

    void O1(String str);

    void O2(String str);

    void O3(String str);

    void O4(String str);

    void P0(String str);

    boolean P3();

    boolean Q2();

    void Q4(int i10);

    void R3(boolean z10);

    void R4(int i10);

    String T();

    boolean T1();

    void T3(boolean z10);

    String V0();

    void V2(boolean z10);

    void W3(String str);

    void X1(String str);

    String X2();

    String Y();

    void Y0(boolean z10);

    boolean Y4();

    void Z0(boolean z10);

    void Z4(String str);

    boolean a2();

    void b3(String str);

    int c();

    boolean d1();

    boolean d5();

    void e(int i10);

    void e3(String str);

    void e4(int i10);

    int g5();

    void h4(boolean z10);

    boolean i2();

    int j();

    void j1(boolean z10);

    void j4(boolean z10);

    boolean j5();

    void k(String str);

    String l0();

    void m0(String str);

    void m5(boolean z10);

    boolean n4();

    void o(int i10);

    void o0(int i10);

    boolean o2();

    void o4(boolean z10);

    String p0();

    int p2();

    boolean r();

    void s4(boolean z10);

    void t3(String str);

    void v2(boolean z10);

    String w();

    void w5(String str);

    boolean x1();

    void x4(boolean z10);

    int x5();

    int y4();

    void z1(boolean z10);

    void z4(String str);
}
