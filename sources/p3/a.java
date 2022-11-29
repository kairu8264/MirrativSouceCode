package p3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: w  reason: collision with root package name */
    public final int f45738w;

    /* renamed from: x  reason: collision with root package name */
    public final c f45739x;

    /* renamed from: y  reason: collision with root package name */
    public final int f45740y;

    public a(int i10, c cVar, int i11) {
        this.f45738w = i10;
        this.f45739x = cVar;
        this.f45740y = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f45738w);
        this.f45739x.Q(this.f45740y, bundle);
    }
}
