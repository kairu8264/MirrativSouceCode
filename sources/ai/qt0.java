package ai;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class qt0 implements jj2 {

    /* renamed from: a  reason: collision with root package name */
    public final bu0 f9190a;

    /* renamed from: b  reason: collision with root package name */
    public Context f9191b;

    /* renamed from: c  reason: collision with root package name */
    public String f9192c;

    /* renamed from: d  reason: collision with root package name */
    public fs f9193d;

    public /* synthetic */ qt0(bu0 bu0Var, st0 st0Var) {
        this.f9190a = bu0Var;
    }

    @Override // ai.jj2
    public final /* bridge */ /* synthetic */ jj2 A(String str) {
        Objects.requireNonNull(str);
        this.f9192c = str;
        return this;
    }

    @Override // ai.jj2
    public final /* bridge */ /* synthetic */ jj2 a(fs fsVar) {
        Objects.requireNonNull(fsVar);
        this.f9193d = fsVar;
        return this;
    }

    @Override // ai.jj2
    public final /* bridge */ /* synthetic */ jj2 b(Context context) {
        Objects.requireNonNull(context);
        this.f9191b = context;
        return this;
    }

    @Override // ai.jj2
    public final kj2 zza() {
        zn3.c(this.f9191b, Context.class);
        zn3.c(this.f9192c, String.class);
        zn3.c(this.f9193d, fs.class);
        return new rt0(this.f9190a, this.f9191b, this.f9192c, this.f9193d, null);
    }
}
