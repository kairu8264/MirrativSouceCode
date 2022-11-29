package rh;

import android.content.Intent;

/* loaded from: classes3.dex */
public final class d0 extends e0 {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Intent f51429w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ph.g f51430x;

    public d0(Intent intent, ph.g gVar, int i10) {
        this.f51429w = intent;
        this.f51430x = gVar;
    }

    @Override // rh.e0
    public final void a() {
        Intent intent = this.f51429w;
        if (intent != null) {
            this.f51430x.startActivityForResult(intent, 2);
        }
    }
}
