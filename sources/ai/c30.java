package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class c30 implements r30 {

    /* renamed from: a  reason: collision with root package name */
    public static final r30 f2684a = new c30();

    @Override // ai.r30
    public final void a(Object obj, Map map) {
        tq0 tq0Var = (tq0) obj;
        r30<rp0> r30Var = q30.f8779a;
        String str = (String) map.get("u");
        if (str == null) {
            uj0.f("URL missing from httpTrack GMSG.");
        } else {
            new yg.d1(tq0Var.getContext(), ((br0) tq0Var).m().f13013w, str).c();
        }
    }
}
