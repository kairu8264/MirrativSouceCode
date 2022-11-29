package d7;

import android.graphics.PointF;
import e7.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class b0 implements m0<PointF> {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f29236a = new b0();

    @Override // d7.m0
    /* renamed from: b */
    public PointF a(e7.c cVar, float f10) throws IOException {
        c.b z10 = cVar.z();
        if (z10 == c.b.BEGIN_ARRAY) {
            return s.e(cVar, f10);
        }
        if (z10 == c.b.BEGIN_OBJECT) {
            return s.e(cVar, f10);
        }
        if (z10 == c.b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.n()) * f10, ((float) cVar.n()) * f10);
            while (cVar.i()) {
                cVar.G();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + z10);
    }
}
