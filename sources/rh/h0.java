package rh;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;

/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final SparseIntArray f51458a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    public nh.e f51459b;

    public h0(nh.e eVar) {
        p.i(eVar);
        this.f51459b = eVar;
    }

    public final int a(Context context, int i10) {
        return this.f51458a.get(i10, -1);
    }

    public final int b(Context context, a.f fVar) {
        p.i(context);
        p.i(fVar);
        int i10 = 0;
        if (fVar.e()) {
            int l10 = fVar.l();
            int a10 = a(context, l10);
            if (a10 == -1) {
                int i11 = 0;
                while (true) {
                    if (i11 >= this.f51458a.size()) {
                        i10 = -1;
                        break;
                    }
                    int keyAt = this.f51458a.keyAt(i11);
                    if (keyAt > l10 && this.f51458a.get(keyAt) == 0) {
                        break;
                    }
                    i11++;
                }
                a10 = i10 == -1 ? this.f51459b.h(context, l10) : i10;
                this.f51458a.put(l10, a10);
            }
            return a10;
        }
        return 0;
    }

    public final void c() {
        this.f51458a.clear();
    }
}
