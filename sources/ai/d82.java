package ai;

import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes3.dex */
public final class d82 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final ls f3175a;

    /* renamed from: b  reason: collision with root package name */
    public final zj0 f3176b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3177c;

    public d82(ls lsVar, zj0 zj0Var, boolean z10) {
        this.f3175a = lsVar;
        this.f3176b = zj0Var;
        this.f3177c = z10;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.f3176b.f13015y >= ((Integer) ft.c().c(ox.C3)).intValue()) {
            bundle2.putString("app_open_version", "2");
        }
        if (((Boolean) ft.c().c(ox.D3)).booleanValue()) {
            bundle2.putBoolean("app_switched", this.f3177c);
        }
        ls lsVar = this.f3175a;
        if (lsVar != null) {
            int i10 = lsVar.f6652w;
            if (i10 == 1) {
                bundle2.putString("avo", TtmlNode.TAG_P);
            } else if (i10 == 2) {
                bundle2.putString("avo", "l");
            }
        }
    }
}
