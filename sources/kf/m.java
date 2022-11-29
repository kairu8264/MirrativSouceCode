package kf;

import android.content.SharedPreferences;
import kf.o;

/* loaded from: classes2.dex */
public interface m extends o {

    /* loaded from: classes2.dex */
    public static final class a {
        public static SharedPreferences a(m mVar) {
            return o.a.b(mVar);
        }

        public static void b(m mVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            o.a.f(mVar, str, str2);
        }

        public static void c(m mVar, String str, boolean z10) {
            jo.p.h(str, "key");
            o.a.h(mVar, str, z10);
        }

        public static String d(m mVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            return o.a.l(mVar, str, str2);
        }

        public static boolean e(m mVar, String str, boolean z10) {
            jo.p.h(str, "key");
            return o.a.n(mVar, str, z10);
        }
    }

    void A4(String str);

    String D1();

    void D3(String str);

    String F0();

    void J4(String str);

    void L2(String str);

    String R();

    boolean V();

    boolean W0();

    String b();

    String b1();

    String e5();

    String getTitle();

    String h();

    void l4(String str);

    String q3();

    void q5(boolean z10);

    String r3();

    void s2(String str);

    void u0(boolean z10);

    void v0(String str);

    void x2(String str);

    void z3(String str);
}
