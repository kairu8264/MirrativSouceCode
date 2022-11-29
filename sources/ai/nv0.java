package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class nv0 implements lv0 {

    /* renamed from: a  reason: collision with root package name */
    public final yg.r1 f7536a;

    public nv0(yg.r1 r1Var) {
        this.f7536a = r1Var;
    }

    @Override // ai.lv0
    public final void a(Map<String, String> map) {
        this.f7536a.b(Boolean.parseBoolean(map.get("content_url_opted_out")));
    }
}
