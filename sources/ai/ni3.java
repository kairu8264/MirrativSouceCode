package ai;

import ai.ni3;
import ai.ri3;
import com.google.android.gms.internal.ads.zzggm;
import com.google.android.gms.internal.ads.zzgin;
import java.io.IOException;

/* loaded from: classes3.dex */
public class ni3<MessageType extends ri3<MessageType, BuilderType>, BuilderType extends ni3<MessageType, BuilderType>> extends wg3<MessageType, BuilderType> {

    /* renamed from: w  reason: collision with root package name */
    public final MessageType f7356w;

    /* renamed from: x  reason: collision with root package name */
    public MessageType f7357x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f7358y = false;

    public ni3(MessageType messagetype) {
        this.f7356w = messagetype;
        this.f7357x = (MessageType) messagetype.A(4, null, null);
    }

    public static final void i(MessageType messagetype, MessageType messagetype2) {
        fk3.a().b(messagetype.getClass()).j(messagetype, messagetype2);
    }

    @Override // ai.yj3
    public final /* bridge */ /* synthetic */ xj3 g() {
        return this.f7356w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ai.wg3
    public final /* bridge */ /* synthetic */ wg3 h(xg3 xg3Var) {
        o((ri3) xg3Var);
        return this;
    }

    public void k() {
        MessageType messagetype = (MessageType) this.f7357x.A(4, null, null);
        i(messagetype, this.f7357x);
        this.f7357x = messagetype;
    }

    /* renamed from: l */
    public final BuilderType clone() {
        BuilderType buildertype = (BuilderType) this.f7356w.A(5, null, null);
        buildertype.o(P());
        return buildertype;
    }

    @Override // ai.wj3
    /* renamed from: m */
    public MessageType P() {
        if (this.f7358y) {
            return this.f7357x;
        }
        MessageType messagetype = this.f7357x;
        fk3.a().b(messagetype.getClass()).e(messagetype);
        this.f7358y = true;
        return this.f7357x;
    }

    public final MessageType n() {
        MessageType P = P();
        if (P.v()) {
            return P;
        }
        throw new zzgin(P);
    }

    public final BuilderType o(MessageType messagetype) {
        if (this.f7358y) {
            k();
            this.f7358y = false;
        }
        i(this.f7357x, messagetype);
        return this;
    }

    public final BuilderType q(byte[] bArr, int i10, int i11, di3 di3Var) throws zzggm {
        if (this.f7358y) {
            k();
            this.f7358y = false;
        }
        try {
            fk3.a().b(this.f7357x.getClass()).i(this.f7357x, bArr, 0, i11, new ah3(di3Var));
            return this;
        } catch (zzggm e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzggm.d();
        }
    }
}
