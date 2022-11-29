package n1;

import android.view.PointerIcon;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a  reason: collision with root package name */
    public final PointerIcon f41405a;

    public final PointerIcon a() {
        return this.f41405a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (jo.p.c(a.class, obj != null ? obj.getClass() : null)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
            return jo.p.c(this.f41405a, ((a) obj).f41405a);
        }
        return false;
    }

    public int hashCode() {
        return this.f41405a.hashCode();
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.f41405a + ')';
    }
}
