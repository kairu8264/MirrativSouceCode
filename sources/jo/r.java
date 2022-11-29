package jo;

import qo.g;

/* loaded from: classes4.dex */
public abstract class r extends t implements qo.e {
    public r(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // qo.g
    public g.a C() {
        return ((qo.e) i()).C();
    }

    @Override // jo.d
    public qo.a c() {
        return f0.d(this);
    }

    @Override // io.l
    public Object invoke(Object obj) {
        return get(obj);
    }
}
