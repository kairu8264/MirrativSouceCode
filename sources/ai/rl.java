package ai;

import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class rl implements ValueCallback<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ tl f9490a;

    public rl(tl tlVar) {
        this.f9490a = tlVar;
    }

    @Override // android.webkit.ValueCallback
    /* renamed from: a */
    public final void onReceiveValue(String str) {
        tl tlVar = this.f9490a;
        tlVar.A.d(tlVar.f10345x, tlVar.f10346y, str, tlVar.f10347z);
    }
}
