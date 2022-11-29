package v2;

import android.view.View;
import r2.f;

/* loaded from: classes.dex */
public abstract class d extends f {

    /* loaded from: classes.dex */
    public static class a extends d {
        @Override // v2.d
        public boolean b(View view, float f10, long j10, r2.c cVar) {
            return this.f49731h;
        }

        public boolean c(View view, r2.c cVar, float f10, long j10, double d10, double d11) {
            view.setRotation(a(f10, j10, view, cVar) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
            return this.f49731h;
        }
    }

    public float a(float f10, long j10, View view, r2.c cVar) {
        this.f49724a.c(f10, this.f49730g);
        float[] fArr = this.f49730g;
        float f11 = fArr[1];
        if (f11 == 0.0f) {
            this.f49731h = false;
            return fArr[2];
        } else if (Float.isNaN(this.f49733j)) {
            throw null;
        } else {
            this.f49733j = (float) ((this.f49733j + (((j10 - this.f49732i) * 1.0E-9d) * f11)) % 1.0d);
            throw null;
        }
    }

    public abstract boolean b(View view, float f10, long j10, r2.c cVar);
}
