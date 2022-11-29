package gi;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class y implements ql.g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f33633a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f33634b = false;

    /* renamed from: c  reason: collision with root package name */
    public ql.c f33635c;

    /* renamed from: d  reason: collision with root package name */
    public final u f33636d;

    public y(u uVar) {
        this.f33636d = uVar;
    }

    @Override // ql.g
    public final ql.g a(String str) throws IOException {
        c();
        this.f33636d.g(this.f33635c, str, this.f33634b);
        return this;
    }

    public final void b(ql.c cVar, boolean z10) {
        this.f33633a = false;
        this.f33635c = cVar;
        this.f33634b = z10;
    }

    public final void c() {
        if (this.f33633a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f33633a = true;
    }

    @Override // ql.g
    public final ql.g f(boolean z10) throws IOException {
        c();
        this.f33636d.h(this.f33635c, z10 ? 1 : 0, this.f33634b);
        return this;
    }
}
