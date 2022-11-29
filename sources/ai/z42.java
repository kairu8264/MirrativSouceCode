package ai;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class z42 extends ab0 {
    public boolean A;

    /* renamed from: w  reason: collision with root package name */
    public final String f12873w;

    /* renamed from: x  reason: collision with root package name */
    public final ya0 f12874x;

    /* renamed from: y  reason: collision with root package name */
    public final mk0<JSONObject> f12875y;

    /* renamed from: z  reason: collision with root package name */
    public final JSONObject f12876z;

    public z42(String str, ya0 ya0Var, mk0<JSONObject> mk0Var) {
        JSONObject jSONObject = new JSONObject();
        this.f12876z = jSONObject;
        this.A = false;
        this.f12875y = mk0Var;
        this.f12873w = str;
        this.f12874x = ya0Var;
        try {
            jSONObject.put("adapter_version", ya0Var.a().toString());
            jSONObject.put("sdk_version", ya0Var.f().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // ai.bb0
    public final synchronized void B(sr srVar) throws RemoteException {
        if (this.A) {
            return;
        }
        try {
            this.f12876z.put("signal_error", srVar.f9917x);
        } catch (JSONException unused) {
        }
        this.f12875y.d(this.f12876z);
        this.A = true;
    }

    @Override // ai.bb0
    public final synchronized void H(String str) throws RemoteException {
        if (this.A) {
            return;
        }
        if (str == null) {
            s("Adapter returned null signals");
            return;
        }
        try {
            this.f12876z.put("signals", str);
        } catch (JSONException unused) {
        }
        this.f12875y.d(this.f12876z);
        this.A = true;
    }

    @Override // ai.bb0
    public final synchronized void s(String str) throws RemoteException {
        if (this.A) {
            return;
        }
        try {
            this.f12876z.put("signal_error", str);
        } catch (JSONException unused) {
        }
        this.f12875y.d(this.f12876z);
        this.A = true;
    }

    public final synchronized void zzb() {
        if (this.A) {
            return;
        }
        this.f12875y.d(this.f12876z);
        this.A = true;
    }
}
