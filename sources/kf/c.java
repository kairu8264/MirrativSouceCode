package kf;

import android.content.SharedPreferences;
import kf.o;

/* loaded from: classes2.dex */
public interface c extends o {

    /* loaded from: classes2.dex */
    public static final class a {
        public static SharedPreferences a(c cVar) {
            return o.a.b(cVar);
        }

        public static void b(c cVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            o.a.f(cVar, str, str2);
        }

        public static String c(c cVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            return o.a.l(cVar, str, str2);
        }
    }

    void J2(String str);

    String e0();
}
