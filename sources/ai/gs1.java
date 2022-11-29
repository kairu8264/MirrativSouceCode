package ai;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class gs1 {

    /* renamed from: a  reason: collision with root package name */
    public final tr1 f4554a;

    /* renamed from: b  reason: collision with root package name */
    public final jn1 f4555b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4556c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final List<fs1> f4557d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f4558e;

    public gs1(tr1 tr1Var, jn1 jn1Var) {
        this.f4554a = tr1Var;
        this.f4555b = jn1Var;
    }

    public final void a() {
        this.f4554a.h(new es1(this));
    }

    public final JSONArray b() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f4556c) {
            if (!this.f4558e) {
                if (this.f4554a.m()) {
                    d(this.f4554a.j());
                } else {
                    a();
                    return jSONArray;
                }
            }
            for (fs1 fs1Var : this.f4557d) {
                jSONArray.put(fs1Var.a());
            }
            return jSONArray;
        }
    }

    public final void d(List<d50> list) {
        String lb0Var;
        synchronized (this.f4556c) {
            if (this.f4558e) {
                return;
            }
            for (d50 d50Var : list) {
                List<fs1> list2 = this.f4557d;
                String str = d50Var.f3147w;
                in1 c10 = this.f4555b.c(str);
                if (c10 == null) {
                    lb0Var = "";
                } else {
                    lb0 lb0Var2 = c10.f5305b;
                    lb0Var = lb0Var2 == null ? "" : lb0Var2.toString();
                }
                String str2 = lb0Var;
                list2.add(new fs1(str, str2, d50Var.f3148x ? 1 : 0, d50Var.f3150z, d50Var.f3149y));
            }
            this.f4558e = true;
        }
    }
}
