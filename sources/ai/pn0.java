package ai;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class pn0 {

    /* renamed from: a  reason: collision with root package name */
    public long f8480a;

    public final long a(ByteBuffer byteBuffer) {
        k54 k54Var;
        j54 j54Var;
        long j10 = this.f8480a;
        if (j10 > 0) {
            return j10;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator<h54> it = new f54(new on0(duplicate), rn0.f9507c).e().iterator();
            while (true) {
                k54Var = null;
                if (!it.hasNext()) {
                    j54Var = null;
                    break;
                }
                h54 next = it.next();
                if (next instanceof j54) {
                    j54Var = (j54) next;
                    break;
                }
            }
            Iterator<h54> it2 = j54Var.e().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                h54 next2 = it2.next();
                if (next2 instanceof k54) {
                    k54Var = (k54) next2;
                    break;
                }
            }
            long i10 = (k54Var.i() * 1000) / k54Var.h();
            this.f8480a = i10;
            return i10;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
