package d1;

import jo.p;

/* loaded from: classes.dex */
public final class n extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, int i10) {
        super(str, b.f28954a.c(), i10, null);
        p.h(str, "name");
    }

    @Override // d1.c
    public float[] a(float[] fArr) {
        p.h(fArr, "v");
        fArr[0] = j(fArr[0]);
        fArr[1] = j(fArr[1]);
        fArr[2] = j(fArr[2]);
        return fArr;
    }

    @Override // d1.c
    public float d(int i10) {
        return 2.0f;
    }

    @Override // d1.c
    public float e(int i10) {
        return -2.0f;
    }

    @Override // d1.c
    public float[] i(float[] fArr) {
        p.h(fArr, "v");
        fArr[0] = j(fArr[0]);
        fArr[1] = j(fArr[1]);
        fArr[2] = j(fArr[2]);
        return fArr;
    }

    public final float j(float f10) {
        return po.n.l(f10, -2.0f, 2.0f);
    }
}
