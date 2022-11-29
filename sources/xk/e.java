package xk;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f60361a;

    /* renamed from: b  reason: collision with root package name */
    public b f60362b = null;

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f60363a;

        /* renamed from: b  reason: collision with root package name */
        public final String f60364b;

        public b() {
            int q10 = al.g.q(e.this.f60361a, "com.google.firebase.crashlytics.unity_version", "string");
            if (q10 == 0) {
                if (e.this.c("flutter_assets")) {
                    this.f60363a = "Flutter";
                    this.f60364b = null;
                    f.f().i("Development platform is: Flutter");
                    return;
                }
                this.f60363a = null;
                this.f60364b = null;
                return;
            }
            this.f60363a = "Unity";
            String string = e.this.f60361a.getResources().getString(q10);
            this.f60364b = string;
            f f10 = f.f();
            f10.i("Unity Editor version is: " + string);
        }
    }

    public e(Context context) {
        this.f60361a = context;
    }

    public static boolean g(Context context) {
        return al.g.q(context, "com.google.firebase.crashlytics.unity_version", "string") != 0;
    }

    public final boolean c(String str) {
        String[] list;
        try {
            if (this.f60361a.getAssets() == null || (list = this.f60361a.getAssets().list(str)) == null) {
                return false;
            }
            return list.length > 0;
        } catch (IOException unused) {
            return false;
        }
    }

    public String d() {
        return f().f60363a;
    }

    public String e() {
        return f().f60364b;
    }

    public final b f() {
        if (this.f60362b == null) {
            this.f60362b = new b();
        }
        return this.f60362b;
    }
}
