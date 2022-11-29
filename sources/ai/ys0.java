package ai;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ys0 implements zf2 {

    /* renamed from: a  reason: collision with root package name */
    public final bu0 f12719a;

    /* renamed from: b  reason: collision with root package name */
    public Context f12720b;

    /* renamed from: c  reason: collision with root package name */
    public String f12721c;

    public /* synthetic */ ys0(bu0 bu0Var, st0 st0Var) {
        this.f12719a = bu0Var;
    }

    @Override // ai.zf2
    public final /* bridge */ /* synthetic */ zf2 a(Context context) {
        Objects.requireNonNull(context);
        this.f12720b = context;
        return this;
    }

    @Override // ai.zf2
    public final /* bridge */ /* synthetic */ zf2 t(String str) {
        Objects.requireNonNull(str);
        this.f12721c = str;
        return this;
    }

    @Override // ai.zf2
    public final ag2 zza() {
        zn3.c(this.f12720b, Context.class);
        zn3.c(this.f12721c, String.class);
        return new zs0(this.f12719a, this.f12720b, this.f12721c, null);
    }
}
