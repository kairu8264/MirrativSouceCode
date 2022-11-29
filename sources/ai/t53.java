package ai;

import ai.xj3;
import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class t53<KeyFormatProtoT extends xj3, KeyProtoT extends xj3> {

    /* renamed from: a  reason: collision with root package name */
    public final y53<KeyFormatProtoT, KeyProtoT> f10153a;

    public t53(y53<KeyFormatProtoT, KeyProtoT> y53Var) {
        this.f10153a = y53Var;
    }

    public final KeyProtoT a(oh3 oh3Var) throws GeneralSecurityException, zzggm {
        KeyFormatProtoT c10 = this.f10153a.c(oh3Var);
        this.f10153a.b(c10);
        return this.f10153a.d(c10);
    }
}
