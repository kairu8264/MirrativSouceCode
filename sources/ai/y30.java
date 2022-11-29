package ai;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.Map;

/* loaded from: classes3.dex */
public final class y30 implements r30<rp0> {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<String, Integer> f12434d = vh.g.e(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a  reason: collision with root package name */
    public final wg.b f12435a;

    /* renamed from: b  reason: collision with root package name */
    public final tb0 f12436b;

    /* renamed from: c  reason: collision with root package name */
    public final ac0 f12437c;

    public y30(wg.b bVar, tb0 tb0Var, ac0 ac0Var) {
        this.f12435a = bVar;
        this.f12436b = tb0Var;
        this.f12437c = ac0Var;
    }

    @Override // ai.r30
    public final /* bridge */ /* synthetic */ void a(rp0 rp0Var, Map map) {
        rp0 rp0Var2 = rp0Var;
        int intValue = f12434d.get((String) map.get(TopicConstant.EXTEND_LIPMETA_A)).intValue();
        int i10 = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                if (!this.f12435a.b()) {
                    this.f12435a.c(null);
                    return;
                } else if (intValue == 1) {
                    this.f12436b.h(map);
                    return;
                } else if (intValue == 3) {
                    new wb0(rp0Var2, map).i();
                    return;
                } else if (intValue == 4) {
                    new rb0(rp0Var2, map).i();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.f12436b.i(true);
                        return;
                    } else if (intValue != 7) {
                        uj0.e("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f12437c.b();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (rp0Var2 == null) {
            uj0.f("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i10 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i10 = parseBoolean ? -1 : wg.t.f().h();
        }
        rp0Var2.A0(i10);
    }
}
