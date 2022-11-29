package g5;

import android.os.IBinder;

/* loaded from: classes.dex */
public class k0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f32737a;

    public k0(IBinder iBinder) {
        this.f32737a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k0) && ((k0) obj).f32737a.equals(this.f32737a);
    }

    public int hashCode() {
        return this.f32737a.hashCode();
    }
}
