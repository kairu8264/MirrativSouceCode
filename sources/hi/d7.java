package hi;

import com.google.android.gms.internal.measurement.zzkh;
import hi.d7;
import hi.e7;

/* loaded from: classes3.dex */
public abstract class d7<MessageType extends e7<MessageType, BuilderType>, BuilderType extends d7<MessageType, BuilderType>> implements v9 {
    @Override // hi.v9
    public final /* synthetic */ v9 A0(byte[] bArr) throws zzkh {
        return e(bArr, 0, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hi.v9
    public final /* bridge */ /* synthetic */ v9 V0(w9 w9Var) {
        if (b().getClass().isInstance(w9Var)) {
            return c((e7) w9Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public abstract BuilderType c(MessageType messagetype);

    public abstract BuilderType e(byte[] bArr, int i10, int i11) throws zzkh;

    public abstract BuilderType f(byte[] bArr, int i10, int i11, g8 g8Var) throws zzkh;

    @Override // hi.v9
    public final /* synthetic */ v9 x0(byte[] bArr, g8 g8Var) throws zzkh {
        return f(bArr, 0, bArr.length, g8Var);
    }
}
