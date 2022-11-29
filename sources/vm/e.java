package vm;

import android.content.Context;
import android.util.Log;
import com.google.firebase.abt.AbtException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: l  reason: collision with root package name */
    public static final byte[] f57498l = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final Context f57499a;

    /* renamed from: b  reason: collision with root package name */
    public final pk.c f57500b;

    /* renamed from: c  reason: collision with root package name */
    public final qk.b f57501c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f57502d;

    /* renamed from: e  reason: collision with root package name */
    public final wm.d f57503e;

    /* renamed from: f  reason: collision with root package name */
    public final wm.d f57504f;

    /* renamed from: g  reason: collision with root package name */
    public final wm.d f57505g;

    /* renamed from: h  reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.b f57506h;

    /* renamed from: i  reason: collision with root package name */
    public final wm.j f57507i;

    /* renamed from: j  reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.c f57508j;

    /* renamed from: k  reason: collision with root package name */
    public final yl.f f57509k;

    public e(Context context, pk.c cVar, yl.f fVar, qk.b bVar, Executor executor, wm.d dVar, wm.d dVar2, wm.d dVar3, com.google.firebase.remoteconfig.internal.b bVar2, wm.j jVar, com.google.firebase.remoteconfig.internal.c cVar2) {
        this.f57499a = context;
        this.f57500b = cVar;
        this.f57509k = fVar;
        this.f57501c = bVar;
        this.f57502d = executor;
        this.f57503e = dVar;
        this.f57504f = dVar2;
        this.f57505g = dVar3;
        this.f57506h = bVar2;
        this.f57507i = jVar;
        this.f57508j = cVar2;
    }

    public static boolean j(com.google.firebase.remoteconfig.internal.a aVar, com.google.firebase.remoteconfig.internal.a aVar2) {
        return aVar2 == null || !aVar.e().equals(aVar2.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ vi.g k(vi.g gVar, vi.g gVar2, vi.g gVar3) throws Exception {
        if (gVar.s() && gVar.o() != null) {
            com.google.firebase.remoteconfig.internal.a aVar = (com.google.firebase.remoteconfig.internal.a) gVar.o();
            if (gVar2.s() && !j(aVar, (com.google.firebase.remoteconfig.internal.a) gVar2.o())) {
                return vi.j.e(Boolean.FALSE);
            }
            return this.f57504f.k(aVar).j(this.f57502d, new vi.a() { // from class: vm.a
                @Override // vi.a
                public final Object a(vi.g gVar4) {
                    boolean n10;
                    n10 = e.this.n(gVar4);
                    return Boolean.valueOf(n10);
                }
            });
        }
        return vi.j.e(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ vi.g m(Void r12) throws Exception {
        return e();
    }

    public static List<Map<String, String>> p(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public vi.g<Boolean> e() {
        final vi.g<com.google.firebase.remoteconfig.internal.a> e10 = this.f57503e.e();
        final vi.g<com.google.firebase.remoteconfig.internal.a> e11 = this.f57504f.e();
        return vi.j.i(e10, e11).l(this.f57502d, new vi.a() { // from class: vm.b
            @Override // vi.a
            public final Object a(vi.g gVar) {
                vi.g k10;
                k10 = e.this.k(e10, e11, gVar);
                return k10;
            }
        });
    }

    public vi.g<Void> f() {
        return this.f57506h.h().u(d.f57497a);
    }

    public vi.g<Boolean> g() {
        return f().t(this.f57502d, new vi.f() { // from class: vm.c
            @Override // vi.f
            public final vi.g a(Object obj) {
                vi.g m10;
                m10 = e.this.m((Void) obj);
                return m10;
            }
        });
    }

    public Map<String, h> h() {
        return this.f57507i.d();
    }

    public f i() {
        return this.f57508j.c();
    }

    public final boolean n(vi.g<com.google.firebase.remoteconfig.internal.a> gVar) {
        if (gVar.s()) {
            this.f57503e.d();
            if (gVar.o() != null) {
                q(gVar.o().c());
                return true;
            }
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        return false;
    }

    public void o() {
        this.f57504f.e();
        this.f57505g.e();
        this.f57503e.e();
    }

    public void q(JSONArray jSONArray) {
        if (this.f57501c == null) {
            return;
        }
        try {
            this.f57501c.k(p(jSONArray));
        } catch (AbtException e10) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
        } catch (JSONException e11) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e11);
        }
    }
}
