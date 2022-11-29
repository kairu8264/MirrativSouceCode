package yg;

import ai.yj0;
import android.content.Context;

/* loaded from: classes3.dex */
public final class d1 extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final yj0 f61864c;

    /* renamed from: d  reason: collision with root package name */
    public final String f61865d;

    public d1(Context context, String str, String str2) {
        this.f61864c = new yj0(wg.t.d().P(context, str));
        this.f61865d = str2;
    }

    @Override // yg.b0
    public final void a() {
        this.f61864c.v(this.f61865d);
    }
}
