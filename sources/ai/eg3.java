package ai;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* loaded from: classes3.dex */
public final class eg3 extends ThreadLocal<Mac> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ fg3 f3662a;

    public eg3(fg3 fg3Var) {
        this.f3662a = fg3Var;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: a */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            rf3<wf3, Mac> rf3Var = rf3.f9424f;
            str = this.f3662a.f4023b;
            Mac b10 = rf3Var.b(str);
            key = this.f3662a.f4024c;
            b10.init(key);
            return b10;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
