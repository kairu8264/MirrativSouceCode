package tj;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f53695a;

    public i(float f10) {
        this.f53695a = f10;
    }

    @Override // tj.c
    public float a(RectF rectF) {
        return this.f53695a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f53695a == ((i) obj).f53695a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f53695a)});
    }
}
