package ak;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Double> f13657a = new HashMap();

    public final synchronized double a(String str) {
        Double d10 = this.f13657a.get(str);
        if (d10 == null) {
            return 0.0d;
        }
        return d10.doubleValue();
    }

    public final synchronized double b(String str, m2 m2Var) {
        double d10;
        d10 = (((j1) m2Var).f13482h + 1.0d) / ((j1) m2Var).f13483i;
        this.f13657a.put(str, Double.valueOf(d10));
        return d10;
    }

    public final synchronized void c(String str) {
        this.f13657a.put(str, Double.valueOf(0.0d));
    }
}
