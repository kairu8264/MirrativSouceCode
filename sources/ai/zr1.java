package ai;

import android.os.IBinder;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zr1 implements y41, r71, o61 {
    public n41 A;
    public sr B;

    /* renamed from: w  reason: collision with root package name */
    public final ms1 f13079w;

    /* renamed from: x  reason: collision with root package name */
    public final String f13080x;

    /* renamed from: y  reason: collision with root package name */
    public int f13081y = 0;

    /* renamed from: z  reason: collision with root package name */
    public yr1 f13082z = yr1.AD_REQUESTED;

    public zr1(ms1 ms1Var, yl2 yl2Var) {
        this.f13079w = ms1Var;
        this.f13080x = yl2Var.f12652f;
    }

    public static JSONObject c(n41 n41Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", n41Var.c());
        jSONObject.put("responseSecsSinceEpoch", n41Var.R5());
        jSONObject.put("responseId", n41Var.a());
        if (((Boolean) ft.c().c(ox.G6)).booleanValue()) {
            String S5 = n41Var.S5();
            if (!TextUtils.isEmpty(S5)) {
                String valueOf = String.valueOf(S5);
                uj0.a(valueOf.length() != 0 ? "Bidding data: ".concat(valueOf) : new String("Bidding data: "));
                jSONObject.put("biddingData", new JSONObject(S5));
            }
        }
        JSONArray jSONArray = new JSONArray();
        List<js> f10 = n41Var.f();
        if (f10 != null) {
            for (js jsVar : f10) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adapterClassName", jsVar.f5904w);
                jSONObject2.put("latencyMillis", jsVar.f5905x);
                sr srVar = jsVar.f5906y;
                jSONObject2.put(MRLog.PAYLOAD_KEY_ERROR, srVar == null ? null : d(srVar));
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    public static JSONObject d(sr srVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", srVar.f9918y);
        jSONObject.put("errorCode", srVar.f9916w);
        jSONObject.put("errorDescription", srVar.f9917x);
        sr srVar2 = srVar.f9919z;
        jSONObject.put("underlyingError", srVar2 == null ? null : d(srVar2));
        return jSONObject;
    }

    @Override // ai.o61
    public final void Z(u01 u01Var) {
        this.A = u01Var.d();
        this.f13082z = yr1.AD_LOADED;
    }

    public final boolean a() {
        return this.f13082z != yr1.AD_REQUESTED;
    }

    public final JSONObject b() throws JSONException {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f13082z);
        jSONObject.put("format", fl2.a(this.f13081y));
        n41 n41Var = this.A;
        JSONObject jSONObject2 = null;
        if (n41Var != null) {
            jSONObject2 = c(n41Var);
        } else {
            sr srVar = this.B;
            if (srVar != null && (iBinder = srVar.A) != null) {
                n41 n41Var2 = (n41) iBinder;
                jSONObject2 = c(n41Var2);
                List<js> f10 = n41Var2.f();
                if (f10 != null && f10.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(d(this.B));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    @Override // ai.r71
    public final void s(ie0 ie0Var) {
        this.f13079w.j(this.f13080x, this);
    }

    @Override // ai.r71
    public final void u(sl2 sl2Var) {
        if (sl2Var.f9876b.f9496a.isEmpty()) {
            return;
        }
        this.f13081y = sl2Var.f9876b.f9496a.get(0).f4082b;
    }

    @Override // ai.y41
    public final void z(sr srVar) {
        this.f13082z = yr1.AD_LOAD_FAILED;
        this.B = srVar;
    }
}
