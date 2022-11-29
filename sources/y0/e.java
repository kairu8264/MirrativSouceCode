package y0;

import android.view.ViewStructure;
import jo.p;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f61036a = new e();

    public final int a(ViewStructure viewStructure, int i10) {
        p.h(viewStructure, "structure");
        return viewStructure.addChildCount(i10);
    }

    public final ViewStructure b(ViewStructure viewStructure, int i10) {
        p.h(viewStructure, "structure");
        return viewStructure.newChild(i10);
    }

    public final void c(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
        p.h(viewStructure, "structure");
        viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
    }

    public final void d(ViewStructure viewStructure, int i10, String str, String str2, String str3) {
        p.h(viewStructure, "structure");
        viewStructure.setId(i10, str, str2, str3);
    }
}
