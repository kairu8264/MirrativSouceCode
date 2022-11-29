package hl;

import al.f0;
import al.q;
import al.r;
import al.s;
import al.v;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import vi.j;

/* loaded from: classes4.dex */
public class d implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f36115a;

    /* renamed from: b  reason: collision with root package name */
    public final il.f f36116b;

    /* renamed from: c  reason: collision with root package name */
    public final f f36117c;

    /* renamed from: d  reason: collision with root package name */
    public final q f36118d;

    /* renamed from: e  reason: collision with root package name */
    public final hl.a f36119e;

    /* renamed from: f  reason: collision with root package name */
    public final jl.b f36120f;

    /* renamed from: g  reason: collision with root package name */
    public final r f36121g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<il.d> f36122h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReference<vi.h<il.a>> f36123i;

    /* loaded from: classes4.dex */
    public class a implements vi.f<Void, Void> {
        public a() {
        }

        @Override // vi.f
        /* renamed from: b */
        public vi.g<Void> a(Void r52) throws Exception {
            JSONObject a10 = d.this.f36120f.a(d.this.f36116b, true);
            if (a10 != null) {
                il.e b10 = d.this.f36117c.b(a10);
                d.this.f36119e.c(b10.d(), a10);
                d.this.q(a10, "Loaded settings: ");
                d dVar = d.this;
                dVar.r(dVar.f36116b.f36866f);
                d.this.f36122h.set(b10);
                ((vi.h) d.this.f36123i.get()).e(b10.c());
                vi.h hVar = new vi.h();
                hVar.e(b10.c());
                d.this.f36123i.set(hVar);
            }
            return j.e(null);
        }
    }

    public d(Context context, il.f fVar, q qVar, f fVar2, hl.a aVar, jl.b bVar, r rVar) {
        AtomicReference<il.d> atomicReference = new AtomicReference<>();
        this.f36122h = atomicReference;
        this.f36123i = new AtomicReference<>(new vi.h());
        this.f36115a = context;
        this.f36116b = fVar;
        this.f36118d = qVar;
        this.f36117c = fVar2;
        this.f36119e = aVar;
        this.f36120f = bVar;
        this.f36121g = rVar;
        atomicReference.set(b.e(qVar));
    }

    public static d l(Context context, String str, v vVar, el.b bVar, String str2, String str3, fl.f fVar, r rVar) {
        String g10 = vVar.g();
        f0 f0Var = new f0();
        return new d(context, new il.f(str, vVar.h(), vVar.i(), vVar.j(), vVar, al.g.h(al.g.n(context), str, str3, str2), str3, str2, s.a(g10).c()), f0Var, new f(f0Var), new hl.a(fVar), new jl.a(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), rVar);
    }

    @Override // hl.e
    public il.d a() {
        return this.f36122h.get();
    }

    @Override // hl.e
    public vi.g<il.a> b() {
        return this.f36123i.get().a();
    }

    public boolean k() {
        return !n().equals(this.f36116b.f36866f);
    }

    public final il.e m(c cVar) {
        il.e eVar = null;
        try {
            if (!c.SKIP_CACHE_LOOKUP.equals(cVar)) {
                JSONObject b10 = this.f36119e.b();
                if (b10 != null) {
                    il.e b11 = this.f36117c.b(b10);
                    if (b11 != null) {
                        q(b10, "Loaded cached settings: ");
                        long a10 = this.f36118d.a();
                        if (!c.IGNORE_CACHE_EXPIRATION.equals(cVar) && b11.e(a10)) {
                            xk.f.f().i("Cached settings have expired.");
                        }
                        try {
                            xk.f.f().i("Returning cached settings.");
                            eVar = b11;
                        } catch (Exception e10) {
                            e = e10;
                            eVar = b11;
                            xk.f.f().e("Failed to get cached settings", e);
                            return eVar;
                        }
                    } else {
                        xk.f.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    xk.f.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return eVar;
    }

    public final String n() {
        return al.g.r(this.f36115a).getString("existing_instance_identifier", "");
    }

    public vi.g<Void> o(c cVar, Executor executor) {
        il.e m10;
        if (!k() && (m10 = m(cVar)) != null) {
            this.f36122h.set(m10);
            this.f36123i.get().e(m10.c());
            return j.e(null);
        }
        il.e m11 = m(c.IGNORE_CACHE_EXPIRATION);
        if (m11 != null) {
            this.f36122h.set(m11);
            this.f36123i.get().e(m11.c());
        }
        return this.f36121g.j(executor).t(executor, new a());
    }

    public vi.g<Void> p(Executor executor) {
        return o(c.USE_CACHE, executor);
    }

    public final void q(JSONObject jSONObject, String str) throws JSONException {
        xk.f f10 = xk.f.f();
        f10.b(str + jSONObject.toString());
    }

    @SuppressLint({"CommitPrefEdits"})
    public final boolean r(String str) {
        SharedPreferences.Editor edit = al.g.r(this.f36115a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }
}
