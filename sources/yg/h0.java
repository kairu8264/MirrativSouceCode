package yg;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f61891a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<Double> f61892b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final List<Double> f61893c = new ArrayList();

    public final h0 d(String str, double d10, double d11) {
        int i10 = 0;
        while (i10 < this.f61891a.size()) {
            double doubleValue = this.f61893c.get(i10).doubleValue();
            double doubleValue2 = this.f61892b.get(i10).doubleValue();
            if (d10 < doubleValue || (doubleValue == d10 && d11 < doubleValue2)) {
                break;
            }
            i10++;
        }
        this.f61891a.add(i10, str);
        this.f61893c.add(i10, Double.valueOf(d10));
        this.f61892b.add(i10, Double.valueOf(d11));
        return this;
    }

    public final j0 e() {
        return new j0(this, null);
    }
}
