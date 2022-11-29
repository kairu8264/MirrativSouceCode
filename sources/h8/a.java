package h8;

import android.content.Context;
import i8.k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import m7.e;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: b  reason: collision with root package name */
    public final int f34589b;

    /* renamed from: c  reason: collision with root package name */
    public final e f34590c;

    public a(int i10, e eVar) {
        this.f34589b = i10;
        this.f34590c = eVar;
    }

    public static e c(Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        this.f34590c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f34589b).array());
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f34589b == aVar.f34589b && this.f34590c.equals(aVar.f34590c);
        }
        return false;
    }

    @Override // m7.e
    public int hashCode() {
        return k.p(this.f34590c, this.f34589b);
    }
}
