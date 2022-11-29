package d7;

import e7.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class f0 implements m0<g7.d> {

    /* renamed from: a  reason: collision with root package name */
    public static final f0 f29245a = new f0();

    @Override // d7.m0
    /* renamed from: b */
    public g7.d a(e7.c cVar, float f10) throws IOException {
        boolean z10 = cVar.z() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.c();
        }
        float n10 = (float) cVar.n();
        float n11 = (float) cVar.n();
        while (cVar.i()) {
            cVar.G();
        }
        if (z10) {
            cVar.e();
        }
        return new g7.d((n10 / 100.0f) * f10, (n11 / 100.0f) * f10);
    }
}
