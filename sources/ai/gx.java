package ai;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class gx<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f4618a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4619b;

    /* renamed from: c  reason: collision with root package name */
    public final T f4620c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gx(int i10, int i11, String str, T t10) {
        this.f4618a = i10;
        this.f4619b = i11;
        this.f4620c = str;
        ft.b().a(this);
    }

    public static gx<Boolean> g(int i10, String str, Boolean bool) {
        return new zw(i10, str, bool);
    }

    public static gx<Integer> h(int i10, String str, int i11) {
        return new ax(1, str, Integer.valueOf(i11));
    }

    public static gx<Long> i(int i10, String str, long j10) {
        return new bx(1, str, Long.valueOf(j10));
    }

    public static gx<Float> j(int i10, String str, float f10) {
        return new dx(1, str, Float.valueOf(f10));
    }

    public static gx<String> k(int i10, String str, String str2) {
        return new ex(1, str, str2);
    }

    public static gx<String> l(int i10, String str) {
        gx<String> k10 = k(1, "gads:sdk_core_constants:experiment_id", null);
        ft.b().b(k10);
        return k10;
    }

    public abstract T a(Bundle bundle);

    public abstract void b(SharedPreferences.Editor editor, T t10);

    public abstract T c(JSONObject jSONObject);

    public abstract T d(SharedPreferences sharedPreferences);

    public final String e() {
        return this.f4619b;
    }

    public final T f() {
        return this.f4620c;
    }

    public final int m() {
        return this.f4618a;
    }
}
