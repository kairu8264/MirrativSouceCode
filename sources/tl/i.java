package tl;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* loaded from: classes4.dex */
public class i implements ql.g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f53815a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f53816b = false;

    /* renamed from: c  reason: collision with root package name */
    public ql.c f53817c;

    /* renamed from: d  reason: collision with root package name */
    public final f f53818d;

    public i(f fVar) {
        this.f53818d = fVar;
    }

    @Override // ql.g
    public ql.g a(String str) throws IOException {
        b();
        this.f53818d.h(this.f53817c, str, this.f53816b);
        return this;
    }

    public final void b() {
        if (!this.f53815a) {
            this.f53815a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    public void c(ql.c cVar, boolean z10) {
        this.f53815a = false;
        this.f53817c = cVar;
        this.f53816b = z10;
    }

    @Override // ql.g
    public ql.g f(boolean z10) throws IOException {
        b();
        this.f53818d.n(this.f53817c, z10, this.f53816b);
        return this;
    }
}
