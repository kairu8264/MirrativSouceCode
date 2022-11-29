package rg;

import ai.ft;
import ai.ox;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m extends a {

    /* renamed from: e  reason: collision with root package name */
    public final t f51372e;

    public m(int i10, @RecentlyNonNull String str, @RecentlyNonNull String str2, a aVar, t tVar) {
        super(i10, str, str2, aVar);
        this.f51372e = tVar;
    }

    @Override // rg.a
    @RecentlyNonNull
    public final JSONObject e() throws JSONException {
        JSONObject e10 = super.e();
        t f10 = f();
        if (f10 == null) {
            e10.put("Response Info", "null");
        } else {
            e10.put("Response Info", f10.c());
        }
        return e10;
    }

    @RecentlyNullable
    public t f() {
        if (((Boolean) ft.c().c(ox.X5)).booleanValue()) {
            return this.f51372e;
        }
        return null;
    }

    @Override // rg.a
    @RecentlyNonNull
    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
