package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class r20 implements r30<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final s20 f9304a;

    public r20(s20 s20Var) {
        this.f9304a = s20Var;
    }

    @Override // ai.r30
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            uj0.f("App event with no name parameter.");
        } else {
            this.f9304a.w0(str, map.get("info"));
        }
    }
}
