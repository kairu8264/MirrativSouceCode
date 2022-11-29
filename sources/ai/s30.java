package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class s30 implements r30<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final ms1 f9698a;

    public s30(ms1 ms1Var) {
        rh.p.j(ms1Var, "The Inspector Manager must not be null");
        this.f9698a = ms1Var;
    }

    @Override // ai.r30
    public final void a(Object obj, Map<String, String> map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j10 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j10 = Long.parseLong(map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.f9698a.i(map.get("extras"), j10);
    }
}
