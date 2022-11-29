package yd;

import android.view.View;

/* loaded from: classes2.dex */
public final class f1 implements View.OnClickListener {

    /* renamed from: w  reason: collision with root package name */
    public int f61725w;

    /* renamed from: x  reason: collision with root package name */
    public final io.l<View, wn.v> f61726x;

    /* renamed from: y  reason: collision with root package name */
    public long f61727y;

    /* JADX WARN: Multi-variable type inference failed */
    public f1(int i10, io.l<? super View, wn.v> lVar) {
        jo.p.h(lVar, "onSafeClick");
        this.f61725w = i10;
        this.f61726x = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        jo.p.h(view, "v");
        if (System.currentTimeMillis() - this.f61727y < this.f61725w) {
            return;
        }
        this.f61727y = System.currentTimeMillis();
        this.f61726x.invoke(view);
    }

    public /* synthetic */ f1(int i10, io.l lVar, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? 1000 : i10, lVar);
    }
}
