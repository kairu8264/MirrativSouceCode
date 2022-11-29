package ai;

import com.google.android.gms.internal.ads.zzaeg;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class ur3 {

    /* renamed from: a  reason: collision with root package name */
    public tr3 f10815a;

    /* renamed from: b  reason: collision with root package name */
    public ds3 f10816b;

    public abstract void a(Object obj);

    public abstract wr3 b(v6[] v6VarArr, uz3 uz3Var, bp3 bp3Var, q7 q7Var) throws zzaeg;

    public final void c(tr3 tr3Var, ds3 ds3Var) {
        this.f10815a = tr3Var;
        this.f10816b = ds3Var;
    }

    public final void d() {
        tr3 tr3Var = this.f10815a;
        if (tr3Var != null) {
            tr3Var.zza();
        }
    }

    public final ds3 e() {
        ds3 ds3Var = this.f10816b;
        Objects.requireNonNull(ds3Var);
        return ds3Var;
    }
}
