package ai;

import com.google.android.gms.internal.ads.zzbtv;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b80 implements f40 {

    /* renamed from: a  reason: collision with root package name */
    public final e70 f2266a;

    /* renamed from: b  reason: collision with root package name */
    public final mk0 f2267b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c80 f2268c;

    public b80(c80 c80Var, e70 e70Var, mk0 mk0Var) {
        this.f2268c = c80Var;
        this.f2266a = e70Var;
        this.f2267b = mk0Var;
    }

    @Override // ai.f40
    public final void t(String str) {
        e70 e70Var;
        try {
            if (str == null) {
                this.f2267b.e(new zzbtv());
            } else {
                this.f2267b.e(new zzbtv(str));
            }
            e70Var = this.f2266a;
        } catch (IllegalStateException unused) {
            e70Var = this.f2266a;
        } catch (Throwable th2) {
            this.f2266a.g();
            throw th2;
        }
        e70Var.g();
    }

    @Override // ai.f40
    public final void u(JSONObject jSONObject) {
        e70 e70Var;
        p70 p70Var;
        try {
            try {
                mk0 mk0Var = this.f2267b;
                p70Var = this.f2268c.f2747a;
                mk0Var.d(p70Var.u(jSONObject));
                e70Var = this.f2266a;
            } catch (IllegalStateException unused) {
                e70Var = this.f2266a;
            } catch (JSONException e10) {
                this.f2267b.e(e10);
                e70Var = this.f2266a;
            }
            e70Var.g();
        } catch (Throwable th2) {
            this.f2266a.g();
            throw th2;
        }
    }
}
