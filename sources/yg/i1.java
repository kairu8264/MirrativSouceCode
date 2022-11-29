package yg;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class i1 implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f61897a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f61898b;

    public i1(j1 j1Var, Context context, Context context2) {
        this.f61897a = context;
        this.f61898b = context2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() throws Exception {
        SharedPreferences sharedPreferences;
        boolean z10 = false;
        if (this.f61897a != null) {
            p1.k("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f61897a.getSharedPreferences("admob_user_agent", 0);
        } else {
            p1.k("Attempting to read user agent from local cache.");
            sharedPreferences = this.f61898b.getSharedPreferences("admob_user_agent", 0);
            z10 = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            p1.k("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f61898b);
            if (z10) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                p1.k("Persisting user agent.");
            }
        }
        return string;
    }
}
