package ai;

import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzdym;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m12 implements g12<jg1> {

    /* renamed from: a  reason: collision with root package name */
    public final cf1 f6762a;

    /* renamed from: b  reason: collision with root package name */
    public final t43 f6763b;

    /* renamed from: c  reason: collision with root package name */
    public final cj1 f6764c;

    /* renamed from: d  reason: collision with root package name */
    public final qm2<nl1> f6765d;

    /* renamed from: e  reason: collision with root package name */
    public final tl1 f6766e;

    public m12(cf1 cf1Var, t43 t43Var, cj1 cj1Var, qm2<nl1> qm2Var, tl1 tl1Var) {
        this.f6762a = cf1Var;
        this.f6763b = t43Var;
        this.f6764c = cj1Var;
        this.f6765d = qm2Var;
        this.f6766e = tl1Var;
    }

    @Override // ai.ry1
    public final s43<List<s43<jg1>>> a(final sl2 sl2Var, final fl2 fl2Var) {
        return j43.i(j43.i(this.f6765d.b(), new p33(this, fl2Var) { // from class: ai.h12

            /* renamed from: a  reason: collision with root package name */
            public final m12 f4691a;

            /* renamed from: b  reason: collision with root package name */
            public final fl2 f4692b;

            {
                this.f4691a = this;
                this.f4692b = fl2Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f4691a.f(this.f4692b, (nl1) obj);
            }
        }, this.f6763b), new p33(this, sl2Var, fl2Var) { // from class: ai.i12

            /* renamed from: a  reason: collision with root package name */
            public final m12 f5079a;

            /* renamed from: b  reason: collision with root package name */
            public final sl2 f5080b;

            /* renamed from: c  reason: collision with root package name */
            public final fl2 f5081c;

            {
                this.f5079a = this;
                this.f5080b = sl2Var;
                this.f5081c = fl2Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f5079a.e(this.f5080b, this.f5081c, (JSONArray) obj);
            }
        }, this.f6763b);
    }

    @Override // ai.ry1
    public final boolean b(sl2 sl2Var, fl2 fl2Var) {
        ll2 ll2Var = fl2Var.f4108s;
        return (ll2Var == null || ll2Var.f6615c == null) ? false : true;
    }

    public final /* synthetic */ jg1 c(s43 s43Var, s43 s43Var2, sl2 sl2Var, fl2 fl2Var, JSONObject jSONObject) throws Exception {
        og1 og1Var = (og1) s43Var.get();
        nl1 nl1Var = (nl1) s43Var2.get();
        pg1 c10 = this.f6762a.c(new j11(sl2Var, fl2Var, null), new ah1(og1Var), new pf1(jSONObject, nl1Var));
        c10.i().b();
        c10.j().a(nl1Var);
        c10.k().a(og1Var.r());
        c10.l().a(this.f6766e);
        return c10.h();
    }

    public final /* synthetic */ s43 d(nl1 nl1Var, JSONObject jSONObject) throws Exception {
        this.f6765d.c(j43.a(nl1Var));
        if (jSONObject.optBoolean("success")) {
            return j43.a(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbtv("process json failed");
    }

    public final /* synthetic */ s43 e(sl2 sl2Var, fl2 fl2Var, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return j43.c(new zzdym(3));
        }
        if (sl2Var.f9875a.f8473a.f12657k > 1) {
            int length = jSONArray.length();
            this.f6765d.a(Math.min(length, sl2Var.f9875a.f8473a.f12657k));
            ArrayList arrayList = new ArrayList(sl2Var.f9875a.f8473a.f12657k);
            for (int i10 = 0; i10 < sl2Var.f9875a.f8473a.f12657k; i10++) {
                if (i10 < length) {
                    arrayList.add(g(sl2Var, fl2Var, jSONArray.getJSONObject(i10)));
                } else {
                    arrayList.add(j43.c(new zzdym(3)));
                }
            }
            return j43.a(arrayList);
        }
        return j43.j(g(sl2Var, fl2Var, jSONArray.getJSONObject(0)), k12.f6023a, this.f6763b);
    }

    public final /* synthetic */ s43 f(fl2 fl2Var, final nl1 nl1Var) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) ft.c().c(ox.f7987f6)).booleanValue() && vh.n.n()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", fl2Var.f4108s.f6615c);
        jSONObject2.put("sdk_params", jSONObject);
        return j43.i(nl1Var.d("google.afma.nativeAds.preProcessJson", jSONObject2), new p33(this, nl1Var) { // from class: ai.j12

            /* renamed from: a  reason: collision with root package name */
            public final m12 f5586a;

            /* renamed from: b  reason: collision with root package name */
            public final nl1 f5587b;

            {
                this.f5586a = this;
                this.f5587b = nl1Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f5586a.d(this.f5587b, (JSONObject) obj);
            }
        }, this.f6763b);
    }

    public final s43<jg1> g(final sl2 sl2Var, final fl2 fl2Var, final JSONObject jSONObject) {
        final s43<nl1> b10 = this.f6765d.b();
        final s43<og1> a10 = this.f6764c.a(sl2Var, fl2Var, jSONObject);
        return j43.n(b10, a10).a(new Callable(this, a10, b10, sl2Var, fl2Var, jSONObject) { // from class: ai.l12

            /* renamed from: a  reason: collision with root package name */
            public final m12 f6446a;

            /* renamed from: b  reason: collision with root package name */
            public final s43 f6447b;

            /* renamed from: c  reason: collision with root package name */
            public final s43 f6448c;

            /* renamed from: d  reason: collision with root package name */
            public final sl2 f6449d;

            /* renamed from: e  reason: collision with root package name */
            public final fl2 f6450e;

            /* renamed from: f  reason: collision with root package name */
            public final JSONObject f6451f;

            {
                this.f6446a = this;
                this.f6447b = a10;
                this.f6448c = b10;
                this.f6449d = sl2Var;
                this.f6450e = fl2Var;
                this.f6451f = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6446a.c(this.f6447b, this.f6448c, this.f6449d, this.f6450e, this.f6451f);
            }
        }, this.f6763b);
    }
}
