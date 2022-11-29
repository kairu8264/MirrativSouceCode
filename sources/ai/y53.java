package ai;

import ai.xj3;
import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class y53<KeyFormatProtoT extends xj3, KeyT> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<KeyFormatProtoT> f12456a;

    public y53(Class<KeyFormatProtoT> cls) {
        this.f12456a = cls;
    }

    public final Class<KeyFormatProtoT> a() {
        return this.f12456a;
    }

    public abstract void b(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public abstract KeyFormatProtoT c(oh3 oh3Var) throws zzggm;

    public abstract KeyT d(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public Map<String, x53<KeyFormatProtoT>> e() throws GeneralSecurityException {
        return Collections.emptyMap();
    }
}
