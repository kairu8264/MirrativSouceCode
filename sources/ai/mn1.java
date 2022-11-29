package ai;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbye;
import com.google.android.gms.internal.ads.zzfaw;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mn1 {

    /* renamed from: a  reason: collision with root package name */
    public final jn1 f6983a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<z80> f6984b = new AtomicReference<>();

    public mn1(jn1 jn1Var) {
        this.f6983a = jn1Var;
    }

    public final void a(z80 z80Var) {
        this.f6984b.compareAndSet(null, z80Var);
    }

    public final pm2 b(String str, JSONObject jSONObject) throws zzfaw {
        c90 t10;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                t10 = new y90(new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                t10 = new y90(new AdUrlAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                t10 = new y90(new zzbye());
            } else {
                z80 e10 = e();
                if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (e10.A(string)) {
                            t10 = e10.t("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else if (e10.x4(string)) {
                            t10 = e10.t(string);
                        } else {
                            t10 = e10.t("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e11) {
                        uj0.d("Invalid custom event.", e11);
                    }
                }
                t10 = e10.t(str);
            }
            pm2 pm2Var = new pm2(t10);
            this.f6983a.a(str, pm2Var);
            return pm2Var;
        } catch (Throwable th2) {
            throw new zzfaw(th2);
        }
    }

    public final ya0 c(String str) throws RemoteException {
        ya0 s10 = e().s(str);
        this.f6983a.b(str, s10);
        return s10;
    }

    public final boolean d() {
        return this.f6984b.get() != null;
    }

    public final z80 e() throws RemoteException {
        z80 z80Var = this.f6984b.get();
        if (z80Var != null) {
            return z80Var;
        }
        uj0.f("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
