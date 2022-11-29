package jl;

import al.l;
import android.text.TextUtils;
import el.c;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import xk.f;

/* loaded from: classes4.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f38096a;

    /* renamed from: b  reason: collision with root package name */
    public final el.b f38097b;

    /* renamed from: c  reason: collision with root package name */
    public final f f38098c;

    public a(String str, el.b bVar) {
        this(str, bVar, f.f());
    }

    @Override // jl.b
    public JSONObject a(il.f fVar, boolean z10) {
        if (z10) {
            try {
                Map<String, String> f10 = f(fVar);
                el.a b10 = b(d(f10), fVar);
                f fVar2 = this.f38098c;
                fVar2.b("Requesting settings from " + this.f38096a);
                f fVar3 = this.f38098c;
                fVar3.i("Settings query params were: " + f10);
                return g(b10.c());
            } catch (IOException e10) {
                this.f38098c.e("Settings request failed.", e10);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    public final el.a b(el.a aVar, il.f fVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", fVar.f36861a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", l.l());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", fVar.f36862b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", fVar.f36863c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", fVar.f36864d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", fVar.f36865e.a());
        return aVar;
    }

    public final void c(el.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    public el.a d(Map<String, String> map) {
        el.a a10 = this.f38097b.a(this.f38096a, map);
        return a10.d("User-Agent", "Crashlytics Android SDK/" + l.l()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    public final JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            f fVar = this.f38098c;
            fVar.l("Failed to parse settings JSON from " + this.f38096a, e10);
            f fVar2 = this.f38098c;
            fVar2.k("Settings response " + str);
            return null;
        }
    }

    public final Map<String, String> f(il.f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", fVar.f36868h);
        hashMap.put("display_version", fVar.f36867g);
        hashMap.put("source", Integer.toString(fVar.f36869i));
        String str = fVar.f36866f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject g(c cVar) {
        int b10 = cVar.b();
        f fVar = this.f38098c;
        fVar.i("Settings response code was: " + b10);
        if (h(b10)) {
            return e(cVar.a());
        }
        f fVar2 = this.f38098c;
        fVar2.d("Settings request failed; (status: " + b10 + ") from " + this.f38096a);
        return null;
    }

    public boolean h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }

    public a(String str, el.b bVar, f fVar) {
        if (str != null) {
            this.f38098c = fVar;
            this.f38097b = bVar;
            this.f38096a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
