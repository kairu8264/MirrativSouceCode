package rg;

import ai.ft;
import ai.js;
import ai.lv;
import ai.ox;
import ai.uj0;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final lv f51386a;

    /* renamed from: b  reason: collision with root package name */
    public final List<j> f51387b = new ArrayList();

    public t(lv lvVar) {
        this.f51386a = lvVar;
        if (!((Boolean) ft.c().c(ox.X5)).booleanValue() || lvVar == null) {
            return;
        }
        try {
            List<js> f10 = lvVar.f();
            if (f10 != null) {
                for (js jsVar : f10) {
                    j a10 = j.a(jsVar);
                    if (a10 != null) {
                        this.f51387b.add(a10);
                    }
                }
            }
        } catch (RemoteException e10) {
            uj0.d("Could not forward getAdapterResponseInfo to ResponseInfo.", e10);
        }
    }

    public static t d(lv lvVar) {
        if (lvVar != null) {
            return new t(lvVar);
        }
        return null;
    }

    @RecentlyNullable
    public String a() {
        try {
            lv lvVar = this.f51386a;
            if (lvVar != null) {
                return lvVar.c();
            }
            return null;
        } catch (RemoteException e10) {
            uj0.d("Could not forward getMediationAdapterClassName to ResponseInfo.", e10);
            return null;
        }
    }

    @RecentlyNullable
    public String b() {
        try {
            lv lvVar = this.f51386a;
            if (lvVar != null) {
                return lvVar.a();
            }
            return null;
        } catch (RemoteException e10) {
            uj0.d("Could not forward getResponseId to ResponseInfo.", e10);
            return null;
        }
    }

    @RecentlyNonNull
    public final JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String b10 = b();
        if (b10 == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", b10);
        }
        String a10 = a();
        if (a10 == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", a10);
        }
        JSONArray jSONArray = new JSONArray();
        for (j jVar : this.f51387b) {
            jSONArray.put(jVar.b());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        return jSONObject;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return c().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
