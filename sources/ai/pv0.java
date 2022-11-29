package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class pv0 implements lv0 {

    /* renamed from: a  reason: collision with root package name */
    public final yg.r1 f8696a;

    public pv0(yg.r1 r1Var) {
        this.f8696a = r1Var;
    }

    @Override // ai.lv0
    public final void a(Map<String, String> map) {
        this.f8696a.b0(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}
