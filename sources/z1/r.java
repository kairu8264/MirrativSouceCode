package z1;

import android.text.Layout;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f62481a = new r();

    /* renamed from: b  reason: collision with root package name */
    public static final Layout.Alignment f62482b;

    /* renamed from: c  reason: collision with root package name */
    public static final Layout.Alignment f62483c;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (jo.p.c(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (jo.p.c(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f62482b = alignment;
        f62483c = alignment2;
    }

    public final Layout.Alignment a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return Layout.Alignment.ALIGN_NORMAL;
                        }
                        return f62483c;
                    }
                    return f62482b;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }
}
