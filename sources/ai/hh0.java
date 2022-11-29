package ai;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class hh0 implements vk {

    /* renamed from: w  reason: collision with root package name */
    public final Context f4846w;

    /* renamed from: x  reason: collision with root package name */
    public final Object f4847x;

    /* renamed from: y  reason: collision with root package name */
    public final String f4848y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4849z;

    public hh0(Context context, String str) {
        this.f4846w = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f4848y = str;
        this.f4849z = false;
        this.f4847x = new Object();
    }

    @Override // ai.vk
    public final void U(uk ukVar) {
        a(ukVar.f10736j);
    }

    public final void a(boolean z10) {
        if (wg.t.a().g(this.f4846w)) {
            synchronized (this.f4847x) {
                if (this.f4849z == z10) {
                    return;
                }
                this.f4849z = z10;
                if (TextUtils.isEmpty(this.f4848y)) {
                    return;
                }
                if (this.f4849z) {
                    wg.t.a().k(this.f4846w, this.f4848y);
                } else {
                    wg.t.a().l(this.f4846w, this.f4848y);
                }
            }
        }
    }

    public final String b() {
        return this.f4848y;
    }
}
