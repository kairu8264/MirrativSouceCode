package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class kt0 implements rq1 {

    /* renamed from: a  reason: collision with root package name */
    public final Long f6352a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6353b;

    /* renamed from: c  reason: collision with root package name */
    public final bu0 f6354c;

    /* renamed from: d  reason: collision with root package name */
    public final mt0 f6355d;

    /* renamed from: e  reason: collision with root package name */
    public final kt0 f6356e = this;

    public /* synthetic */ kt0(bu0 bu0Var, mt0 mt0Var, Long l10, String str, st0 st0Var) {
        this.f6354c = bu0Var;
        this.f6355d = mt0Var;
        this.f6352a = l10;
        this.f6353b = str;
    }

    @Override // ai.rq1
    public final br1 zza() {
        Context context;
        uq1 b10;
        long longValue = this.f6352a.longValue();
        context = this.f6355d.f7041a;
        b10 = vq1.b(this.f6355d.f7042b);
        return cr1.a(longValue, context, b10, this.f6354c, this.f6353b);
    }

    @Override // ai.rq1
    public final fr1 zzb() {
        Context context;
        uq1 b10;
        long longValue = this.f6352a.longValue();
        context = this.f6355d.f7041a;
        b10 = vq1.b(this.f6355d.f7042b);
        return gr1.a(longValue, context, b10, this.f6354c, this.f6353b);
    }
}
