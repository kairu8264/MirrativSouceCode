package rh;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class c0 extends e0 {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Intent f51409w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Activity f51410x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f51411y;

    public c0(Intent intent, Activity activity, int i10) {
        this.f51409w = intent;
        this.f51410x = activity;
        this.f51411y = i10;
    }

    @Override // rh.e0
    public final void a() {
        Intent intent = this.f51409w;
        if (intent != null) {
            this.f51410x.startActivityForResult(intent, this.f51411y);
        }
    }
}
