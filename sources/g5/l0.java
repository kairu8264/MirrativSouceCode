package g5;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
public class l0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f32740a;

    public l0(View view) {
        this.f32740a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof l0) && ((l0) obj).f32740a.equals(this.f32740a);
    }

    public int hashCode() {
        return this.f32740a.hashCode();
    }
}
