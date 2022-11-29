package hi;

import com.google.android.gms.internal.measurement.zzkh;
import com.google.android.gms.internal.measurement.zzma;
import hi.q8;
import hi.t8;
import java.io.IOException;

/* loaded from: classes3.dex */
public class q8<MessageType extends t8<MessageType, BuilderType>, BuilderType extends q8<MessageType, BuilderType>> extends d7<MessageType, BuilderType> {

    /* renamed from: w  reason: collision with root package name */
    public final MessageType f35955w;

    /* renamed from: x  reason: collision with root package name */
    public MessageType f35956x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f35957y = false;

    public q8(MessageType messagetype) {
        this.f35955w = messagetype;
        this.f35956x = (MessageType) messagetype.q(4, null, null);
    }

    public static final void g(MessageType messagetype, MessageType messagetype2) {
        ea.a().b(messagetype.getClass()).f(messagetype, messagetype2);
    }

    @Override // hi.x9
    public final /* synthetic */ w9 b() {
        return this.f35955w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hi.d7
    public final /* synthetic */ d7 c(e7 e7Var) {
        m((t8) e7Var);
        return this;
    }

    @Override // hi.d7
    public final /* bridge */ /* synthetic */ d7 e(byte[] bArr, int i10, int i11) throws zzkh {
        n(bArr, 0, i11, g8.a());
        return this;
    }

    @Override // hi.d7
    public final /* bridge */ /* synthetic */ d7 f(byte[] bArr, int i10, int i11, g8 g8Var) throws zzkh {
        n(bArr, 0, i11, g8Var);
        return this;
    }

    public final MessageType h() {
        MessageType S = S();
        boolean z10 = true;
        byte byteValue = ((Byte) S.q(1, null, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z10 = false;
            } else {
                boolean e10 = ea.a().b(S.getClass()).e(S);
                S.q(2, true != e10 ? null : S, null);
                z10 = e10;
            }
        }
        if (z10) {
            return S;
        }
        throw new zzma(S);
    }

    @Override // hi.v9
    /* renamed from: i */
    public MessageType S() {
        if (this.f35957y) {
            return this.f35956x;
        }
        MessageType messagetype = this.f35956x;
        ea.a().b(messagetype.getClass()).d(messagetype);
        this.f35957y = true;
        return this.f35956x;
    }

    public void k() {
        MessageType messagetype = (MessageType) this.f35956x.q(4, null, null);
        g(messagetype, this.f35956x);
        this.f35956x = messagetype;
    }

    /* renamed from: l */
    public final BuilderType clone() {
        BuilderType buildertype = (BuilderType) this.f35955w.q(5, null, null);
        buildertype.m(S());
        return buildertype;
    }

    public final BuilderType m(MessageType messagetype) {
        if (this.f35957y) {
            k();
            this.f35957y = false;
        }
        g(this.f35956x, messagetype);
        return this;
    }

    public final BuilderType n(byte[] bArr, int i10, int i11, g8 g8Var) throws zzkh {
        if (this.f35957y) {
            k();
            this.f35957y = false;
        }
        try {
            ea.a().b(this.f35956x.getClass()).h(this.f35956x, bArr, 0, i11, new h7(g8Var));
            return this;
        } catch (zzkh e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzkh.f();
        }
    }
}
