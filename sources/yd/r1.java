package yd;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class r1 extends androidx.recyclerview.widget.s {
    @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.c0
    public int i(RecyclerView.p pVar, int i10, int i11) {
        jo.p.h(pVar, "layoutManager");
        View h10 = h(pVar);
        if (h10 == null) {
            return -1;
        }
        int o02 = pVar.o0(h10);
        return i10 > 0 ? o02 : o02 - 1;
    }
}
