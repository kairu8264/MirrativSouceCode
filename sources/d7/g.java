package d7;

import android.graphics.Color;
import e7.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class g implements m0<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f29246a = new g();

    @Override // d7.m0
    /* renamed from: b */
    public Integer a(e7.c cVar, float f10) throws IOException {
        boolean z10 = cVar.z() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.c();
        }
        double n10 = cVar.n();
        double n11 = cVar.n();
        double n12 = cVar.n();
        double n13 = cVar.z() == c.b.NUMBER ? cVar.n() : 1.0d;
        if (z10) {
            cVar.e();
        }
        if (n10 <= 1.0d && n11 <= 1.0d && n12 <= 1.0d) {
            n10 *= 255.0d;
            n11 *= 255.0d;
            n12 *= 255.0d;
            if (n13 <= 1.0d) {
                n13 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) n13, (int) n10, (int) n11, (int) n12));
    }
}
