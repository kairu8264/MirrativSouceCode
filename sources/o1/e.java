package o1;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import jo.p;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f43806a;

    /* renamed from: b  reason: collision with root package name */
    public final Float[] f43807b;

    public e(int i10) {
        this.f43806a = i10;
        Float[] fArr = new Float[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fArr[i11] = Float.valueOf(0.0f);
        }
        this.f43807b = fArr;
    }

    public final float a(int i10) {
        return this.f43807b[i10].floatValue();
    }

    public final float b() {
        return (float) Math.sqrt(d(this));
    }

    public final void c(int i10, float f10) {
        this.f43807b[i10] = Float.valueOf(f10);
    }

    public final float d(e eVar) {
        p.h(eVar, TopicConstant.EXTEND_LIPMETA_A);
        int i10 = this.f43806a;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < i10; i11++) {
            f10 += a(i11) * eVar.a(i11);
        }
        return f10;
    }
}
