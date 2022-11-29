package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class d30 implements r30 {

    /* renamed from: a  reason: collision with root package name */
    public static final r30 f3114a = new d30();

    @Override // ai.r30
    public final void a(Object obj, Map map) {
        ar0 ar0Var = (ar0) obj;
        r30<rp0> r30Var = q30.f8779a;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            u w10 = ar0Var.w();
            if (w10 != null) {
                w10.b().g(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            uj0.f("Could not parse touch parameters from gmsg.");
        }
    }
}
