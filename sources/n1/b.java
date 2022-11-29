package n1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements r {

    /* renamed from: a  reason: collision with root package name */
    public final int f41411a;

    public b(int i10) {
        this.f41411a = i10;
    }

    public final int a() {
        return this.f41411a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (jo.p.c(b.class, obj != null ? obj.getClass() : null)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
            return this.f41411a == ((b) obj).f41411a;
        }
        return false;
    }

    public int hashCode() {
        return this.f41411a;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f41411a + ')';
    }
}
