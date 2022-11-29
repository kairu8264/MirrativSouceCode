package kf;

import android.content.SharedPreferences;
import kf.o;

/* loaded from: classes2.dex */
public interface a extends o {

    /* renamed from: kf.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0546a {
        public static void a(a aVar) {
            o.a.a(aVar);
        }

        public static SharedPreferences b(a aVar) {
            return o.a.b(aVar);
        }

        public static void c(a aVar, String str, int i10) {
            jo.p.h(str, "key");
            o.a.d(aVar, str, i10);
        }

        public static void d(a aVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            o.a.f(aVar, str, str2);
        }

        public static void e(a aVar, String str, boolean z10) {
            jo.p.h(str, "key");
            o.a.h(aVar, str, z10);
        }

        public static int f(a aVar, String str, int i10) {
            jo.p.h(str, "key");
            return o.a.j(aVar, str, i10);
        }

        public static String g(a aVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            return o.a.l(aVar, str, str2);
        }

        public static boolean h(a aVar, String str, boolean z10) {
            jo.p.h(str, "key");
            return o.a.n(aVar, str, z10);
        }
    }

    void A3(boolean z10);

    void G(int i10);

    void X0(String str);

    boolean a0();

    boolean f0();

    int k4();

    String t0();
}
