package ai;

import android.media.AudioAttributes;

/* loaded from: classes3.dex */
public final class lc3 {

    /* renamed from: c  reason: collision with root package name */
    public static final lc3 f6517c = new lc3(0, 0, 1, 1, null);

    /* renamed from: d  reason: collision with root package name */
    public static final x2<lc3> f6518d = ku1.f6362a;

    /* renamed from: a  reason: collision with root package name */
    public final int f6519a = 1;

    /* renamed from: b  reason: collision with root package name */
    public AudioAttributes f6520b;

    public /* synthetic */ lc3(int i10, int i11, int i12, int i13, gl2 gl2Var) {
    }

    public final AudioAttributes a() {
        if (this.f6520b == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            if (sb.f9778a >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            this.f6520b = usage.build();
        }
        return this.f6520b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lc3.class != obj.getClass()) {
            return false;
        }
        lc3 lc3Var = (lc3) obj;
        return true;
    }

    public final int hashCode() {
        return 15699889;
    }
}
