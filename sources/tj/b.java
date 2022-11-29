package tj;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f53663a;

    /* renamed from: b  reason: collision with root package name */
    public final float f53664b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f53663a;
            f10 += ((b) cVar).f53664b;
        }
        this.f53663a = cVar;
        this.f53664b = f10;
    }

    @Override // tj.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f53663a.a(rectF) + this.f53664b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f53663a.equals(bVar.f53663a) && this.f53664b == bVar.f53664b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53663a, Float.valueOf(this.f53664b)});
    }
}
