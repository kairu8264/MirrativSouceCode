package eh;

import ai.e43;
import ai.ft;
import ai.ki0;
import ai.ox;
import ai.uj0;
import ai.zj0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import yg.d2;

/* loaded from: classes3.dex */
public final class b0 implements e43<j> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ki0 f30563a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f0 f30564b;

    public b0(f0 f0Var, ki0 ki0Var) {
        this.f30564b = f0Var;
        this.f30563a = ki0Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        String message = th2.getMessage();
        wg.t.h().k(th2, "SignalGeneratorImpl.generateSignals");
        f0.u6(this.f30564b, "sgf", "sgf_reason", message);
        try {
            ki0 ki0Var = this.f30563a;
            String valueOf = String.valueOf(message);
            ki0Var.t(valueOf.length() != 0 ? "Internal error. ".concat(valueOf) : new String("Internal error. "));
        } catch (RemoteException e10) {
            uj0.d("", e10);
        }
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(j jVar) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        zj0 zj0Var;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        l lVar;
        j jVar2 = jVar;
        if (!((Boolean) ft.c().c(ox.f8130x5)).booleanValue()) {
            try {
                this.f30563a.t("QueryInfo generation has been disabled.");
                return;
            } catch (RemoteException e10) {
                uj0.c("QueryInfo generation has been disabled.".concat(e10.toString()));
                return;
            }
        }
        try {
            if (jVar2 == null) {
                this.f30563a.j1(null, null, null);
                f0.u6(this.f30564b, "sgs", "rid", "-1");
                return;
            }
            try {
                String optString = new JSONObject(jVar2.f30597b).optString("request_id", "");
                if (TextUtils.isEmpty(optString)) {
                    uj0.f("The request ID is empty in request JSON.");
                    this.f30563a.t("Internal error: request ID is empty in request JSON.");
                    f0.u6(this.f30564b, "sgf", "sgf_reason", "rid_missing");
                    return;
                }
                if (((Boolean) ft.c().c(ox.f8010i5)).booleanValue()) {
                    lVar = this.f30564b.G;
                    lVar.b(optString, jVar2.f30597b);
                }
                Bundle bundle = jVar2.f30598c;
                z10 = this.f30564b.N;
                if (z10 && bundle != null) {
                    str5 = this.f30564b.P;
                    if (bundle.getInt(str5, -1) == -1) {
                        str6 = this.f30564b.P;
                        atomicInteger = this.f30564b.Q;
                        bundle.putInt(str6, atomicInteger.get());
                    }
                }
                z11 = this.f30564b.M;
                if (z11 && bundle != null) {
                    str = this.f30564b.O;
                    if (TextUtils.isEmpty(bundle.getString(str))) {
                        str2 = this.f30564b.S;
                        if (TextUtils.isEmpty(str2)) {
                            f0 f0Var = this.f30564b;
                            d2 d10 = wg.t.d();
                            context = this.f30564b.f30577x;
                            zj0Var = this.f30564b.R;
                            f0Var.S = d10.P(context, zj0Var.f13013w);
                        }
                        str3 = this.f30564b.O;
                        str4 = this.f30564b.S;
                        bundle.putString(str3, str4);
                    }
                }
                this.f30563a.j1(jVar2.f30596a, jVar2.f30597b, bundle);
                f0.u6(this.f30564b, "sgs", "rid", optString);
            } catch (JSONException e11) {
                uj0.f("Failed to create JSON object from the request string.");
                ki0 ki0Var = this.f30563a;
                String obj = e11.toString();
                StringBuilder sb2 = new StringBuilder(obj.length() + 33);
                sb2.append("Internal error for request JSON: ");
                sb2.append(obj);
                ki0Var.t(sb2.toString());
                f0.u6(this.f30564b, "sgf", "sgf_reason", "request_invalid");
            }
        } catch (RemoteException e12) {
            uj0.d("", e12);
        }
    }
}
