package tj;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f53662a;

    public a(float f10) {
        this.f53662a = f10;
    }

    @Override // tj.c
    public float a(RectF rectF) {
        return this.f53662a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f53662a == ((a) obj).f53662a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f53662a)});
    }
}
