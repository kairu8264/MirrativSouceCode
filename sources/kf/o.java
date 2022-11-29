package kf;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public interface o {

    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(o oVar) {
            oVar.a5().edit().clear().apply();
        }

        public static SharedPreferences b(o oVar) {
            SharedPreferences sharedPreferences = oVar.getContext().getSharedPreferences(oVar.z(), 0);
            jo.p.g(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }

        public static void c(o oVar, String str, float f10) {
            jo.p.h(str, "key");
            oVar.a5().edit().putFloat(str, f10).apply();
        }

        public static void d(o oVar, String str, int i10) {
            jo.p.h(str, "key");
            oVar.a5().edit().putInt(str, i10).apply();
        }

        public static void e(o oVar, String str, long j10) {
            jo.p.h(str, "key");
            oVar.a5().edit().putLong(str, j10).apply();
        }

        public static void f(o oVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            oVar.a5().edit().putString(str, str2).apply();
        }

        public static void g(o oVar, String str, Set<String> set) {
            jo.p.h(str, "key");
            jo.p.h(set, "default");
            oVar.a5().edit().putStringSet(str, set).apply();
        }

        public static void h(o oVar, String str, boolean z10) {
            jo.p.h(str, "key");
            oVar.a5().edit().putBoolean(str, z10).apply();
        }

        public static float i(o oVar, String str, float f10) {
            jo.p.h(str, "key");
            return oVar.a5().getFloat(str, f10);
        }

        public static int j(o oVar, String str, int i10) {
            jo.p.h(str, "key");
            return oVar.a5().getInt(str, i10);
        }

        public static long k(o oVar, String str, long j10) {
            jo.p.h(str, "key");
            return oVar.a5().getLong(str, j10);
        }

        public static String l(o oVar, String str, String str2) {
            jo.p.h(str, "key");
            jo.p.h(str2, "default");
            String string = oVar.a5().getString(str, str2);
            return string == null ? "" : string;
        }

        public static Set<String> m(o oVar, String str, Set<String> set) {
            jo.p.h(str, "key");
            jo.p.h(set, "default");
            Set<String> stringSet = oVar.a5().getStringSet(str, set);
            return stringSet == null ? new HashSet() : stringSet;
        }

        public static boolean n(o oVar, String str, boolean z10) {
            jo.p.h(str, "key");
            return oVar.a5().getBoolean(str, z10);
        }

        public static void o(o oVar, String str) {
            jo.p.h(str, "key");
            oVar.a5().edit().remove(str).apply();
        }
    }

    SharedPreferences a5();

    void clear();

    Context getContext();

    String z();
}
