package kf;

import android.content.SharedPreferences;
import kf.o;

/* loaded from: classes2.dex */
public interface g extends o {

    /* loaded from: classes2.dex */
    public static final class a {
        public static SharedPreferences a(g gVar) {
            return o.a.b(gVar);
        }

        public static void b(g gVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            o.a.f(gVar, str, str2);
        }

        public static String c(g gVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            return o.a.l(gVar, str, str2);
        }
    }

    void D4(String str);

    String M0();

    String b4();

    void x3(String str);
}
