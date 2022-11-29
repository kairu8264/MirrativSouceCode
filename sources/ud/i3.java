package ud;

import ud.a;

/* loaded from: classes2.dex */
public final class i3 implements a {

    /* renamed from: w  reason: collision with root package name */
    public final a.EnumC0862a f55021w;

    public i3() {
        this(null, 1, null);
    }

    public i3(a.EnumC0862a enumC0862a) {
        jo.p.h(enumC0862a, "type");
        this.f55021w = enumC0862a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i3) && getType() == ((i3) obj).getType();
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f55021w;
    }

    public int hashCode() {
        return getType().hashCode();
    }

    public String toString() {
        return "SeparatorBindModel(type=" + getType() + ')';
    }

    public /* synthetic */ i3(a.EnumC0862a enumC0862a, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? a.EnumC0862a.SEPARATOR : enumC0862a);
    }
}
