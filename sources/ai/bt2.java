package ai;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bt2 {

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f2492a;

    /* renamed from: b  reason: collision with root package name */
    public final kt2 f2493b;

    public bt2(kt2 kt2Var) {
        this.f2493b = kt2Var;
    }

    public final void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f2493b.a(new nt2(this, hashSet, jSONObject, j10, null));
    }

    public final void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f2493b.a(new mt2(this, hashSet, jSONObject, j10, null));
    }

    public final void c() {
        this.f2493b.a(new lt2(this, null));
    }

    public final JSONObject d() {
        return this.f2492a;
    }

    public final void e(JSONObject jSONObject) {
        this.f2492a = jSONObject;
    }
}
