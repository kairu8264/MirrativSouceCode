package ai;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class vy1 {

    /* renamed from: c  reason: collision with root package name */
    public kl2 f11412c = null;

    /* renamed from: d  reason: collision with root package name */
    public fl2 f11413d = null;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, js> f11411b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a  reason: collision with root package name */
    public final List<js> f11410a = Collections.synchronizedList(new ArrayList());

    public final void a(kl2 kl2Var) {
        this.f11412c = kl2Var;
    }

    public final void b(fl2 fl2Var) {
        String str = fl2Var.f4112w;
        if (this.f11411b.containsKey(str)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = fl2Var.f4111v.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, fl2Var.f4111v.getString(next));
            } catch (JSONException unused) {
            }
        }
        js jsVar = new js(fl2Var.E, 0L, null, bundle);
        this.f11410a.add(jsVar);
        this.f11411b.put(str, jsVar);
    }

    public final void c(fl2 fl2Var, long j10, sr srVar) {
        String str = fl2Var.f4112w;
        if (this.f11411b.containsKey(str)) {
            if (this.f11413d == null) {
                this.f11413d = fl2Var;
            }
            js jsVar = this.f11411b.get(str);
            jsVar.f5905x = j10;
            jsVar.f5906y = srVar;
        }
    }

    public final n41 d() {
        return new n41(this.f11413d, "", this, this.f11412c);
    }

    public final List<js> e() {
        return this.f11410a;
    }
}
